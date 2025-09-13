import java.util.Scanner;
class reverse1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string to be reversed:");
        str=sc.nextLine();
        str=str.trim();
        int len=str.length();
        String wrd="";
        String reverse="";
        String reverse2="";
        String wrd1= "";

        for(int i=len-1;i>=0;i--){
            reverse2+=str.charAt(i);

        }
        int k=0;
        reverse2+=" "; 
        for(int i=0;i<reverse2.length();i++){
            if(reverse2.charAt(i)==' '){

                     
            wrd=reverse2.substring(k,i);
                k=i+1;
                for(int j=(wrd.length()-1);j>=0;j--){
                    wrd1+=wrd.charAt(j);
                }
                if(wrd1!=""){
                reverse+=wrd1;
                reverse+=" ";
                wrd1="";
                }
                

                

            }
        
            
        }
        System.out.println("The reversed string is:"+" "+reverse);
        sc.close();
    }
}
