package stock_tradings;
public class Storage
{
  public static final String []tables={"create table if not exists account(account_id serial unique,account_no bigint ,password int,balance float(10), primary key(account_no,password))","create table if not exists address(id serial primary key,door_number int,street varchar(30),city varchar(30),district varchar(30),pincode int )","create table if not exists company(company_id serial unique, name varchar(30),username varchar(30),password varchar(30),address_id int,primary key (username,password), foregin key(address) references address(id))","create table if not exists customer(customer_id serial unique, name varchar(30),username varchar(10), password varchar(10),address_id int references address(id),account_id int references account(account_id),contact bigint,primary key(username,password))","create table if not exists stock(stock_id serial primary key,name varchar(30),company_id int references company(company_id),rate float(10),no_of_stocks int)","create table if not exists purchasestock( id serial primary key, customer_id int references customer(customer_id),stock_id int references stock(stock_id),no_of_stock int ,purchase_price float(30), date date)","create table if not exists sellingstock( id serial primary key, customer_id int references customer(customer_id),stock_id int references stock(stock_id),no_of_stock int , date date,selling_price float(30))"};
}
