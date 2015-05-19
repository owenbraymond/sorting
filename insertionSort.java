import java.util.*;

public class insertionSort implements sortingAlgorithm
{
    public void sort(int[] array)
    {
        for(int i = 0; i < array.length; i ++)
        {
            for(int k = 0; k < i; k ++)
            {
                if(array[i] < array[k])
                {
                    int temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
    }
}
