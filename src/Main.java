import Exceptions.KringeException;
import characters.*;
import objects.TypeOfObject;
import position.Box;
import position.CornerOfSheet;
import quallity.QualityOfAction;
import stuff.Phone;
import stuff.Time;
import stuff.Wire;

public class Main {
    public static void main(String[] args) {
        try {
            Malysh char1 = new Malysh("Малыш", "1");
            Gunilla char2 = new Gunilla("Гунилла", "2");
            Crister char3 = new Crister("Кристер", "3");
            Karlson char4 = new Karlson("Карлсон", "4");
            Time.ShowTime time = new Time.ShowTime();
            AllThree allchars = new AllThree("Все");
            System.out.println();
            char4.toDecide("обидеться всерьез");
            allchars.toUnderstand();
            allchars.toSay("принялись уговаривать его остаться");
            char4.toSay("сидит и дуется");
            time.displayTime(Time.MINUTE.getTime());
            allchars.doThings(" издали" + QualityOfAction.RELIEF.getQa());
            Parents.walk();
            time.displayTime(Time.EVENING.getTime());


            allchars.doThings(QualityOfAction.HAPPILY.getQa() + " согласились играть в привидения");
            System.out.println();

            char1.toSay("сказал");
            System.out.println();
            Box box1 = new Box("Ящик письменного стола");
            char4.takeObject(TypeOfObject.CRAYONS, "мелки");
            CornerOfSheet corner = new CornerOfSheet("Угол простыни");
            char4.Draw();
            char4.takeObject(TypeOfObject.SCISSORS, "ножницы");
            char1.toWarn();
            char4.doThings(QualityOfAction.QUICKLY.getQa() + " прорезал две дырки для глаз");
            char4.doWeirdThings(" закутался с головой в простыню");
            allchars.toScary(" слегка испугались");
            Effa char5 = new Effa("Еффа", "5");
            char5.doThings(QualityOfAction.FURIOUS.getQa() + " залаял");
            Karlson.Flight startFlight = char4.new Flight();
            startFlight.startEngine();
            startFlight.doWeirdThings(" принялся летать вокруг люстры");
            startFlight.sheetFligh();
            allchars.toScary(" притихли и боязливо следили за полетом");
            char5.doThings(QualityOfAction.OVERSTAIN.getQa() + " от лая");
            allchars.toScary(" ищут, кого пугать");
            Phone phone = new Phone("Телефон", "звонок");
            phone.makeSound();
            char4.doWeirdThings(" вздыхает и стонет на все лады");
            allchars.toScary(" хотят идти пугать прохожих");
            Wire wire = new Wire("Стальная проволока", "скр-скр");
            wire.makeSound();
            BratEtoJuliki char6 = new BratEtoJuliki();
            char6.hackScheme();

            System.out.println(char1);
            System.out.println(char2);
            System.out.println(char3);
            System.out.println(char4);
            System.out.println(char5);
        }
        catch (KringeException e){
            System.err.println(e.getMessage());
        }

    }
}