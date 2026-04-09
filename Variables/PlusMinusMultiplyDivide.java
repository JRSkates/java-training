public class PlusMinusMultiplyDivide {
	public static void main(String[] args) {   
	    int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;

        System.out.println(animalsInZoo);

        int numZebrasAfterTrade = zebrasInZoo - 2;

        System.out.println(numZebrasAfterTrade);

        double subtotal = 30;
        double tax = 0.0875;

        double total = (subtotal * tax) + subtotal;
        System.out.println(total);

        double perPerson = total / 4;
        System.out.println(perPerson);

        int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;

        System.out.println(numCookies);


        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;

        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

        System.out.println(creditsEarned < creditsAfterSeminar);
	}
}
