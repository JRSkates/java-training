public class StringComparison {
  	public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

      System.out.println(line1.equals(line2));
      System.out.println(line2.equals(line3));

      int animals = 12;
      String species = "zebra";

      String zooDescription = "Our zoo has " + animals + " " + species + "s!";

      System.out.println(zooDescription);
    }       
}