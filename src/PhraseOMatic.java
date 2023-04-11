public class PhraseOMatic {
    public static void main(String[] args) {
        String [] wordListOne = {"brilliant", "important", "recursive", "hypothetical"};
        String [] wordListTwo = {"forth-coming", "reluctant", "specialized", "poor"};
        String [] wordListThree = {"penis", "motorcycle", "beef steak", "photograph"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        String article = "a ";

        if (phrase.startsWith("a") || phrase.startsWith("e") || phrase.startsWith("i") || phrase.startsWith("o")) {
            article = "an ";
        }

        System.out.println("We certainly need " + article + phrase);
    }

}
