package position;

public class Box extends AbstractPosition{
    public Box(String nameOfPosition){
        super(nameOfPosition);
        System.out.println("Место действия - " + nameOfPosition);
    }

}
