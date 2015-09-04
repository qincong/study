package Java;
import java.util.*; 
import typeinfo.pets.*;
import static net.mindview.util.Print.*;

public class HelloJava {
	public static void main(String[] args) {
		Random rand = new Random();
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i =0;i < 10000;i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r,freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
