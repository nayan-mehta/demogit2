package day3;

public class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
        Complex n = new Complex(5.6, 9.8),
               
                temp;

        temp = display(n);

        System.out.printf(" %.1f + %.1fi", temp.real, temp.imag);
    }

    public static Complex display(Complex n)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n.real;
        temp.imag = n.imag;

        return(temp);
    }
}
