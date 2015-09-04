package Java;
import java.util.*; 
import static net.mindview.util.Print.*;

public class HelloJava {
	static Random rand = new Random(47);
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		print("1: " + ints);
		ints.add(8);
		print("2: " + ints);
		print("3: " + ints.contains(8));
		ints.remove(Integer.valueOf(8));
		Integer i = ints.get(2);
		print("4: " + i + " " + ints.indexOf(i));
		Integer j = Integer.valueOf(1);
		print("5: " + ints.indexOf(j));
		print("6: " + ints.remove(j));
		print("7: " + ints.remove(i));
		print("8: " + ints);
		ints.add(3,0);
		print("9: " + ints);
		List<Integer> sub = ints.subList(1,4);
		print("subList: " + sub);
		print("10: " + ints.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("11: " + ints.containsAll(sub));
		Collections.shuffle(sub,rand);
		print("shuffled subList: " + sub);
		print("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1),ints.get(4));
		print("sub: " + sub);
		copy.retainAll(sub);
		print("13: " + copy);
	}
}
