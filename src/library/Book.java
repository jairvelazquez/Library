package library;

import java.util.List;

public class Book {


    private String title;
    private String author;
    private Integer pages;
    private String editorial;
    private Category category;
    private List<Copy> copies;

    public Book(String title, String author){
          this.title = title;
          this.author = author;
    }

    public void addCopy(){
        System.out.println("Copy added successfully");
    }

    public Integer getAvailableCopies(){
        return 0;
    }

    public void lendCopy(){

    }

    public List<Copy> getCopies() {
        return copies;
    }

    public void setCopies(List<Copy> copies) {
        this.copies = copies;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if(pages < 0){
            System.out.println("Number of pages is invalid");
        }
        else{
            this.pages = pages;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
