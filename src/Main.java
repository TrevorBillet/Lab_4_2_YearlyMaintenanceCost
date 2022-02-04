import java.sql.SQLOutput;

import static java.lang.System.out;

public class Main
{

    public static void main(String[] args)
    {
        int intOperandA = 300;
        int intOperandB = 500;
        int intOperandC = 400;
        int intOperandD = 600;

        int intSum = 0;
        int totalCost = 0;

        totalCost = intOperandA + intOperandB + intOperandC + intOperandD;

        System.out.println(" Your Winter cost were " + intOperandA + " Your Spring costs were " + intOperandB + " Your Summer costs were " + intOperandC + " Your Fall costs were " + intOperandD);
        System.out.println(" Your total costs for the year are " + totalCost);

    }

}
