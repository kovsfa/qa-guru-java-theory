package sfa.kov;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // primitiveIntArithmetic
        int a = 6;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // mixedTypeArithmetic
        int c = 2;
        double d = 3.4;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(d / c);

        // logicOperations
        double averageWeightOfWomen = 65.5;
        double averageWeightOfMen = 80.8;
        System.out.println(averageWeightOfWomen < averageWeightOfMen);

        if(averageWeightOfWomen > averageWeightOfMen) {
            System.out.println("Womeeeeen");
        }
        else {
            System.out.println("Meeeen");
        }

        String toBePrint = averageWeightOfWomen >= averageWeightOfMen ? "Wow, that's unexpected" : "Of course not";
        System.out.println(toBePrint);

        System.out.println(averageWeightOfWomen <= averageWeightOfMen);

        // min/max for float and double
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE; // наименьшее положительное
        float negativeMaxFloat = -Float.MAX_VALUE; // самое маленькое отрицательное

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE; // наименьшее положительное
        double negativeMaxDouble = -Double.MAX_VALUE; // самое маленькое отрицательное

        // overflow - когда результат выходит за пределы допустимого
        System.out.println(maxFloat * 2);
        System.out.println(maxDouble * 2);
        System.out.println(negativeMaxDouble * 2);
    }
}
