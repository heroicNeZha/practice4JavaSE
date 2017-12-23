package other;

/**
 * Created by Administrator on 2017/12/23.
 */
public class ExtendedEUCLID {
    public static void main(String[] args){
        System.out.println(EEUCLID(3,8));
    }

    public static int EEUCLID(int d, int m){
        int[] X = {1,0,m};
        int[] Y = {0,1,d};
        while(true){
            if(Y[2]==0) return 0;
            if(Y[2]==1) return Y[1];
            int Q = X[2]/Y[2];
            int[] T = {X[0]-Q*Y[0],X[1]-Q*Y[1],X[2]-Q*Y[2]};
            X[0] = Y[0];
            X[1] = Y[1];
            X[2] = Y[2];
            Y[0]=T[0];
            Y[1]=T[1];
            Y[2]=T[2];
        }
    }
}
