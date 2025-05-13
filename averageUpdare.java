public class averageUpdare {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        System.out.println(arr.length);
        for(int i :arr) {
            if(arr[i]==6 || arr[i]==7 )
                continue;
            else if(arr[i]==9)
                break;
            else
            sum+=arr[i];
        }
        int average =sum/10;
        System.out.println("sum "+ sum);
        System.out.println("Average "+ average);
    }
}
