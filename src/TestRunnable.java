import java.util.*;

public class TestRunnable implements Runnable{
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 1; i++)
			System.out.println(this.toString());
	}

	public String toString() {
		return "!*! \r" + "\"**\"\r"+ "#***#\r" + "$****$\r" +"%*****%\r" +"&******&\r" + "'*******'\r" + "(********(\r"+ ")*********)\r"+ "************\r";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}
