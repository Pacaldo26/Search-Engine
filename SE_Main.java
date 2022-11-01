
package search_engine;
import java.util.*;

public class SE_Main 
{
    public static Scanner in = new Scanner(System.in);
    public static List<SE_Account>useraccs = new ArrayList<>();
    //private final List<account>accounts= new ArrayList<>();
    public static String choice,again,NAME,LASTNAME,EMAIL,USERNAME,PASSWORD,user,pass;
    //static Searchmanagement sm = new Searchmanagement();
    public static char acc;
    public static int attempt = 1;
    public static String choose;
    public static boolean stat = true;
   
   
     public static void CHOICE()
    {
        while(stat)
       
       
        {
            System.out.println("----------------------------");
            System.out.println("      Welcome Facebook      ");
            System.out.println("----------------------------");
            System.out.println();
            System.out.println("Press '1' to Login "
                           + "\nPress '2' to Signup ");
            System.out.print("Enter Choice : ");
            acc=in.next().charAt(0);
            System.out.println("----------------------------");

            // FOR PAGES *******************************************************************
           switch(acc)
           {
               case '1':
                   Login();
                   break;
               case '2':
                  Signup();
                   break;
               default:
                   System.out.println("Try Again\n\n");
           }
        }
   
    }
     
     public static void Signup()
     {
         
         in.nextLine();
         
          System.out.println("Enter Name");
          NAME=in.nextLine();
          System.out.println("Enter Lastname");
          LASTNAME=in.nextLine();
          System.out.println("Enter Email");
          EMAIL=in.nextLine();
          System.out.println("Enter Username");
          USERNAME=in.nextLine();
          System.out.println("Enter Password");
          PASSWORD=in.nextLine();
         
          SE_Account users = new SE_Account(NAME,LASTNAME,EMAIL,USERNAME,PASSWORD);
          useraccs.add(users);
     }
     
