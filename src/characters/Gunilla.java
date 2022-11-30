package characters;

import actions.Communicate;

public class Gunilla extends AbstractCharacter implements Communicate {

    public Gunilla(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }


    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " соглашается играть");
    }
}
