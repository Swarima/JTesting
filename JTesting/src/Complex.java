	public class Complex{
		public int real,img;
		public Complex() {
			real=0;
			img=0;
		}
		public Complex(int r,int i) {
			real=r;
			img=i;
		}
		public Complex add(Complex c) {
			real=this.real+c.real;
			img=this.img+c.img;
			return this;
		}
		public Complex subtract(Complex c) {
			this.real=this.real-c.real;
			this.img=this.img-c.img;
			return this;
		}
		@Override
		public String toString() {
			return "Complex [real=" + real + ", img=" + img + "]";
		}
		
		
	}
