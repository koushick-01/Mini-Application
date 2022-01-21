import java.util.*;

import javax.lang.model.util.ElementScanner14;
 class Atm {
	 static ArrayList<Integer> a=new ArrayList<>();
	 static ArrayList<String> a1=new ArrayList<>();
	 static ArrayList<String> a2=new ArrayList<>();
	 static ArrayList<Integer> a3=new ArrayList<>();
	 static ArrayList<String> a4=new ArrayList<>();
static int count1=0;
	    static Scanner sc = new Scanner(System.in);
	    static int x,p=10;
	    static int balance1=0;
	    static int balance=100000;
		static int count=0;
	    static int ar[]={0,0,0,0};
	    public static void main(String[] args){
	        System.out.flush();
	        welcome();
	        hello();
	    }
	        public static void hello() {
	        if(x>3 || x<1)
	        	welcome();
	        switch(x){
	            case 1:{
	                admin();

	            }
	            case 2:{
	                customer();
	            }
	            case 3:{
	                System.out.flush();
	                System.out.print("Thank you for visting the atm");
	            }
	        }
	    }
	    public static void welcome(){
	        System.out.println("\t\tATM");
	        System.out.println("1.ADMIN");
	        System.out.println("2.CUSTOMER");
	        System.out.println("3.EXIT");
	        x=sc.nextInt();
	        System.out.flush();
	        hello();
	    }
	    public static void admin(){
	        System.out.print("ENTER USERNAME: ");
	        String s = sc.next();
	        System.out.print("ENTER PASSWORD : "); 
	        int a = sc.nextInt();
	        if((s.equals("KOUSHICK") && a==10) || ((s.equals("0102") && a==05))){
	        System.out.flush();
	            trueAdmin();
	        }
	    }
	    public static void trueAdmin(){
	        System.out.println("\t\tWelcome admin");
	            System.out.println("1. Add Money");
	            System.out.println("2. Show Balance");
	            System.out.println("3. Exit");
	            int l=sc.nextInt();
	            if(l==1){
	             
	        System.out.flush();
	        add();}
	            else if(l==2) {
	        System.out.flush();
	                show();
	            }
	            else{
	        System.out.flush();
	                 welcome();
	            }
	    }
	    public static void add(){
	        System.out.println("Enter number of notes to add");
	        System.out.println("ENTER THE NO OF 2000");
	        ar[3]+=sc.nextInt(); 
	        System.out.println("ENTER THE NO OF 500");
	        ar[2]+=sc.nextInt();
	        System.out.println("ENTER THE NO OF 200");
	        ar[1]+=sc.nextInt();
	        System.out.println("ENTER THE NO OF  100");
	        ar[0]+=sc.nextInt();
	        System.out.println("====PRESS ENTER TO CONTINUE====");
	        
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals("")){
	        System.out.flush();      
	            addbalance();
	        } 
	    }
	    public static void show(){
	        System.out.println("100 --> "+ar[0]);
	        System.out.println("200 --> "+ar[1]);
	        System.out.println("500 --> "+ar[2]);
	        System.out.println("2000 --> "+ar[3]);
	        System.out.println("ATM BALANCE IS:"+balance1);
	        System.out.println("====PRESS ENTER TO CONTINUE====");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals("")){

	        System.out.flush();
	            trueAdmin();
	        } 
	    }
	    public static void customer(){

	  
	        System.out.flush();
	        sc.nextLine();
	        System.out.print("ENTER YOUR  USERNAME : ");
	        String n=sc.nextLine();
	        System.out.print("ENTER YOUR PASSWORD: ");
	         p=sc.nextInt();
	        if(n.equals("KOUSHICK") && p==10&&count<3){
	            a1.add(n);
	            customerid();
	            }
	        else
	        {
				if(count<3){
				count++;
	        	System.out.println("ENTER THE CORRECT USERNAME OR PASSWORD");
	        	 System.out.println("=====PRESS ENTER TO CONTINUE====");
	    		   sc.nextLine();
		    	   String hh=sc.nextLine();
		    	   if(hh.equals(""))
		    		   customer();
				}
					   else{
					   System.out.println("YOUR ACCOUNT IS BLOCKED FOR 24 HRS");
					   System.out.println();
					   System.out.println("ENTER THE CORRECT USERNAME OR PASSWORD");
	        	 System.out.println("=====PRESS ENTER TO CONTINUE====");
	    		   sc.nextLine();
		    	  String  hh=sc.nextLine();
		    	   if(hh.equals(""))
				   welcome();
					   }

	        }
	       
	       
	    } 
	    public static void customerid(){
	        //System.out.print("\033[H\033[2J");
	        System.out.flush();
	        System.out.println("1. WITHDRAW");
	        System.out.println("2. PIN CHANGE");
	        System.out.println("3. BALANCE ECQUIRY");
	        System.out.println("4. DEPOSIT PENNY");
	        System.out.println("5. MONEY TRANSFER");
			System.out.println("6. MINI STATEMENT");
	        System.out.println("7. EXIT");
	        int g=sc.nextInt();
	        if(g==1)
	            withdraw();
	        if(g==4)
	        	deposit();
	        if(g==3)
	        	balance();
	        if(g==2)
	        	pin();
	        if(g==5)
	        {
	        	transaction();
	        }
	        if(g==6){
	            System.out.flush();
	           ministatement();}
			   else
			   {
				   welcome();
			   }

            }
	    
	    public static void withdraw(){
	        System.out.flush();
	        
	        System.out.println("ENTER THE AMOUNT: ");
	        int amount=sc.nextInt();
	        
	       if(amount<=balance){
	       balance-=amount;
		   a.add((amount));
		   a3.add((balance));
		   balance1-=amount;
	       System.out.println("AVAILABLE BALANCE : "+balance);
		   count1++;
	       //System.out.println();
	       while(amount>0){
	           if(ar[3]>0 && amount>=2000){
	               amount-=2000;
	               ar[3]--;
	           }
	           else if(ar[2]>0 && amount>=500){
	            amount-=500;
	            ar[2]--;
	        }
	        else if(ar[1]>0 && amount>=200){
	            amount-=200;
	            ar[1]--;
	        }
	        else if(ar[0]>0 && amount>=100){
	            amount-=100;
	            ar[0]--;
	        }
	         
	       
	       
	       System.out.println("PRESS ENTER TO CONTINUE");
	       sc.nextLine(); 
	       String back=sc.nextLine();
	       if(back.equals(""))
	            customerid();
	       }
		}
		
	  
	    
	    
	   
	       else{
	           System.out.println("SORRY, NO SUFFICIENT BALANCE");
	       }
	       System.out.println();
	       System.out.println("PRESS ENTER TO CONTINUE");
	       sc.nextLine();
	       String back=sc.nextLine();
	       if(back.equals(""))
	            customerid();
	    }
	
	       public static void  deposit()
	       {
	    	   System.out.println("ENTER THE NO OF NOTE TO ADD");
		        System.out.println("ENTER THE NO OF 2000");
		        ar[3]+=sc.nextInt(); 
		        System.out.println("ENTER THE NO.OF 500");
		        ar[2]+=sc.nextInt();
		        System.out.println("ENTER THE NO OF 200");
		        ar[1]+=sc.nextInt();
		        System.out.println("ENTER THE NO OF 100");
		        ar[0]+=sc.nextInt();
		        balance1+=ar[3]*2000+ar[2]*500+ar[1]*200+ar[0]*100;
		        balance+=ar[3]*2000+ar[2]*500+ar[1]*200+ar[0]*100;
	    	   System.out.println("YOR MONEY HAS SUCCESSFULLY DEPOSITED");
	    	   System.out.println("PRESS ENTER TO CONTINUE");
	    	   sc.nextLine();
	    	   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	       }
	       public static void balance()
	       {
	    	   System.out.println(balance);
	       
	       System.out.println("PRESS ENTER TO CONTINUE");
		   sc.nextLine();
    	   String hh=sc.nextLine();
    	   if(hh.equals(""))
    		   customerid();
	       }
	       public static void pin() {
	    	   System.out.println("ENTER A OLD PIN");
	    	   int y1=sc.nextInt();
	    	   if(y1==p)
	    	   {
	    		   System.out.println("ENTER A NEW PIN");
	    		   int y2=sc.nextInt();
	    		   p=y2;
	    		   System.out.println("PIN UPDATED SUCCESSFULLY");
	    		   
	    	   
	    	   System.out.println("PRESS ENTER TO CONTINUE");
    		   sc.nextLine();
	    	   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	    	   }
	    	   else
	    	   {
				   if(count<3){
	    		   System.out.println("PIN IS INCORRECT");
				   }

	    	   }
	    	      System.out.println("PRESS ENTER TO CONTINUE");
	    	      sc.nextLine();
    		   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	    	   
	       }
	       public static void addbalance()
	       {
	    	   balance1+=ar[3]*2000+ar[2]*500+ar[1]*200+ar[0]*100;
	    	   trueAdmin();
	       }
	       public static void transaction()
	       {
	    	   System.out.println("ENTER THE ACCOUNT NUMBER");
	    	   String a=sc.next();
	    	   if(a.length()>5)
	    	   {
	    	   System.out.println("ENTER THE AMOUNT");
	    	   int amount=sc.nextInt();
	    	   if(amount<balance) {
	    	   System.out.println("ENTER THE IFSC CODE");
	    	   String a1=sc.next();
	    	   //int amount=sc.nextInt();
	    	   if(!a1.contains("SBI"))
	    	   {
	    		 amount+=100; 
	    	   }
	    	   balance-=amount;
	    	   balance1-=amount;
	    	   System.out.println("RE-ENTER THE PIN TO CONTINUE");
	    	   int p4=sc.nextInt();
	    	   if(p4==p) {
	    		   System.out.println("YOUR MONEY HAS BE SENT SUCCESSFULLY");
	    		   sc.nextLine();
	    	   System.out.println("PRESS ENTER TO CONTINUE");
   		      String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	       }
	    	   
	       else
	       {
	    	   System.out.println("YOU ENTERED A WRONG PIN");
	    	   System.out.println("YOUR TRANSCATION WAS CANCELLED");
	    	   System.out.println("PRESS ENTER TO CONTINUE");
    		   sc.nextLine();
	    	   String hh=sc.nextLine();
	    	   if(hh.equals(""))
	    		   customerid();
	       }
	    	   }
	    
	    	   else if(amount>balance)
	    	   {
		    		   System.out.println("NO SUFFICIENT BALANCE");
		    		   sc.nextLine();
			    	   System.out.println("PRESS ENTER TO CONTINUE");
		   		      String hh=sc.nextLine();
			    	   if(hh.equals(""))
			    		   customerid();
	    	   }}
	    	   else
	    	   {
	    		   System.out.println("YOUR ACC NUMBER SIZE MUST BE GREATER THAN 5");
	    		   sc.nextLine();
		    	   System.out.println("PRESS ENTER TO CONTINUE");
	   		      String hh=sc.nextLine();
		    	   if(hh.equals(""))
		    		   customerid();
	    	   }
	    }
		public static void ministatement()
		{
			System.out.println("WITHDRAWED "+"USERNAME "+"BALANCE");
			for(int i=0;i<a.size();i++)
			{
			
				System.out.println(a.get(i)+"       "+a1.get(0)+"    "+a3.get(i));
			}
			
		
	
				//System.out.println("\nUSER NAME"+a1);
			//	System.out.println("\nBALANCE"+a3);
			//}
				//System.out.println(a.get(a.size()-i));
				System.out.println("PRESS ENTER TO CONTINUE");
				String hh=sc.nextLine();
			  if(hh.equals(""))
				  customerid();
			
		} 
}