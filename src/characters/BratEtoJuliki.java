package characters;
import Exceptions.*;
public class BratEtoJuliki {
    public void hackScheme(){
        class Hack{
            public String name;
            boolean phoneChecked;
            boolean lockBroken;
            boolean everythingStolen;

            public Hack(String name){
                this.name = name;
            }
            public String getName(){
                return this.name;
            }
            public void toCome(){
                System.out.println(this.getName() + " лезут в дом по схеме:");
            }
            public void toRing(){
                System.out.println(this.getName() + " сначала звонят по телефону");
                phoneChecked = true;
            }
            public void toBreak(){
                System.out.println("Потом взламывают замок");
                lockBroken = true;
            }
            public void toSteal(){
                System.out.println(this.getName() + " выносят из квартиры все ценное");
                everythingStolen = true;
            }
            public void steal() throws NotAllStepsException {

                if (phoneChecked && lockBroken && everythingStolen) {
                    System.out.println("Все шаги предприняты, кража успешна");
                } else {
                    throw new NotAllStepsException("Не все шаги кражи выполнены, вас поймали!!");
                }
            }

        }

        Hack hack = new Hack("Жулики");
        hack.toCome();
        hack.toRing();
        hack.toBreak();
        hack.toSteal();
        try {
            hack.steal();
        }
        catch (NotAllStepsException e) {
            System.err.println(e.getMessage());
        }
    }

}

