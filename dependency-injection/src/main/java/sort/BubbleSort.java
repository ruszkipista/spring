package sort;

import org.springframework.stereotype.Component;

@Component("legacySort")
public class BubbleSort extends ISortAlgorithm{

    @Override
    public int[] sort(int[] arr) {
        super.printClassName();
        return arr;
    }
    
}
