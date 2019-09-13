
public class Animal {
	String name;
	int legs;
	
	public int getLegs() {
		return legs;
	}
	public String getName() {
		return name;
	}
	
	public int compareTo(Animal o) {
		if (name != o.name) {
			return name.compareTo(o.name);
		}
		return legs - o.legs;
	}
}
