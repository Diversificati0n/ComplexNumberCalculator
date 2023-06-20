package ComplexNumberCalculator;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new StandardComplexNumber(5, 10);
        ComplexNumber num2 = new StandardComplexNumber(6, 9);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber division = num1.divide(num2);

        System.out.printf("Сумма: %.1f + %.1fi\n", sum.getReal(), sum.getImaginary());
        System.out.printf("Произведение: %.1f + %.1fi\n", product.getReal(), product.getImaginary());
        System.out.printf("Деление: %.1f + %.1fi\n", division.getReal(), division.getImaginary());

    }
}
