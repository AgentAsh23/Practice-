#include <iostream>
using namespace std;
class node
{
    public:
    int data;
    node*next;
    
    node(int val)
    {
        data=val;
        next=NULL;
    }
};

void insertAtTail(node* &head,int val)
{
    node*n= new node(val);
    if(head==NULL)
    {
        head=n;
        return;
    }
    node*temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;
}

void insertAtHead(node* &head,int val)
{
    node*n= new node(val);
    n->next=head;
    head=n;
}

bool search(node*head ,int key)
{
    node*temp=head;
    while(temp!=NULL)
    {
        if(temp->data==key)
        {
            return true;
        }
        temp=temp->next;
    }
    return false;
}

void deleteAtHead(node* &head)
    {
        node* toDelete=head;
        head=head->next;
        delete toDelete;
    }

void deletion(node*head,int val)
{
    node*temp=head;
    if(head==NULL)
    {
        return;
    }
    if(head->next==NULL)
    {
        deleteAtHead(head);
        return;
    }
    while(temp->next->data!=val)
    {
        temp=temp->next;
    }
    node* toDelete =temp->next;
    temp->next=temp->next->next;
    delete toDelete;
}

void display(node* head)
{
    node* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

int main() 
{
    node *head=NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtHead(head,4);
    display(head);
    cout<<search(head,5)<<endl;
    cout<<search(head,2)<<endl;
    deletion(head,2);
    display(head);
    deleteAtHead(head);
    return 0;
}
