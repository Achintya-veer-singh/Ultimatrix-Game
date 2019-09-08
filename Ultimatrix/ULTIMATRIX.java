import java.util.*;//helps to input anything
class ULTIMATRIX
 { 
  static String a[][] = new String[9][9];//Board of ultimatrix
  static int up =3,down = 3;//3 helps us to start it from the middle grid
  static char p1,p2;//stores pieces of players
  static String P1,P2,sp,qw;//stores name of players
  static int end1=0,end2 =0;//stores no. of wins of players
  ULTIMATRIX(char e,char b,String t,String oo)//this parameterised constructor initialises array to blank spaces
    {
        for(int i=0;i<9;i++)
      {
       for(int j=0;j<9;j++)
            a[i][j] = " ";
       }
      p1 = e;p2=b;
      P1 = t;
      P2 = oo;
    }
    ULTIMATRIX()
    {
        for(int i=0;i<9;i++)
      {
       for(int j=0;j<9;j++)
            a[i][j] = " ";
       }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        ULTIMATRIX ob2 = new ULTIMATRIX();
        System.out.print("Welcome ");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print("to ");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print("the ");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print("world ");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print("of ");
        for(long cv=0;cv<=50000000;cv++);//causes some sort of animation effect
        System.out.print("Ultimatrix... ");
        for(long cv=0;cv<=100000000;cv++);//causes some sort of animation effect
        System.out.print(" TRIAL");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.println(" Version");
        for(long cv=0;cv<=50000000;cv++);//causes some sort of animation effect
        System.out.print("The");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" above");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" game");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" is");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" a");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" creation ");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" of");
        for(long cv=0;cv<=100000000;cv++);//causes some sort of animation effect
        System.out.print(" AVS");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" Game");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.println(" Company");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        
        System.out.print("Enter");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" F");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" To play");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" against");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" friend");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" or ");
        for(long cv=0;cv<=100000000;cv++);//causes some sort of animation effect
        System.out.print(" C to");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.print(" Challenge");
        for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        System.out.println(" Computer");
        while(true)//chooses if to play with bot or multiplayer
        {
           String tr = sc.nextLine().toUpperCase();
           char ch = tr.charAt(0);
           if(ch == 'F')
            {frnd();
             System.out.println("Press E to end");
             String res = sc.nextLine().toUpperCase();
             if(res.equals("E"))
             break;
            }
           else if(ch == 'C')
           {comp();
               System.out.println("Press E to restart");
             String res = sc.nextLine().toUpperCase();
             if(res.equals("E"))
             break;
            }
           else
           System.out.println("Invalid!!...Try again");
        }
       for(long cv=0;cv<=10000000;cv++);//causes some sort of animation effect
        if(end1>end2)//ends the game
       System.out.println(P2 +" wins");
       else if(end2>end1)
       System.out.println(P1 + " wins");
       else
       System.out.println("Thats a draw!!");
       System.out.println("Please like and share the game.Leave your Comments"); 
    }
    static void frnd()//friendly function
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter");
        for(long cv=0;cv<=1000000;cv++);
        System.out.print(" your");
        for(long cv=0;cv<=1000000;cv++);
        System.out.println(" name");
        qw = sc.nextLine().toUpperCase();
        if(qw.equalsIgnoreCase("Achintya"))
        {
         for(long cv=0;cv<=1000000;cv++);
         System.out.print("Match ");
        for(long cv=0;cv<=1000000;cv++);
        System.out.print("found. ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Welcome ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Achintya ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Veer ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("Singh ");
        for(long cv=0;cv<=100000000;cv++);
        System.out.print("Enter ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("Password ");
            while(true)//see's if correct password is entered or not
            {
                String pass = sc.nextLine();
                if(pass.equals("****"))
                break;
                else
                System.out.println("INCORRECT.ENTER AGAIN..");
            }
        }
       for(long cv=0;cv<=100000000;cv++);
        System.out.print("ACCESS ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("GRANTED ");
        for(long cv=0;cv<=50000000;cv++);
        System.out.print("Enter ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("your ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("choice ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print(":- ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("X ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("or ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("O");
        for(long cv=0;cv<=10000000;cv++);
        while(true)//gives X and O to variables
        {
            sp = sc.nextLine();
            if(sp.equals("X") || sp.equals("x") || sp.equals("O") || sp.equals("o") )
            break;
            else
            System.out.println("Invalid !!! Try again....");
        }
        for(long cv=0;cv<=50000000;cv++);
        System.out.print("Enter");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print(" your");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print(" name");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println(" player 2");
        String rs = sc.nextLine().toUpperCase();
        char v = ' ',e = Character.toUpperCase(sp.charAt(0));
        if(e == 'X')
          v = 'O';
        else
        v = 'X';
        ULTIMATRIX ob = new ULTIMATRIX(e,v,qw,rs); 
       System.out.println("_______ _______ _______  _______ _______ _______  _______ _______ _______");
      for(int i=0;i<9;i++)
      {
       for(int j=0;j<9;j++)
            a[i][j] = " ";
       }
       for(int i=0;i<3;i++)//prints board for example purpose
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
      for(long cv=0;cv<=10000000;cv++);
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
      for(long cv=0;cv<=10000000;cv++);
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
      for(long cv=0;cv<=10000000;cv++); 
      int i = 0;
       while(true)//runs until all the grids are filled
        {
            int rec =0;
            for(int ind=0;ind<9;ind++)
            {
                for(int j=0;j<9;j++)
                if(a[ind][j].equals(" "))
                rec =1;
            }
            if(rec == 0)
            break;
            ob.pk(i);
            i++;
        }
    }
    void pk(int ik)//it is the real method ,which runs the program(friend)
    {
    
       int row,col,mx = ik; 
      Scanner sc = new Scanner(System.in);
      String der = "";
      int joke = 0;
      if(ik%2 == 0)//checks if it is turn of player1 or player2
      der = P1 +"";
      else
      der = P2 + "";
     if(up ==0 )//used to know in which grid will the next piece is going to
     {
         if(down ==0)
         joke = 1;
         if(down == 3)
         joke = 2;
         if(down == 6)
         joke = 3;
      }
      if(up ==3 )
     {
         if(down ==0)
         joke = 4;
         if(down ==3)
         joke = 5;
         if(down == 6)
         joke = 6;
      }
      if(up ==6 )
     {
         if(down ==0)
         joke = 7;
         if(down == 3)
         joke = 8;
         if(down == 6)
         joke = 9;
      }
    while(true)//enters pieces on the board
    {
      System.out.println("Enter your co ordinates " + der + " in grid "+joke);
      row = sc.nextInt();
      col = sc.nextInt();
      if(row<1||row>3||col<1||col>3)
      System.out.println("Invalid.Try again...");
      else if (a[up + row-1][down + col-1].equals("X") || a[up + row-1][down + col-1].equals("O"))
      System.out.println("Already filled.Please try again...");
      else if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
      {
          System.out.println("Sorry ,that one is filled . Choose a grid from 1 to 9");
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
          for(long cv=0;cv<=10000000;cv++);
          System.out.print("Invalid");
          for(long cv=0;cv<=10000000;cv++);
          System.out.println(" choice ");
              
          }
      }
      else//enters the pieces
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
    for(long cv=0;cv<=10000000;cv++);  
    for(int i=0;i<3;i++)//prints the board after inputting the pieces
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
    for(long cv=0;cv<=70000000;cv++);
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
      for(long cv=0;cv<=80000000;cv++);
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
        switch(row)//very imp.,used to know in which grid will the next piece be placed
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
        }
    }
  }
  static void comp()//comp ka function
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print(" your");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println(" name");
        qw = sc.nextLine().toUpperCase();
        P1 = qw;
        if(qw.equalsIgnoreCase("Achintya"))
        {
         for(long cv=0;cv<=10000000;cv++);
         System.out.print("Match ");
        for(long cv=0;cv<=1000000;cv++);
        System.out.print("found. ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Welcome ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Achintya ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("Veer ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("Singh ");
        for(long cv=0;cv<=100000000;cv++);
        System.out.print("Enter ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("Password ");
            while(true)
            {
                String pass = sc.nextLine();
                if(pass.equals("****"))
                break;
                else
                System.out.println("INCORRECT.ENTER AGAIN..");
            }
        }
       for(long cv=0;cv<=100000000;cv++);
        System.out.print("ACCESS ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("GRANTED ");
        for(long cv=0;cv<=50000000;cv++);
        System.out.print("Enter ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("your ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("choice ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print(":- ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("X ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.print("or ");
        for(long cv=0;cv<=10000000;cv++);
        System.out.println("O");
        for(long cv=0;cv<=10000000;cv++);
        while(true)
        {
            sp = sc.nextLine();
            if(sp.equals("X") || sp.equals("x") || sp.equals("O") || sp.equals("o") )
            break;
            else
            System.out.println("Invalid !!! Try again....");
        }
        String rs = "GAME GOD";//name of bot,HEHEHEHEHE!!!!
        P2 = rs;
        char v = ' ',e = Character.toUpperCase(sp.charAt(0));
        if(e == 'X')
          v = 'O';
        else
        v = 'X';
        ULTIMATRIX ob = new ULTIMATRIX(e,v,qw,rs); 
       for(int iKKK=0;iKKK<9;iKKK++)
      {
       for(int j=0;j<9;j++)
            a[iKKK][j] = " ";
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
      for(long cv=0;cv<=10000000;cv++);
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
      for(long cv=0;cv<=10000000;cv++);
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
      for(long cv=0;cv<=10000000;cv++); 
      int i = 0;
       while(true)
        {
            int rec =0;
            for(int ind=0;ind<9;ind++)
            {
                for(int j=0;j<9;j++)
                if(a[ind][j].equals(" "))
                rec =1;
            }
            if(rec == 0)
            break;
            pk1(i);
            i++;
        }
        
    }
  static void pk1(int ik)//MASTERPIECE OF THE GAME
    {
    
       int row,col,mx = ik; 
      Scanner sc = new Scanner(System.in);
      String der = "";
      int joke = 0;
     if(up ==0 )
     {
         if(down ==0)
         joke = 1;
         if(down == 3)
         joke = 2;
         if(down == 6)
         joke = 3;
      }
      if(up ==3 )
     {
         if(down ==0)
         joke = 4;
         if(down ==3)
         joke = 5;
         if(down == 6)
         joke = 6;
      }
      if(up ==6 )
     {
         if(down ==0)
         joke = 7;
         if(down == 3)
         joke = 8;
         if(down == 6)
         joke = 9;
      }
    while(true)
    {
      if(ik %2==0)//TURN OF PLAYER
      {
          System.out.println("Enter your co ordinates " + der + " in grid "+joke);
        row = sc.nextInt();
        col = sc.nextInt();
      
      if(row<1||row>3||col<1||col>3)
      System.out.println("Invalid.Try again...");
      else if (a[up + row-1][down + col-1].equals("X") || a[up + row-1][down + col-1].equals("O"))
      System.out.println("Already filled.Please try again...");
      else if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
      {
          System.out.println("Sorry ,that one is filled . Choose a grid from 1 to 9");
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
          for(long cv=0;cv<=10000000;cv++);
          System.out.print("Invalid");
          for(long cv=0;cv<=10000000;cv++);
          System.out.println(" choice ");
              
          }
      }
      else
      {
         row--;
         col--;
         a[up+row][down+col] = p1+"";
          break;
      }
     }
     else
     {
         for(long cv=0;cv<=400000000;cv++);
         System.out.println("Now its " + P2 + "'S" + " turn");
         for(long cv=0;cv<=100000000;cv++);
         System.out.print("Processing");
         for(long cv=0;cv<=500000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=500000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=5000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=500000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=500000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=5000000;cv++);
         System.out.print(".");
         for(long cv=0;cv<=100000000;cv++);
         System.out.println(".");
         for(long cv=0;cv<=500000000;cv++);
         row = (int)(Math.random()*10);//GENERATES ROW
         if(row == 0)
         row++;
         else if(row>3 &&row<7)
         row -= 3;
         else if(row>6&&row<10)
         row -= 6;
         col = (int)(Math.random()*10);//GENERATES COLUMN
         if(col == 0)
         col++;
         else if(col>3 &&col<7)
         col -= 3;
         else if(col>6&&col<10)
         col -= 6;
         
         if (a[up + row-1][down + col-1].equals("X") || a[up + row-1][down + col-1].equals("O"))
         continue;
         else if (a[up + row-1][down + col-1].equals(P1.charAt(0)+"") || a[up + row-1][down + col-1].equals(P2.charAt(0)+""))
         {
          int c = (int)(Math.random()*10);//GENERATES CHOICE OF GRID
           if(c == 0)
           c++;
          if(c==1 && (a[0 + row-1][0 + col-1].equals(" ") || a[0 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
           a[0+row][0+col] = p2+"";
           break;
          }
          else if(c==2 && (a[0 + row-1][3 + col-1].equals(" ") || a[0 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
           a[0+row][3+col] = p2+"";
           break;
          }
          else if(c==3 && (a[0 + row-1][6 + col-1].equals(" ") || a[0 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
           a[0+row][6+col] = p2+"";
           break;
          }
          else if(c==4 && (a[3 + row-1][0 + col-1].equals(" ") || a[3 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
           a[3+row][0+col] = p2+"";
           break;
           
          }
          else if(c==5 && (a[3 + row-1][3 + col-1].equals(" ") || a[3 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--; 
           a[3+row][3+col] = p2+"";
           break; 
          }
          else if(c==6 && (a[3 + row-1][6 + col-1].equals(" ") || a[3 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
           a[3+row][6+col] = p2+"";
           break;
          }
          else if(c==7 && (a[6 + row-1][0 + col-1].equals(" ") || a[6 + row-1][0 + col-1].equals(" ")))
           {  row--;
             col--;
           a[6+row][0+col] = p2+"";
           break;
          }
          else if(c==8 && (a[6 + row-1][3 + col-1].equals(" ") || a[6 + row-1][3 + col-1].equals(" ")))
           {  row--;
             col--;
           a[6+row][3+col] = p2+"";
           break;
          }
          else if(c==9 && (a[6 + row-1][6 + col-1].equals(" ") || a[6 + row-1][6 + col-1].equals(" ")))
           {  row--;
             col--;
           a[6+row][6+col] = p2+"";
           break;
          }
          else
          {
           continue;  
           }
         }
         else
       {
         row--;
         col--;
         a[up+row][down+col] = p2+"";
          break;
      }
        }
    }
    
    System.out.println("_______ _______ _______  _______ _______ _______  _______ _______ _______");
    for(long cv=0;cv<=10000000;cv++);  
    for(int i=0;i<3;i++)//PRINTS BOARD AFTER ENTERING
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
    for(long cv=0;cv<=70000000;cv++);
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
      for(long cv=0;cv<=80000000;cv++);
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end1++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
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
          end2++;
        }
    }
   }    
}
//ACHINTYA ROCKS!!!!!