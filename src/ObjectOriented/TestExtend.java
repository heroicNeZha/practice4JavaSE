package ObjectOriented;

/**
 * Created by Administrator on 2017/12/5.
 */
public class TestExtend {

    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();
        A ab = new B();

        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}
