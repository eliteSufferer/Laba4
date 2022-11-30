package characters;
import actions.LeaveToWalk;
public class Parents {
    public static void walk(){

    LeaveToWalk Dad = new LeaveToWalk() {
        @Override
        public void toLeave() {
            System.out.println("Папа ушел на прогулку");
        }
    };

    LeaveToWalk Mom = new LeaveToWalk() {
        @Override
        public void toLeave() {
            System.out.println("Мама ушла на прогулку");
        }
    };
    Mom.toLeave();
    Dad.toLeave();
    }
}
