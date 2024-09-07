package ClassWorkJava;

public class Library {
    public static void main(String[] args) {
        Book onegin = new Book();
        onegin.title = "Евгений Онегин";
        onegin.author = "А.С.Пушкин";
        onegin.language = "Russian";
        onegin.pages = 800;

        Book ivangoe = new Book();
        ivangoe.title = "Ivangoe";
        ivangoe.author = "W. Scott";
        ivangoe.language = "English";
        ivangoe.pages = 500;


        Book[] books ={onegin, ivangoe};
        int a = 3;
        int b = 17;
        int[] someNumbers = {a, b};

        System.out.println(books[0].title);
        System.out.println(someNumbers);

    }
}
