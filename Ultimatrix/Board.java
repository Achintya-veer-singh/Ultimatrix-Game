import java.util.*;
class Board
{
    public static void main(String arg[])
    {
        int a[][] = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
        System.out.println("_______ _______ _______  _______ _______ _______  _______ _______ _______");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[i][j] + "   |");
            System.out.print("|");
            for(int p=0;p<3;p++)
            System.out.print("   " +a[i][p] + "   |");
            System.out.print("|");
            for(int q=0;q<3;q++)
            System.out.print("   " +a[i][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
        }
        System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
        for(int r=0;r<3;r++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[r][j] + "   |");
            System.out.print("|");
            for(int p=0;p<3;p++)
            System.out.print("   " +a[r][p] + "   |");
            System.out.print("|");
            for(int q=0;q<3;q++)
            System.out.print("   " +a[r][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
        }
        System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
        for(int s=0;s<3;s++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[s][j] + "   |");
            System.out.print("|");
            for(int p=0;p<3;p++)
            System.out.print("   " +a[s][p] + "   |");
            System.out.print("|");
            for(int q=0;q<3;q++)
            System.out.print("   " +a[s][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
        }
    }
}