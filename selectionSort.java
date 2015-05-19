import java.util.*;

public class selectionSort implements sortingAlgorithm
{
    public void sort(int[] array)
    {
        int smallest;
        int switchindex = 0;
        for(int i = 0; i < array.length; i ++)
        {
            smallest = array[i];
            for(int j = i; j < array.length; j++)
            {
                if(array[j] < smallest)
                {
                    smallest = array[j];
                    switchindex = j;
                }
            }
            array[switchindex] = array[i];
            array[i] = smallest;
        }
    }
}