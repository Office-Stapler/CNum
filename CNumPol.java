package CNum;
import CNum.CNumRect;
public class CNumPol{
    private double modulus;
    private double argument;
    public CNumPol() {
        modulus = 0.0;
        argument = 0.0;
    }

    public CNumPol(double modulus, double argument) {
        this.modulus = modulus;
        this.argument = argument;
    }

    public String toString() {
        return String.format("%.3fcis(%.3f)", this.modulus, this.argument);
    }

    public CNumPol add(CNumPol z) {
        /*
        Parems:
            A CNumPol z.
        Returns:
            A new CNumPol which divides the current CNumPol with the other CNumPol z.
         */
        CNumRect curr = this.getRect();
        CNumRect newZ = z.getRect();
        return curr.add(newZ).getPolar();
    }

    public CNumPol minus(CNumPol z) {
        CNumRect curr = this.getRect();
        CNumRect newZ = z.getRect();
        return curr.minus(newZ).getPolar();
    }

    public CNumPol multiply(CNumPol z) {
        double mod = this.modulus * z.getModulus();
        double arg = this.argument + z.getArgument();
        return new CNumPol(mod, arg);
    }

    public CNumPol divide(CNumPol z) {
        double mod = this.modulus / z.getModulus();
        double arg = this.modulus - z.getArgument();
        return new CNumPol(mod, arg);
    }

    public CNumPol addRect(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A New CNumPol which adds the current CNumPol with the other CNumRect z.
         */
        return this.add(z.getPolar());
    }

    public CNumPol minusRect(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A New CNumPol which minuses the current CNumPol with the other CNumRect z.
         */
        return this.minus(z.getPolar());
    }

    public CNumPol multiplyRect(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A New CNumPol which multiplies the current CNumPol with the other CNumRect z.
         */
        return this.multiply(z.getPolar());
    }

    public CNumPol divideRect(CNumRect z) {
        /*
        Parems:
            A CNumRect z.
        Returns:
            A New CNumPol which divides the current CNumPol with the other CNumRect z.
         */
        return this.divide(z.getPolar());
    }

    public CNumRect getRect() {
        /*
        Converts the current polar form to rectangular form assuming the argument
        is in radians.
        Parems:
            None
        Returns:
            A new CNum with equivalent real and imaginary form.
         */
        return new CNumRect(this.modulus * Math.cos(this.argument), this.modulus * Math.sin(this.argument));
    }

    public CNumRect getRectDegrees() {
        /*
        Converts the current polar form to rectangular form assuming the argument
        is in degrees.
        Parems:
            None
        Returns:
            A new CNum with equivalent real and imaginary form.
         */
        return new CNumRect(this.modulus * Math.cos(this.getDeg()), this.modulus * Math.sin(this.getDeg()));
    }

    public double getDeg() {
        /*
        Gets the current argument to its degree equivalent,
        assumes the current argument is in radians.
        Parems:
            None
        Returns:
            An angle in degrees.
         */
        return this.argument * (180 / Math.PI);
    }

    public double getRad() {
        /*
        Gets the current argument to its radian equivalent,
        assumes the current argument is in degrees.
        Parems:
            None
        Returns:
           An angle in radians.
         */
        return this.argument * (Math.PI / 180);
    }

    public double getModulus() {
        return this.modulus;
    }

    public double getArgument() {
        return this.argument;
    }
}
