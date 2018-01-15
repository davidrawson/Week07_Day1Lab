public class Stereo {

    private String name;
    private String make;
    private String model;
    private Radio radio;
    private CDPlayer cdPlayer;


    public Stereo(String make, String model, String name){
//        super(make, model);
        this.name = name;
        this.make = make;
        this.model = model;
//        radio = new Radio(this.make, this.model);

    }

    public String play() {
        return "Playing your fav track";
    }

//    public String connect(){
//        return "Connected to Trevor";
//    }

    public String getName() {
        return name;
    }
}
