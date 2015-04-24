import java.util.Scanner;

public class KarteTester
{
  public static void main ( String[] args )
  {
    String name;
    Scanner scan = new Scanner( System.in );

    System.out.println("Ihr Name");
    name = scan.nextLine();

    Feiertag   feiern = new Feiertag( name );
    feiern.gruss();

    Geburtstag  geb  = new Geburtstag( name, 21 );
    geb.gruss();

    Valentin val = new Valentin( name, 7 );
    val.gruss();

  }
}