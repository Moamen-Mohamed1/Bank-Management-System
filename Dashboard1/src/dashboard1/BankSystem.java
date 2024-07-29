/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dashboard1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;
import dashboard1.Login;
import dashboard1.MainPage;

/**
 *
 * @author Moemen Mohamed
 *                          @Notes: 
 * **************************************************************************************
 * Click On Run File on BankSystem.java to run project                                  *
 * Make Sure that mysql-connector in Libraries to Run database                          *
 * to display Images on Application (IF THE IMAGES NOT SHOWING)                         *                         *
 * [A place u stored the project on]\Dashboard1\test\Images\[Image Name]                *
 * Example:                                                                             *
 * C:\Users\Moemen Mohamed\Documents\NetBeansProjects\Dashboard1\test\Images\9196974.png*
 * **************************************************************************************
 * 
 */
public class BankSystem {
    static char[] ASCII = {
    ' ', '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/',
    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?',
    '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
    'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_',
    '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'
};
static String[] security = {
    "What Is Your Last 5 Numbers OF Your SSN? "  , "What Is The name of your first school?" , 
    "what is the street number of the house you grew up in?"
};


    public class TransactionDetails {
        public int transactionId=0;
        public String amount;
        public String transactionType;
        public String transactionTime;
    }

    public class Client {
        private String fName;
        private String lName;
        private String address;
        private String contactNumber;
        private String email;
        private String password;
        private String birthdayDate;
        private long bankAmount = 0;
        private String gender;
        private String Account_Number;
        public TransactionDetails customers=new TransactionDetails();
        private final String[] Security_question=new String[3];
        private int block_account;

        public Client() {}

        public Client(String fName, String lName, String address, String contactNumber,
                      String email, String password, String birthdayDate, String gender, long bankAmount,
                     String Security_question1,String Security_question2,String Security_question3,int block_account) {
            this.fName = fName;
            this.lName = lName;
            this.address = address;
            this.contactNumber = contactNumber;
            this.email = email;
            this.password = password;
            this.birthdayDate = birthdayDate;
            this.gender = gender;
            this.bankAmount = bankAmount;
            this.Security_question[0]=Security_question1;
            this.Security_question[1]=Security_question2;
            this.Security_question[2]=Security_question3;
            this.block_account=block_account;
        }

        public void withdraw(long amount) {
            this.bankAmount-=amount;
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");
            String timeString = currentTime.format(formatter);
            this.customers.transactionType = "Withdraw";
            this.customers.transactionTime = timeString;
            this.customers.amount = Long.toString(amount) + "$";
            this.customers.transactionId++;
            
        }
        public void deposit(long amount) {
            this.bankAmount+=amount;
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");
            String timeString = currentTime.format(formatter);
            Random rand=new Random(System.currentTimeMillis());
            this.customers.transactionType = "Deposit";
            this.customers.transactionTime = timeString;
            this.customers.amount = Long.toString(amount) + "$";
            this.customers.transactionId++;
        }  
        public void setAccountNumber(String account){
            this.Account_Number=account;
        }
        public void setGenerate(){
            Account_Number=systemAdmin.system.generateAccountNumber();
        }
        
        public void setEmail(String email){this.email=email;}
        
        public String getSecurity(int indx) {
            return this.Security_question[indx];
        }
        
        public String getAccountNumber() {
            return this.Account_Number;
        }
        
        public long getAmount(){
            return this.bankAmount;
        }
        
        public String getName() {
            return fName;
        }

        public String getLName() {
            return lName;
        }

        public String getAddress() {
            return address;
        }

        public String getBday() {
            return birthdayDate;
        }

        public String getEmail() {
            return email;
        }

        public String getPass() {
            return password;
        }

        public String getPhone() {
           return  contactNumber;
        }
 
        public int getBlock() {
            return this.block_account;
        }
        
        public String getGender() {
            return this.gender;
        }
        
 }
    public  static class Employee{
        private String name;
        private String Position;
        private String contactInfo;
        Employee(){
            
        }
    }
    
        public class serverAdmin extends Employee{
        public static DatabaseServer server;
        serverAdmin(){
            server=new DatabaseServer();
        }
    }
    public class systemAdmin extends Employee{
        public static SystemManagment system;
         systemAdmin(){
            system=new SystemManagment();
        }
       
    }
    public class DatabaseServer{
        public void Create() throws SQLException{
            Connection connection = null;
            Statement statement = null;
            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement = connection.createStatement();
                connection.setAutoCommit(false);
                
                String Customers="create table customers(Fname VARCHAR(255) not null,Lname VARCHAR(255) not null,Email VARCHAR(255) not null unique,"
                + "Password VARCHAR(255),Account_Balance VARCHAR(255) not null,Account_Number VARCHAR(6) not null unique,Phone_number VARCHAR(16) not null unique,"
                + "Address VARCHAR(255) not null,Birthday_date VARCHAR(10) not null,"
                + "Gender VARCHAR(5) not null,primary key(Email,Phone_number,Account_Number));";
                
                String Security_Questions="create table security(Account VARCHAR(255) not null unique,"
                + "security1 VARCHAR(255) not null,security2 VARCHAR(255) not null,"
                + "security3 VARCHAR(255) not null,FOREIGN KEY (Account) references customers(Account_Number))";
                
                String blockedAccounts="create table blocked_Account(Account VARCHAR(255) not null unique,blocked int not null"
                + ",FOREIGN KEY(Account) references customers(Account_Number));";
                
                String Transactions="create table transactions(Account_Number VARCHAR(6) not null,transaction_type VARCHAR(10) not null,"
                + "transaction_number int not null,transaction_Amount VARCHAR(255) not null,transaction_time VARCHAR(255) not null"
                + ",FOREIGN KEY (Account_Number) references customers(Account_Number));";
                
                statement.addBatch(Customers);
                statement.addBatch(Security_Questions);
                statement.addBatch(blockedAccounts);
                statement.addBatch(Transactions);
                
                statement.executeBatch();
                
                connection.commit();
            }catch(SQLException e){
                    e.printStackTrace();
            }
            finally{
                statement.close();
                connection.close();
            }
            
        }

