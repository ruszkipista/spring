package search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import sort.ISortAlgorithm;


@Component // make a bean out of this class
// Prototype: a NEW bean (class instance) is returned whenever requested from application context
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Primary // @Primary has priority over injection by name
public class BinarySearch extends ISearchAlgorithm {

    @Autowired
    // get bean qualifier name from application.properties, e.g. defaultSort
    @Qualifier("${config.component.qualifier.sort}")
    // if variable name would be "quickSort" and no @Qualifier,
    // then an instance of "QuickSort" would be wired here 
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
