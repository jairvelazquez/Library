import library.Book;
import library.Category;
import library.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        Library library = new Library();
        scanner = new Scanner(System.in);
        Boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Icaro's Library \n Menu \n Choose an option ");
            System.out.println("""
                    1.Add Book
                    2.Add Copy (adds a copy of an existing book)
                    3.Lend Book
                    4.List all books
                    5.List available books
                    6.List Category Books
                    7.Delete Book
                    8.Exit
                    """);
            System.out.println("Option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    library.addbook(requestInfoToAddBook());
                    break;
                case 2:
                    library.addcopytoBook(requestTitle());
                    break;
                case 3:
                    library.lendBook(requestTitle());
                    System.out.println("Borrowed Book");
                    break;
                case 4:
                    for (Book book : library.getBooklist()) {
                        System.out.println(book);
                    }
                    break;
                case 5:
                    for (Book book : library.getAvailableBooklist()) {
                        System.out.println(book);
                    }
                    break;
                case 6:
                    for (Book book : library.getCategoryBookList(requestCategory())) {
                        System.out.println(book);
                    }
                    break;
                case 7:
                    library.deletebook(requestTitle());
                    break;
                case 8:
                    exit = true;
                    break;
            }
        }


    }

    public static Book requestInfoToAddBook() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Book title: ");
        String title = scanner1.nextLine();
        System.out.println("Author: ");
        String author = scanner1.nextLine();
        System.out.println("Editorial: ");
        String editorial = scanner1.nextLine();
        System.out.println("Pages: ");
        Integer pages = scanner1.nextInt();
        return new Book(title, author, pages, editorial, Category.POETRY);
    }

    public static String requestTitle() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Book title: ");
        return scanner1.nextLine();
    }

    public static Category requestCategory() {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println(""" 
                Choose Category
                1.Romance\s
                2.Sci-fi\s
                3.Educational\s
                4.Poetry\s
                5.Philosophy\s
                6.Child\s
                """);
        System.out.println("Option: ");
        int option = scanner1.nextInt();

        switch (option) {
            case 1:
                return Category.ROMANCE;
            case 2:
                return Category.SCI_FI;
            case 3:
                return Category.EDUCATIONAL;
            case 4:
                return Category.POETRY;
            case 5:
                return Category.PHILOSOPHY;
            case 6:
                return Category.CHILD;
            default:
                return null;
        }

    }
}


        /*
        Library

        Nombre
        Accion - Agregar nuevos libros (Recibe un libro, no retorna nada)
        Accion- Deshacerse de un libro (Recibe el nombre del libro, no retorna nada)
        Accion - Listar el catalogo de libros (No recibe nada, retorna una lista de libros)
        Accion - Ordenar por categoria (Recibe el nombre de la categoria, retorna una lista de libros)

        Book

        Titulo
        Autor
        Paginas
        Editorial
        Categoria
        Arreglo Ejemplares
        Accion - Listar numero de ejemplares disponibles (No recibe nada, retorna un entero)
        Accion - Agregar ejemplar (No recibe nada, no retorna nada)
        Accion - PrestarEjemplar (no recibe nada, no retorna nada)

        Copy
        Estado (Disponible, en prestamo)
        Accion - marcarPrestado (No recibe nada, no retorna nada)

    */
