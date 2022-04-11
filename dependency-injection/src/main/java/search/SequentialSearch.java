package search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import sort.ISortAlgorithm;

@Component
public class SequentialSearch extends ISearchAlgorithm {

    @Autowired
    @Qualifier("legacySort")
    private ISortAlgorithm sortAlgorithm;

    // No need for explicit constructor, but assume the following:
    // -----------------------------------------------------------
    // public SequentialSearch(SortAlgorithm sortAlgorithm) {
    //     this.sortAlgorithm = sortAlgorithm;
    // }

    @Override
    public boolean search(int[] where, int what){
        sortAlgorithm.sort(where);
        super.printClassName();
        return true;
    }
}