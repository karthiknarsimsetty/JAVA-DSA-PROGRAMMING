public class MergeSort {
    public static void mergeSort(int[] a){ mergeSort(a,0,a.length-1); }
    private static void mergeSort(int[] a,int l,int r){ if(l>=r) return; int m=(l+r)/2; mergeSort(a,l,m); mergeSort(a,m+1,r); int[] tmp=new int[r-l+1]; int i=l,j=m+1,k=0; while(i<=m||j<=r){ if(j>r||(i<=m&&a[i]<=a[j])) tmp[k++]=a[i++]; else tmp[k++]=a[j++]; } System.arraycopy(tmp,0,a,l,tmp.length); }
    public static void main(String[] args){ System.out.println("MergeSort example"); }
}
