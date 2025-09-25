package run;

import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.events.MediaPlayerEventAdapter;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;

public class VideoPlayer {

    public static void reproducirVideo(String ruta) {
        boolean ok = new NativeDiscovery().discover();
        if (!ok) System.err.println("[VLCJ] No se encontró VLC. Ajusta PATH o VM option.");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Reproductor VLCJ");
            EmbeddedMediaPlayerComponent c = new EmbeddedMediaPlayerComponent();

            frame.setContentPane(c);
            frame.setSize(800, 450);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);

            // Cerrar ventana al terminar o si hay error
            c.mediaPlayer().events().addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
                @Override public void finished(MediaPlayer mp) { cleanup(frame, c); }
                @Override public void error(MediaPlayer mp)    { System.err.println("Error reproduciendo: " + ruta); cleanup(frame, c); }
            });

            c.mediaPlayer().media().play(ruta);
        });
    }

    private static void cleanup(JFrame f, EmbeddedMediaPlayerComponent c){
        try { c.mediaPlayer().controls().stop(); } catch(Exception ignored){}
        try { c.release(); } catch(Exception ignored){}
        f.dispose();
        System.exit(0);
    }
}