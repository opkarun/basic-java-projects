import java.util.*;
class binarysearch{
    int arr[];
    int num;
    int len;
    binarysearch(){
        num=0;
        len=0;
    }
    void getdata(){
        Scanner sc=new Scanner(System.in);
        int k;
        System.out.println("Enter the number of elements:");
        k=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        len=k;
        arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        num=sc.nextInt();
        sc.close();

    }
    int binsearch(){
        int first=0;
        int last=len-1;
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]==num){
               break;

            }
            else if(num>arr[mid]){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(arr[mid]==num){
            return mid;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[]){
        binarysearch obj =new binarysearch();
        obj.getdata();
        System.out.println("The number is at"+" "+obj.binsearch()+" "+"position");
        

    }

}