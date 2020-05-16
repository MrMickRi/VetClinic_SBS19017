package Objects;

public class Animals {

	String name;
	int age;
	String type;
	String condition;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return "Animals"
				+ "["
				+":: Name=" + name 
				+":: Age =" + age 
				+":: Type of Animal =" + type 
				+":: Condition =" + condition 
				+"]";
				
	}
	
}
