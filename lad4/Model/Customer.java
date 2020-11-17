package EbookStore.Model;

public class Customer {
    private int CustomerID;
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerMail;
    private int CustomerPhone;
    private int Member;
    private String CreateDate;
    private String UpdateDate;

    public Customer(int CustomerID, String CustomerName, String CustomerAddress, String CustomerMail,int CumtomerPhone, int Member,String CreateDate,String UpdateDate){
        this.CustomerID=CustomerID;
        this.CustomerName=CustomerName;
        this.CustomerAddress=CustomerAddress;
        this.CustomerMail=CustomerMail;
        this.CustomerPhone=CumtomerPhone;
        this.Member=Member;
        this.CreateDate=CreateDate;
        this.UpdateDate=UpdateDate;
    }

    public Customer(){
        CustomerID=0;
        CustomerName="";
        CustomerAddress="";
        CustomerMail="";
        CustomerPhone=0;
        Member=1;
        CreateDate="";
        UpdateDate="";

    }

    public Customer(int CustomerID, String CustomerName, String CustomerAddress, String CustomerMail,int CumtomerPhone, int Member){
        this.CustomerID=CustomerID;
        this.CustomerName=CustomerName;
        this.CustomerAddress=CustomerAddress;
        this.CustomerMail=CustomerMail;
        this.CustomerPhone=CumtomerPhone;
        this.Member=Member;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String customerMail) {
        CustomerMail = customerMail;
    }

    public int getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        CustomerPhone = customerPhone;
    }

    public int getMember() {
        return Member;
    }

    public void setMember(int member) {
        Member = member;
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
        return "Customer{" +
                "CustomerID=" + CustomerID +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", CustomerMail='" + CustomerMail + '\'' +
                ", CustomerPhone=" + CustomerPhone +
                ", Member=" + Member +
                ", CreateDate='" + CreateDate + '\'' +
                ", UpdateDate='" + UpdateDate + '\'' +
                '}';
    }
}
