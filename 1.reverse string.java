public class reversestring{
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String orgString=sc.nextLine();
    StringBuilder rev=new StringBuilder();
    int n=orgString.length()-1;
    for(int i=n;i>=0;i--){
      rev.append(orgString.charAt(i));
    }
    System.out.println("reversed String:",rev);
   }
}