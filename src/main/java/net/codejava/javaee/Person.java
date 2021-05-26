package net.codejava.javaee;

public class Person {
	private String name;
	private Integer age;
		
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Get y set necesario para q se reconozca en JavaBean
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
