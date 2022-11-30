package characters;

import actions.Communicate;


public class Crister extends AbstractCharacter implements Communicate {
    public Crister(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }


    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }
}

