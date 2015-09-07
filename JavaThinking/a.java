enum Search {HITHER,YON,}
public class HelloJava {
	public static void main(String[] args){
		Search[] vals = Search.values();
		Enum e = Search.HITHER;
		for(Enum en : e.getClass().getEnumConstants())
			System.out.println(en);
	}
}


Hello


his is f



This is feature-A
OK