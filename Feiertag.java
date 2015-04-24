class Feiertag extends Karte
{
  public Feiertag( String e)
  {
    this.empfaenger = empfaenger;
    this.anrede = anrede;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}