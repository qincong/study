enum Signal {GREEN,YELLOW,RED,}
public class HelloJava {
	Signal color = Signal.RED;
	public void change() {
		switch(color) {
			case RED: color = Signal.GREEN;
				break;
			case GREEN:
				color = Signal.YELLOW;
				break;
			case YELLOW:
				color = Signal.RED;
				break;
		}
	}
	public String toString() {
		return "The traffic light is " + color;
	}
	public static void main(String[] args){
		HelloJava t = new HelloJava();
		for(int i = 0;i < 7;i++) {
			System.out.println(t);
			t.change();
		}
	}
}











