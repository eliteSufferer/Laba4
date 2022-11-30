package stuff;
import actions.Sound;
public class Phone extends UnnecessaryThings implements Sound{

    public Phone(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " издает звук " + this.getSound());
    }
}
