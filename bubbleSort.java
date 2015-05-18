import java.util.*;

public class bubbleSort implements sortingAlgorithm
{
    public void sort(int[] array)
    {
        int j;
        boolean sorted = true;
        int temp;

        while ( sorted )
        {
            sorted= false;    
            for( j=0;  j < array.length -1;  j++ )
            {
                if ( array[ j ] > array[j+1] )   
                {
                    temp = array[ j ]; 
                    array[ j ] = array[ j+1 ];
                    array[ j+1 ] = temp;
                    sorted = true; 
                } 
            } 
        } 
    }
}

//sort algorithm from http://crunchify.com/java-bubble-sort-algorithm-ascending-order-sample/