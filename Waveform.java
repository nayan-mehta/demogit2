package day3;

import java.util.Arrays;

public class Waveform {
	void swap(int arr[], int a, int b)
	{ 
		int temp = arr[a]; 
		arr[a] = arr[b];
		arr[b] = temp; 
}
void Waveform(int arr[],int n)
{
Arrays.sort(arr);
for(int i=0;i<n-1;i+=2)
	swap(arr , i , i+1);
}
public static void main(String args[]) 
{
	Waveform ob = new Waveform(); 
	int arr[] = {1,2,3,4,5,6,7,8,9,10}; 
	int n = arr.length; 
	ob.Waveform(arr, n); 
	for (int i : arr) 
		System.out.print(i + " "); } 


	
}
