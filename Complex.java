//AEM 11033
public class Complex extends SimpleComplex {
	Complex(){
		super();
	}
	Complex(float real, float imaginary){
			super(real, imaginary);
	}
	Complex conjugate(){
		return new Complex(super.getReal(), -super.getImaginary());
	}
	static Complex multiply(Complex c1, Complex c2) {
		return new Complex(c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary(),
					   c1.getReal() * c2.getImaginary() + c2.getReal() * c1.getImaginary());
		// (x1+iy1)(x2+iy2) = (x1x2 - y1y2) + i(y1x2 + x1y2)
	}
	
	private static void populateArray(Complex[] compArray) {
		//populates the array with random imaginary numbers 
		for (int i = 0; i<compArray.length; i++)
			compArray[i] = new Complex((float)Math.random()*10, (float)Math.random()*10);
	}
	private static void printArrayAndNorm(Complex[] compArray, float[] norms) {
		//prints the array with the complex and their norms with the format
		//(Real) + (Imaginary)i   norm = 
		for(int i = 0; i < compArray.length; i++){
			System.out.println("(" + compArray[i].getReal() + ") + (" +compArray[i].getImaginary() + ")i  norm = " + norms[i]);
		}
		
	}
	
	public static void main(String[] args) {
		Complex compArray[] = new Complex[10];
		populateArray(compArray);
		
		float norms[] = new float[10];
		for(int i = 0; i < compArray.length; i++)
			norms[i] = compArray[i].computeNorm();
		
		printArrayAndNorm(compArray, norms);
	}
	
	
}