        public  void insert_customers(Client client) throws SQLException {
            Connection connection = null;
            Statement statement = null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                connection.setAutoCommit(false);
                // Connection Commits to how many statment
                
                String Fname=client.getName();
                String Lname=client.getLName();
                String Email=client.getEmail();
                String Password=client.getPass();
                String Account_Balance=Long.toString(client.getAmount())+'$';
                String Account_Number=client.getAccountNumber();
                String Phone_number=client.getPhone();
                String Address=client.getAddress();
                String BirthDay=client.getBday();
                String Gender=client.getGender();
            
                String query1="insert into customers values('"+Fname+"','"+Lname+"','"+Email+"', '"+Password+"',"
                    + "'"+Account_Balance+"','"+Account_Number+"','"+Phone_number+"','"+Address+"','"+BirthDay+"','"+Gender+"');";   
                String sq1=client.getSecurity(0);
                String sq2=client.getSecurity(1);
                String sq3=client.getSecurity(2);
                String query2="insert into  security values('"+Account_Number+"','"+sq1+"','"+sq2+"','"+sq3+"');";
                String query3="insert into blocked_Account values('"+Account_Number+"',0);";
                statement.addBatch(query1);
                statement.addBatch(query2);
                statement.addBatch(query3);
            
                statement.executeBatch();
                connection.commit();
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }
        
        public void insert_transactions(String acc_number,String Type,long Count,String Time,String Amount) 
        throws SQLException{
            Connection connection = null;
            Statement statement = null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                connection.setAutoCommit(false);
                
                  String type=Type;
                  long count=Count;
                  String amount=Amount;
                  String time=Time;
                  String query="insert into transactions values ('"+acc_number+"','"+type+"','"+count+"','"+amount+"','"+time+"')";
                  String query1="update customers set Account_Balance='"+bank.customer.getAmount()+"' where Account_Number='"+acc_number+"';";
                  statement.addBatch(query);
                  statement.addBatch(query1);
                  statement.executeBatch();
                 connection.commit();
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }
        public void query_transactions(String acc_number) 
        throws SQLException{
            Connection connection = null;
            Statement statement = null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                String query="select * from transactions where Account_Number='"+acc_number+"'";
                ResultSet rs=statement.executeQuery(query);
                while(rs.next()){
                    dashboard1.MainPage.model.addRow(new Object[]{rs.getString("transaction_number"),
                    rs.getString("transaction_type"),rs.getString("transaction_Amount"),rs.getString("transaction_time")});
                    if(bank.customer.customers!=null)bank.customer.customers.transactionId=Integer.parseInt(rs.getString("transaction_number"));
                }
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }

        public void delete(Client client)throws SQLException{
            Connection connection = null;
            Statement statement = null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                connection.setAutoCommit(false);
                String query="delete from customers where Email='"+client.getEmail()+"';";
                String query1="delete from blocked_Account where Account= '"+client.getAccountNumber()+"';";
                String query2="delete from security where Account='"+client.getAccountNumber()+"';";
                String query3="delete from transactions where Account_Number='"+client.getAccountNumber()+"';";
                
                statement.addBatch(query1);
                statement.addBatch(query2);
                statement.addBatch(query3);
                statement.addBatch(query);
            
                statement.executeBatch();
                connection.commit();
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }

        public Client queryClient(String email)throws SQLException{
            Connection connection = null;
            Statement statement = null;
            Client client=null;
            try{
                
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                connection.setAutoCommit(false);
                String query="select * from customers where Email='"+email+"';";
                String query1="select security1,security2,security3 from security where Account= (select Account_Number from customers where Email='"+email+"');";   
                String query2="select blocked from blocked_Account where Account=(select Account_Number from customers where Email='"+email+"');";  
                ResultSet rs=statement.executeQuery(query1);
                if(!rs.next())return null;
                
                String q1=rs.getString("security1");
                String q2=rs.getString("security2");
                String q3=rs.getString("security3");
             
                rs=statement.executeQuery(query2);
                rs.next();
                int state=rs.getInt("blocked");

                rs=statement.executeQuery(query);
                rs.next();
                
                
            String Balance=rs.getString("Account_Balance");
            String balanceWithoutLastChar = Balance.substring(0, Balance.length() - 1);
            
            int balanceValue = Integer.parseInt(balanceWithoutLastChar);
                client=new Client(rs.getString("Fname"),rs.getString("Lname"),rs.getString("Address"),rs.getString("Phone_number"),rs.getString("Email"),
                rs.getString("Password"),rs.getString("Birthday_date"),rs.getString("gender"),balanceValue,q1,q2,q3,state);
                client.setAccountNumber(rs.getString("Account_Number"));
                statement.executeBatch();
                connection.commit();

            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
            return client;
        }
        
        
        public void UpdateState(String account) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                
                String query="udpate blocked_Account set blocked='1' where Account='"+account+"';";
                statement.execute(query);
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
            
        }
        
