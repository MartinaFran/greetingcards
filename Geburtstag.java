class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, int jahre )
  {
    empfaenger = e;
    alter = jahre;
  }

  public void gruss()
  {
    System.out.println("Dear " + empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}