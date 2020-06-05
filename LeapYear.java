public class LeapYear {

    public static boolean checkYear(final String year){

        boolean isLeapYear = false;
        int yearInt = Integer.parseInt(year);

        if (yearInt > 0){
            if (isDivBy4ButNot100(yearInt)){
                isLeapYear = true;
            } else if (isDivBy4And100And400(yearInt)){
                isLeapYear = true;
            }
        } else throw new RuntimeException("Cannot be a negative number");

        return isLeapYear;

    } 

    private static boolean isDivBy4ButNot100(int yearInt){
        return yearInt%4 == 0 && yearInt%100 != 0;
    }

    private static boolean isDivBy4And100And400(int yearInt){
        return yearInt%4 == 0 && yearInt%100 == 0 && yearInt%400 == 0;
    }    

}