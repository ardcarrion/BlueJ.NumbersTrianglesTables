
public class NumberUtilities {
    
    public static String getRange(int stop) {
        String outcome = "";

        for (int i = 0; i < stop; i++) {
            outcome = outcome + String.valueOf(i); 
        }
        System.out.println(outcome);
        return outcome;
    }

    public static String getRange(int start, int stop) {
        String outcome = "";

        for (int i = start; i < stop; i++) {
            outcome = outcome + String.valueOf(i);
        }
        System.out.println(outcome);
        return outcome;
    }


    public static String getRange(int start, int stop, int step) {
        String outcome = "";
        for (int i = start; i < stop; i += step) {
            outcome = outcome + String.valueOf(i);
        }
        System.out.println(outcome);
        return outcome;
    }

    public static String getEvenNumbers(int start, int stop) {
        String outcome = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) outcome = outcome + String.valueOf(i);
        }
        System.out.println(outcome);
        return outcome;
    }


    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 1) outcome = outcome + String.valueOf(i);
        }
        System.out.println(outcome);
        return outcome;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = "";

        for (int i = start; i <= stop; i++) {
            int result = (int)Math.pow(i, exponent);
            outcome = outcome + String.valueOf(result);
        }
        System.out.println(outcome);
        return outcome;
        
    }
}
