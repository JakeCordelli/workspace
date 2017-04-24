#include <iostream>
using namespace std;

//https://www.youtube.com/watch?v=U-MfAoL6qjM
struct node{
    int number;
    node *next;
};

bool isEmpty(node *head);
char menu();
void insertAsFirstElement(node *&head, node *&last, int number);
void insert(node *&head, node *&last, int number);
void remove(node *&head, node *&last);
void showList(node *current);


bool isEmpty(node *head)
{
    if (head == NULL)
        return true;
    else
        return false;
}


char menu()
{
//This menu is used to organize the choices and allow the user to select what they want to do to the ll
    char choice;
    cout<<"Menu"<<endl;
    cout<<"1. Add an Item"<<endl;
    cout<<"2. Remove an Item"<<endl;
    cout<<"3. Show the List"<<endl;
    cout<<"4. Exit"<<endl;
    
    cin>>choice;
    
    return choice;
}

void insertAsFirstElement(node *&head, node *&last, int number)
{
    node *temp= new node;
    temp->number = number;
    temp->next = NULL;
    head = temp;
    last  = temp;
    
}

void insert(node *&head, node *&last, int number)
{
    if (isEmpty(head))
        insertAsFirstElement(head, last, number);
    else
    {
        node *temp= new node;
        temp->number = number;
        temp->next = NULL;
        last ->next = temp;
        last = temp;
    }
    
}

void remove(node *&head, node *&last)
{
    if(isEmpty(head))
        cout<< "The list is already empty";
    else if (head == last)
    {
        delete head;
        head == NULL;
        last == NULL;
    }
    else
    {
        node *temp =head;
        head = head->next;
        delete temp;
        
    }
    
}

void showList(node *current)
{
    if(isEmpty(current))
    {
        cout<<"Thelist is empty";
    }
    else
    {
        cout<<"The list contains: ";
        while (current !=NULL)
        {
            cout << current ->number <<endl;
            current= current ->next;
        }
    }
}


int main()
{
    node *head =NULL;
    node *last =NULL;
    char choice;
    int number;
    
    do{
        choice = menu();
        switch (choice)
        {
            case '1':   cout<<"Please enter a number";
                            cin >>number;
                            insert (head, last, number);
                            break;
                
            case '2':   remove (head, last);
                            break;
                
            case '3':   showList(head);
                            break;
            default: cout<<"System exit";
        }
    }
    while (choice!='4');
    return 0;
    
    
}