package Thread;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableTest {

	public static void main(String[] args) {
		Runnable task = ()->{
			for(int i =0;i<5;i++)
				System.out.println("hello"+i);
		};
		
		Runnable task2 = new Runnable() {
			@Override
			public void run() {
				for(int i =0;i<5;i++)
					System.out.println("goodbye"+i);
			}
		};
		Executor exec = Executors.newCachedThreadPool();
		exec.execute(task);
		exec.execute(task2);
	}
}
