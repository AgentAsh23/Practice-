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
    printf("%d\n",s1);
    printf("%d\n",s2);
    for(int i=0;i<Y;i++)
    {
        final_str[i]=str[i];
    }
     for(int i=0;i<s2;i++)
    {
        final_str[Y+i]=add_str[i];
    }
    for(int i=0;i<s1+Y;i++)
    {
        final_str[s2+Y+i]=str[s2-Y+i];
    }
    printf("%s",final_str);
    return 0;
}
