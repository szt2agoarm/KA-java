public class CodingHours {
    public static void main(String[] args){
        int codingHoursDaily = 6;
        int numberOfWeeks = 17;
        int workdaysonWeek = 5;
        int workHoursPerWeek = 52;

        int totalWorkHours = codingHoursDaily * workdaysonWeek * numberOfWeeks;

        double percentageOfWorkHours = ((double) totalWorkHours / (workHoursPerWeek * numberOfWeeks)) * 100;

        System.out.println("Total coding hours in the semester: " + totalWorkHours + " hours");
        System.out.println("Percentage of coding hours in the semester: " + percentageOfWorkHours + "%");
    }
}
