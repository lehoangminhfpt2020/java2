CREATE database ebookStore;
USE EbookStore;
CREATE TABLE book(
BookID int,
BookName varchar(100),
Author varchar(80),
Genre varchar(80),
QTY int,
Price decimal(10,1),
Years date,
CreateDate date,
UpdateDate date,
constraint PK_BookID PRIMARY KEY(BookID)
);

CREATE TABLE Customer(
CustomerID int,
CustomerName varchar(100),
CustomerAddress varchar(100),
CustomerMail varchar(100),
CustomerPhone varchar(10) check (CustomerPhone REGEXP '[0-9]{10}'),
Member int check (member REGEXP '[1-4]{1}'),
CreateDate date,
UpdateDate date,
constraint PK_CustomerID  PRIMARY KEY(CustomerID)
);

CREATE TABLE Orders(
OrderID int,
CustomerID int,
OrderDate date,
Discount int,
BookName varchar(100),
BookID int,
Amount int,
Total decimal(10,1),
Status int check (status REGEXP '[0-5]{1}'),
CreateDate date,
UpdateDate date,
constraint PK_orderID PRIMARY KEY(orderID)
);




insert into book(BookID,BookName,Author,Genre, Years,QTY,Price,CreateDate) values
(001,"Tô Bình Yên vẽ Hạnh Phúc","Kulz","Tư Duy","2020-04-17",6,52000,"2020-11-9"),
(002,"Đắc nhân tâm","Dale Carnegie","Self Help","2020-08-05",10,56000,"2020-11-11"),
(003,"Phía sau nghi can X","Higashino","Trinh thám","2020-08-05",7,75000,"2020-11-11"),
(004,"Án mạng mười một chữ","Higashino","Trinh thám","2020-08-07",10,75000,"2020-11-9"),
(005,"Thú tội","Higashino","Trinh thám","2020-11-07",17,60000,"2020-11-11"),
(006,"Biến thân ","Higashino","trinh thám","2020-06-07",6,57000,"2020-11-11"),
(007,"tỷ phú bán giày","Tony Hsieh","Kinh Doanh","2020-08-07",3,83000,"2020-11-11"),
(008,"hackers ielts","Minh","English","2020-08-08",24,52000,"2020-11-11"),
(009,"hackers ielts 1","Minh","English","2020-11-07",24,52000,"2020-11-11"),
(010,"hackers ielts 2","Minh","English","2020-02-07",24,52000,"2020-11-11"),
(011,"hackers ielts 3","Minh","English","2020-01-07",24,52000,"2020-11-11"),
(012,"hackers toeic 1","Minh","English","2020-12-07",24,52000,"2020-11-11"),
(013,"hackers toeic 2","Minh","English","2020-06-07",24,52000,"2020-11-11"),
(014,"hackers toeic 3","Minh","English","2020-03-07",24,52000,"2020-11-11"),
(015,"hackers toeic 4","Minh","English","2020-08-07",24,52000,"2020-11-11");

insert into  Orders(OrderID,CustomerID,OrderDate,BookName,BookID,Amount,Discount,Total,Status) values
(001,003,"2020-4-5","Phía sau nghi can X",003,75000,5,71250,0),
(002,002,"2020-6-5","hackers ielts 1",009,52000,10,46800,2),
(003,008,"2020-10-8","hackers ielts 2",010,52000,10,46800,3),
(004,005,"2020-4-25","hackers ielts 3",011,75000,5,71250,1),
(005,012,"2020-9-15","Tô Bình Yên vẽ Hạnh Phúc",001,52000,10,46800,4),
(006,010,"2020-4-20","Phía sau nghi can X",003,75000,5,71250,1),
(007,003,"2020-5-19","Án mạng mười một chữ",004,75000,5,71250,1),
(008,014,"2020-7-5","Phía sau nghi can X",003,75000,5,71250,3),
(009,009,"2020-4-5","hackers toeic 3",014,52000,10,46800,2),
(010,003,"2020-4-6","Phía sau nghi can X",003,75000,5,71250,0),
(011,007,"2020-2-5","hackers toeic 1",012,52000,10,46800,2),
(012,001,"2020-4-5","Phía sau nghi can X",003,75000,5,71250,5),
(013,003,"2020-8-5","thú tội",005,60000,10,54000,1),
(014,015,"2020-11-5","Phía sau nghi can X",003,75000,5,71250,5),
(015,014,"2020-4-5","hackers toeic 4",015,52000,10,46800,4);

insert into Customer(CustomerID,CustomerName,CustomerAddress,CustomerMail,CustomerPhone,Member)values
(001,"Minh","HaNoi","minh@gmail.com","0961330812",1),
(002,"Hoang","HaNoi","Hoang@gmail.com","0963453459",1),
(003,"Nhật","HaNoi","Nhat@gmail.com","0965555559",2),
(004,"Thi","HaNoi","Thi@gmail.com","0961666666",1),
(005,"Hoa","Phsu Quốc","Hoa@gmail.com","0961999999",1),
(006,"Tuấn","HaNoi","Tuan@gmail.com","0961335412",1),
(007,"Long","Kiên Giang","Long@gmail.com","0961360812",1),
(008,"Hằng","HaNoi","Hang@gmail.com","0985430812",1),
(009,"Trang","Móng Cái","Trang@gmail.com","0966630812",4),
(010,"Thảo","HaNoi","Thao@gmail.com","0945670812",1),
(011,"Vương","Hạ Long","Vuong@gmail.com","0936542812",1),
(012,"Phú","HaNoi","Phu@gmail.com","0961660812",1),
(013,"Dũng","Thanh Hóa","Dung@gmail.com","0999330812",3),
(014,"Quang","HaNoi","Quang@gmail.com","0891330812",1),
(015,"Thắng","HCM","Thang@gmail.com","0963130812",2);



