import java.util.*;
class kamatoProject//Class initialization of kamato Application
{
  static Scanner sc=new Scanner(System.in);// initializing scanner class
  public static void main(String[] args) throws Exception//throws Exception is used for thread.slee function
  {
    System.out.println("");
    System.out.println("1.SS Hydrabad\n2.Al-saga\n3.Al-Beak\n4.Khadir Biriyani");
    int hotel=sc.nextInt();
//switch starts for selecting 1st hotel
    switch (hotel) {
        case 1:{
          System.out.println("\t Thank You for Choosing SS Hydrabad "+(char)1+"\n Please choose your food\n");
          System.out.println("1.Chicken Biriyani\n2.mutton biriyani\n3.kebab chicken\n4.lolipop chicken");
          int dish=sc.nextInt();
          switch (dish) {
            case 1:{
              int price =120;
              System.out.println("Please Enter The Quantity");
              int qt=sc.nextInt();
              double bill =price*qt;
              System.out.println("Your Bill is "+bill);
              System.out.println("\tPlease Enter The Payment Mode");
              System.out.println("1.Googlepay\n2.Phone pay");
              int payment1=sc.nextInt();
              switch (payment1) {
                case 1:{
                  System.out.println("Please Enter The Amount"+bill);
                  double amount1=sc.nextDouble();
                  if (amount1==bill) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp1=999*Math.random()*999;
                    int check1=(int)otp1;
                    System.out.println(check1);
                    int otpscheck1=sc.nextInt();
                    if (otpscheck1==check1) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                    break;
                  }
                  break;
                }
                case 2:{
                  System.out.println("Please Enter The Amount"+bill);
                  double amount11=sc.nextDouble();
                  if (amount11==bill) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp11=999*Math.random()*999;
                    int check11=(int)otp11;
                    System.out.println(check11);
                    int otpscheck11=sc.nextInt();
                    if (otpscheck11==check11) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                    break;
                  }
                  break;
                }
              }
              break;
            }
            case 2:{
              int price1 =220;
              System.out.println("Please Enter The Quantity");
              int qt1=sc.nextInt();
              double bill1 =price1*qt1;
              System.out.println("Your Bill is "+bill1);
              System.out.println("Please Enter The Payment Mode");
              System.out.println("1.Googlepay\n2.Phone pay");
              int payment1pp=sc.nextInt();
              switch (payment1pp) {
                case 1:{
                  System.out.println("Please Enter The Amount"+bill1);
                  double amount1pp=sc.nextDouble();
                  if (amount1pp==bill1) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp1p=999*Math.random()*999;
                    int check1p=(int)otp1p;
                    System.out.println(check1p);
                    int otpscheck1p=sc.nextInt();
                    if (otpscheck1p==check1p) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                  }
                }

              }
              break;

            }
            case 3:{
              int price1p =350;
              System.out.println("Please Enter The Quantity");
              int qt1p=sc.nextInt();
              double bill1p =price1p*qt1p;
              System.out.println("Your Bill is "+bill1p);
              System.out.println("Please Enter The Payment Mode");
              System.out.println("1.Googlepay\n2.Phone pay");
              int payment1ppp=sc.nextInt();
              switch (payment1ppp) {
                case 1:{
                  System.out.println("Please Enter The Amount"+bill1p);
                  double amount1ppp=sc.nextDouble();
                  if (amount1ppp==bill1p) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp1ppp=999*Math.random()*999;
                    int check1ppp=(int)otp1ppp;
                    System.out.println(check1ppp);
                    int otpscheck1ppp=sc.nextInt();
                    if (otpscheck1ppp==check1ppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                  }
                }

              }
              break;

            }
            case 4:{
              int price1pp =350;
              System.out.println("Please Enter The Quantity");
              int qt1pp=sc.nextInt();
              double bill1pp =price1pp*qt1pp;
              System.out.println("Your Bill is "+bill1pp);
              System.out.println("Please Enter The Payment Mode");
              System.out.println("1.Googlepay\n2.Phone pay");
              int payment1pppp=sc.nextInt();
              switch (payment1pppp) {
                case 1:{
                  System.out.println("Please Enter The Amount"+bill1pp);
                  double amount1pppp=sc.nextDouble();
                  if (amount1pppp==bill1pp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp1pppp=999*Math.random()*999;
                    int check1pppp=(int)otp1pppp;
                    System.out.println(check1pppp);
                    int otpscheck1pppp=sc.nextInt();
                    if (otpscheck1pppp==check1pppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                  }
                }

              }
              break;

            }
          }
        }
        break;
      }//end of hotel 3
