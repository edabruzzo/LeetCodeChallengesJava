package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.util.Arrays;

/**
 *
 * @link https://www.baeldung.com/java-arrays-guide
 *
 *
 * @author Emmanuel Abruzzo
 * @date 15/01/2022
 */
public class MedianTwoSortedArrays {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        int m = nums1.length;
        int n_num2 = nums2.length;

        boolean condicao1 = m>= 0 && m<=1000;
        boolean condicao2 = n_num2>= 0 && n_num2<=1000;
        boolean condicao3 = m+n_num2>= 0 && m+n_num2<=2000;



        int[] arrayResultante = concatenarArrays(nums1, nums2);
        Arrays.sort(arrayResultante);
        int n = arrayResultante.length;

         if (n % 2 != 0)            // se o tamanho do Array resultante após a concatenação e sort for par
            return (double) arrayResultante[n / 2];
         else
            return (double)(arrayResultante[(n - 1) / 2] + arrayResultante[n / 2]) / 2.0;

    }

    public static int[] concatenarArrays(int[] array1, int[] array2){
        
        int[] arrayResultante = new int[array1.length + array2.length];
        for (int i = 0; i < arrayResultante.length; i++) {
                 arrayResultante[i] = (i < array1.length ? array1[i] : array2[i - array1.length]);
        }
        return arrayResultante;
    }




    public static void main(String[] args) {

       int[] nums1 = new int[]{1,3};
       int[] nums2 = new int[]{2};

       double medianSortedArrays =  findMedianSortedArrays(nums1, nums2);

        System.out.println(String.format("{}",medianSortedArrays));

    }

}
