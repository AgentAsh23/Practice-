#include <stdio.h>
int main()
{
    int Y;
    char str[50]="";
    char add_str[50]="";
    char final_str[100]="";
    printf("Enter main String\n");
    scanf("%s",&str);
    printf("Enter String to be added\n");
    scanf("%s",&add_str);
    printf("Enter Position to be inserted\n");
    scanf("%d",&Y);
    int s1=strlen(str);
    int s2=strlen(add_str);
    for(int i=0;i<Y;i++)
    {
        final_str[i]==str[i];
    }
     for(int i=Y;i<Y+s2;i++)
    {
        for(int j=0;j<s2;j++)
        {
            final_str[i]==add_str[j];
        }
    }
    for(int i=Y+s2;i<s1+s2;i++)
    {
        for(int j=s2-s1;j<s2;j++)
        {
            final_str[i]==str[j];
        }
    }
    printf("%s",final_str);
    return 0;
}
