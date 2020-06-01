package CNum;
import CNum.CNumPol;

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

    public CNumRect add(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A new CNumRect which adds the current CNumRect with the other CNumRect z.
         */
        double addRe = this.Re + z.getRe();
        double addIm = this.Re + z.getRe();
        return new CNumRect(addRe, addIm);
    }

    public CNumRect minus(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A New CNumRect which minuses the current CNumRect with the other CNumRect z.
         */
        double minusRe = this.Re - z.getRe();
        double minusIm = this.Re - z.getRe();
        return new CNumRect(minusRe, minusIm);
    }

    public CNumRect multiply(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A new CNumRect which multiplies the current CNumRect with the other CNumRect z.
         */
        double otherRe = z.getRe();
        double otherIm = z.getIm();
        double real = this.Re * otherRe - this.Im * z.getIm();
        double imaginary = this.Re * z.getIm() + this.Im * z.getRe();
        return new CNumRect(real, imaginary);
    }

    public CNumRect divide(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A new CNumRect which divides the current CNumRect with the other CNumRect z.
         */
        CNumRect reciprocate = new CNumRect(z.getRe(), -z.getIm());
        CNumRect numerator = this.multiply(reciprocate);
        CNumRect denominator = z.multiply(reciprocate);
        return new CNumRect(numerator.getRe() / denominator.getRe(), numerator.getIm() / denominator.getRe());
    }

    public CNumRect addPolar(CNumPol z) {
        /*
        Parems:
            A CNumPol z.
        Returns:
            A new CNumRect which adds the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return this.add(z.getRect());
    }

    public CNumRect minusPolar(CNumPol z) {
        /*
        Parems:
            A CNumPol z.
        Returns:
            A new CNumRect which minuses the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return this.minus(z.getRect());
    }

    public CNumRect multiplyPolar(CNumPol z) {
        /*
        Parems:
            A CNumPol z.
        Returns:
            A new CNumRect which multiplies the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return this.multiply(z.getRect());
    }

    public CNumRect dividePolar(CNumPol z) {
        /*
        Parems:
            A CNumPol z.
        Returns:
            A new CNumRect which divides the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return this.divide(z.getRect());
    }


    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
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
