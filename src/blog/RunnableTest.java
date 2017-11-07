package blog;

public class RunnableTest {
	public static void main(String[] args) {
		
		class c1 implements Runnable{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.out.println("hello" + i);
				}
			}
		}
		
		class c2 implements Runnable{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					System.out.println("goodbye" + i);
				}
			}
		}

		

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
