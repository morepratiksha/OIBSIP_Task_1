package reservation_system;

import java.util.Scanner;

public class Online_Reservation_System {
	


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("|| WELCOME TO ONLINE RESERVATION SYSTEM ||");
			System.out.println("------------------------------------------------------------");
			System.out.println("Press 1 to SIGN UP ");
			System.out.println("Press 2 to LOGIN ");
			int BUTTON;
			BUTTON = sc.nextInt();
			System.out.println("-------------------------------------------------------------");
			switch(BUTTON) {
				case 1->SIGNIN();
				case 2->{
					System.out.println("PLEASE CREATE AN ACCOUNT !!!");
					System.out.println("---------------------------------------------------------");
					SIGNIN();
				}
				default->{
					System.out.println("----------- |\\t\\t\\tINCORRECT INPUT\\t\\t\\t\\t| ----------- ");
					System.out.println("----------------------------------------------------------");
				}
			}
		}
		public static void SIGNIN() {
			Scanner sc = new Scanner(System.in);
			String id="";
			String pw="";
			
			System.out.println("Enter User Id and Password: ");
			try {
				id = sc.next();
				pw= sc.next();
			}catch(Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.println("|| YOU HAVE SIGNED IN SUCCESSFULY !!! ||");
			System.out.println("--------------------------------------------------------");
			LOGIN(id,pw);

		}

		public static void LOGIN(String id, String pw) {
			String user_id;
			String pass;
			int BUTTON1 = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter User ID :");
			user_id = sc.next();
			System.out.print("Enter Password :");
			pass = sc.next();
			if(id.equals(id)) {
				if(pw.equals(pass)) {
					System.out.println("|| LOGIN SUCCESSFULY !!! ||");
					System.out.println("--------------------------------------------------");
					System.out.println("PRESS 1 TO BOOK TRAIN TICKET");
					
					try {
						BUTTON1 = sc.nextInt();
						
					}catch(Exception e) {
						System.out.println(e);
					}
					if(BUTTON1 == 1) {
						ReservationSystem();
					}
				
					}else {
						System.out.println("----------- |\\t\\t\\tINCORRECT INPUT\\t\\t\\t\\t| ----------- ");
						System.out.println("-----------------------------------------------------");
					}
				}else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("\t\t\t\t\t\t| 404 |\t\t\t");
					System.out.println("\t\t\t\tINCORRECT ID & PASSWORD\t\t\t");
				 	System.out.println("------------------------------------------------------------------");
					LOGIN(id, pw);
					System.exit(0);
				}
			}
		private static void Exit() {
			// TODO Auto-generated method stub
			
		}
		public static void CancellationSystem(String name,int age,String start,String end,int PRN,int Class_Type,String date,String train_name,int Train_Number) {

			Scanner C = new Scanner(System.in);
			System.out.println("Enter PRN:");
			 int PRNL = 25;
			try {
				PRNL = C.nextInt();
			}catch(Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			if(PRN==PRNL) {
				System.out.println("Train Name :" +train_name );
				System.out.println( "Train Number :"+ Train_Number);
				System.out.println("PRN :"+PRNL);
				System.out.println("Class_Type :"+Class_Type);
				System.out.println("From : " + start  );
				System.out.println("To :"+end);
				System.out.println("Passenger Name :"+name);
				System.out.println("Age :"+age);
				System.out.println("Date :" + date);
				System.out.println("---------|| CANCELLATION SUCCESSFULLY ||------------");
				System.out.println("---------------------------------------------------------------------");
			}else {
				System.out.println("---------|| ENTER VALID PRN  ||------------");
				CancellationSystem(name,age,start,end,PRN,Class_Type,date,train_name,Train_Number);
				System.out.println("---------------------------------------------------------------------");
			}
		}


		public static void ReservationSystem() {
			String name="";
			int age= 0;
			String start = "";
			String end = "";
			int Class_Type = 0;
			String date = "";
			String train_name = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------------------------------------------------------");
			System.out.print("Enter Name of Passenger : ");
			try {
				name = sc.nextLine();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.print("Enter age : ");
			try {

				age = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			sc.nextLine();
			System.out.print("Enter Train Name : ");
			try {
				train_name = sc.nextLine();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.print("Enter Travel Date : ");
			try {
				date = sc.next();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			
			System.out.print("From : ");
			try {
				start = sc.next();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
			System.out.print("To : ");
			try {
				end = sc.next();
			} catch (Exception e) {
				System.out.println(e);
				System.exit(0);
			}
		
			
			System.out.println("------------------------------------------------------------------");
			 int Train_Number= (int)Math.floor(Math.random()*100000);
			 int PRN= (int)Math.floor(Math.random()*10000);
	 
			
			
			
			
			
			System.out.println("------------------------------------------------------------------");
			System.out.println("Press 1 to Ticket Conform");
			System.out.println("Press 2 to Cancel Tickets");
			int button3 = sc.nextInt();
			switch (button3) {
				case 1 -> {
					ticket(name, age, start, end, PRN, Class_Type, date, train_name, Train_Number);
					System.out.println("-----------| YOUR TICKET IS CONFIRMED  |-----------");
					System.out.println("--------------------------------------------------------------------------");
				}
				case 2 -> {
					CancellationSystem(name, age, start, end, PRN, Class_Type, date, train_name, Train_Number);
				}
				default -> {
					System.out.println(" ----------- |\t\t\tINCORRECT INPUT\t\t\t\t| ----------- ");
					System.out.println("------------------------------------------------------------------");
				}
			}

		}
		public static void ticket(String name, int age, String start, String end, int PRN, int Class_Type, String date, String train_name, int Train_Number) {
			Scanner sc = new Scanner(System.in);
			System.out.println("TICKET");
		
			System.out.println("Train Name :" +train_name );
			System.out.println( "Train Number:"+ Train_Number);
			System.out.println("PRN :"+PRN);
			System.out.println("Class_Type :"+Class_Type);
			System.out.println("From : " + start  );
			System.out.println("To :"+end);
			System.out.println("Passenger Name :"+name);
			System.out.println("Age :"+age);
			System.out.println("Date :" + date);
		}


		}


