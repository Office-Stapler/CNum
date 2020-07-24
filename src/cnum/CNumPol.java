package cnum;

public class CNumPol {
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

    public void setArgument(double argument) {
        this.argument = argument;
    }
}
