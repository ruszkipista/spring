package search;

public abstract class ISearchAlgorithm {

    public abstract boolean search(int[] where, int what);

    protected void printClassName(){
        System.out.println("Searched with injected bean of "
                            + this.getClass().getSimpleName());
    }
}
