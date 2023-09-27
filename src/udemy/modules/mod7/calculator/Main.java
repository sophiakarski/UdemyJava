package udemy.modules.mod7.calculator;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("Add = " + simpleCalculator.getAdditionResult());
        System.out.println("Subtract = " + simpleCalculator.getSubtractionResult());

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);

        System.out.println("Multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("Divide = " + simpleCalculator.getDivisionResult());

    }

}
