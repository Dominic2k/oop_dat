package CLASSES;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real = real;
    }

    public double getImag(){
        return this.imag;
    } 
    public void setImag(double imag){
        this.imag = imag;
    }

    public void setValues(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    // "(x + yi)" 
    public String toString(){
        return "(" + this.real + " + " + this.imag +"i)";
    }

    public boolean isReal(){
        return (this.imag == 0);
    }
    public boolean isImag(){
        return (this.real == 0);
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex anotherComplex){
        return this.real == anotherComplex.getReal() && this.imag == anotherComplex.getImag();
    }

    public double magnitude(){
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }

    public double argumentInRadians(){
        return Math.atan2(this.real, this.imag);
    }

    public int argumentInDegrees(){
        return (int)Math.toDegrees(argumentInRadians());
    }

    public MyComplex conjugate(){
        return new MyComplex(this.real, -this.imag);
    }

    public MyComplex add(MyComplex anotherComplex){
        return new MyComplex(this.real + anotherComplex.getReal(), this.imag + anotherComplex.getImag());
    }
    public MyComplex subtract(MyComplex anotherComplex){
        return new MyComplex(this.real - anotherComplex.getReal(), this.imag - anotherComplex.getImag());
    }

    public MyComplex multiplyWith(MyComplex anotherComplex){
        return new MyComplex((this.real*anotherComplex.getReal()-this.imag*anotherComplex.getImag()) + (this.real*anotherComplex.getImag()+this.imag*anotherComplex.getReal()), imag);
    }

    public MyComplex divideBy(MyComplex anotherComplex){
        return new MyComplex(real, imag);
    }
}

