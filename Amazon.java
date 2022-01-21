import java.util.*;
public class Amazon
{
    static Scanner sc=new Scanner(System.in);
    static int a;
    static int soldout=0;
    static int balance=10000;
    static ArrayList <String> i4=new ArrayList<>();
    static ArrayList <Integer> i=new ArrayList<>(); 
    static ArrayList <String> i1=new ArrayList<>();
    static ArrayList <String> i2=new ArrayList<>();
    static ArrayList <String> i3=new ArrayList<>();
    static ArrayList <Integer> i5=new ArrayList<>(); 
    static ArrayList <String> s1=new ArrayList<>();
    static ArrayList<Integer> s2=new ArrayList<>();
    static ArrayList<String> s4=new ArrayList<>();
    static ArrayList<Integer> s3=new ArrayList<>();
    //__________________________________________________________//
    static ArrayList <String> j4=new ArrayList<>();
    static ArrayList <Integer> j=new ArrayList<>(); 
    static ArrayList <String> j1=new ArrayList<>();
    static ArrayList <String> j2=new ArrayList<>();
    static ArrayList <String> j3=new ArrayList<>();
    static ArrayList<Integer> j5=new ArrayList<>();
    //-----------------------------------------------------------//
    static ArrayList<String> o=new ArrayList<>();
    static ArrayList<String> o1=new ArrayList<>();
    //------------------------------------------------------//
    static ArrayList<String> l=new ArrayList<>();
    //-----------------------------------------------------//
    static ArrayList<String> k=new ArrayList<>();
    static ArrayList<String> k1=new ArrayList<>();
    static ArrayList<String>k2=new ArrayList<>();

