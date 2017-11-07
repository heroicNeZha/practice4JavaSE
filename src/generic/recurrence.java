package generic;

/**
 * Created by Administrator on 2017/11/5.
 */
public class recurrence {
    public static void main(String[] args){
        show(1);
    }

    public static void show(int index){
        System.out.println(index);
        show(++index);
    }
}
