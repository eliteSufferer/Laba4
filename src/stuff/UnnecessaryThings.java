package stuff;

public abstract class UnnecessaryThings {
    private String thing;
    private String sound;
    public UnnecessaryThings(String name, String sound){
        this.thing = name;
        this.sound = sound;
    }

    public String getName(){
        return this.thing;
    }
    public String getSound(){
        return this.sound;
    }
}
