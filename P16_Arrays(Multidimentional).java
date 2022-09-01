import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        char [][] answers =new char[5][5];
        char [][] key =new char[5][5];
        int correct=0;
        key[0][0]='A';
        key[0][1]='A';
        key[0][2]='A';
        key[0][3]='A';
        key[0][4]='A';
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<8;j++)
            {
                answers[i][j]=sc.next().charAt(0);
                if(answers[i][j]==key[i][j])
                {
                    correct++;
                }
            }
            System.out.println(correct);
        }
    }
}
