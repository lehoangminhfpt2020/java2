package EbookStore.Model;

public class Orders {
    private int OrderID;
    private int CustomerID;
    private String OrderDate;
    private int Discount;
    private String BookName;
    private int BookID;
    private int Amount;
    private double Total;
    private int Status;
    private String CreateDate;
    private String UpdateDate;

    public Orders(int OrderID, int CustomerID, String OrderDate, int Discount, String BookName, int BookID, int Amount, double Total, int Status, String CreateDate, String UpdateDate){
        this.OrderID=OrderID;
        this.CustomerID=CustomerID;
        this.OrderDate=OrderDate;
        this.Discount=Discount;
        this.BookName=BookName;
        this.BookID=BookID;
        this.Amount=Amount;
        this.Total=Total;
        this.Status=Status;
        this.CreateDate=CreateDate;
        this.UpdateDate=UpdateDate;
    }

    public Orders(){
        OrderID=0;
        CustomerID=0;
        OrderDate="";
        Discount=0;
        BookName="";
        BookID=0;
        Amount=0;
        Total=0;
        Status=0;
        CreateDate="";
        UpdateDate="";
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
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
        return "Orders{" +
                "OrderID=" + OrderID +
                ", CustomerID=" + CustomerID +
                ", OrderDate='" + OrderDate + '\'' +
                ", Discount=" + Discount +
                ", BookName='" + BookName + '\'' +
                ", BookID=" + BookID +
                ", Amount=" + Amount +
                ", Total=" + Total +
                ", Status=" + Status +
                ", CreateDate='" + CreateDate + '\'' +
                ", UpdateDate='" + UpdateDate + '\'' +
                '}';
    }
}
