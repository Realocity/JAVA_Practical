import java.sql.SQLException;

public class SaveStudentDemo {
	public static void main(String[] args) throws SQLException {
		SaveStudent saveStudentObj = new SaveStudent();
		saveStudentObj.storeStudentDetail("Rahul", 1, "MCA", "11/12/1998", "rahul@gmail.com");
		saveStudentObj.storeStudentDetail("Manoj", 2, "MBA", "5/3/1998", "rahul@gmail.com");
		saveStudentObj.storeStudentDetail("Pratik", 3, "MCA", "13/6/1998", "rahul@gmail.com");
		saveStudentObj.storeStudentDetail("Mehul", 4, "BCA", "4/2/1999", "rahul@gmail.com");
		saveStudentObj.storeStudentDetail("Sidhart", 5, "BBA", "3/8/1999", "rahul@gmail.com");
	}
}
