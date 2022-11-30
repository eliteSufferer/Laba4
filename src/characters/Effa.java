package characters;
import quallity.HowDoThings;

public class Effa extends AbstractCharacter implements HowDoThings {

    public Effa(String name, String id) {
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void doThings(String QualityOfAction) {
        System.out.println(this.getName() + QualityOfAction);
    }
}
