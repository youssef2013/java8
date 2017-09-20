package fr.ybf.ocpjp.generics;

public class Youssef extends Ingenieur {

	private Integer age;
	private String food;
	
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Youssef(int age, String food) {
		this.age = age;
		this.food = food;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Youssef [age=" + age + ", food=" + food + "]";
	}

	
	
	
	
}
