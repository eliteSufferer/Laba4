package characters;

import actions.ShortInteraction;
import actions.Understand;
import quallity.HowDoThings;
import actions.Scary;

public class AllThree implements ShortInteraction, HowDoThings, Understand, Scary {
    public String name;

    public AllThree(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    @Override
    public void toUnderstand() {
        System.out.println(this.getName() + " понимали, какая это будет беда");
    }

    @Override
    public void toSay(String how) {
        System.out.println(this.getName() + " " + how);
    }

    @Override
    public void doThings(String QualityOfAction) {
        System.out.println(this.getName() + QualityOfAction);
    }


    @Override
    public void toScary(String degree) {
        System.out.println(this.getName() + degree);
    }
}
