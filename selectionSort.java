import java.util.*;

public class selectionSort implements sortingAlgorithm
{
    public void sort(int[] array)
    {
        int smallest;
        int switchindex = 0;
        for(int i = 0; i < array.length; i ++)
        {
            smallest = i;
            for(int j = i; j < array.length; j++)
            {
                if(array[j] < array[smallest])
                {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
}