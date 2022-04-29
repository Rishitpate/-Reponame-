package classes;

public class Student {
	
	String name;
	int age;
	String address;

	public Student (String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public void setaddress(String address) {
		this.name = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getaddress() {
		return address;
	}
	
	public static void main(String args[]) {
		Student john = new Student("John", 25,"17 Fairlight St");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getaddress());
	}

}
