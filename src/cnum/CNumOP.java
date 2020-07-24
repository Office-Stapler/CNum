package cnum;

public class CNumOP {
    /**
     * A simple method to add two rectangular complex numbers
     * @param x - A complex number in rectangular form
     * @param y - A complex number in rectangular form
     * @return - A new Complex Numer in Rectangular form
     */
    public static CNumRect add(CNumRect x, CNumRect y) {
        double addRe = x.getRe() + y.getRe();
        double addIm = x.getIm() + y.getIm();
        return new CNumRect(addRe, addIm);
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static CNumRect minus(CNumRect x, CNumRect y) {
        double minusRe = x.getRe() - y.getRe();
        double minusIm = x.getIm() - y.getIm();
        return new CNumRect(minusRe, minusIm);
    }
    
    public static CNumPol divide(CNumPol x, CNumPol y) {
        double mod = x.getModulus() / y.getModulus();
        double arg = x.getArgument() - y.getArgument();
        return new CNumPol(mod, arg);
    }

    public static CNumPol multiply(CNumPol x, CNumPol y) {
        double mod = x.getModulus() * y.getModulus();
        double arg = x.getArgument() + y.getArgument();
        return new CNumPol(mod, arg);
    }
    public static CNumRect multiply(CNumRect x, CNumRect y) {
        /*
        Parems:
            A CNumRect x.
            A CNumRect y.
        Returns:
            A new CNumRect which multiplies x by y.
         */
        return multiply(x.getPolar(), y.getPolar()).getRect();
    }

    public static CNumRect divide(CNumRect x, CNumRect y) {
        /*
        Parems:
            A CNumRect x.
            A CNumRect y.
        Returns:
            A new CNumRect which divides x by y.
         */
        return divide(x.getPolar(), y.getPolar()).getRect();
    }

    public static CNumRect add(CNumRect x, CNumPol y) {
        /*
        Parems:
            A CNumRect x.
            A CNumPol y.
        Returns:
            A new CNumRect which adds x with y.
        Assumes that the CNumPol is in radians.
         */
        return add(x, y.getRect());
    }

    public static CNumRect minus(CNumRect x, CNumPol y) {
        /*
        Parems:
            A CNumRect x.
            A CNumPol y.
        Returns:
            A new CNumRect which minuses x by y.
        Assumes that the CNumPol is in radians.
         */
        return minus(x, y.getRect());
    }

    public static CNumRect multiply(CNumRect x, CNumPol y) {
        /*
        Parems:
            A CNumRect x.
            A CNumPol y.
        Returns:
            A new CNumRect which multiplies the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return multiply(x.getPolar(), y).getRect();
    }

    public static CNumRect divide(CNumRect x, CNumPol y) {
        /*
        Parems:
            A CNumRect x.
            A CNumPol y.
        Returns:
            A new CNumRect which divides the current CNumRect with the other CNumPol z.
        Assumes that the CNumPol is in radians.
         */
        return divide(x.getPolar(), y).getRect();
    }

    public static CNumPol add(CNumPol x, CNumRect y) {
        /*
        Parems:
            A CNumPol x.
            A CNumRect y.
        Returns:
            A new CNumPol which adds x to y.
        Assumes that the CNumPol is in radians.
         */
        return add(x.getRect(), y).getPolar();
    }

    public static CNumPol minus(CNumPol x, CNumRect y) {
        /*
        Parems:
            A CNumPol x.
            A CNumRect y.
        Returns:
            A new CNumPol which minuses x by y.
        Assumes that the CNumPol is in radians.
         */
        return minus(x.getRect(), y).getPolar();
    }

    public static CNumPol multiply(CNumPol x, CNumRect y) {
        /*
        Parems:
            A CNumPol x.
            A CNumRect y.
        Returns:
            A new CNumPol which multiplies x by y.
        Assumes that the CNumPol is in radians.
         */
        return multiply(x, y.getPolar());
    }

    public static CNumPol divide(CNumPol x, CNumRect y) {
        /*
        Parems:
            A CNumPol x.
            A CNumRect y.
        Returns:
            A new CNumPol which divides x by y.
        Assumes that the CNumPol is in radians.
         */
        return divide(x, y.getPolar());
    }


    public static CNumPol add(CNumPol x, CNumPol y) {
        /*
        Parems:
            A CNumPol x.
            A CNumPol y.
        Returns:
            A new CNumPol which adds x by y.
        Assumes that the CNumPol is in radians.
         */
        return add(x.getRect(), y.getRect()).getPolar();
    }

    public static CNumPol minus(CNumPol x, CNumPol y) {
        /*
        Parems:
            A CNumPol x.
            A CNumPol y.
        Returns:
            A new CNumPol which minuses x by y.
        Assumes that the CNumPol is in radians.
         */
        return minus(x.getRect(), y.getRect()).getPolar();
    }

}
