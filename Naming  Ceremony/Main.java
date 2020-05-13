#include<iostream>
using namespace std;
#define MAX_LENGTH 100
int main() 
{
  char name[MAX_LENGTH]={0};
  cout<<name;
  cin.getline(name,MAX_LENGTH);
  cout<<name<<endl;
}
  