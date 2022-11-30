package characters;

public abstract class AbstractCharacter {
    private String name;
    private String id;


    public AbstractCharacter(String name, String id){

        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int hashCode(){
        return(id != null ? id.hashCode() : 0);
    }

    @Override
    public String toString(){
        return "Character Data: {"
                +"Имя персонажа = '" + this.getName() + '\''
                + " Айдишник = " + Integer.toString(this.hashCode()-48)
                + '}';

    }
}


