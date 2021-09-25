package com.eg;

public class Employee {
	private int id;
	private String name;

	public Employee() {
		// System.out.println("Employee def cons");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		// System.out.println("Employee(int id, String name)");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		// System.out.println("setting id");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// System.out.println("setting name");
	}

	void show() {
		System.out.println(id + " " + name);
		// System.out.println(address.toString());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
