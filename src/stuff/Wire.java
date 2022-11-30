package stuff;
import actions.Sound;
public class Wire extends UnnecessaryThings implements Sound{
    public Wire(String name, String sound) {
        super(name, sound);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " издает звук " + this.getSound());
    }
}
