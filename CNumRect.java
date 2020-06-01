package CNum;

public class CNumRect {
    /*
   Simple Complex Number in Polar form with operations done in polar form
    */
    private double Re;
    private double Im;

    public CNumRect() {
        /*
        Initializing with empty argument, makes a new 0 CNum.
         */
        this.Re = 0;
        this.Im = 0;
    }

    public CNumRect(double Re, double Im) {
        /*
        Initializing a CNumRect with Real number Re and Imaginary number Im.
         */
        this.Re = Re;
        this.Im = Im;
    }

    public CNumRect(double Re) {
        /*
        Initializing a CNumRect with Real number Re and Imaginary number 0.
         */
        this.Re = Re;
        this.Im = 0;
    }

    public CNumRect getConjugate() {
        return new CNumRect(this.Re, -this.Im);
    }



    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
    }

    public void setRe(double set) {
        this.Re = set;
    }

    public void setIm(double set) {
        this.Im = set;
    }

    public String toString() {
        if (Im >= 0) {
            return String.format("%.3f + %.3fi", Re, Im);
        } else {
            return String.format("%.3f - %.3fi", Re, -Im);
        }
    }

    public CNumPol getPolar() {
        /*
        Converts the current CNumRect to a CNumMA (Modulus Argument).
        Parems:
            None
        Returns:
            A new CNumMA which includes its converted modulus and argument.
         */
        double argument = Math.atan(Im / Re);
        double modulus = Math.sqrt(Math.pow(Re, 2) + Math.pow(Im, 2));
        return new CNumPol(modulus, argument);
    }
}
