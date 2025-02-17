import library.Book;
import library.Library;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese titulo de libro");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese titulo de author");
        String author = scanner.nextLine();
        System.out.println("Ingrese numero de paginas");

        Integer numeroDePaginas= scanner.nextInt();


        Book book = new Book(titulo, author);
        book.setPages(numeroDePaginas);

        System.out.println("Title:" + book.getTitle());
        System.out.println("Author:" + book.getAuthor());
        System.out.println("Pages:" + book.getPages());
        System.out.println("Editorial:" + book.getEditorial());
        System.out.println("Category:" + book.getCategory());

        Library newlibrery= new Library();
        newlibrery.addbook(book);
        System.out.println(book.toString());
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
}