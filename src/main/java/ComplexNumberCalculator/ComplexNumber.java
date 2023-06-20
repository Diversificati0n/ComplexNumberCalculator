package ComplexNumberCalculator;

interface ComplexNumber {
    double getReal();
    double getImaginary();
    ComplexNumber add(ComplexNumber other);
    ComplexNumber multiply(ComplexNumber other);
    ComplexNumber divide(ComplexNumber other);
}