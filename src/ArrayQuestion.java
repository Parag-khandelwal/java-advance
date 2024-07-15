/*  
 Given an array of integer Triplet. you have to sort the array in ascending order with respect to the last element in the triplet. 
 
Examples: 
 
Input:  { {1, 2, 3}, {2, 2, 4}, {5, 6, 1}, {10, 2, 10} } 
Output:  { {5, 6, 1}, {1, 2, 3}, {2, 2, 4}, {10, 2, 10} } 
 
Input:  { {10, 20, 30}, {40, -1, 2}, {30, 10, -1}, {50, 10, 50} } 
Output:  { {30, 18, -1}, {40, -1, 2}, {10, 20, 30}, {50, 10, 50} } 
*/ 
 
 
// package fivequestions; 
import java.util.Scanner; 
import java.util.Arrays;
 
class ArrangTriplets{ 
    int n = 4; 
    int m = 3; 
    Scanner sc = new Scanner(System.in); 
    int [] lastElemnts = new int[4]; 
    int [] sortedLastElements = new int[4]; 
 
 
    int [][] arr = new int[n][m]; 
 
    // int[4] => { {}, {}, {}, {} } 
 
    public void setArray(){ 
        for(int i = 0; i < n ; i++){ 
            for(int j = 0; j < m ; j++){ 
                System.out.print("Enter arr element: "); 
                int num = sc.nextInt(); 
                arr[i][j] = num; 
            } 
        } 
    } 
 
    public void displayArray(){ 
        for(int i = 0; i < n ; i++){ 
            for(int j = 0; j < m ; j++){ 
                System.out.print(arr[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
 
    public void arrangeArray(){ 
        for(int i = 0; i < n; i++){ 
            lastElemnts[i] = arr[i][2]; 
        } 

        System.arraycopy(lastElemnts, 0, sortedLastElements, 0, lastElemnts.length);
        Arrays.sort(sortedLastElements);

        int [][] sortedArr = new int[n][m];
        for (int i = 0; i < sortedLastElements.length; i++) {
            for (int j = 0; j < lastElemnts.length; j++) {
                if (sortedLastElements[i] == lastElemnts[j]) {
                    sortedArr[i] = arr[j];
                    lastElemnts[j] = -1; 
                    break;
                }
            }
        }

        for(int i = 0; i < n ; i++){ 
            for(int j = 0; j < m ; j++){ 
                System.out.print(sortedArr[i][j] + " "); 
            } 
            System.out.println(); 
        } 
    } 
} 
 

 
 
 
public class ArrayQuestion { 
    public static void main(String[] args) { 
        ArrangTriplets tri = new ArrangTriplets(); 
        tri.setArray(); 
        // tri.displayArray(); 
        tri.arrangeArray(); 
    } 
     
}
