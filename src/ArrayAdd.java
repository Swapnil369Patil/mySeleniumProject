import java.util.Scanner;

/**
 * Created by user on 3/1/2017.
 */
public class ArrayAdd {

    public static void main(String[]args){
        int a,b,c,d;
        Scanner in = new Scanner(System.in);
        System .out.println("Enter the no. of rows and column");
        a=in.nextInt();
        b=in.nextInt();

        int firstarray[][]=new int[a][b];
        int secondarray[][]=new int[a][b];
        int sum [][]= new int[a][b];

        System.out.println("enter the element of first matrix");
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                firstarray[c][d]=in.nextInt();

        System.out.println("enter the element of second matrix");
        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
                secondarray[c][d]=in.nextInt();

        for(c=0;c<a;c++)
            for(d=0;d<b;d++)
        sum[c][d] = firstarray[c][d] + secondarray[c][d];

        System.out.println("Sum of entered matrices:-");

        for ( c = 0 ; c < a; c++ )
        {
            for ( d = 0 ; d < b ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }

    }
}
