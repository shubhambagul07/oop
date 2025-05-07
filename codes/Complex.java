package complex;

public class Complex {
    private double real;
    private double imag;

    // Default constructor
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Parameterized constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Add method
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Subtract method
    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Multiply method
    public Complex multiply(Complex c) {
        double r = this.real * c.real - this.imag * c.imag;
        double i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    // Display method
    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}
