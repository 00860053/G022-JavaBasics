public class AritmetischeOperationen {
    public static void main(String[] args) {
       //  System.out.println("HelloWorld");

        //Insert
        int varA = 3;
        int varB = 2;

        //Operation
        int resultPlus = varA + varB;
        int resultMinus = varA - varB;
        int resultMal = varA * varB;
        double resultDividieren = (double) varA / (1.0 * varB);
        int resultRest = varA % varB;

        //Print
        System.out.println("Summe : " + varA + " + " + varB + " = " + resultPlus );
        System.out.println("Differenz : " + varA + " - " + varB + " = " + resultMinus );
        System.out.println("Produkt : " + varA + " * " + varB + " = " + resultMal );
        System.out.println("Quotient : " + varA + " / " + varB + " = " + resultDividieren );
        System.out.println("Rest : " + varA + " % " + varB + " = " + resultRest );


    }
}
