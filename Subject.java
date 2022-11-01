package Com.bnt;

public class Subject {
	private String subjectName;
	private int mark;
	private int totalMark;

	public Subject(String subjectName, int mark, int totalMark) {
		super();
		this.subjectName = subjectName;
		this.mark = mark;
		this.totalMark = totalMark;
	}
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subject [subjectName=");
		builder.append(subjectName);
		builder.append(", mark=");
		builder.append(mark);
		builder.append(", totalMark=");
		builder.append(totalMark);
		builder.append("]");
		return builder.toString();
	}


}
