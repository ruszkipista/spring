package search.binary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    SortAlgorithm sortAlgorithm;

    public void search(int[] where, int what){
        sortAlgorithm.sort(where);
        System.out.println("Sorted with injected bean of "
                        +sortAlgorithm.getClass().getSimpleName());
    }
}
