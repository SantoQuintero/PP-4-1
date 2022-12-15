public class GoodStudent
{
    private String firstName;
    private String lastName;
    private int id;
    private double gpa;
    private boolean isCsStudent;

    //creates a student object fully
    public GoodStudent(String name, int id, double gpa, boolean isCsStudent)
    {
        firstName = name.substring(0,name.indexOf(" "));
        lastName = name.substring(name.indexOf(" ")+1);
        this.id = id;
        this.gpa = gpa;
        this.isCsStudent = isCsStudent;
    }//end of constructor full

    //creates a student object partially
    public GoodStudent(String name, boolean isCsStudent)
    {
        firstName = name.substring(0,name.indexOf(" "));
        lastName = name.substring(name.indexOf(" ")+1);
        id = -1;
        gpa = -1;
        this.isCsStudent = isCsStudent;
    }//end of constructor partially


    //creates a student object empty
    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        id = -1;
        gpa = -1;
        isCsStudent = false;
    }//end of constructor empty

    //returns firstName
    public String getFirstName()
    {
        return firstName;
    }//end of getFirstName

    //returns lastName
    public String getLastName()
    {
        return lastName;
    }//end of getLastName


    //returns id
    public int getId()
    {
        return id;
    }//end of getId

    //returns gpa
    public double getGpa()
    {
        return gpa;
    }//end of getGpa

    //returns isCsStudent
    public boolean getIsCsStudent()
    {
        return isCsStudent;
    }//end of getIsCsStudent

    //sets firstName
    public void setName(String firstName)
    {
        this.firstName = firstName;
    }//end of setFirstName

    //sets lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }//end of setLastName

    //sets id
    public void setId(int id)
    {
        this.id = id;
    }//end of setId

    //sets gpa
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }//end of setGpa

    //sets isCsStudent
    public void setIsCsStudent(boolean isCsStudent)
    {
        this.isCsStudent = isCsStudent;
    }//end of setIsCsStudent

    //returns a created id
    public String createId()
    {
        return firstName.substring(0,1).toLowerCase()+lastName.toLowerCase()+id%1000;
    }//end of createId

    //returns the boosted gpa
    public double getCsGpa()
    {
        if(isCsStudent)
        {
            return gpa*1.15;
        }
        else
        {
            return gpa;
        }
    }//end of csGpa








    //returns the student information in a string
    public String toString()
    {

        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nID: " + id + "\nRaw GPA: " + gpa + "\nCS Student: " + isCsStudent;
    }//end of toString

}//end of class


