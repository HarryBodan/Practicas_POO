package models;

public class Animal {
    protected String name;
    protected String videoPath;
    protected String sound; // el sonido que hace

    public Animal(String name, String sound, String videoPath) {
        this.name = name;
        this.sound = sound;
        this.videoPath = videoPath;
    }

    public String getName() { return name; }
    public String getSound() { return sound; }
    public String getVideoPath() { return videoPath; }

    public void sound() {
        System.out.println(name + " hace: " + sound);
        VideoPlayer.reproducirVideo(videoPath);
    }
}