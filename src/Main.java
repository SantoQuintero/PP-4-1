public class Main {
    public static void main(String[] args) {
        GoodStudent student1= new GoodStudent("Alan Turing", 191254, 3.56, true);
        GoodStudent student2= new GoodStudent("Florence Nightingale", 182010, 3.89, false);
        GoodStudent student3= new GoodStudent("Grace Hopper", 190692, 3.99, true);
        System.out.println(student1.toString());
        student2.setId(95366);
        student2.setGpa(3.92);
        System.out.println("Florence’s ID: " + student2.getId() + " and gpa: " + student2.getGpa());
        System.out.println("Student 3’s first name: " + student3.getFirstName()+  " Enrolled in CS: " + student3.getIsCsStudent());
        System.out.println("Student 1’s (Alan Turing) new ID: " + student1.createId());
        System.out.println("Student 2’s (Florence Nightingale) new ID: " + student2.createId());
        System.out.println("Student 3’s (Grace Hopper) new ID: " + student3.createId());
        System.out.println("Student 1’s (Alan Turing) Computer Science GPA: " + student1.getCsGpa());
        System.out.println("Student 2’s (Florence Nightingale) Computer Science GPA: " + student2.getCsGpa());
        System.out.println("Student 3’s (Grace Hopper) Computer Science GPA: " + student3.getCsGpa());

    }//end of main
}//end of class