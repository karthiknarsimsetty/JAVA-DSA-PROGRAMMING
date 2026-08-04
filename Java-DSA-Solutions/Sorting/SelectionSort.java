public class SelectionSort {
    public static void selectionSort(int[] a){ int n=a.length; for(int i=0;i<n;i++){int min=i; for(int j=i+1;j<n;j++) if(a[j]<a[min]) min=j; int t=a[i]; a[i]=a[min]; a[min]=t; }}
    public static void main(String[] args){ System.out.println("SelectionSort example"); }
}
