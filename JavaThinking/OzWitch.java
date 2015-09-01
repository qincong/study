enum Shrubbery {GROUND,CRAWLING,HANGING}
public enum HelloJava {
	WEST("Miss Gulch, ake the"),
	NORTH("Glinda,the Good"),
	EAST("Wicked Witch of the East"),
	SOUTH("Good by inference,but missing");
	private String description;
	private HelloJava(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	public static void main(String[] args){
		for(HelloJava witch : HelloJava.values()){
			System.out.println(witch + ":" + witch.getDescription());
		}
	}
}











