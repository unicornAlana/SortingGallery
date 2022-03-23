package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to array with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums)
    {
        if (nums[0]>nums[1])
        {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        else
        {
            nums[0] = nums[0];
            nums[1] = nums[1];
        }

    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2)
    {
        int i = 0;
        int a = 0;
        int b = 0;

        while (a < array1.length && b < array2.length)
        {
            if (array1[a] < array2[b])
            {
                inputArray[i] = array1[a];
                a++;
            }
            else
            {
                inputArray[i] = array2[b];
                b++;
            }
            i++;
        }
        while(a < array1.length) {
            //add them all in in order.
            inputArray[i] = array1[a];
            a++;
            i++;
        }

        while(b < array2.length) {
            //add them all in in order.
            inputArray[i] = array2[b];
            b++;
            i++;
        }

    }
}
