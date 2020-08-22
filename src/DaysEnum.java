public enum DaysEnum {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6, true),
    SUNDAY(7, true);

    private int number;
    private boolean isWeekend = false;

    DaysEnum(int number) {
        this.number = number;
    }

    DaysEnum(int number, boolean isWeekend) {
        this.number = number;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Is " + DaysEnum.MONDAY.toString().toLowerCase() + " weekend day? " + isWeekend(DaysEnum.MONDAY));
        System.out.println("Is " + DaysEnum.SATURDAY.toString().toLowerCase() + " weekend day? " + isWeekend(DaysEnum.SATURDAY));

        System.out.println(DaysEnum.TUESDAY.toString().toLowerCase() + " in Polish is " + checkDays(DaysEnum.TUESDAY));
        System.out.println(DaysEnum.SUNDAY.toString().toLowerCase() + " in Polish is " + checkDays(DaysEnum.SUNDAY));
    }


    static boolean isWeekend(DaysEnum daysEnum) {
        return daysEnum.isWeekend();
    }


    static String checkDays(DaysEnum daysEnum) {
        switch (daysEnum) {
            case MONDAY:
                return "Poniedziełek";
            case TUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Sroda";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piątek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
        }
        return null;
    }
}
