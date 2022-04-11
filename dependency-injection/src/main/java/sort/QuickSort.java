package sort;

import org.springframework.stereotype.Component;

@Component("defaultSort")
public class QuickSort extends ISortAlgorithm{

    @Override
    public int[] sort(int[] arr) {
        super.printClassName();        
        return arr;
    }
    
}
