
public class mainStudent {
	public static void main(String[]args){
		
		Student []stu =new underGradStudent[5];
		
		stu[0]=new underGradStudent("Alyemin", "Shikur", 3.05);
		stu[1]=new underGradStudent("Ekram", "Shikur", 2.98);
		stu[2]=new underGradStudent("Ametulah", "Shikur", 2.87);
		stu[3]=new PartTimeStudent("Hamudi", "Salih", 3.99, 45);
		stu[4]=new PartTimeStudent("Zikra", "Salih", 4.00, 90);
		
		
		
		
		//System.out.println(x.getFirstName() + " " + x.getLastName());
		
		for(Student st:stu)
			System.out.println(st.getFirstName()+ " "+ st.getLastName()+" "+ st.studentInfo());
		
	}

}
