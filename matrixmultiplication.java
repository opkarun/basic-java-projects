import java.util.*;
class matrixmultiplication 
{
    int n1,m1,n2,m2;
    int arr[][];
    int arr2[][];
    int arr3[][];
    matrixmultiplication()
    {
        n1=0;
        m1=0;
        n2=0;
        m2=0;
    }
void input()
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the rows and colums for matrix 1:");
    n1=input.nextInt();
    m1=input.nextInt();
    System.out.println("Enter the rows and colums for matrix 2:");
    n2=input.nextInt();
    m2=input.nextInt();
    System.out.println("Enter the rows and colums for matrix1:");
    System.out.println("Enter the matrix 1:");
    arr= new int[n1][m1];
    arr2= new int[n2][m2];
    
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            arr[i][j]=input.nextInt();


        }
    }
    System.out.println("Enter the matrix 2:");
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            arr2[i][j]=input.nextInt();
        }
    }

    
}
void display(){
    System.out.println("Matrix 1 is:");
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();

        
    }
    System.out.println("Matrix 2 is:");
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            System.out.print(arr2[i][j]+" ");

        }
        System.out.println();
        
        
    }
}
void multipy(){
    if(m1!=n2){
     System.out.println("The matrices are incompatible for multiplication:");
     


    }
    else{
        
        int  arr3[][]=new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                arr3[i][j]=0;
                for(int k=0;k<m1;k++){
                    arr3[i][j]+=(arr[i][k]*arr2[k][j]);
                }


                
            }

        }
        System.out.println("the matrix afrer multiplication:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(arr3[i][j]+" ");

            }
            System.out.println();
        }
        

    }
    
}

public static void main(String args[]){
    matrixmultiplication obj=new matrixmultiplication();
    obj.input();
    obj.display();
    obj.multipy();
    
}





}
