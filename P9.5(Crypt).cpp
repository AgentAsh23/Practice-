// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() 
{
    int a[10];
    for(int i=0;i<10;i++)
    {
        if(a[i]!=a[i-1] )
        {
            int k=rand()%10;
            if(k>0 || k==0);
            {
                a[i]=k;
            }
        }
    }
    cout<<a[10]<<endl;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
 
// Function to display the array
void display(int a[], int n)
{
  for (int i = 0; i < n; i++) {
    cout << a[i] << " ";
  }
  cout << endl;
}
 
// Function to find the permutations
void findPermutations(int a[], int n)
{
 
  // Sort the given array
  sort(a, a + n);
 
  // Find all possible permutations
  cout << "Possible permutations are:\n";
  do {
    display(a, n);
  } while (next_permutation(a, a + n));
}
 
// Driver code
int main()
{
 
  int a[] = { 10, 20, 30, 40 };
 
  int n = sizeof(a) / sizeof(a[0]);
 
  findPermutations(a, n);
 
  return 0;
}
