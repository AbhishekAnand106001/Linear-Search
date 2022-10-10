//finding minimum and maximum element in array using 
//linear Sarch
import java.util.Scanner;
public class Main
{
    static class Pair
    {
        int min;
        int max;
    }
    
    static Pair getMinMax(int arr[], int n)
    {
        Pair minmax = new Pair();
        
        if (n==1)
        {
            minmax.min = arr[0];
            minmax.max = arr[0];
         return minmax;
        }
    
    if(arr[0] > arr[1])
    {
        minmax.max = arr[0];
        minmax.min = arr[1];
    }
    else
    {
        minmax.max = arr[1];
        minmax.min = arr[0];
    }
    
    for(int i=2; i<n; i++)
    {
    if(arr[i] > minmax.max)
    {
        minmax.max = arr[i];
    }
    else if(arr[i] < minmax.min)
    {
        minmax.min = arr[i];
    }
}
    return minmax;
}

public static void main(String[] args)
{
    System.out.println("Enter the numbr of elements");
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements");
    for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    Pair minmax = getMinMax(arr, n);
    System.out.println(minmax.min);
    System.out.println(minmax.max);
    // int arr[] = {500, 475, 875, 932, 1001, 005, 1200};
    // Pair minmax = getMinMax(arr, 7);
    // System.out.println(minmax.min);
    // System.out.println(minmax.max);
}
}
