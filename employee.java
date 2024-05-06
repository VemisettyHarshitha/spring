package springdemo;

public class employee {
	
	int empid;
	String name;
	String city;
	public employee() {
		
	}
		qaws
	public employee(int empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
