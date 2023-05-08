package architaTrials.IOexceptions;

public class C implements java.io.Serializable { private int v1;
private static double v2;
private transient A v3 = new A();
}
class A { } // A is not serializable


