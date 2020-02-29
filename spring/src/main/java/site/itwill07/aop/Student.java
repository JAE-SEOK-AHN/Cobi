package site.itwill07.aop;

public class Student {
	private int num;
	private String name;
	private String email;
	
	public Student() {
		 System.out.println("### Student Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	public Student(int num) {
		super();
		this.num = num;
		System.out.println("### Student Ŭ������ �Ű�����(�й�)�� �����ϴ� ������ ȣ�� ###");
	}
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
		System.out.println("### Student Ŭ������ �Ű�����(�й�,�̸�)�� �����ϴ� ������ ȣ�� ###");
	}

	public Student(int num, String name, String email) {
		super();
		this.num = num;
		this.name = name;
		this.email = email;
		System.out.println("### Student Ŭ������ �Ű�����(�й�,�̸�,�̸���)�� �����ϴ� ������ ȣ�� ###");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		System.out.println("+++ Student Ŭ������ setNum() �޼ҵ� ȣ�� +++");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("+++ Student Ŭ������ setName() �޼ҵ� ȣ�� +++");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("+++ Student Ŭ������ setEmail() �޼ҵ� ȣ�� +++");
	}
	
	@Override
	public String toString() {
		return "�й� = "+num+", �̸� = "+name+", �̸��� = "+email;
	}
}