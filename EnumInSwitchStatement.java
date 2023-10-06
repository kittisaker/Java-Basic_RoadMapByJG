public class EnumInSwitchStatement {

    enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public static String enumInSwitch(Days day){
        switch (day) {
            case SUNDAY:
                return "Its Sunday!!";
            case MONDAY:
                return "Its Monday";
            case TUESDAY:
                return "Its Tuesday";
            case WEDNESDAY:
                return "Its Wednesday";
            default:
                return "Rest of the week....";
        }
    }

    public static void main(String[] args) {
        System.out.println(enumInSwitch(Days.SUNDAY));
    }
}
