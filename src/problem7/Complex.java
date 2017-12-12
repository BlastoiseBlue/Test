package problem7;

public class Complex {
	double real = 0;
	double imaginary = 0;

	Complex(double a, double b) {
		real = a;
		imaginary = b;
	}

	Complex(double a) {
		real = a;
		imaginary = 0;
	}

	Complex() {
		real = 0;
		imaginary = 0;
	}

	public static Complex add(Complex c1, Complex c2) {
		Complex c3 = new Complex((c1.real + c2.real), (c1.imaginary + c2.imaginary));
		return c3;
	}
	public Complex add(Complex c2) {
		return add(this,c2);
	}
	public static Complex subtract(Complex c1, Complex c2) {
		Complex c3 = new Complex((c1.real - c2.real), (c1.imaginary - c2.imaginary));
		return c3;
	}
	public Complex subtract(Complex c2) {
		return add(this,c2);
	}
	public static Complex multiply(Complex c1, Complex c2) {
		Complex c3 = new Complex((c1.real * c2.real - c1.imaginary * c2.imaginary),
				(c1.real * c2.imaginary + c2.real * c1.imaginary));
		return c3;
	}
	public Complex multiply(Complex c2) {
		return multiply(this,c2);
	}
	public String toString() {
		if(this.imaginary>=0)return (this.real+"+"+this.imaginary+"i");
		else return (this.real+""+this.imaginary+"i");
	}
}
