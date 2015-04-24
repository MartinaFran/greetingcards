class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, int k )
  {
    empfaenger = e;
    kuesse     = k;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}