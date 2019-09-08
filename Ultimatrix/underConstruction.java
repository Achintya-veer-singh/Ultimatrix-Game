import java.util.*;
class underConstruction
 {
    String a[][] = new String[9][9];
    int up =3,down = 3;//3 helps us to start it from the middle grid
    char p1,p2;
    String P1,P2;
    int count1=0,count2=0;
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome ,please choose 1 for frnd &2 for comp");
        while(true)
        {
            int choice = sc.nextInt();
            if(choice == 1)
            frnd();
            else if(choice == 2)
            comp();
            else 
            System.out.println("Invalid!!.Choose again");
        }
        
    }
    underConstruction(char e,char b,String t,String oo)
    {for(int i=0;i<9;i++)
    {
     for(int j=0;j<9;j++)
            a[i][j] = " ";
    }
    p1 = e;p2=b;
    P1 = t;
    P2 = oo;
    }  
    void pk(int ik)
    {
    
       int row,col,mx = ik; 
      Scanner sc = new Scanner(System.in);
      
    while(true)
    { System.out.println("Enter co ordinates");
        row = sc.nextInt();
      col = sc.nextInt();
      if(row<1||row>3||col<1||col>3)
      System.out.println("Invalid.Try again...");
      else if (a[up + row-1][down + col-1].equals("X") || a[up + row-1][down + col-1].equals("O"))
      System.out.println("Already filled.Please try again...");
      else if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
      {
          System.out.println("Choose a grid");
          int c = sc.nextInt();
          if(c==1 && (a[0 + row-1][0 + col-1].equals(" ") || a[0 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][0+col] = p1+"";
            else 
           a[0+row][0+col] = p2+"";
           break;
          }
          else if(c==2 && (a[0 + row-1][3 + col-1].equals(" ") || a[0 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][3+col] = p1+"";
            else 
           a[0+row][3+col] = p2+"";
           break;
          }
          else if(c==3 && (a[0 + row-1][6 + col-1].equals(" ") || a[0 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][6+col] = p1+"";
            else 
           a[0+row][6+col] = p2+"";
           break;
          }
          else if(c==4 && (a[3 + row-1][0 + col-1].equals(" ") || a[3 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][0+col] = p1+"";
            else 
           a[3+row][0+col] = p2+"";
           break;
           
          }
          else if(c==5 && (a[3 + row-1][3 + col-1].equals(" ") || a[3 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][3+col] = p1+"";
            else 
           a[3+row][3+col] = p2+"";
           break; 
          }
          else if(c==6 && (a[3 + row-1][6 + col-1].equals(" ") || a[3 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][6+col] = p1+"";
            else 
           a[3+row][6+col] = p2+"";
           break;
          }
          else if(c==7 && (a[6 + row-1][0 + col-1].equals(" ") || a[6 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][0+col] = p1+"";
            else 
           a[6+row][0+col] = p2+"";
           break;
          }
          else if(c==8 && (a[6 + row-1][3 + col-1].equals(" ") || a[6 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][3+col] = p1+"";
            else 
           a[6+row][3+col] = p2+"";
           break;
          }
          else if(c==9 && (a[6 + row-1][6 + col-1].equals(" ") || a[6 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][6+col] = p1+"";
            else 
           a[6+row][6+col] = p2+"";
           break;
          }
          else
          {
              System.out.println("Invalid Choice");
              
          }
      }
      else
      {
         row--;
         col--;
          if(ik%2 ==0)
         a[up+row][down+col] = p1+"";
         else 
         a[up+row][down+col] = p2+"";
          break;
      }
    }
    System.out.println("_______ _______ _______  _______ _______ _______  _______ _______ _______");
      for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[i][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[i][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[i][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
        System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
        for(int r=3;r<6;r++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[r][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[r][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[r][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
      System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
      for(int s=6;s<9;s++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[s][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[s][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[s][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
        switch(row)
      {
          case 0 : up = 0;
                    break;
          case 1 : up = 3;
                    break;
          case 2 : up = 6;
                    break;
      }
      switch(col)
      {
          case 0 : down = 0;
                    break;
          case 1 : down = 3;
                    break;
          case 2 : down = 6;
                    break;
      }
     for(int AA = 0;AA<=8;AA+=3)//HORIZONTAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP+1].equals(p1+"")&& a[AA+2][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 3 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 2 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP-1].equals(p1+"")&& a[AA+2][PP-2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 1;AA<=8;AA+=3)//HORIZONTAL 2 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-1+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 2;AA<=8;AA+=3)//HORIZONTAL 3 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-2+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 2 CHECKING
      for(int PP = 1;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-1+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//HORIZONTAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP+1].equals(p2+"")&& a[AA+2][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 3 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 2 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP-1].equals(p2+"")&& a[AA+2][PP-2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 1;AA<=8;AA+=3)//HORIZONTAL 2 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-1+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 2;AA<=8;AA+=3)//HORIZONTAL 3 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-2+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 2 CHECKING
      for(int PP = 1;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-1+YY] = P2.charAt(0)+"";
        }
    }
}
static void frnd()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String qw = sc.nextLine().toUpperCase();
        System.out.println("Enter your choice :- X or O");
        String sp;
        while(true)
        {
            sp = sc.nextLine();
            if(sp.equals("X") || sp.equals("x") || sp.equals("O") || sp.equals("o") )
            break;
            else
            System.out.println("Invalid !!! Try again....");
        }
        System.out.println("Enter your name player 2");
        String rs = sc.nextLine().toUpperCase();
        char v = ' ',e = Character.toUpperCase(sp.charAt(0));
        if(e == 'X')
          v = 'O';
        else
        v = 'X';
        underConstruction ob = new underConstruction(e,v,qw,rs);
        for(int i=0;i<=20;i++)
        ob.pk(i);
}
static void comp()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String qw = sc.nextLine().toUpperCase();
        System.out.println("Enter your choice :- X or O");
        String sp;
        while(true)
        {
            sp = sc.nextLine();
            if(sp.equals("X") || sp.equals("x") || sp.equals("O") || sp.equals("o") )
            break;
            else
            System.out.println("Invalid !!! Try again....");
        }
        String rs = "Lucifer";
        char v = ' ',e = Character.toUpperCase(sp.charAt(0));
        if(e == 'X')
          v = 'O';
        else
        v = 'X';
        underConstruction ob = new underConstruction(e,v,qw,rs);
        for(int i=0;i<=20;i++)
        ob.pk2(i);
}
void pk2(int ik)
    {
    
       int row,col,mx = ik; 
      Scanner sc = new Scanner(System.in);
      if(ik %2 == 0) 
      {  while(true)
         { System.out.println("Enter co ordinates");
        row = sc.nextInt();
       col = sc.nextInt();
         if(row<1||row>3||col<1||col>3)
       System.out.println("Invalid.Try again...");
       else if (a[up + row-1][down + col-1].equals("X") || a[up + row-1][down + col-1].equals("O"))
       System.out.println("Already filled.Please try again...");
       else if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
       {
          System.out.println("Choose a grid");
          int c = sc.nextInt();
          if(c==1 && (a[0 + row-1][0 + col-1].equals(" ") || a[0 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][0+col] = p1+"";
            else 
           a[0+row][0+col] = p2+"";
           break;
          }
          else if(c==2 && (a[0 + row-1][3 + col-1].equals(" ") || a[0 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][3+col] = p1+"";
            else 
           a[0+row][3+col] = p2+"";
           break;
          }
          else if(c==3 && (a[0 + row-1][6 + col-1].equals(" ") || a[0 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][6+col] = p1+"";
            else 
           a[0+row][6+col] = p2+"";
           break;
          }
          else if(c==4 && (a[3 + row-1][0 + col-1].equals(" ") || a[3 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][0+col] = p1+"";
            else 
           a[3+row][0+col] = p2+"";
           break;
           
          }
          else if(c==5 && (a[3 + row-1][3 + col-1].equals(" ") || a[3 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][3+col] = p1+"";
            else 
           a[3+row][3+col] = p2+"";
           break; 
          }
          else if(c==6 && (a[3 + row-1][6 + col-1].equals(" ") || a[3 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][6+col] = p1+"";
            else 
           a[3+row][6+col] = p2+"";
           break;
          }
          else if(c==7 && (a[6 + row-1][0 + col-1].equals(" ") || a[6 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][0+col] = p1+"";
            else 
           a[6+row][0+col] = p2+"";
           break;
          }
          else if(c==8 && (a[6 + row-1][3 + col-1].equals(" ") || a[6 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][3+col] = p1+"";
            else 
           a[6+row][3+col] = p2+"";
           break;
          }
          else if(c==9 && (a[6 + row-1][6 + col-1].equals(" ") || a[6 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][6+col] = p1+"";
            else 
           a[6+row][6+col] = p2+"";
           break;
          }
          else
          {
              System.out.println("Invalid Choice");
              
          }
       }
       else
       {
         row--;
         col--;
          if(ik%2 ==0)
         a[up+row][down+col] = p1+"";
         else 
         a[up+row][down+col] = p2+"";
          break;
        }
      }
}
else
{
  while(true)
         { 
             row = (int)Math.random()*10;
           col = (int)Math.random()*10;
        if(row>-1&&row<3 && col >-1 && col<3)   
       {if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
       {
          int c = (int)Math.random()*10;
          if(c==1 && (a[0 + row-1][0 + col-1].equals(" ") || a[0 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][0+col] = p1+"";
            else 
           a[0+row][0+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==2 && (a[0 + row-1][3 + col-1].equals(" ") || a[0 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][3+col] = p1+"";
            else 
           a[0+row][3+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==3 && (a[0 + row-1][6 + col-1].equals(" ") || a[0 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[0+row][6+col] = p1+"";
            else 
           a[0+row][6+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==4 && (a[3 + row-1][0 + col-1].equals(" ") || a[3 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][0+col] = p1+"";
            else 
           a[3+row][0+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==5 && (a[3 + row-1][3 + col-1].equals(" ") || a[3 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][3+col] = p1+"";
            else 
           a[3+row][3+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==6 && (a[3 + row-1][6 + col-1].equals(" ") || a[3 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[3+row][6+col] = p1+"";
            else 
           a[3+row][6+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==7 && (a[6 + row-1][0 + col-1].equals(" ") || a[6 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][0+col] = p1+"";
            else 
           a[6+row][0+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==8 && (a[6 + row-1][3 + col-1].equals(" ") || a[6 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][3+col] = p1+"";
            else 
           a[6+row][3+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
          else if(c==9 && (a[6 + row-1][6 + col-1].equals(" ") || a[6 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
             if(ik%2 ==0)
             a[6+row][6+col] = p1+"";
            else 
           a[6+row][6+col] = p2+"";
           System.out.println("Comp's turn");
           break;
          }
       }
       else
       {
         row--;
         col--;
          if(ik%2 ==0)
         a[up+row][down+col] = p1+"";
         else 
         a[up+row][down+col] = p2+"";
          System.out.println("Comp's turn");
          break;
        }
      }  }

    System.out.println("_______ _______ _______  _______ _______ _______  _______ _______ _______");
      for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[i][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[i][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[i][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
        System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
        for(int r=3;r<6;r++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[r][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[r][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[r][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
      System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");
      for(int s=6;s<9;s++)
        {
            for(int j=0;j<3;j++)
            System.out.print("   " +a[s][j] + "   |");
            System.out.print("|");
            for(int p=3;p<6;p++)
            System.out.print("   " +a[s][p] + "   |");
            System.out.print("|");
            for(int q=6;q<9;q++)
            System.out.print("   " +a[s][q] + "   |");
            System.out.print("|");
            System.out.println();
            System.out.println("_______|_______|_______||_______|_______|_______||_______|_______|_______||");  
      }
        switch(row)
      {
          case 0 : up = 0;
                    break;
          case 1 : up = 3;
                    break;
          case 2 : up = 6;
                    break;
      }
      switch(col)
      {
          case 0 : down = 0;
                    break;
          case 1 : down = 3;
                    break;
          case 2 : down = 6;
                    break;
      }
     for(int AA = 0;AA<=8;AA+=3)//HORIZONTAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP+1].equals(p1+"")&& a[AA+2][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 3 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 2 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP-1].equals(p1+"")&& a[AA+2][PP-2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 1;AA<=8;AA+=3)//HORIZONTAL 2 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-1+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 2;AA<=8;AA+=3)//HORIZONTAL 3 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA][PP+1].equals(p1+"")&& a[AA][PP+2].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-2+XX][PP+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 2 CHECKING
      for(int PP = 1;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p1+"") && a[AA+1][PP].equals(p1+"")&& a[AA+2][PP].equals(p1+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-1+YY] = P1.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//HORIZONTAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 1 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP+1].equals(p2+"")&& a[AA+2][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 3 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//DIAGONAL 2 CHECKING
      for(int PP = 2;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP-1].equals(p2+"")&& a[AA+2][PP-2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-2+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 1;AA<=8;AA+=3)//HORIZONTAL 2 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-1+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 2;AA<=8;AA+=3)//HORIZONTAL 3 CHECKING
      for(int PP = 0;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA][PP+1].equals(p2+"")&& a[AA][PP+2].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA-2+XX][PP+YY] = P2.charAt(0)+"";
        }
    }
    for(int AA = 0;AA<=8;AA+=3)//VERTICAL 2 CHECKING
      for(int PP = 1;PP<=8;PP+=3)
      {
      if(a[AA][PP].equals(p2+"") && a[AA+1][PP].equals(p2+"")&& a[AA+2][PP].equals(p2+""))
      for(int XX=0;XX<3;XX++)
        {
          for(int YY=0;YY<3;YY++)
          a[AA+XX][PP-1+YY] = P2.charAt(0)+"";
        }
    }
}
}
}