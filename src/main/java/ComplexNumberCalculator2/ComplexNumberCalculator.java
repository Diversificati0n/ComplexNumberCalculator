package ComplexNumberCalculator2;

public class ComplexNumberCalculator {
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = num1.getReal() + num2.getReal();
        double resultImaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(resultReal, resultImaginary);
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double resultReal = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());
        double resultImaginary = (num1.getReal() * num2.getImaginary()) + (num1.getImaginary() * num2.getReal());
        return new ComplexNumber(resultReal, resultImaginary);
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double denominator = (num2.getReal() * num2.getReal()) + (num2.getImaginary() * num2.getImaginary());
        double resultReal = ((num1.getReal() * num2.getReal()) + (num1.getImaginary() * num2.getImaginary())) / denominator;
        double resultImaginary = ((num1.getImaginary() * num2.getReal()) - (num1.getReal() * num2.getImaginary())) / denominator;
        return new ComplexNumber(resultReal, resultImaginary);
    }
}
