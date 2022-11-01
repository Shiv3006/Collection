package Com.bnt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// System.out.println(getStudentData());
		List<Student> studentList = getStudentData();
		Map<String, List<Student>> mapStudent = getMapOfStudent(studentList);
	}

	private static List<Student> getStudentData() {
		List<Student> studentList = new ArrayList<Student>();

		Subject math = new Subject("math", 75, 100);
		Subject marathi = new Subject("marathi", 70, 100);
		Subject hindi = new Subject("hindi", 69, 100);
		Subject math1 = new Subject("math", 45, 100);
		Subject marathi1 = new Subject("marathi", 50, 100);
		Subject hindi1 = new Subject("hindi", 51, 100);
		Subject math2 = new Subject("math", 55, 100);
		Subject marathi2 = new Subject("marathi", 77, 100);
		Subject hindi2 = new Subject("hindi", 88, 100);
		Subject math3 = new Subject("math", 35, 100);
		Subject marathi3 = new Subject("marathi", 66, 100);
		Subject hindi3 = new Subject("hindi", 87, 100);
		Student studentRitesh = new Student(1, "Ritesh", math1, marathi1, hindi1);
		Student studentPrateek = new Student(2, "Prateek", math, marathi, hindi);
		Student studentShiv = new Student(3, "Shiv", math2, marathi2, hindi2);
		Student studentSwara = new Student(4, "Swara", math3, marathi3, hindi3);

		studentList.add(studentPrateek);
		studentList.add(studentRitesh);
		studentList.add(studentShiv);
		studentList.add(studentSwara);
		return studentList;
	}

	static int greaterThan50Student = 0;
	static int lessthan50Student = 0;

	private static Map<String, List<Student>> getMapOfStudent(List<Student> studentList) {
		Map<String, List<Student>> studentMap = new HashMap<String, List<Student>>();
		Map<String, List<Student>> differenceOfMaraksStudents = new HashMap<String, List<Student>>();
		List<Student> greaterThan50Percentage = new ArrayList<Student>();
		List<Student> lessThan50Percentage = new ArrayList<Student>();
		float totalmark;
		double percentage;
		for (Student student : studentList) {

			// write percentage logic here and split into studentlistLessThen50percent &
			// studentlistGreaterThen50percent

			Subject hindi = student.getHindi();
			Subject marathi = student.getMarathi();
			Subject math = student.getMath();

			totalmark = hindi.getMark() + marathi.getMark() + math.getMark();
			percentage = ((totalmark / 300) * 100);
			percentage = Double.parseDouble(new DecimalFormat("##.##").format(percentage));

			if (percentage > 50) {
				greaterThan50Percentage.add(student);
				greaterThan50Student++;
			} else {
				lessThan50Percentage.add(student);
				lessthan50Student++;
			}

			differenceOfMaraksStudents.put("list of greater than 50 percentage students", greaterThan50Percentage);
			differenceOfMaraksStudents.put("list of less than 50 percentage students", lessThan50Percentage);

			System.out.println(" student name : " + student.getName());
			System.out.print(" Hindi mark : " + hindi.getMark());
			System.out.print(" marathi mark : " + marathi.getMark());
			System.out.print(" math mark : " + math.getMark());
			System.out.println();

			System.out.println("Total marks of:" + student.getName() + " " + totalmark);
			System.out.println("Percentage of " + student.getName() + ":" + "" + percentage + "%");
			System.out.println();

			System.out.println();
			System.out.println("---------------------------------------------");
		}
		System.out.println(differenceOfMaraksStudents);
		System.out.println("count of graeter than 50 percent student :" + greaterThan50Student);
		System.out.println("count of less than 50 percent student :" + lessthan50Student);

		return studentMap;
	}

}
