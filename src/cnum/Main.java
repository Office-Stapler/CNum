package cnum;

public class Main {
    public static void main(String[] args) {
        CNumRect rect = new CNumRect(1,2);
        CNumPol pol = new CNumPol(10, Math.PI);
        System.out.println(CNumOP.add(rect, pol));
        System.out.println(CNumOP.minus(rect, pol));
    }
}
