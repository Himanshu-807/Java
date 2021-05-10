public class pattern3{
    public static void main(String[] args) {
        int i=0;
        int n=5;
        while(i<n){
            int j =0;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