        public int queryState(String account) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            int Check=0;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                
                String query="select blocked from blocked_Account where Account='"+account+"';";
                ResultSet rs=statement.executeQuery(query);
                rs.next();
                Check=rs.getInt("blocked");
                
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
            return Check;
        }
        
        public void updatePass(String Email,String password) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                
                String query="update customers set Password='"+password+"' where Email='"+Email+"';";
                statement.execute(query);
                
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }

        public void updateEmail(String newEmail,String email) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                connection.setAutoCommit(false);
                
                statement=connection.createStatement();
                String query="update customers set Email='"+newEmail+"' where Email='"+email+"';";
                statement.addBatch(query);
                statement.executeBatch();
                connection.commit();
                
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }

        public void updatePhone(String newPhone,String email) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                
                String query="update customers set Phone_number='"+newPhone+"' where Email='"+email+"';";
                statement.execute(query);
                
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }

        public void updateAddress(String newAddress,String email) throws SQLException {
            Connection connection=null;
            Statement statement=null;
            try{
                connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/banksystem", "root", "");
                statement=connection.createStatement();
                
                String query="update customers set Address='"+newAddress+"' where Email='"+email+"';";
                statement.execute(query);
                
            }
            catch(SQLException e){
                if (e.getSQLState().equals("23000")) { // SQLState for duplicate entry
                System.out.println("Failed to insert record: Duplicate entry.");
                }else{
                    e.printStackTrace();
                }
            }
            finally{
                statement.close();
                connection.close();
            }
        }
}

    public class SystemManagment{
        public String encryptPassword(String password) {
            StringBuilder Encrepted_Password=new StringBuilder();
            for(int i=0; i<password.length();++i){
                //((65-32-20)+95)%95==>9-95
                int indx=(((password.charAt(i)-' '-(2*(int)Math.pow(10, 1)))+95))%95;
                Encrepted_Password.append(ASCII[indx]);
            }
            return Encrepted_Password.toString();
        }

        public String decryptPassword(String password) {
            StringBuilder Encrepted_Password=new StringBuilder();
            for(int i=0; i<password.length();++i){
                int indx=(((password.charAt(i)-' '+(2*(int)Math.pow(10, 1)))+95))%95;
                Encrepted_Password.append(ASCII[indx]);
            }
            return Encrepted_Password.toString();
        }

        public boolean checkEmailFormat(String email) {
        Pattern validEmailPattern = Pattern.compile("[A-Za-z0-9]+([._][A-Za-z0-9]+)?@[A-Za-z]{1,}\\.[A-Za-z]{1,}");
        // moamen@gmail.com-->regex
       return validEmailPattern.matcher(email).matches();
    }

    public boolean checkPhoneFormat(String contactNumber) {
        Pattern phonePattern = Pattern.compile("[+]{0,1}(20|0)?-?(10|11|12|15)-?[0-9]{4}-?[0-9]{4}");
        return phonePattern.matcher(contactNumber).matches();
    }

    public boolean checkPasswordFormat(String password) {
        Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])"
                + "(?=.*[\\~\\ \\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+\\=\\-\\`\\;\\,\\.\\/\\:\\[\\]\\{\\}]).+$");
            return passwordPattern.matcher(password).matches();
    }

    public String generateAccountNumber(){
        Random rand=new Random(System.currentTimeMillis());
        StringBuilder acc_number=new StringBuilder();
        int i=6;
        while(i>0){
            acc_number.append((char)(rand.nextInt(9)+'0'));
            --i;
        }
        return acc_number.toString();
    }
}
    
public class Bank {
        private final String Bankname;
        private final String address;
        private final String contactNumber;
        public serverAdmin serverAdmin; 
        public systemAdmin systemAdmin; 
        public Client customer; 

        public Bank() {
            this.Bankname="Maze Bank";
            this.address="6th of October Cairo,Egypt";
            this.contactNumber="01212576274";
            serverAdmin=new BankSystem().new serverAdmin();
            systemAdmin=new BankSystem().new systemAdmin();
            customer=new BankSystem().new Client();
        }
    }
 
static Bank bank=new BankSystem().new Bank();
static Login login=new Login();
public class Authentication {
    public Authentication() {
        login.setVisible(true);
    }
 }
    public static void main(String[] args) throws SQLException {
        new BankSystem().new Authentication();
    }
}