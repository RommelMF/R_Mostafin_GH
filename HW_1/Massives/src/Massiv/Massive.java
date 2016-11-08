package Massiv;


public class Massive {
    public static void main(String[]args){
        int[][]dim={{1,2,3},{4,5,6},{7,8,9}};
        int[][]dim1=new int[3][3];

        for(int i=0;i<dim.length;i++){
            for(int j=0;j<dim[i].length;j++){
                dim1[i][j]=dim[j][i];
                System.out.print(dim1[i][j]+" ");
            }
            System.out.println("");

        }
        System.out.println("The End");
        matrix();


    }
    static void matrix(){
    int[][]m={{1,2,3},{2,3,4},{4,5,6}};
    int[][]n={{3,5,6},{6,7,8},{5,6,7}};
    int[][]k=new int[3][3];

    for(int i=0;i<m.length;i++){
        System.out.println(" ");
        for(int j=0;j<m[i].length;j++){
            System.out.print(m[i][j]+" ");}
    }
    System.out.println(" ");
    for(int i=0;i<n.length;i++){
        System.out.println(" ");
        for(int j=0;j<n[i].length;j++){
            System.out.print(n[i][j]+" ");}
    }
    System.out.println(" ");
    for(int i=0;i<k.length;i++) {
        System.out.println(" ");
        for (int j = 0; j < k[i].length; j++) {
            k[i][j] = m[i][j] * n[j][i];
            System.out.print(k[i][j] + " ");
        }
    }
    }
}
