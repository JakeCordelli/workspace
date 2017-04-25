//
//  main.cpp
//  MergeSort
//
//  Created by Jake Cordelli on 4/25/17.
//  Code Assistance from http://www.sanfoundry.com/cpp-program-implement-merge-sort/
//  Implemented and modified by Jake Cordelli


#include <iostream>
#include <chrono>
#include <ctime>

using namespace std;
//#include <conio.h>
void merge(int *,int, int , int );
void mergesort(int *a, int low, int high)
{
    int mid;
    if (low < high)
    {
        //Divide the
        mid=(low+high)/2;
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,high,mid);
    }
    return;
}
void merge(int *a, int low, int high, int mid)
{
    int i, j, k, c[50];
    i = low;
    k = low;
    j = mid + 1;
    while (i <= mid && j <= high)
    {
        if (a[i] < a[j])
        {
            c[k] = a[i];
            k++;
            i++;
        }
        else
        {
            c[k] = a[j];
            k++;
            j++;
        }
    }
    while (i <= mid)
    {
        c[k] = a[i];
        k++;
        i++;
    }
    while (j <= high)
    {
        c[k] = a[j];
        k++;
        j++;
    }
    for (i = low; i < k; i++)
    {
        a[i] = c[i];
    }
}
//Print values
void print_ar (int ar[], int size)
{
    for (int i = 0; i < size; ++i)
    {
        cout << ar[i] << " ";
    }
    cout << endl;
}
int main(int argc, const char * argv[])
{
    //Insert before the target operation of the program
    std::chrono::time_point<std::chrono::system_clock> start, end;
    start = std::chrono::system_clock::now();
    
    //Elements in the array (TURN THIS INTO A VECTOR)
    int ar[] = {1, 4, 16, 30, 29, 18, 100, 2, 43, 1};
    
    cout << "Intial Array : ";
    print_ar(ar, 10);
    
    mergesort(ar, 0, 9);
    cout<<"Sorted array : ";
    for (int i = 0; i < 10; i++)
    {
        cout<<ar[i];
        cout<<" ";
    }
    
    //Insert after the target operation of the program
    end = std::chrono::system_clock::now();
    
    cout<<("\n\n\t\t\t#####TIME STAMP#####\n");
    std::chrono::duration<double> elapsed_seconds = end-start;
    std::time_t end_time = std::chrono::system_clock::to_time_t(end);
    
    std::cout << "finished computation at " << std::ctime(&end_time);
    int time =(elapsed_seconds.count()*1000000);
    std::cout<< "elapsed time in microseconds: " << time << " micro seconds\n";
    
    return 0;
}
