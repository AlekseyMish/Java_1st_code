public class Main {
    public static void main(String[] args) {
        double d1 = 3.35; // Sat
        double d2 = 1.50; // Sun
        double d3 = 2.26; // Mon
        double d4 = 3.55; // Tue
        double d5 = 3.15; // Wed
        double d6 = 3.40; // Thu
        double d7 = 5.35; // Fri

        // I could use this type of typing:
        // "double d1 = 3.35; d2 = 1.50; d3 = 2.26; d4 = 3.55; d5 = 3.15; d6 = 3.40; d7 = 2.40;"

        double xH1 = 0.60; // the amount of minutes in one hour
        double xH2 = d1 + d2 + d3 + d4 + d5 + d6 + d7; //summary of time for a week
        double xH3 = (int) xH2; // change from double to int
        var xH4 = (xH2 - xH3); // the reminder of the expression amount

        // the condition is bellow
        if (xH4 < xH1) {
            System.out.println("CommonTimeOfStudy1 = " + (String.format("%.2f",xH2)) + " hours");
        }else{
            double xH5 = xH4-xH1;
            var result = (xH3 + xH5)+1;
            var finalResult = String.format("%.2f",result);
            System.out.println("CommonTimeOfStudy2 = " + finalResult + " hours");
        }
    }
}