#include <iostream>
using namespace std;
class node 
{
    public:
    char data;
    node* next;
    // constructor
    node(char x){
        data = x;
        next = NULL;
}
};
node* string_to_SLL(string s)
{
    if(s.size() == 0) return NULL;
    node *head = new node(s[0]);
    node* curr = head;
    for (int i = 1; i < s.size(); i++) 
    {
        curr->next = new node(s[i]);
        curr = curr->next;
    }
    return head;
}
void print(node* head)
{
    node* curr = head;
    while (curr != NULL) 
    {
        cout << curr->data << " -> ";
        curr = curr->next;
    }
    cout<<"NULL";
}

int main()
{
    cout<<"Enter a string "<<endl;
    string s;
    cin>>s;
    node *head = string_to_SLL(s);
    print(head);
    return 0;
}
