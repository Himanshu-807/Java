public class pattern4{
    public static void main(String[] args) {
        int i=0;
        int n=5;
        while(i<n){
            int j=0;
            while(j>1){
                j=n-i;
                j--;
                System.out.print(" ");
            }
            while(j<=i){
                j++;
                System.out.print("* ");}
            i++;
            System.out.println();
        }
    }
}
