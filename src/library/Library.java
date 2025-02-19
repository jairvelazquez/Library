package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String library_name = "The corner";
    private List<Book> booklist;

    public Library() {
        this.booklist = new ArrayList<>();
    }

    public String getLibraryName() {
        return library_name;
    }

    public void addbook(Book book) {
        booklist.add(book);
        System.out.println("Book " + book + " added successfully");
    }

    public void addcopytoBook (String title){
        for (Book book : booklist){
            if (book.getTitle().equals(title)){
                book.addCopy();
                break;
            }
        }
    }

    public void deletebook(String title) {
        for (Book book : booklist) {
            if (book.getTitle().equals(title)) {
                booklist.remove(book);
                break;
            }
        }
    }

    public List<Book> getBooklist() {
        return booklist;
    }
    public List<Book> getAvailableBooklist() {
        List<Book> availablebooklist= new ArrayList<>();
        for (Book book: booklist){
            if (book.getAvailableCopies()>1){
                availablebooklist.add(book);
            }
        }
        return availablebooklist;
    }

    public List<Book> getCategoryBookList(Category category) {
        List<Book> filteredlist = new ArrayList<>();
        for (Book book : booklist) {
            if (book.getCategory().equals(category)) {
                filteredlist.add(book);
            }
        }
        return filteredlist;
    }

    public void lendBook (String title)

    {
        for (Book book: booklist) {
            if (book.getTitle().equals(title)) {
                book.lendCopy();
                System.out.println("Book lent successfully");
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
 */


}
