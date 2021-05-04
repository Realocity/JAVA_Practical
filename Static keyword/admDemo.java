package Package1;

public class admDemo {

public static void main(String[] args) {
	MCAAdmission mcaAdmObj1 = new MCAAdmission();
	MCAAdmission mcaAdmObj2 = new MCAAdmission();
	MCAAdmission mcaAdmObj3 = new MCAAdmission();
	
	System.out.println("========================================" );
	mcaAdmObj1.getAdmission();
	
	int count = mcaAdmObj1.totalAdmissions();
	System.out.println("Total admissions are: "+ count);
	
	mcaAdmObj2.getAdmission();
	count = mcaAdmObj1.totalAdmissions();
	System.out.println("Total admissions are: "+ count );
	
	mcaAdmObj3.getAdmission();
	count = mcaAdmObj1.totalAdmissions();
	System.out.println("Total admissions are: "+ count );
	
	System.out.println("========================================" );
	
	System.out.println("Total admissions are: "+ MCAAdmission.totalAdmn	);
	
	

}

}
