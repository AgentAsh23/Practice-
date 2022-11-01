#include<iostream>
using namespace std;
class node
{
    public:
    int data;
    node* next;
    node* prev;
    node(int val)
    {
        data=val;
        next=NULL;
        prev=NULL;
    }
};

void insertAtHead(node* &head, int val)
{
    node* n= new node(val);
    n->next=head;
    if(head!=NULL)
    {
        head->prev=n;
    }
    head=n;
}

void insertAtTail(node* &head, int val)
{
    if(head==NULL)
    {
        insertAtHead(head,val);
        return;
    }
    node* n=new node(val);
    node* temp=head;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=n;
    n->prev=temp;
}

void display(node* head)
{
    node* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

node* mergeRecurssive(node* &head1, node* &head2)
{
    if(head1==NULL)
    {
        return head2;
    }
    if(head2==NULL)
    {
        return head1;
    }
    node* result;
    if(head1->data<head2->data)
    {
        result=head1;
        result->next=mergeRecurssive(head1->next ,head2);
    }
    else
    {
        result=head2;
        result->next=mergeRecurssive(head1 ,head2->next);
    }
    return result;
}

int main()
{
    node* head1=NULL;
    node* head2=NULL;
    int arr1[]={1,4,5,7};
    int arr2[]={2,3,6};
    for(int i=0;i<4;i++)
    {
        insertAtTail(head1,arr1[i]);
    }
    for(int i=0;i<3;i++)
    {
        insertAtTail(head2,arr2[i]);
    }
    display(head1);
    display(head2);
    node* newhead=mergeRecurssive(head1,head2);
    display(newhead);
    return 0;
}
