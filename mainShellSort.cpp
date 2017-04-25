//
//  main.cpp
//  Shell Sort
//
//  Created by Jake Cordelli on 4/24/17.
//  Copyright © 2017 Jake Cordelli. All rights reserved.
//  Code Assistance from http://www.sanfoundry.com/cplusplus-program-implement-shell-sort/

#include <iostream>
#include <chrono>
#include <ctime>

using namespace std;


//Print values
void print_ar (int ar[], int size)
{
    for (int i = 0; i < size; ++i)
    {
        cout << ar[i] << " ";
    }
    cout << endl;
}

//Shell sort function
void shell_sort (int ar[], int size)
{
    int j;
    
    //Narrow the array by 2 everytime
    for (int gap = size / 2; gap > 0; gap /= 2)
    {
        for (int i = gap; i < size; ++i)
        {
            int temp = ar[i];
            for (j = i; j >= gap && temp < ar[j - gap]; j -= gap)
            {
                ar[j] = ar[j - gap];
            }
            ar[j] = temp;
        }
    }
}


int main(int argc, const char * argv[]) {
    //Insert before the target operation of the program
    std::chrono::time_point<std::chrono::system_clock> start, end;
    start = std::chrono::system_clock::now();
    

    
    //Elements in the array (TURN THIS INTO A VECTOR)
    int ar[] = {1, 4, 16, 30, 29, 18, 100, 2, 43, 1};
    
    cout << "Intial Array : ";
    print_ar (ar, 10);
    
    shell_sort (ar, 10);
    
    cout << "Sorted Array : ";
    print_ar (ar, 10);
    
    //Insert after the target operation of the program
    end = std::chrono::system_clock::now();
    
    cout<<("\n\t\t\t#####TIME STAMP#####\n");
    std::chrono::duration<double> elapsed_seconds = end-start;
    std::time_t end_time = std::chrono::system_clock::to_time_t(end);
    
    std::cout << "finished computation at " << std::ctime(&end_time);
    int time =(elapsed_seconds.count()*1000000);
    std::cout<< "elapsed time in microseconds: " << time << " micro seconds\n";
    
    
    return 0;
}

