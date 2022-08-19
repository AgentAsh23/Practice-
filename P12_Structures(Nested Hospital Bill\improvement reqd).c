#include <stdio.h>
    struct Patient
    {
        char Patient_name[50];
        struct DOB
        {
            int day;
            int month;
            int year;
        }DoB;
        double Bill_Amount;
        double Final_Bill;
    };
    int main()
    {
        struct Patient P;
        printf("Enter the name of the patient\n");
        scanf("%s",P.Patient_name);
        printf("Enter Date of Birth of the Patient\n");
        scanf("%d\n",P.DoB.day);
        scanf("%d\n",P.DoB.month);
        scanf("%d\n",P.DoB.year);
        int age= 2022-P.DoB.year;
        printf("%d",age);
        printf("Enter the bill amount of the patient\n");
        scanf("%f",P.Bill_Amount);
        if(age>=60)
        {
            printf("You will get discount of 25 percent on your bill account");
            P.Final_Bill=P.Bill_Amount*0.75;
            printf("Your Final bill is %f",P.Final_Bill);
        }
        else
        {
            P.Final_Bill=P.Bill_Amount;
            printf("Your Final bill is %f",P.Final_Bill);
        }
        return 0;
    }#include <stdio.h>
    struct Patient
    {
        char Patient_name[50];
        struct DOB
        {
            int day;
            int month;
            int year;
        }DoB;
        double Bill_Amount;
        double Final_Bill;
    };
    int main()
    {
        struct Patient P;
        printf("Enter the name of the patient\n");
        scanf("%s",P.Patient_name);
        printf("Enter Date of Birth of the Patient\n");
        scanf("%d\n",P.DoB.day);
        scanf("%d\n",P.DoB.month);
        scanf("%d\n",P.DoB.year);
        int age= 2022-P.DoB.year;
        printf("%d",age);
        printf("Enter the bill amount of the patient\n");
        scanf("%f",P.Bill_Amount);
        if(age>=60)
        {
            printf("You will get discount of 25 percent on your bill account");
            P.Final_Bill=P.Bill_Amount*0.75;
            printf("Your Final bill is %f",P.Final_Bill);
        }
        else
        {
            P.Final_Bill=P.Bill_Amount;
            printf("Your Final bill is %f",P.Final_Bill);
        }
        return 0;
    }
