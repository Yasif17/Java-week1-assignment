
class Book{
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author=author;
        this.isAvailable=true;
    }

    public int getBookId(){
        return bookId;
    }

    public String getTitle(){
        return title;
    }

    public String getauthor(){
        return author;
    }

    public boolean getAvailability(){
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return " BookId: " + bookId + "\n Title: " + title + "\n Author: " + author + "\n Status: " + (isAvailable ? "Available":"Issued") +"\n";
    }


}