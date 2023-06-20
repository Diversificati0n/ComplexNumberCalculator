package ComplexNumberCalculator;

class StandardComplexNumber extends AbstractComplexNumber {
    public StandardComplexNumber(double real, double imaginary) {
        super(real, imaginary);
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.getReal();
        double resultImaginary = this.imaginary + other.getImaginary();
        return new StandardComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        double resultReal = (this.real * other.getReal()) - (this.imaginary * other.getImaginary());
        double resultImaginary = (this.real * other.getImaginary()) + (this.imaginary * other.getReal());
        return new StandardComplexNumber(resultReal, resultImaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = (other.getReal() * other.getReal()) + (other.getImaginary() * other.getImaginary());
        double resultReal = ((this.real * other.getReal()) + (this.imaginary * other.getImaginary())) / denominator;
        double resultImaginary = ((this.imaginary * other.getReal()) - (this.real * other.getImaginary())) / denominator;
        return new StandardComplexNumber(resultReal, resultImaginary);
    }
}

