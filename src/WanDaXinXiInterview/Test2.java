package WanDaXinXiInterview;

public class Test2 {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(true);
		Object o1 = (Object)b1;
		Object o2 = (Object)b2;
		if (o1 == o2) {
			if (o1.equals(o2)) {
				System.out.println("a");
			}else {
				System.out.println("b");
			}
		}else {
			if (o1.equals(o2)) {
				System.out.println("c");
			}else {
				System.out.println("d");
			}
		}
	}
}
