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
    public Book(String title, String author, Integer pages){
        this.title = title;
        this.author = author;
        this.pages= pages;
    }
    public Book(String title, String author, Integer pages, String editorial){
        this.title = title;
        this.author = author;
        this.pages= pages;
        this.editorial=editorial;
    }
    public Book(String title, String author, Integer pages, String editorial, Category category){
        this.title = title;
        this.author = author;
        this.pages= pages;
        this.editorial=editorial;
        this.category=category;
    }

    @Override
    public String toString() {
        return title;
    }

    public void addCopy(){
        copies.add(new Copy());
        System.out.println("Copy added successfully");
    }

    public Integer getAvailableCopies(){
        int i=0;
        for (Copy copy:copies){
            if (copy.getstatus().equals(CopyStatus.AVAILABLE));{
                i= i+1;
            }
        }
        System.out.print(this.title+"Copies available:" +i);
        return i;
    }
    public void lendCopy() {
        boolean lended=false;
        for (Copy copy : copies) {
            if (copy.getstatus().equals(CopyStatus.AVAILABLE)) {
                copy.setStatus(CopyStatus.ON_LOAN);
                lended = true;
            }
        }
        if (!lended) {
            System.out.println("No copies available");
        }
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
