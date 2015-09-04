package Java;
import java.util.*; 
import typeinfo.pets.*;
import static net.mindview.util.Print.*;

public class HelloJava {
	public static void main(String[] args) {
		Map<String,Pet> petMap = new HashMap<String,Pet> ();
		petMap.put("My Cat",new Cat("Molly"));
		petMap.put("My dog",new Dog("Ginger"));
		petMap.put("My Hamster",new Hamster("Bosco"));
		print(petMap);
		Pet dog = petMap.get("My dog");
		print(dog);
		print(petMap.containsKey("My dog"));
		print(petMap.containsValue(dog));
	}
}
