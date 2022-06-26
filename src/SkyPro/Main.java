package SkyPro;
public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War And peace", 1867,
                new Author(" Lev", "Tolstoy"));
        Author tolstoy = new Author("Lev", "Tolstoy");
        System.out.println("warAndPeace.getTitle() = " + warAndPeace.getTitle());
        System.out.println("warAndPeace.yearPublication() = " + warAndPeace.getYearPublication());
        System.out.println("Tolstoy.getNameAuthor() = " + tolstoy.getNameAuthor());
        System.out.println("Tolstoy.getSurnameAuthor() = " + tolstoy.getSurnameAuthor());
        warAndPeace.setYearPublication(1868);
        System.out.println("warAndPeace.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println();


        Book historyOfTheWealthOfNations = new Book("history of the wealth of nations", 1776,
                new Author(" Adam", "Smith"));
        Author Smith = new Author("Adam", "Smith");
        System.out.println("historyOfTheWealthOfNations.getTitle() = " + historyOfTheWealthOfNations.getTitle());
        System.out.println("historyOfTheWealthOfNations.getYearPublication() = " +
                historyOfTheWealthOfNations.getYearPublication());
        historyOfTheWealthOfNations.setYearPublication(1777);
        System.out.println("historyOfTheWealthOfNations.getYearPublication() = " +
                historyOfTheWealthOfNations.getYearPublication());
        System.out.println("Smith.getNameAuthor() = " + Smith.getNameAuthor());
        System.out.println("Smith.getSurnameAuthor() = " + Smith.getSurnameAuthor());
        System.out.println();
        System.out.println(tolstoy.toString());
        System.out.println(warAndPeace.toString());
        System.out.println(warAndPeace.equals(historyOfTheWealthOfNations));
        System.out.println(warAndPeace.equals(warAndPeace));
        System.out.println(warAndPeace.equals(historyOfTheWealthOfNations));
        System.out.println();
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(historyOfTheWealthOfNations.hashCode());
    }
}