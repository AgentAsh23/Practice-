#include <stdio.h>
struct DOB
    {
        int day;
        int month;
        int year;
    };

struct Patient
{
    char Patient_name[50];
    struct DOB DoB;
    float Bill_Amount;
    float Final_Bill;
    int age;
    };
int main()
{
    struct Patient P;
    struct Patient normal[100], senior[100];
    int number;
    int a=0, b=0;
    printf("Please enter number of patients: \n");
    scanf("%d",&number);
    for (int i=0; i<number; i++){
        struct DOB date;
        printf("Enter Date of Birth of the Patient\n");
        scanf("%d\n",&date.day);
        scanf("%d\n",&date.month);
        scanf("%d",&date.year);
        int age= 2022-date.year;
        if (age>=60){
            senior[a].DoB = date;
            senior[a].age = age;
            printf("Enter the name of the patient\n");
            scanf("%s",&senior[a].Patient_name);
            printf("Enter the bill amount of the patient\n");
            scanf("%f",&senior[a].Bill_Amount);
            a++;
        }
        else{
            normal[b].DoB = date;
            normal[b].age = age;
            printf("Enter the name of the patient\n");
            scanf("%s",&normal[b].Patient_name);
            printf("Enter the bill amount of the patient\n");
            scanf("%f",&normal[b].Bill_Amount);
            b++;
        }
    }
    
    for (int i=0; i<b; i++){
        printf("%s is eligible for discount",senior[i].Patient_name);
        printf("Final amount is ");
        printf("%f",senior[i].Bill_Amount*0.75);
    }
    return 0;
}
