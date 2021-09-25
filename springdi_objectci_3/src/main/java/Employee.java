public class Employee {
	private int id;
	private String name;
	private Address address;
	private Department dpt;

//public Employee() {System.out.println("def cons");}  

	public Employee(int id, String name, Address address, Department dpt) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dpt = dpt;
		System.out.println("Employee(int id, String name, Address address)");
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDpt() {
		return dpt;
	}

	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}

	void show() {
		System.out.println("Employee Details: " + id + " " + name);
		//System.out.println("Employee Address Details:" + address.toString());
		address.toString();
		//System.out.println("Employee Dept Details:" + dpt.showd());
		dpt.toString();
	}

}
