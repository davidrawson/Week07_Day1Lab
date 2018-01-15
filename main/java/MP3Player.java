public class MP3Player implements IConnect {

    private String name;

    public MP3Player(String name){
        this.name = name;
    }

    public String connect(Stereo stereo){
        return this.name + " is connected to " + stereo.getName();
    }

}
