public class QuickSort {
    public static void quickSort(int[] a){ quickSort(a,0,a.length-1); }
    private static void quickSort(int[] a,int l,int r){ if(l<r){ int p=partition(a,l,r); quickSort(a,l,p-1); quickSort(a,p+1,r); } }
    private static int partition(int[] a,int l,int r){ int pivot=a[r]; int i=l; for(int j=l;j<r;j++) if(a[j]<pivot){ int t=a[i]; a[i]=a[j]; a[j]=t; i++; } int t=a[i]; a[i]=a[r]; a[r]=t; return i; }
    public static void main(String[] args){ System.out.println("QuickSort example"); }
}
