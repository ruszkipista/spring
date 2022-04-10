package search.binary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm{

    @Override
    public int[] sort(int[] arr) {
        return arr;
    }
    
}
