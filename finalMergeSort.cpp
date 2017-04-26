// finalMergeSort.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
//
//  main.cpp
//  MergeSort
//
//  Created by Jake Cordelli on 4/25/17.
//  Code Assistance from http://www.sanfoundry.com/cpp-program-implement-merge-sort/
//  Implemented and modified by Jake Cordelli


#include <iostream>
using namespace std;

void merge(int *, int, int, int);
void mergesort(int *a, int low, int high)
{
	int mid;
	if (low < high)
	{
		//Divide the sum of low and high by 2
		mid = (low + high) / 2;
		mergesort(a, low, mid);
		mergesort(a, mid + 1, high);
		merge(a, low, high, mid);
	}

	//The program runs until low is less than the value of high 
	return;
}

//main mergesort function
void merge(int *a, int low, int high, int mid)
{
	//this is where variables are initialized based on inputs from the function
	int i, j, k, c[50];
	i = low;
	k = low;
	j = mid + 1;

	//While the low is less than or equal to the min and also less than or equal to the high...
	while (i <= mid && j <= high)
	{
		//If the element in the original array at the low point is less than the original array at the midpoint...
		if (a[i] < a[j])
		{
			//the low element is placed into the newly established array and the value is updated in the original array 
			c[k] = a[i];
			//Increment k and i by one through each loop to look for the next items 
			k++;
			i++;
		}
		//If the element in the original array at the low point is NOT less than the original array at the midpoint...
		else
		{
			//the low element is placed into the newly established array and then the mid value is updated in the original array
			c[k] = a[j];
			//Increment k and i by one through each loop to look for the next items 
			k++;
			j++;
		}
	}
	//While the low is less than or equal to the mid value...
	while (i <= mid)
	{
		//the low element is placed into the newly established array and the value is updated in the original array 
		c[k] = a[i];
		//Increment k and i by one through each loop to look for the next items 
		k++;
		i++;
	}
	//While the mid is less than or equal to the high value...
	while (j <= high)
	{
		//the low element is placed into the newly established array and then the mid value is updated in the original array
		c[k] = a[j];
		//Increment k and i by one through each loop to look for the next items 
		k++;
		j++;
	}

	//This loop is used to compare the values in the old array and the newly established array.
	//This is where the final sort occurs 
	for (i = low; i < k; i++)
	{
		a[i] = c[i];
	}
}
//function that simply prints the original array 
void print_ar(int ar[], int size)
{
	for (int i = 0; i < size; ++i)
	{
		cout << ar[i] << " ";
	}
	cout << endl;
}
int main(int argc, const char * argv[])
{
	//Array of numbers to sort
	int ar[] = { 1, 4, 16, 30, 29, 18, 100, 2, 43, 1 };

	//Prints the initial array
	cout << "Intial Array : ";
	print_ar(ar, 10);

	//runs the mergesort function and prints the sorted array
	mergesort(ar, 0, 9);
	cout << "Sorted array : ";
	for (int i = 0; i < 10; i++)
	{
		cout << ar[i];
		cout << " ";
	}
	cout << endl;

	//Program ends
	return 0;
}