     public static void Login()
     {
         
        while(stat){
           
            
            System.out.println("----------------------------");
           
           
                System.out.println("username: ");
                user = in.next();
                System.out.println("password: ");
                pass = in.next();
                if(user.equals(USERNAME) && pass.equals(PASSWORD)){
                    CHOICES();
                    break;
                }
                else if (!(user.equals(USERNAME) && pass.equals(PASSWORD)) && attempt == 3)
                {
                    System.out.println("Maximum Attempts");
                    System.out.println("Login attempt: " + attempt);
                    System.exit(0);
                }
                else
                {

                    System.out.println("Login incorrect!");
                    System.out.println("Login attempt: " + attempt);
                    attempt++;
                    
                }
        }
     }
    public static void CHOICES()
    {
           
           while(stat){
       

                System.out.println("----------------------------");
                System.out.println("         Facabook          ");
                System.out.println("*******Search Engine*******");
                System.out.println("________________________________");
                System.out.print(" |Search : ");
                choice = in.next();
                
           
        
    
        // FOR PAGES *******************************************************************
       
    
        
     if(choice.equals("SHAPPY") || choice.equals("shappy") || choice.equals("Shappy"))
     {
         SE_pages.SHAPPY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CLARITY") || choice.equals("clarity") || choice.equals("Clarity"))
     {
         SE_pages.CLARITY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("AYALAMALLSCAPITOLCENTRAL") || choice.equals("ayalamallscapitolcentral") || choice.equals("Ayalamallscapitolc  entral"))
     {
         SE_pages.AYALAMALLSCAPITOLCENTRAL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SERENITYVIBE") || choice.equals("senerityvibe") || choice.equals("SerenityVibe"))
     {
         SE_pages.SERENITYVIBE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("KATIK") || choice.equals("katik") || choice.equals("Katik"))
     {
         SE_pages.KATIK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("PHINMACAGAYANDEOROCITY") || choice.equals("phinmacagayandeorocity") || choice.equals("Phinmacagayandeorocity"))
     {
         SE_pages.PHINMACOC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BEN&BEN") || choice.equals("ben&ben") || choice.equals("Ben&ben"))
     {
         SE_pages.BEN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no")|| again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("CERVANA") || choice.equals("cervana") || choice.equals("Cervana"))
     {
         SE_pages.CERVANA();
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("REHM") || choice.equals("rehm") || choice.equals("Rehm"))
     {
         SE_pages.REHM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
  else if(choice.equals("LEXERS") || choice.equals("lexers") || choice.equals("Lexers"))
     {
         SE_pages.LEXERS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("META") || choice.equals("meta") || choice.equals("Meta"))
     {
         SE_pages.META();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FILIPINOVINES") || choice.equals("filipinovines") || choice.equals("Filipinovines"))
     {
        SE_pages. FILIPINOVINES();
         
        System.out.println("Do You Want Search Again??? Yes Or No");
        System.out.println("Enter : "); 
        again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("OREO") || choice.equals("oreo") || choice.equals("Oreo"))
     {
         SE_pages.OREO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STEEZYGADGETHUBCDO") || choice.equals("steezygadgethubcdo") || choice.equals("Steezygadgethubcdo"))
     {
         SE_pages.STEEZYGADGETHUBCDO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PRIMEVIDEOPH") || choice.equals("primevideoph") || choice.equals("Primevideoph"))
     {
         SE_pages.PRIMEVIDEOPH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SMARTCOMMUNICATIONINC") || choice.equals("smartcommunicationinc") || choice.equals("Smartcommunicationinc"))
     {
         SE_pages.SMARTCOM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SHOPZADA") || choice.equals("shopzada") || choice.equals("Shopzada"))
     {
         SE_pages.SHOPZADA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PALMOLIVENATURALS") || choice.equals("palmolivenaturals") || choice.equals("Palmolivenaturals"))
     {
         SE_pages.PANA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLLEGEOFINFORMATIONTECHNOLOGYSTUDENTBODYORGANIZATION") || choice.equals("collegeofinformationtechnologystudentbodyorganization") || choice.equals("Collegeofinformationtechnologystudentbodyorganization"))
     {
         SE_pages.CITSBD ();
     
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SEAOIL") || choice.equals("seaoil") || choice.equals("Seaoil"))
     {
         SE_pages.SEAOIL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NEUTROGENA") || choice.equals("neutrogena") || choice.equals("Neutrogena"))
     {
         SE_pages.NEUTROGEN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLUMBIASPORTSWAREPH") || choice.equals("columbiasportwareph") || choice.equals("Columbiasportwareph"))
     {
         SE_pages.COMSPOPH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TELMA") || choice.equals("telma") || choice.equals("Telma"))
     {
         SE_pages.TELMA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JONYY") || choice.equals("jonny") || choice.equals("Jonny"))
     {
         SE_pages.JONYY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BENEDEXRAMOS") || choice.equals("benedexramos") || choice.equals("Benedexramos"))
     {
         SE_pages.BERA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GREENWICHBARKADA") || choice.equals("greenwichbarkada") || choice.equals("Greenwichbarkada"))
     {
         SE_pages.GREENBAR();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JOIRA") || choice.equals("joira") || choice.equals("Joira"))
     {
         SE_pages.JOIRA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SANDKING") || choice.equals("sandking") || choice.equals("Sandking"))
     {
         SE_pages.SK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KUYAMEL") || choice.equals("kuyamel") || choice.equals("Kuyamel"))
     {
         SE_pages.KM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TAKETWOFILMS") || choice.equals("taketwofilms") || choice.equals("Taketwofilms"))
     {
         SE_pages.TTF();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DIONELA") || choice.equals("dionela") || choice.equals("Dionela"))
     {
         SE_pages.D();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TELEPERFORMANCEPHILIPPINES") || choice.equals("teleperformancephilippines") || choice.equals("Teleperformancephilippines"))
     {
         SE_pages.TP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TITAKIM") || choice.equals("titakim") || choice.equals("Titakim"))
     {
         SE_pages.TK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MCDONALDS") || choice.equals("mcdonalds") || choice.equals("Mcdonalds"))
     {
         SE_pages.MCDO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("APORTS") || choice.equals("aports") || choice.equals("Aports"))
     {
         SE_pages.A();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
          else if(choice.equals("STUDENT") || choice.equals("student") || choice.equals("Student"))
     {
         SE_pages.STUDENT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KHELTRISHTV") || choice.equals("kheltrishtv") || choice.equals("Kheltrishtv"))
     {
         SE_pages.KTT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PHCAREPHILIPPINES") || choice.equals("phcarephilippines") || choice.equals("Phcarephilippines"))
     {
         SE_pages.PCP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARCOLAVILLA") || choice.equals("marcolavilla") || choice.equals("Marcolavilla"))
     {
         SE_pages.ML();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BRYOFFICIAL") || choice.equals("bryofficial") || choice.equals("Bryofficial"))
     {
         SE_pages.BO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MYXGLOBAL") || choice.equals("myxglobal") || choice.equals("Myxglobal"))
     {
         SE_pages.MG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CALLSTREET") || choice.equals("callstreet") || choice.equals("Callstreet"))
     {
         SE_pages.CS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ITSSHOWTIME") || choice.equals("itsshowtime") || choice.equals("Itsshowtime"))
     {
         SE_pages.IS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("LAPISIANSOFFICIAL") || choice.equals("lapisiansofficial") || choice.equals("Lapisiansofficial"))
     {
         SE_pages.LO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ASAPOFFICIAL") || choice.equals("asapofficial") || choice.equals("Asapofficial"))
     {
         SE_pages.AO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BURGERKINGPHILIPPINES") || choice.equals("burgerkingphilippines") || choice.equals("Burgerkingphilippines"))
     {
         SE_pages.BKP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JEGGYJEG") || choice.equals("jeggyjeg") || choice.equals("Jeggyjeg"))
     {
         SE_pages.JJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SERENITYVIBE") || choice.equals("serenityvibe") || choice.equals("Serenityvibe"))
     {
         SE_pages.SERENITYVIBE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ARTHURMIGUEL") || choice.equals("arthurmiguel") || choice.equals("Arthurmiguel"))
     {
         SE_pages.AM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ESMARK") || choice.equals("esmark") || choice.equals("Esmark"))
     {
         SE_pages.ESMARK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TROPANGLOL") || choice.equals("tropanglol") || choice.equals("Tropanglol"))
     {
         SE_pages.TL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DAPANEY") || choice.equals("dapaney") || choice.equals("Dapaney"))
     {
         SE_pages.DAPANEY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     
     //FOR PEOPLES *********************************************************************************************************
   
       
        else if(choice.equals("ADORAJAQUILMACDUMAOG") || choice.equals("adorajaquilmacdumaog") || choice.equals("Adorajaquilmacdumaog"))
     {
         SE_people.AJD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SAMANTHAMARMERCADO") || choice.equals("samanthamarmercado") || choice.equals("Samanthamarmercado"))
     {
         SE_people.SMM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SHERWINSALVOSELMA") || choice.equals("sherwinsalvoselma") || choice.equals("Sherwinsalvoselma"))
     {
         SE_people.SSS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARKQUISTADIOPALMA") || choice.equals("markquistadiopalma") || choice.equals("Markquistadiopalma"))
     {
         SE_people.MQP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RAFAELLOZANODUMAOG") || choice.equals("rafaellozanodumaog") || choice.equals("Rafaellozanodumaog"))
     {
         SE_people.RLD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANECANTAYAYUBAN") || choice.equals("janecantayayuban") || choice.equals("Janecantayayuban"))
     {
         SE_people.JCA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DAVIDJAQUILMACDUMAOG") || choice.equals("davidjaquilmacdumaog") || choice.equals("Davidjaquilmacdumaog"))
     {
         SE_people.DJD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUSTINEMARVILGARA") || choice.equals("justinemarvilgara") || choice.equals("Justinemarvilgara"))
     {
         SE_people.JMV();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ROSALYNINTONGJAQUILMAC") || choice.equals("rosalynintongjaquilmac") || choice.equals("Rosalynintongjaquilmac"))
     {
         SE_people.RIJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANCRUZCAYONDA") || choice.equals("jancruzcayonda") || choice.equals("Jancruzcayonda"))
     {
         SE_people.JCC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("VANISSAINTONGJAQUILMAC") || choice.equals("vanissaintongjaquilmac") || choice.equals("Vanissaintongjaquilmac"))
     {
         SE_people.VIJ();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("LINDSAYMUITBALDONADO") || choice.equals("lindsaymuitbaldonado") || choice.equals("Lindsaymuitbaldonado"))
     {
         SE_people.LMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CHRISTIANSAPONABACAHIN") || choice.equals("christiansaponabacahin") || choice.equals("Christiansaponabacahin"))
     {
         SE_people.CSA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RECHELLEEBALARLUBERAS") || choice.equals("rechelleeballarluberas") || choice.equals("Rechelleeballarluberas"))
     {
         SE_people.REL();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DARIELLLAMISMUIT") || choice.equals("darielllamismuit") || choice.equals("Darielllamismuit"))
     {
         SE_people.DLM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JANEMILITARESSIBAY") || choice.equals("janemilitaressibay") || choice.equals("Janemilitaressibay"))
     {
         SE_people.JMS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
         
     }
     else if(choice.equals("JUSTINEFABEMUIT") || choice.equals("justinefabemuit") || choice.equals("Justinefabemuit"))
     {
         SE_people.JFM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ASHLIESTANOLDONGUINES") || choice.equals("ashliestanoldonguines") || choice.equals("Ashliestanoldonguines"))
     {
         SE_people.SED();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DIANEBALABAOSING") || choice.equals("dianebalabaosing") || choice.equals("Dianebalabaosing"))
     {
         SE_people.DBO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("DERRICKCULTURASAGRADO") || choice.equals("derrickculturasagrado") || choice.equals("Derrickculturasagrado"))
     {
         SE_people.DCS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("TRIVYDELAPENACURAY") || choice.equals("trivydelapenacuray") || choice.equals("Trivydelapenacuray"))
     {
         SE_people.TDC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("MICHELLEDACUPACON") || choice.equals("michelledacupacon") || choice.equals("Michelledacupacon"))
     {
         SE_people.MDP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("LOUISEELARCOARABIANA") || choice.equals("louiseelarcoarabiana") || choice.equals("Louiseelarcoarabiana"))
     {
         SE_people.LEA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("PHILLIPPEREZSALINGAY") || choice.equals("phillipperezsalingay") || choice.equals("Phillipperezsalingay"))
     {
         SE_people.PPS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SHAIRAMADRIDANOBELTRAN") || choice.equals("shairamadridanobeltran") || choice.equals("Shairamadridanobeltran"))
     {
         SE_people.SMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
      else if(choice.equals("SANDRAGARCIACASAS") || choice.equals("sandragarciacasas") || choice.equals("Sandragarciacasas"))
     {
         SE_people.SGC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALONAMONTECILLOBABANO") || choice.equals("alonamontecillobabano") || choice.equals("Alonamontecillobabano"))
     {
         SE_people.AMB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }else if(choice.equals("CHRISTIANCAHULOGANHAMO") || choice.equals("christycahuloganhamo") || choice.equals("Christycahuloganhamo"))
     {
         SE_people.CCH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("TRISHAJAQUILMACVALMORIDA") || choice.equals("trishajaquilmacvalmorida") || choice.equals("Trishajaquilmacvalmorida"))
     {
         SE_people.TJV();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUNEGALASGERALDEZ") || choice.equals("junegalasgeraldez") || choice.equals("Junegalasgeraldez"))
     {
         SE_people.JGG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALTHEABAINTOMAGAWAY") || choice.equals("altheabaintomagaway") || choice.equals("Altheabaintomagaway"))
     {
         SE_people.ABM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARIAVALMORIDATION") || choice.equals("mariavalmoridation") || choice.equals("Mariavalmoridation"))
     {
         SE_people.MVT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MARKDABLOBADA") || choice.equals("markdablobada") || choice.equals("Markdablobada"))
     {
         SE_people.MDB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NINAMAGADALESMEDINA") || choice.equals("ninamagdalesmedina") || choice.equals("Ninamagdalesmedina"))
     {
         SE_people.NMM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GERMAINQUIDERGARRIDO") || choice.equals("germainquidergarrido") || choice.equals("Germainquidergarrido"))
     {
         SE_people.GQG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JAZELUBSUBANENTERINA") || choice.equals("jazelubsubanenterina") || choice.equals("Jazelubsubanenterina"))
     {
         SE_people.JUE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("REJEEDALUPEREDEDOMO") || choice.equals("rejeedaluperededomo") || choice.equals("Rejeedaluperededomo"))
     {
         SE_people.RDD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DELMEGEANPORNESABAO") || choice.equals("delmegeanpornesabao") || choice.equals("Delmegeanpornesabao"))
     {
         SE_people.DPA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CHARLYNAGULAYPAJARON") || choice.equals("charlynagulaypajaron") || choice.equals("Charlynagulaypajaron"))
     {
         SE_people.CAP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JESSASABANTOACENAS") || choice.equals("jessasabantoacenas") || choice.equals("Jessasabantoacenas"))
     {
         SE_people.JSA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SANDRAPASCONABALES") || choice.equals("sandrapasconabales") || choice.equals("Sandrapasconabales"))
     {
         SE_people.SPN();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JESONTAMBAGANTAGAL") || choice.equals("jesontambagantagal") || choice.equals("Jesontambagantagal"))
     {
         SE_people.JTT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MECHAELLAHENSONASINO") || choice.equals("mechaellahensonasino") || choice.equals("Mechaellahensonasino"))
     {
         SE_people.MHA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("EDNELLBUTALIDALABA") || choice.equals("ednellbutalidalaba") || choice.equals("Ednellbutalidalaba"))
     {
         SE_people.EBA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DANIELADULANASSIN-INGAN") || choice.equals("danieladulanassin-ingan") || choice.equals("Danieladulanassin-ingan"))
     {
         SE_people.DDS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("JUNMARGADOTSALALIMA") || choice.equals("junmargadotsalalima") || choice.equals("Junmargadotsalalima"))
     {
         SE_people.JGS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ABEGUILMENDEZDUMAOG") || choice.equals("abeguilmendezdumaog") || choice.equals("Abeguilmendezdumaog"))
     {
         SE_people.AMD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("AARONLAYAOENARELLANO") || choice.equals("aaronlayaoenarellano") || choice.equals("Aaronlayaoenarellano"))
     {
         SE_people.AAA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ALFONSOENTERAABANIL") || choice.equals("alfonsoenteraabanil") || choice.equals("Alfonsoenteraabanil"))
     {
         SE_people.AEA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     
     }
       
   
   //FOR GROUPS *********************************************************************************************************
   
             
      else if(choice.equals("PROGRAMMINGFORBEGINNERSPHILIPPINES") || choice.equals("programmingforbeginnersphilippines") || choice.equals("Programmingforbeginnersphilippines"))
     {
         SE_groups.PFBP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENT") || choice.equals("student") || choice.equals("Student"))
     {
         SE_groups.STUDENT();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENTGROUP") || choice.equals("studentgroup") || choice.equals("Studentgroup"))
     {
         SE_groups.ST();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("NURSINGSTUDENTSGROUP") || choice.equals("nursingstudentsgroup") || choice.equals("Nursingstudentsgroup"))
     {
         SE_groups.NSG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COLLEGESTUDENTS") || choice.equals("collegestudent") || choice.equals("Collegestudent"))
     {
         SE_groups.CS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("STUDENTOFPSYCHOLOGY") || choice.equals("studentofpsychology") || choice.equals("Studentofpsychology"))
     {
         SE_groups.SOP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ARCHITECTURESTUDENTSGROUP") || choice.equals("architecturestudentsgroup") || choice.equals("Architecturestudentsgroup"))
     {
         SE_groups. ASG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SCIENCESTUDENTS") || choice.equals("sciencestudents") || choice.equals("Sciencestudents"))
     {
         SE_groups.SS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("GASSTUDENTS") || choice.equals("gasstudents") || choice.equals("Gasstudents"))
     {
         SE_groups.GS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("HUMMSSTUDENTS") || choice.equals("hummsstudents") || choice.equals("Hummsstudents"))
     {
         SE_groups.HS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MEDICALSTUDENTSANDDOCTORS") || choice.equals("medicalstudentsanddoctors") || choice.equals("Medicalstudentsanddoctors"))
     {
         SE_groups.MSAD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FUTUREWEBDEV") || choice.equals("futurewebdev") || choice.equals("Futurewebdev"))
     {
         SE_groups.FWD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PINAYWEBDEV") || choice.equals("pinoywebdev") || choice.equals("Pinoywebdev"))
     {
         SE_groups.PWD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DEVWEBMARCO") || choice.equals("devwebmaroc") || choice.equals("Devwebmaroc"))
     {
         SE_groups.DWM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WEBDEVCOMMUNITY") || choice.equals("webdevcommunity") || choice.equals("Webdevcommunity"))
     {
         SE_groups.WDC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WEBDEVCOURSES") || choice.equals("webdevcourses") || choice.equals("Webdevcourses"))
     {
         SE_groups.WD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGPHILIPPINES") || choice.equals("programmingphilippines") || choice.equals("Programmingphilippines"))
     {
         SE_groups.PP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGGROUP") || choice.equals("programminggroup") || choice.equals("Programminggroup"))
     {
         SE_groups.PG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PROGRAMMINGSOLUTIONHUB") || choice.equals("programmingsolutionhub") || choice.equals("Programmingsolutionhub"))
     {
         SE_groups.PSH();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BASICCOMPUTERKNOWLEDGE") || choice.equals("basiccomputerknowledge") || choice.equals("Basiccomputerknowledge"))
     {
         SE_groups.BCK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERSCIENCEDEPARTMENT") || choice.equals("computersciencedepartment") || choice.equals("Computersciencedepartment"))
     {
         SE_groups.CSD();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERKNOWLEDGE") || choice.equals("computerknowledge") || choice.equals("Computerknowledge"))
     {
         SE_groups.CK();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERTECHNICIANGROUP") || choice.equals("computertechniciangroup") || choice.equals("Computertechniciangroup"))
     {
         SE_groups.CTG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERSCIENCECAREERS") || choice.equals("computersciencecareers") || choice.equals("Computersciencecareers"))
     {
         SE_groups.CSC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERENGINEERINGGROUP") || choice.equals("computerengineeringgroup") || choice.equals("Computerengineeringgroup"))
     {
         SE_groups.CEG();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTER") || choice.equals("computer") || choice.equals("Computer"))
     {
         SE_groups.COMPUTER();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERPARTSSALE") || choice.equals("computerpartssale") || choice.equals("Computerpartssale"))
     {
         SE_groups.CPS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("PARTCOMPUTERUSED") || choice.equals("partcomputerused") || choice.equals("Partcomputerused"))
     {
         SE_groups.PCU();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FBGROUP") || choice.equals("fbgroup") || choice.equals("Fbgroup"))
     {
         SE_groups.CPM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("VINTAGECOMPUTERSALES") || choice.equals("vintagecomputersales") || choice.equals("Vintagecomputersales"))
     {
         SE_groups.VCS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COMPUTERPARTS") || choice.equals("computerparts") || choice.equals("Computerparts"))
     {
         SE_groups.CP();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODINGFORBEGGINERS") || choice.equals("codingforbegginers") || choice.equals("Codingforbegginers"))
     {
         SE_groups.CB();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODINGANDPROGRAMMING") || choice.equals("codingandprogramming") || choice.equals("Codingandprogramming"))
     {
         SE_groups.C();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CODE") || choice.equals("code") || choice.equals("Code"))
     {
         SE_groups.CODE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FEELART") || choice.equals("feelart") || choice.equals("Feelart"))
     {
         SE_groups.FA();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("KRAZY") || choice.equals("krazy") || choice.equals("Krazy"))
     {
         SE_groups.KRAZY();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("MANAGEMENTSINFORMATIONSYSTEM") || choice.equals("managementsinformationsystem") || choice.equals("Managementsinformationsystem"))
     {
         SE_groups.MIS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("DATABASEMANAGEMENTSYSTEM") || choice.equals("databasemanagementsystem") || choice.equals("Databasemanagementsystem"))
     {
         SE_groups.DMS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEMENGINEERING") || choice.equals("systemengineering") || choice.equals("Systemengineering"))
     {
         SE_groups.SE();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEM") || choice.equals("system") || choice.equals("System"))
     {
         SE_groups.SYSTEM();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("BACOLODBARBERSYSTEM") || choice.equals("bacolodbarbersystem") || choice.equals("Bacolodbarbersystem"))
     {
         SE_groups.BBS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("CAMBODIAACCOUNTINGSYSTEM") || choice.equals("cambodiaaccountingsystem") || choice.equals("Cambodiaaccountingsystem"))
     {
         SE_groups.CAS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FIREALARMSYSTEM") || choice.equals("firealarmsystem") || choice.equals("Firealarmsystem"))
     {
         SE_groups.FAS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("SYSTEMBASKETBALLCOACHES") || choice.equals("systembasketballcoaches") || choice.equals("Systembasketballcoaches"))
     {
         SE_groups.SBC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("WORLDDOMMINATIONSYSTEM") || choice.equals("worlddomminationsystem") || choice.equals("Worlddomminationsystem"))
     {
         SE_groups.WDS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("RUMORSYSTEM") || choice.equals("rumorsystem") || choice.equals("Rumorsystem"))
     {
         SE_groups.RS();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ERROR") || choice.equals("error") || choice.equals("Error"))
     {
         SE_groups.ERROR();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("ERRORCOINS") || choice.equals("errorcoins") || choice.equals("Errorcoins"))
     {
         SE_groups.EC();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("COINSANDERRORCOINS") || choice.equals("coinsanderrorcoins") || choice.equals("Coinsanderrorcoins"))
     {
         SE_groups.CEC();
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 }
          else if(again.equals("NO") || again.equals("no") || again.equals("No"))
          {
              System.exit(0);
          }
     }
     else if(choice.equals("FORERRORONLY") || choice.equals("forerroronly") || choice.equals("Forerroronly"))
     {
         SE_groups.FEO();
         
         System.out.println("Do You Want Search Again??? Yes Or No");
         System.out.println("Enter : ");
         again = in.next();
          if(again.equals("YES") || again.equals("yes") || again.equals("Yes"))
                 {
                     CHOICES();
                 stat=true;
                 
      }
          else if(again.equals("NO") || again.equals("no") ||  again.equals("No"))
      {
          System.exit(0);
     }
    }else{
        System.out.println(" NOT EXIST!");
        
   }  
  }
    }
}
}


