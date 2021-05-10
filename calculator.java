public class calculator{
    public static void main(String[] args) {
        int i =7;
        int j =3;
        char n = '1';
        if( n == '+'){
            System.out.println(i+j);
        }
        else if(n == '/'){
            System.out.println(i / j);
        }
        else if(n=='*'){
            System.out.println(i * j);
        }
        else if(n =='%'){
            System.out.println(i % j);
        }
        else{
            System.out.println("Please Give Correct Operator");
        }
    }
}
