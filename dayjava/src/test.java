public class test {
    public static void main(String[] args) {
        int a[] = new int[] {1,2,3,5,5,44,55,4,3,5,5,3,2,66,44,6};
        int b[] = new int[10];
        for(int i = 0;i<a.length;i++){
            int so = a[i];
            while(so != 0){
                b[so%10]++;
                so/=10;
            }
        }
        int max = b[0];
        int so=0;
        for(int i = 0 ;i<b.length;i++){
            if(max < b[i]) {
                max = b[i];
                so = i;
            }
        }
        System.out.println(so);
    }
}
class test2{
    public static void merge(int a[],int l,int m,int r){
        int i,j,k=l;
        int n1= m-l+1;
        int n2 = r-m;
        int L[] = new int [n1];
        int R[]= new int[n2];
        for(i=0;i<n1;i++) L[i] = a[l+i];
        for(j=0;j<n2;j++) R[j] = a[m+j+1];
        i=0;j=0;
        while(i<n1 && j<n2){
            a[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while(i<n1) a[k++] = L[i++];
        while (j<n2) a[k++] = R[j++];
    }
    public static void mergeSort(int a[],int l,int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int [] {1,3,5,2,3,6,7,3,5,352,2,5,234,6,87,12,243,54,13,453,3};
        mergeSort(arr,0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
