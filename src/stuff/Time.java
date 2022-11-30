package stuff;

public enum Time {
    MINUTE("минуту"),
    EVENING("вечером");

    private String time;
    Time(String time){
        this.time = time;
    }
    public String getTime(){
        return this.time;
    }

    public static class ShowTime {
        private static String exactTime;
        public void displayTime(String t){
            exactTime = t;
            System.out.println("Действие совершается " + exactTime);
        }
        public String getExactTime(){
            return exactTime;
        }
    }
}
