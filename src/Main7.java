public class Main7 {
    static int[][] construct2DArray(int[] original, int m, int n) {
        int ans[][]=new int[m][n];

        for(int i=0;i<original.length;i++){
            ans[i/n][i%n]=original[i];
        }
        return ans;
    }
    static void display(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[][]=construct2DArray(arr,2,2);
        display(arr2);
    }


}
