public class BubbleSort {
    public static void bubbleSort(int[] a){ int n=a.length; for(int i=0;i<n;i++) for(int j=1;j<n-i;j++) if(a[j-1]>a[j]){int t=a[j-1];a[j-1]=a[j];a[j]=t;} }
    public static void main(String[] args){ System.out.println("BubbleSort example"); }
}
