package Com.bnt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
public static void main(String[] args) {

		List<Student> studentList = getStudentData();
		Map<String, List<Student>> mapStudent = getMapOfStudent(studentList);
		System.out.println("-------------------------------------------------");
		Map<String, List<Student>> mapStudent1 = SortingList(studentList);
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
		Subject marathi3 = new Subject("marathi", 33, 100);
		Subject hindi3 = new Subject("hindi", 33, 100);
		Subject math4 = new Subject("math", 11, 100);
		Subject marathi4 = new Subject("marathi", 11, 100);
		Subject hindi4 = new Subject("hindi", 11, 100);

		Student studentPrateek = new Student(1, "Prateek", math, marathi, hindi);
		Student studentRitesh = new Student(2, "Ritesh", math1, marathi1, hindi1);
		Student studentShiv = new Student(3, "Shiv", math2, marathi2, hindi2);
		Student studentSwara = new Student(4, "Swara", math3, marathi3, hindi3);
		Student studentApurwa = new Student(5, "Apurwa", math4, marathi4, hindi4);

		studentList.add(studentPrateek);
		studentList.add(studentRitesh);
		studentList.add(studentShiv);
		studentList.add(studentSwara);
		studentList.add(studentApurwa);
		return studentList;
	}

	static int greaterThan50Student = 0;
	static int lessthan50Student = 0;
	static int studentCnt = 0;
	static int subjectCnt = 0;
	static int outOfMarks = 0;
	static int totalSubjectmarks;
	static double percentage;
	static double totalmark;

	private static Map<String, List<Student>> getMapOfStudent(List<Student> studentList) {

		Map<String, List<Student>> studentMap = new HashMap<String, List<Student>>();
		Map<String, List<Student>> differenceOfMaraksStudents = new HashMap<String, List<Student>>();
		List<Student> greaterThan50Percentage = new ArrayList<Student>();
		List<Student> lessThan50Percentage = new ArrayList<Student>();
		for (Student student : studentList) {

			// write percentage logic here and split into studentlistLessThen50percent &
			// studentlistGreaterThen50percent
			Subject math = student.getMath();
			Subject marathi = student.getMarathi();
			Subject hindi = student.getHindi();

			totalmark = math.getMark() + marathi.getMark() + hindi.getMark();
			outOfMarks = hindi.getTotalMark() + marathi.getTotalMark() + math.getTotalMark();
			subjectCnt = outOfMarks / 100;
			percentage = ((totalmark / outOfMarks) * 100);
			percentage = Double.parseDouble(new DecimalFormat("##.##").format(percentage));
			studentCnt++;
			totalSubjectmarks = 100 * subjectCnt * studentCnt;

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

			System.out.println("Total marks obtained by " + student.getName() + " is: " + totalmark);
			System.out.println("Total Percentage Obtained by " + student.getName() + " is: " + "" + percentage + "%");
			System.out.println();

			System.out.println();
			System.out.println("---------------------------------------------");

		}

		System.out.println("Total number of students: " + studentCnt);
		System.out.println("Total number of subjects: " + subjectCnt);
		System.out.println("Print total subject marks of all students: " + totalSubjectmarks);
		System.out.println("Out of total marks: " + outOfMarks);

	//	System.out.println(differenceOfMaraksStudents);
		System.out.println("---------------------------------------------");
		System.out.println("count of graeter than 50 percent student: " + greaterThan50Student);
		System.out.println("count of less than 50 percent student: " + lessthan50Student);

		return studentMap;
	}

	private static Map<String, List<Student>> SortingList(List<Student> studentList) {
		Map<String, List<Student>> differenceOfMaraksStudents11 = new HashMap<String, List<Student>>();
		List<Student> greaterThan50Percentage1 = new ArrayList<Student>();
		List<Student> lessThan50Percentage1 = new ArrayList<Student>();
		Collections.sort(studentList, new StudentSortByName());
		for (Student student : studentList) {

			Subject math = student.getMath();
			Subject marathi = student.getMarathi();
			Subject hindi = student.getHindi();

			totalmark = math.getMark() + marathi.getMark() + hindi.getMark();
			outOfMarks = hindi.getTotalMark() + marathi.getTotalMark() + math.getTotalMark();
			subjectCnt = outOfMarks / 100;
			percentage = ((totalmark / outOfMarks) * 100);
			percentage = Double.parseDouble(new DecimalFormat("##.##").format(percentage));

			if (percentage > 50) {
				greaterThan50Percentage1.add(student);
				greaterThan50Student++;
			} else {
				lessThan50Percentage1.add(student);
				lessthan50Student++;
			}

			differenceOfMaraksStudents11.put("name of list grater than 50 per", greaterThan50Percentage1);
			differenceOfMaraksStudents11.put("name of list less than 50 per", lessThan50Percentage1);

		}
		System.out.println(differenceOfMaraksStudents11);

		return differenceOfMaraksStudents11;

	}

	

}
