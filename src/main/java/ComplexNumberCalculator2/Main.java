package ComplexNumberCalculator2;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 10);
        ComplexNumber num2 = new ComplexNumber(6, 9);

        ComplexNumberCalculator calculator = new ComplexNumberCalculator();
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber division = calculator.divide(num1, num2);

        System.out.printf("Сумма: %.1f + %.1fi\n", sum.getReal(), sum.getImaginary());
        System.out.printf("Произведение: %.1f + %.1fi\n", product.getReal(), product.getImaginary());
        System.out.printf("Деление: %.1f + %.1fi\n", division.getReal(), division.getImaginary());
    }
}
