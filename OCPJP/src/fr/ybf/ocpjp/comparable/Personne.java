package fr.ybf.ocpjp.comparable;

public class Personne  implements Comparable<Personne>{
	private int age;
	
	private String name;

	public Personne(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
		return o.age - age;
	}

	@Override
	public String toString() {
		return "Personne [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
