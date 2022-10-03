import java.util.*;
class Person 
{
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    Person(String firstName, String lastName, int identification)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    public void printPerson()
    {
         System.out.println("Name: "+lastName+ ", " +firstName+"\nID:"+ idNumber); 
    }
}
class Student extends Person
{
    private int[] testScores;
    Student(String firstName, String lastName, int identification,int[] testScores)
    {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    char calculate()
    {
        double sum=0;
        double average=0;
        char grade = ' '; 
        for(int n : testScores)
        {
            sum += n;
        }
        average = sum/testScores.length;
        if(average>=90 && average<=100)
        {
            grade='O';
        }
        else if(average<90 && average>=80)
        {
            grade = 'E';
        }
        else if(average<80 && average>=70)
        {  
            grade='A';
        }
        else if(average<70 && average>=55)
        {
            grade = 'P';
        }
        else if(average<55 && average>=40)
        {
        grade = 'D';
        }
        else if(average<40)
        {
        grade = 'T';
        }
        return grade;
    }
    
    
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String F=sc.next();
        String F1=sc.next();
        int id=sc.nextInt();
        int I=sc.nextInt();
        int [] arr = new int[I];
        for(int i=0;i<I;i++){
            arr[i] = sc.nextInt();
        }
        Student s = new Student(F,F1,id,arr);
        System.out.println("Name: "+F+", "+F1);
        System.out.println("ID: "+id);
        System.out.println("Grade: "+s.calculate() );
     
        
    }
}
