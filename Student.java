package Com.bnt;

public class Student {
	private int rollNo;
	private String name;
	private Subject math;
	private Subject marathi;
	private Subject hindi;

	public Student(int rollNo, String name, Subject math, Subject marathi, Subject hindi) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.math = math;
		this.marathi = marathi;
		this.hindi = hindi;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public Subject getMarathi() {
		return marathi;
	}

	public void setMarathi(Subject marathi) {
		this.marathi = marathi;
	}

	public Subject getHindi() {
		return hindi;
	}

	public void setHindi(Subject hindi) {
		this.hindi = hindi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [rollNo=");
		builder.append(rollNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", math=");
		builder.append(math);
		builder.append(", marathi=");
		builder.append(marathi);
		builder.append(", hindi=");
		builder.append(hindi);
		builder.append("]");
		return builder.toString();
	}



}
