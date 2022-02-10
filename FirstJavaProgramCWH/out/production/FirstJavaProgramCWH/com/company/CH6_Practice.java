package com.company;
import java.util.Scanner;

public class CH6_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //Problem-1
//        float[] numbers={5.0f,2.5f,7.8f,9.0f,5.6f,6.7f};
//        float sum=0;
//       for(float element: numbers){
//           sum=sum+element;
//       }
//        System.out.print("Sum= "+sum);

//        //Problem-2
//        float[] numbers={5.0f,2.5f,7.8f,9.0f,5.6f,6.7f};
//        float num=45.7f;
//        boolean isInArray=false;
//        for(float element: numbers) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//            if(isInArray){
//                System.out.print("The value is present in the array.");
//            }
//            else{
//                System.out.print("The value is not present in the array.");
//            }

        //Problem-3
//        int[] numbers={100,98,97,78,80};
//        int sum=0;
//       for(int element: numbers){
//           sum=sum+element;
//       }
//        System.out.println("Sum= "+sum);
//        System.out.print("Avg=");
//        System.out.print(sum/ numbers.length);

        //Problem-4
//        int[][] matrix1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] matrix2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//        for (int i = 0; i < matrix1.length; i++) { //row no. of times
//            for (int j = 0; j < matrix1[i].length; j++) {//column no. of times
//                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//        //Printing the elements of a 2D array
//        for (int i = 0; i < matrix1.length; i++) { //row no. of times
//            for (int j = 0; j < matrix1[i].length; j++) {//column no. of times
//                System.out.print(result[i][j]+" ");
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//            System.out.println("");
//        }

        //Problem-5
//        int[]arr={1,2,3,4,5,6};
//        int l= arr.length;
//        int temp;
//        int n=Math.floorDiv(l, 2);
//        //System.out.println(n);
//        for(int i=0; i<=n; i++){
//            //swap a[i] and a[l-1-i]
//            temp=arr[i];
//            arr[i]=arr[l-1-i];
//            arr[l-1-i]=temp;
//        }
//        for(int element: arr){
//            System.out.print(element+" ");
//        }

        //Problem-6
//        int[]arr={1,21,3,255,5,34,67};
//        int max=0;
//        for (int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("The maximum element in the array is : "+max);

        int[]arr={1,21,3,255,5,34,67};
       int max=0;
        for (int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("The maximum element in the array is : "+max);



















    }
}
