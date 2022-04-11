package sort;

public abstract class ISortAlgorithm {

    public abstract int[] sort(int[] arr);

    protected void printClassName(){
        System.out.println("Sorted with injected bean of "
                            + this.getClass().getSimpleName());
    }    
}
