public class demo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int c=sc.nextInt();
        int i, fact=1;
        for( i=1;i<=c;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
        sc.close();

    }
}
