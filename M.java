import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try { 
			    
 			 System.out.println("please input register name:"); 
 			    BufferedReader reader = new BufferedReader(new InputStreamReader( 
 			    System.in)); 
 			    String userId = null; 
			    userId = reader.readLine(); 
			    MyEclipseGen myeclipsegen = new MyEclipseGen(); 
			    String res = myeclipsegen.getSerial(userId, "5"); 
			    System.out.println("Serial:" + res); 
			    reader.readLine(); 
			   } catch (IOException ex) { 
			   }
	}


}
