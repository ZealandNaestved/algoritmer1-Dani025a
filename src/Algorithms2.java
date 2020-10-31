/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH
    public int randomNumbers1000()
    {
        int x = 78;
        int numberPlacement = 0 ;
        int number;
        number = new Data().getRandomNumbers1000().length;

        int [] randomnumbers1000Arr;
        randomnumbers1000Arr = new Data().getRandomNumbers1000();

        for (int i = 0; i < number; i++)
        {
            if (randomnumbers1000Arr[i] == x)
                numberPlacement = i;
        }
        return numberPlacement;
    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH

    public static void main(String[] args) {
        int randomNumbers1000 = new Algorithms2().randomNumbers1000();
        System.out.println(randomNumbers1000);
    }
}