//Switching starts for selectiong 2nd hotel
    switch (hotel) {
      case 2:{
        System.out.println("\t Thank You for Choosing Al-saga "+(char)1+"\n Please choose your food\n");
        System.out.println("1.Chicken tikka\n2.mutton tikka\n3.chicken 65\n4.lolipop manjuriyan");
        int dish2=sc.nextInt();
            switch (dish2) {
              case 1:{
                int price2p =220;
                System.out.println("Please Enter The Quantity");
                int qt2p=sc.nextInt();
                double bill2p =price2p*qt2p;
                System.out.println("Your Bill is "+bill2p);
                System.out.println("Please Enter The Payment Mode");
                System.out.println("1.Googlepay\n2.Phone pay");
                int payment2=sc.nextInt();
                switch (payment2) {
                  case 1:{
                    System.out.println("Please Enter The Amount"+bill2p);
                    double amount2=sc.nextDouble();
                    if (amount2==bill2p) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp2=999*Math.random()*999;
                    int check2=(int)otp2;
                    System.out.println(check2);
                    int otpscheck2=sc.nextInt();
                    if (otpscheck2==check2) {
                      System.out.println("Processing....Please Wait!!");
                     Thread.sleep(300);
                     System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                    }
                  }
                  break;

                }
                break;
              }
              case 2:{
                int price2pp =180;
                System.out.println("Please Enter The Quantity");
                int qt2pp=sc.nextInt();
                double bill2pp =price2pp*qt2pp;
                System.out.println("Your Bill is "+bill2pp);
                System.out.println("Please Enter The Payment Mode");
                System.out.println("1.Googlepay\n2.Phone pay");
                int payment2pp=sc.nextInt();
                switch (payment2pp) {
                  case 1:{
                    System.out.println("Please Enter The Amount"+bill2pp);
                    double amount2pp=sc.nextDouble();
                    if (amount2pp==bill2pp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp2pp=999*Math.random()*999;
                    int check2pp=(int)otp2pp;
                    System.out.println(check2pp);
                    int otpscheck2pp=sc.nextInt();
                    if (otpscheck2pp==check2pp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                    }
                  }
                }
                break;

              }
              case 3:{
                int price2ppp =280;
                System.out.println("Please Enter The Quantity");
                int qt2ppp=sc.nextInt();
                double bill2ppp =price2ppp*qt2ppp;
                System.out.println("Your Bill is "+bill2ppp);
                System.out.println("Please Enter The Payment Mode");
                System.out.println("1.Googlepay\n2.Phone pay");
                int payment2ppp=sc.nextInt();
                switch (payment2ppp) {
                  case 1:{
                    System.out.println("Please Enter The Amount"+bill2ppp);
                    double amount2ppp=sc.nextDouble();
                    if (amount2ppp==bill2ppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp2ppp=999*Math.random()*999;
                    int check2ppp=(int)otp2ppp;
                    System.out.println(check2ppp);
                    int otpscheck2ppp=sc.nextInt();
                    if (otpscheck2ppp==check2ppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);
                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                    }
                  }

                }
                break;

              }
              case 4:{
                int price2pppp =165;
                System.out.println("Please Enter The Quantity");
                int qt2pppp=sc.nextInt();
                double bill2pppp =price2pppp*qt2pppp;
                System.out.println("Your Bill is "+bill2pppp);
                System.out.println("Please Enter The Payment Mode");
                System.out.println("1.Googlepay\n2.Phone pay");
                int payment2pppp=sc.nextInt();
                switch (payment2pppp) {
                  case 1:{
                    System.out.println("Please Enter The Amount"+bill2pppp);
                    double amount2pppp=sc.nextDouble();
                    if (amount2pppp==bill2pppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp2pppp=999*Math.random()*999;
                    int check2pppp=(int)otp2pppp;
                    System.out.println(check2pppp);
                    int otpscheck2pppp=sc.nextInt();
                    if (otpscheck2pppp==check2pppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                    }
                  }

                }
                break;

              }
            }
      }
      break;
    }//end of hotel 2
//switching startis for hotel 3
    switch (hotel) {
      case 3:{
        System.out.println("\t Thank You for Choosing Al-Beak "+(char)1+"\n Please choose your food\n");
        System.out.println("1.Nalli fry\n2.Masala mury thai\n3.Duck Rost\n4.Boneless Fry");
        int dish3=sc.nextInt();
        switch (dish3) {
          case 1:{
            int price3p =173;
            System.out.println("Please Enter The Quantity");
            int qt3p=sc.nextInt();
            double bill3p =price3p*qt3p;
            System.out.println("Your Bill is "+bill3p);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment3p=sc.nextInt();
            switch (payment3p) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill3p);
                double amount3p=sc.nextDouble();
                if (amount3p==bill3p) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp3p=999*Math.random()*999;
                    int check3p=(int)otp3p;
                    System.out.println(check3p);
                    int otpscheck3p=sc.nextInt();
                    if (otpscheck3p==check3p) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
          }
          case 2:{
            int price3pp =185;
            System.out.println("Please Enter The Quantity");
            int qt3pp=sc.nextInt();
            double bill3pp =price3pp*qt3pp;
            System.out.println("Your Bill is "+bill3pp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment3pp=sc.nextInt();
            switch (payment3pp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill3pp);
                double amount3pp=sc.nextDouble();
                if (amount3pp==bill3pp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp3pp=999*Math.random()*999;
                    int check3pp=(int)otp3pp;
                    System.out.println(check3pp);
                    int otpscheck3pp=sc.nextInt();
                    if (otpscheck3pp==check3pp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
            break;

          }
          case 3:{
            int price3ppp =195;
            System.out.println("Please Enter The Quantity");
            int qt3ppp=sc.nextInt();
            double bill3ppp =price3ppp*qt3ppp;
            System.out.println("Your Bill is "+bill3ppp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment3ppp=sc.nextInt();
            switch (payment3ppp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill3ppp);
                double amount3ppp=sc.nextDouble();
                if (amount3ppp==bill3ppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp3ppp=999*Math.random()*999;
                    int check3ppp=(int)otp3ppp;
                    System.out.println(check3ppp);
                    int otpscheck3ppp=sc.nextInt();
                    if (otpscheck3ppp==check3ppp) {
                      System.out.println("Processing....Please Wait!!");
                     Thread.sleep(300);
                     System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
            break;

          }
          case 4:{
            int price3pppp =210;
            System.out.println("Please Enter The Quantity");
            int qt3pppp=sc.nextInt();
            double bill3pppp =price3pppp*qt3pppp;
            System.out.println("Your Bill is "+bill3pppp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment3pppp=sc.nextInt();
            switch (payment3pppp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill3pppp);
                double amount3pppp=sc.nextDouble();
                if (amount3pppp==bill3pppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp3pppp=999*Math.random()*999;
                    int check3pppp=(int)otp3pppp;
                    System.out.println(check3pppp);
                    int otpscheck3pppp=sc.nextInt();
                    if (otpscheck3pppp==check3pppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
          }

        }
      }
      break;


    }//end of hotel 3
//Switching starts for hotel 4
    switch (hotel) {
      case 4:{
        System.out.println("\t Thank You for Choosing Khadir Biriyani "+(char)1+"\n Please choose your food\n");
        System.out.println("1.Mixed Chicken Take Over\n2.Burma Chicken Fry\n3.Tandoori\n4.Boneless grill");
        int dish4=sc.nextInt();
        switch (dish4) {
          case 1:{
            int price4p =173;
            System.out.println("Please Enter The Quantity");
            int qt4p=sc.nextInt();
            double bill4p =price4p*qt4p;
            System.out.println("Your Bill is "+bill4p);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment4p=sc.nextInt();
            switch (payment4p) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill4p);
                double amount4p=sc.nextDouble();
                if (amount4p==bill4p) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp4p=999*Math.random()*999;
                    int check4p=(int)otp4p;
                    System.out.println(check4p);
                    int otpscheck4p=sc.nextInt();
                    if (otpscheck4p==check4p) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
                break;

              }

            }
          }
          case 2:{
            int price4pp =173;
            System.out.println("Please Enter The Quantity");
            int qt4pp=sc.nextInt();
            double bill4pp =price4pp*qt4pp;
            System.out.println("Your Bill is "+bill4pp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment4pp=sc.nextInt();
            switch (payment4pp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill4pp);
                double amount4pp=sc.nextDouble();
                if (amount4pp==bill4pp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp4pp=999*Math.random()*999;
                    int check4pp=(int)otp4pp;
                    System.out.println(check4pp);
                    int otpscheck4pp=sc.nextInt();
                    if (otpscheck4pp==check4pp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }
                }
              }

            }
            break;

          }
          case 3:{
            int price4ppp =173;
            System.out.println("Please Enter The Quantity");
            int qt4ppp=sc.nextInt();
            double bill4ppp =price4ppp*qt4ppp;
            System.out.println("Your Bill is "+bill4ppp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment4ppp=sc.nextInt();
            switch (payment4ppp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill4ppp);
                double amount4ppp=sc.nextDouble();
                if (amount4ppp==bill4ppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp4ppp=999*Math.random()*999;
                    int check4ppp=(int)otp4ppp;
                    System.out.println(check4ppp);
                    int otpscheck4ppp=sc.nextInt();
                    if (otpscheck4ppp==check4ppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
            break;

          }
          case 4:{
            int price4pppp =173;
            System.out.println("Please Enter The Quantity");
            int qt4pppp=sc.nextInt();
            double bill4pppp =price4pppp*qt4pppp;
            System.out.println("Your Bill is "+bill4pppp);
            System.out.println("Please Enter The Payment Mode");
            System.out.println("1.Googlepay\n2.Phone pay");
            int payment4pppp=sc.nextInt();
            switch (payment4pppp) {
              case 1:{
                System.out.println("Please Enter The Amount"+bill4pppp);
                double amount4pppp=sc.nextDouble();
                if (amount4pppp==bill4pppp) {
                    System.out.println("Enter the OTP Showing");
                    Thread.sleep(200);
                    double otp4pppp=999*Math.random()*999;
                    int check4pppp=(int)otp4pppp;
                    System.out.println(check4pppp);
                    int otpscheck4pppp=sc.nextInt();
                    if (otpscheck4pppp==check4pppp) {
                      System.out.println("Processing....Please Wait!!");
                      Thread.sleep(300);
                      System.out.println((char)1+"\t!!!!!!!!!Orderd Succesfully!!!!!!!!!\t"+(char)1);

                    }
                    else {
                      System.out.println("Entered OTP Is Incorrect");
                      break;
                    }

                }
              }

            }
            break;

          }

        }
      }
      break;
    }//end of hotel 4
  }
}
