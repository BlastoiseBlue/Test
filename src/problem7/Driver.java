package problem7;

public class Driver {

	public static void main(String[] args) {
		Complex n1=new Complex(10,4);
		System.out.println(n1);
		Complex n2=new Complex(6,5);
		System.out.println(n1.add(n2));
		System.out.println(Complex.subtract(n1, n2));
		System.out.println(Complex.multiply(n1, n2));
	}

}
