import java.util.Arrays;

public class SharedResourceExample {

    int [] arr = new int[10];

    void produceItem()
    {
        for(int i=0;i<10;i++)
        {
            arr[i]=i;
        }
    }

    void consumeItem()
    {
        if(arr.length!=0)
        {
         
        }
    }
}
