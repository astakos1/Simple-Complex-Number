//AEM 11033
import java.lang.Math;

public class SimpleComplex {
	
	private float real; //real part of the complex number
	private float imaginary; //complex part of the complex number

	SimpleComplex(){
		this.real = 0;
		this.imaginary = 0;
	}
	SimpleComplex(float real, float imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	void setReal(float real) {
		this.real = real;
	}
	float getReal() {
		return real;
	}
	void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	float getImaginary() {
		return imaginary;
	}
	
	float computeNorm() /*returns the |z|*/ {
		return (float)Math.sqrt(imaginary*imaginary + real*real);
	}	

}	
