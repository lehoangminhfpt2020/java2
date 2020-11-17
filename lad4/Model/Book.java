package EbookStore.Model;

public class Book {
    private int BookID;
    private String BookName;
    private String Author;
    private String Genre;
    private int QTY;
    private double Price;
    private String Years;
    private String CreateDate;
    private String UpdateDate;

    public Book(int BookID, String BookName, String Author, String Genre,int QTY,double Price,String Years, String CreateDate,String UpdateDate){
        this.BookID=BookID;
        this.BookName=BookName;
        this.Author=Author;
        this.Genre=Genre;
        this.QTY=QTY;
        this.Price=Price;
        this.Years=Years;
        this.CreateDate=CreateDate;
        this.UpdateDate=UpdateDate;
    }
    public Book(){
        BookID=0;
        BookName="";
        Author="";
        Genre="";
        QTY=0;
        Price=0;
        Years="";
        CreateDate="";
        UpdateDate="";
    }

    public Book(int BookID, String BookName, String Author, String Genre,int QTY,double Price,String Years){
        this.BookID=BookID;
        this.BookName=BookName;
        this.Author=Author;
        this.Genre=Genre;
        this.QTY=QTY;
        this.Price=Price;
        this.Years=Years;
    }

    public Book(int BookID, String BookName, String Author, String Genre,double Price){
        this.BookID=BookID;
        this.BookName=BookName;
        this.Author=Author;
        this.Genre=Genre;
        this.Price=Price;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getYears() {
        return Years;
    }

    public void setYears(String years) {
        Years = years;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String updateDate) {
        UpdateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookID=" + BookID +
                ", BookName='" + BookName + '\'' +
                ", Author='" + Author + '\'' +
                ", Genre='" + Genre + '\'' +
                ", QTY=" + QTY +
                ", Price=" + Price +
                ", Years='" + Years + '\'' +
                ", CreateDate='" + CreateDate + '\'' +
                ", UpdateDate='" + UpdateDate + '\'' +
                '}';
    }
}


