package com.metanit;
/*** Написать метод, в который передается не пустой одномерный целочисленный
 массив, метод должен вернуть true, если в массиве есть место, в котором сумма
 левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10,
 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти
 символы в массив не входят.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert array size");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        boolean flag = CheckBalance(arr, n);
        if (flag == true) {
            System.out.println("There is a place in array where left and right sums are equal");
        }
        else {
            System.out.println("There isn't a place in array where left and right sums are equal");
        }
    }
    public static boolean CheckBalance(int arr[], int n) {
        int LeftSum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++)
        {
            // добавляем текущий элемент в левую сумму
            LeftSum += arr[i] ;
            // найдем сумму массива остальных элементов
            int rightSum = 0 ;
            for (int j = i+1 ; j < n ; j++)
                rightSum += arr[j] ;
          // индекс точки разделения
            if (LeftSum == rightSum)
                flag = true;
        }
        return flag;
    }
}
