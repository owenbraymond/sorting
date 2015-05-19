import java.util.*;

public class mainSort
{
    public static void main()
    {
        int[] array = new int[100];

        selectionSort selSorter = new selectionSort();
        insertionSort inSorter = new insertionSort();
        bubbleSort bubSorter = new bubbleSort();

        for(int i = 0; i < array.length; i ++)
        {
            array[i] = (int)(9 * Math.random());
            System.out.print(array[i]);
        }
        inSorter.sort(array);
        System.out.println();
        for(int i = 0; i < array.length; i ++)
        {
            System.out.print(array[i]);
        }
    }
}
