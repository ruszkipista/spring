package search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import sort.ISortAlgorithm;

@Component
@Primary
public class BinarySearch extends ISearchAlgorithm {

    @Autowired
    @Qualifier("defaultSort")
    private ISortAlgorithm sortAlgorithm;

    // No need for explicit constructor, but assume the following:
    // -----------------------------------------------------------
    // public BinarySearch(SortAlgorithm sortAlgorithm) {
    //     this.sortAlgorithm = sortAlgorithm;
    // }

    @Override
    public boolean search(int[] where, int what){
        sortAlgorithm.sort(where);
        super.printClassName();
        return true;
    }
}
