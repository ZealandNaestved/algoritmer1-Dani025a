import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {
    Random rand = new Random();
    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    public String randomBoyName() {
        String[] names;
        names = new Data().getRandomDrengeNavne();
        return names[rand.nextInt(names.length)];
    }

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    public String randomGirlName() {
        String[] names;
        names = new Data().getRandomPigeNavne();
        return names[rand.nextInt(names.length)];
    }

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det


    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
    public String randomLetters(){
        String[] letters;
        letters = new Data().getRandomLetters();
        return letters[rand.nextInt(letters.length)];
    }
    // TODO 8 - Skriv en  plat eller krone generator metode (plat er boolean true og krone er boolean false)
    public String randomCoinFlip(){

        boolean coinFlip = new Data().coinFlip;
        String coinFlipName = null;

        coinFlip = rand.nextBoolean();
         if (coinFlip == true)
             coinFlipName = "Plat";
         else if (coinFlip == false)
             coinFlipName = "Krone";

         return coinFlipName;
    }
    public static void main(String[] args) {
        exampleOfPredictableRandomNumber();

    }
    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

}
