package characters;

import actions.Communicate;
import actions.Warn;
import actions.ShortInteraction;
import quallity.QualityOfAction;
import quallity.HowDoThings;

public class Malysh extends AbstractCharacter implements Communicate, Warn, ShortInteraction {
    public Malysh(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }


    @Override
    public void toWarn() {
        System.out.println(this.getName() + " пытается остановить Карлсона");
    }

    @Override
    public void toSay(String how) {
        System.out.println(this.getName() + " " + how);
    }
}