        //private static boolean add;
    public static void main(String[] args)
   {
        welcome();
    } 
    public static void welcome()
    {
        System.out.println("\t\t------WELCOME TO AMAZON-------");
        System.out.println();
        System.out.println("1. ADMIN LOGIN");
        System.out.println("2. USER LOGIN");
        System.out.println("3. MERCHANT LOGIN");
        System.out.println("4. EXIT");
         a=sc.nextInt();
        hello();
    }
    public static void hello()
    {
        if(a>3||a<1)
        welcome();
        else
        switch(a)
        {
            case 1:{
            Admin();}
            case 2:{
                user();
            }
            case 3:{
                merchant();
            }

        }
    }
    public static void Admin()
    {
       // System.out.println("\033[H\033[23");
       // System.out.flush();
       System.out.println("\t\t-------ADMIN LOGIN--------");
       System.out.println();
        System.out.println("ENTER THE ADMIN NAME");
        String a=sc.next();
        System.out.println("ENTER YOUR ID");
        int a1=sc.nextInt();
        if(a.equals("KOUSHICK")&&a1==10)
        {
            Adminid();
        }
        else{
            System.out.println("ENTER THE PROPER ADMIN NAME OR ID");
            System.out.println("====PRESS ENTER TO CONTINUE====");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals(""))
	          Admin();
        }
    }
    public static void Adminid()
    {
        //System.out.println("\033[H\033[23");
        //System.out.flush();
        System.out.println();
        System.out.println("1.APPROVE  MERCHANT");
        System.out.println("2.ADD NEW MERCHANT");
        System.out.println("3.REMOVE EXISTING MERCHANT");
        System.out.println("4.VIEW MERCHANT");
        System.out.println("5.EXIT");
        int y=sc.nextInt();
        if(y==1)
        {
            approvemerchant();
        }
        if(y==4)
        {
            viewmerchant();
        }
        if(y==2)
        {
        addnewmerchant();
        }
        else if(y==3){
            removedata();
        }
        /*else if
        {
            approvemerchant();
        }
       */
        else{
            welcome();
        }
    }
    public static void approvemerchant()
    {
        //System.out.println("\033[H\033[23");
       // System.out.flush();
       if(i1.size()-1<0)
       {
           System.out.println("**********NO REQUEST ARE PENDING************");
       }
       else{
       System.out.println(" THE MERCHANT NAME : "+i1.get(i1.size()-1));
       System.out.println(" THE PRODUCT NAME : "+i2.get(i2.size()-1));
       System.out.println(" THE PRODUCT TYPE : "+i3.get(i3.size()-1));
       System.out.println(" THE PRODUCT PRICE : "+i.get(i.size()-1));
       System.out.println(" THE MERCHANT ID : "+i4.get(i4.size()-1));
       System.out.println(" THE PRODUCT COUNT : "+i5.get(i5.size()-1));
        System.out.println();
        System.out.println("PRESS 10 TO ACCEPT");
        System.out.println("PRESS 5 TO REJECT");
        int d1=sc.nextInt(); 
        s3.add(d1);
        //adding();
        if(d1==5)
        {
            System.out.println("SUCESSFULLY REJECTED THE ORDER");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            Adminid();
        }
        else if(d1==10){
            j1.add(i1.get(i1.size()-1));
            j2.add(i2.get(i2.size()-1));
            j3.add(i3.get(i3.size()-1));
            j4.add(i4.get(i4.size()-1));
            j5.add(i5.get(i5.size()-1));
            j.add(i.get(i.size()-1));
            s2.add(0000);
            s1.add(j1.get(j1.size()-1));
            System.out.println("SUCCESSFULLY ACCEPTTED THE ORDER");
            System.out.println();
            System.out.println("YOUR PASSWORD IS 0000");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            Adminid();
        }
    }
    }
        public static void merchant()
        {
           System.out.println("\t\tWELCOME TO MERCHANT LOGIN PAGE");
           System.out.println("1.LOGIN");
           System.out.println("2.SIGN UP");
           System.out.println("3.EXIT");
           int r=sc.nextInt();
           if(r==1)
           loginmerchant();
           if(r==2)
           signup();
           else
           welcome();
        }
        public static void loginmerchant()
        {
           System.out.println("ENTER THE MERCHANT NAME");
           String a=sc.next();
           System.out.println("ENTER THE PASSWORD");
           int a1=sc.nextInt();
           if(s1.contains(a)&& s2.contains(a1)&&s3.contains(10))
           {
            merchantid1();
           } 
           else{
               System.out.println("ENTER THE CORRECT MERCHANT NAME (OR) PASSWORD");
               System.out.println();
               //System.out.println("\t\tSIGN UP");
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               merchant();
           }       
        }
        public static void merchantid1()
        {
            System.out.println("1.ADD DATA");
            System.out.println("2.CHANGE PASSWORD");
            System.out.println("3.VIEW STOCKS");
            System.out.println("4.EDIT DATA");
            System.out.println("5.EXIT");
            int s1=sc.nextInt();
            if(s1==1)
            {
                merchantid();
            }
            else if(s1==2)
            {
                changepass();
            }
            else if(s1==3)
            {
                viewstocks();
            }
            else if(s1==4)
            {
                edit();
            }
            else
            {
                welcome();
            }
        }
        public static void edit()
        {
            System.out.println("1. PRODUCT NAME");
            System.out.println("2. PRODUCT PRICE");
            System.out.println("3. PRODUCT COUNT");
            System.out.println("4. EXIT");
            System.out.println();
            System.out.println("ENTER THE DATA TO BE CHANGED");
            int s=sc.nextInt();
            if(s==1)
            {
                prodname();
            }
            else if(s==2)
            {
                prodprice();
            }
            else if(s==3)
            {
                prodcount();
            }
            else
            {
                merchantid1();
            }

        }
        public static void prodname()
        {
            System.out.println("ENTER THE MERCHANT ID");
            int k=sc.nextInt();
            System.out.println("PRODUCT NAME : "+j1.get(k));
            System.out.println("ENTER THE NEW NAME");
            String k1=sc.next();
            j1.set(k,k1);
            System.out.println("PRODUCT NAME : "+j1.get(k));
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            merchantid1();

        }
        public static void prodprice()
        {
            System.out.println("ENTER THE MERCHANT ID");
            int k=sc.nextInt();
            System.out.println("PRODUCT PRICE : "+j.get(k));
            System.out.println("ENTER THE NEW PRICE");
            int k1=sc.nextInt();
            j.set(k,k1);
            System.out.println("PRODUCT PRICE : "+j.get(k));
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            merchantid1();
        }
        public static void prodcount()
        {
            System.out.println("ENTER THE MERCHANT ID");
            int k=sc.nextInt();
            System.out.println("PRODUCT COUNT : "+j5.get(k));
            System.out.println("ENTER THE NEW COUNT");
           int k1=sc.nextInt();
            j5.set(k,k1);
            System.out.println("PRODUCT COUNT: "+j5.get(k));
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            merchantid1();
        }
        public static void merchantid()
        {
        System.out.println("ENTER THE MERCHANT NAME");
        String h=sc.next();
        j1.add(h);
        System.out.println("ENTER THE PRODUCT NAME");
        String h1=sc.next();
        j2.add(h1);
        System.out.println("ENTER THE PRODUCT TYPE");
        String h3=sc.next();
        j3.add(h3);
        System.out.println("ENTER THE PRODUCT PRICE");
        int h4=sc.nextInt();
        j.add(h4);
        System.out.println("ENTER THE MERCHANT ID");
        String h5=sc.next();
        j4.add(h5);
        System.out.println("ENTER THE PRODUCT COUNT");
        int h6=sc.nextInt();
        j5.add(h6);
        System.out.println("YOUR DATA IS ADDED SUCCESSFULLY");
        System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
        } 
        public static void removedata(){
        System.out.println("****CHOOSE THE DATA TO BE DELETED****");
        System.out.println("1. DELETE BY MERCHANT ID");
        System.out.println("2.CLEAR ALL");
        int u1=sc.nextInt();
        if(u1==1){
        System.out.println("ENTER THE MERCHANT ID");
        int d=sc.nextInt();
        if(d<=j1.size()-1){
           System.out.println("MERCHANT NAME : "+j1.remove(d));
           System.out.println("PRODUCT NAME : "+j2.remove(d));
           System.out.println("PRODUCT NAME : "+j3.remove(d));
           System.out.println("PRODUCT PRICE : "+j4.remove(d));
           System.out.println("MERCHANT ID: "+j.remove(d));
           System.out.println("PRODUCT COUNT : "+j5.remove(d));
           
        System.out.println();
        System.out.println("YOUR DATA IS REMOVED ");
        System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
              Adminid();
        }
        }
        else if(u1==2)
        {
            clearall();
        }
    

    
        else
        {
            System.out.println("INVALID MERCHANT ID");
            System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
           
        }
    
    }
        
        public static void  clearall()
        {
            System.out.println("DO YOU WANT TO ERASE ALL DATA");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int g=sc.nextInt();
            if(g==1)
            {
                j1.clear();
                j2.clear();
                j3.clear();
                j.clear();
                j4.clear();
                j5.clear();
                System.out.println("DATA IS CLEARED SUCCESSFULLY");
                System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
            } 
            else
            {
                welcome();
            }
        }
        public static void signup()
        {
            System.out.println("\t\t ENTER THE DETAILS TO REGISTER");
            System.out.println("ENTER THE MERCHANT NAME");
        String h=sc.next();
        i1.add(h);
        System.out.println("ENTER THE PRODUCT NAME");
        String h1=sc.next();
        i2.add(h1);
        System.out.println("ENTER THE PRODUCT TYPE");
        String h3=sc.next();
        i3.add(h3);
        System.out.println("ENTER THE PRODUCT PRICE");
        int h4=sc.nextInt();
        i.add(h4);
        System.out.println("ENTER THE MERCHANT ID");
        String h5=sc.next();
        i4.add(h5);
        System.out.println("ENTER THE PRODUCT COUNT");
        int h6=sc.nextInt();
        i5.add(h6);
            System.out.println("****REQUEST PENDING****");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();

        }
        public static void addnewmerchant()
        {
            System.out.println("1.MERCHANT NAME");
            String s=sc.next();
            j1.add(s);
            System.out.println("2.PRODUCT NAME");
            String s1=sc.next();
            j2.add(s1);
            System.out.println("3.PRODUCT TYPE");
            String s2=sc.next();
            j3.add(s2);
            System.out.println("4.PRODUCT PRICE");
            int s3=sc.nextInt();
            j.add(s3);
            System.out.println("5.MERCHANT ID");
           String s4=sc.next();
            j4.add(s4);
            System.out.println("6.PRODUCT COUNT");
            int s5=sc.nextInt();
            j5.add(s5);
            System.out.println("DATA ADDED SUCCESSFULLY");
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s10=sc.nextLine();
            if(s10.equals(""))
            Adminid();

        }
        public static void viewmerchant()
        {
            System.out.println("1.VIEW ALL");
            System.out.println("2.VIEW PARTICULAR");
            int u=sc.nextInt();
            if(u==1)
            {
                for (int p=0;p<j1.size();p++)
                {
                    System.out.println("---------------------------------------------");
                    System.out.println("MERCHANT NAME : "+j1.get(p));
                    System.out.println("PRODUCT NAME : "+j2.get(p));
                    System.out.println("PRODUCT TYPE : "+j3.get(p));
                    System.out.println("PRODUCT PRICE : "+j.get(p));
                    System.out.println("MERCHANT ID : "+j4.get(p));
                    System.out.println("PRODUCT COUNT : "+j5.get(p));
                }
                
            }
            else if(u==2)
            {
                System.out.println("ENTER THE MERCHANT ID TO BE VIEWED");
                int g=sc.nextInt();
                if(g<=j1.size()-1){
                System.out.println("MERCHANT NAME : "+j1.get(g));
                System.out.println("PRODUCT NAME : "+j2.get(g));
                System.out.println("PRODUCT TYPE : "+j3.get(g));
                System.out.println("PRODUCT PRICE : "+j.get(g));
                System.out.println("MERCHANT ID : "+j4.get(g));
                System.out.println("PRODUCT COUNT : "+j5.get(g));}
                else{
                System.out.println("ENTER THE VALID MERCHANT ID");}
            }
            System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   Adminid();
        }
        public static void changepass()
        {
            System.out.println("ENTER THE OLD PASSWORD");
            int h=sc.nextInt();
            if(s2.contains(h))
            System.out.println("ENTER THE NEW PASSWORD");
            int y=sc.nextInt();
            s2.add(y);
            System.out.println();
            System.out.println("YOUR PASSWORD IS CHANGED");
            System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   merchantid();

        } 
        public static void viewstocks()
        {
            System.out.println("\t\tWELCOME MERCHANT");
            System.out.println();
            System.out.println("1.VIEW TOTAL NO OF COUNTS");
            System.out.println("2. VIEW TOTAL NO OF STOCKS SOLD");
            int o=sc.nextInt();
            if(o==1)
            {
               
                System.out.println("ENTER YOUR MERCHANT ID");
                int u2=sc.nextInt();
                if(u2<=j5.size()-1){
                System.out.println("YOUR REMAINING STOCK IS");
                System.out.println(j5.get(u2)-soldout);}
                else{
                System.out.println("ENTER THE VALID MERCHANT ID");}
            }
            else if(o==2){
                System.out.println("ENTER YOUR MERCHANT ID");
                int u2=sc.nextInt();
                if(u2<=j4.size()-1){
                System.out.println("YOUR SOLD STOCKS ARE:");
                System.out.println(soldout);}
                else{
                    System.out.println("ENTER THE VALID ,MERCHANT ID");}
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               merchantid1();
        }
        public static void user()
        {
            System.out.println("\t\t*****WELCOME TO USER PAGE*****");
            System.out.println("1.LOGIN");
            System.out.println("2.SIGN UP");
            System.out.println("3.EXIT");
            int p=sc.nextInt();
            if(p==1)
            {
                userlogin();
            }
            else if(p==2)
            {
                usersignup();
            }
            else
            {
                welcome();
            }
        }
        public static void userlogin()
        {
             System.out.println("\t\tWELCOME TO USER LOGIN");
             System.out.println("ENTER THE USERNAME");
             String h=sc.next();
             System.out.println("ENTER THE PASSWORD");
             String jj=sc.next();
             if(o.contains(h)&&o1.contains(jj))
             {
                 amazon();
             }
             else if((o.contains(h)&&!o1.contains(jj))||(!o.contains(h)&&o1.contains(jj)))
             {
                 System.out.println("USERNAME OR PASSWORD IS INCORRECT");
             }
             else
             {
                 System.out.println("YOUR ACCOUNT DOESN'T EXIT");
                 System.out.println("PLEASE SIGNUP");
             }
             System.out.println();
             System.out.println("-------ENTER TO CONTINUE------");
                sc.nextLine();
                String s=sc.nextLine();
                if(s.equals(""))
                welcome();
        }
        public static void usersignup()
        {
            System.out.println("ENTER THE USERNAME");
            String h=sc.next();
            System.out.println("ENTER THE YOUR PASSWORD");
            String jj=sc.next();
            System.out.println("RE-ENTER YOUR PASSWORD TO CONFIRM");
            String uu=sc.next();
            if(jj.equals(uu))
            {
              o.add(h);
              o1.add(jj);
              System.out.println("YOU HAVE SUCCESSFULLY REGISTERED");
            }
            else{
                System.out.println("PASSWORD DOESN'T MATCH");
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
        }
        public static void amazon()
        {
            System.out.println("\t\t------WELCOME TO AMAZON------");
            System.out.println("\t\tINDIA'S LARGEST ONLINE SHOPPING ZONE");
            System.out.println();
            System.out.println("AVAILABLE ITEMS ARE LISTED BELOW ||");
            System.out.println("                                 VV");
            for(int p=0;p<j1.size();p++)
            {
               System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               System.out.println(p);
               System.out.println("---");
               System.out.println();
                System.out.println("MERCHANT NAME : "+j1.get(p));
                System.out.println("PRODUCT NAME : "+j2.get(p));
                System.out.println("PRODUCT TYPE : "+j3.get(p));
                System.out.println("PRODUCT PRICE : "+j4.get(p));
                System.out.println("MERCHANT ID : "+j.get(p));
                System.out.println("PRODUCT COUNT : "+j5.get(p)); 
            }
            System.out.println();
            System.out.println("1.PLACE YOUR ORDER");
            System.out.println("2.CARD");
            System.out.println("3.PURCHASE HISTORY");
            System.out.println("4.WALLET");
            System.out.println("5.EXIT");
            int po=sc.nextInt();
            if(po==2)
            {
                card();
            }
            else if(po==1)
            {
                order();
            }
            else if(po==3)
            {
                history();
            }
            else if(po==4)
            {
                wallet();
            }
            else{
                welcome();
            }
        }
        public static void card()
        {
            System.out.println("1.ADD TO CARD");
            System.out.println("2. REMOVE FROM CARD");
            System.out.println("3. VIEW CARD");
            System.out.println("4. EXIT");
            int j=sc.nextInt();
            if(j==1)
            {
            System.out.println("ENTER THE ID TO ADD");
            int p=sc.nextInt();
            System.out.println("PRODUCT NAME : "+j2.get(p));
            System.out.println("PRODUCT TYPE : "+ j3.get(p));
            System.out.println("PRODUCT PRICE : "+ j4.get(p));
            l.add(j2.get(p));
            l.add(j3.get(p));
            l.add(j4.get(p));
            System.out.println();
            System.out.println("SUCCESSFULLY ADDED TO CARD");
                }
                else if(j==2)
                {
                    System.out.println("ENTER THE ID TO REMOVE");
                    int p=sc.nextInt();
                System.out.println("PRODUCT NAME : "+(l.remove(j2.get(p))));
                System.out.println("PRODUCT TYPE : "+ l.remove(j3.get(p)));
                System.out.println("PRODUCT PRICE : "+ l.remove(j4.get(p)));
                System.out.println();
               System.out.println("SUCCESSFULLY REMOVED FROM CARD");
                }
                else if(j==3)
                {
                    System.out.println();
                    System.out.println("------------------");
                    System.out.println("***YOUR CARD***");
                    for(int p=0;p<l.size();p++){
                    System.out.println(l.get(p));
                    }
                   
                }
                else
                {
                    welcome();
                }
                System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   card();
            }
            public static void order()
            {
                System.out.println("ENTER THE PRODUCT");
                int i=sc.nextInt();
                System.out.println("PRODUCT NAME : "+j2.get(i));
                System.out.println("PRODUCT TYPE : "+ j3.get(i));
                System.out.println("PRODUCT PRICE : "+ j4.get(i));
                System.out.println("PRESS 10 TO CONFIRM YOUR ORDER");
                String j=sc.next();
                if(j.equals("10"))
                {
                    System.out.println("ENTER YOUR ADRESS");
                    String h=sc.next();
                    System.out.println("ENTER THE QUANTITY");
                    int d=sc.nextInt();
                    soldout=d;
                   balance-=d*Integer.parseInt(j4.get(i));
                   System.out.println("ENTER YOUR ADRESS");
                   String kk=sc.nextLine();
                   System.out.println();
                   System.out.println("YOUR ORDER IS CONFIRMED ");
                   k.add(j2.get(i));
                   k1.add(j3.get(i));
                   k2.add(j4.get(i));
                }
                else{
                    System.out.println("YOUR ORDER IS CANCELLED ");
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               amazon();
        }
        public static void history()
        {
            if(k.size()<0)
            {
                System.out.println("NO PURCHASE HISTORY");
            }
            else
            {
                for(int i=0;i<k.size();i++)
                {
                    System.out.println("-----------------------------------");
                    System.out.println("PRODUCT NAME :"+k.get(i));
                    System.out.println("PRODUCT TYPE :"+k1.get(i));
                    System.out.println("PRODUCT PRICE :"+k2.get(i));
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               amazon();

        }
        public static void wallet()
        {
            System.out.println("YOUR BALANCE IS : "+balance);
            System.out.println("PRESS 10 TO ADD MONEY TO WALLET");
            System.out.println("2.EXIT");
            int u=sc.nextInt();
            if(u==10)
            {
               System.out.println("ENTER THE AMOUNT");
               int u1=sc.nextInt();
               balance+=u1;
               System.out.println();
               System.out.println("AMOUNT ADDED SUCCESFULLY");
            }
            else if(u==2)
            {
                amazon();
            }
            else{
                System.out.println("ENTER THE VALID NUMBER");
                System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               wallet();
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               amazon();
        }
        
        }