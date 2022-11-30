package characters;

import actions.Draw;
import actions.Decide;
import objects.TakenObject;
import objects.TypeOfObject;
import quallity.HowDoThings;
import actions.WeirdSh;
import actions.Scary;
import actions.ShortInteraction;
import Exceptions.KringeException;

public class Karlson extends AbstractCharacter implements Scary, Draw, Decide, TakenObject, HowDoThings, ShortInteraction, WeirdSh {

    public Karlson(String name, String id){
        super(name, id);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void toDecide(String what){
        System.out.println(this.getName() + " решил " + what);
    }

    @Override
    public void toSay(String how) {
        System.out.println(this.getName() + " " + how);
    }


    @Override
    public void Draw() {
        System.out.println(this.getName() + " нарисовал страшную рожу");
    }


    @Override
    public void takeObject(TypeOfObject type, String name) {
        System.out.println(this.getName() + " взял " + name);
    }


    @Override
    public void doThings(String QualityOfAction) {
        System.out.println(this.getName() + QualityOfAction);
    }

    @Override
    public void doWeirdThings(String thing) throws KringeException {
        if (thing.length() <= 40) {
            System.out.println(this.getName() + thing);
        }
        else{
            throw new KringeException("У вас передоз кринжа, прекратите немедленно!!");
        }
    }

    @Override
    public void toScary(String degree) {
        System.out.println(this.getName() + degree);
    }

    public class Flight implements WeirdSh{
        public void startEngine(){
            System.out.println(Karlson.this.getName() + " запустил моторчик");
        }

        @Override
        public void doWeirdThings(String thing) {
            System.out.println(Karlson.this.getName() + thing);
        }

        public void sheetFligh(){
            System.out.println("Простыня развевается");
        }

    }

}
