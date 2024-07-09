import java.util.Arrays;

public class selection_sortt {
    public static void main(String[] args) {
        int arr[]={10,4,3,6,5,7,100,99};
       selection(arr);
        System.out.println(Arrays.toString(arr));




    }
    public static void selection(int arr[]){
        for (int i = 0; i < arr.length ; i++) {


            int last = arr.length - 1 - i;

            int maxindex=greaterele(arr,0,last);
            swap(arr,maxindex,last);
        }




    }
    public static int greaterele(int arr[],int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }


        }
        return max;
    }
    public static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end] =temp;
    }

}
