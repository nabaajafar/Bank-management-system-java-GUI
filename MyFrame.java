/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagment;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MyFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyFrame
     */
    ResultSet rs ;
   
    public MyFrame() {
        super("BANK MANAGEMENT SYSTEM");
        initComponents();
        this.loginCustomerPage1.setVisible(true);
        this.loginEmployeePage1.setVisible(false);
        this.registerCustomerPage1.setVisible(false);
        this.customerPage2.setVisible(false);
        this.transactionPage1.setVisible(false);
        this.deposit1.setVisible(false);
        this.afDeposit2.setVisible(false);
        this.withdraw1.setVisible(false);
        this.transaction1.setVisible(false);
        this.afTransfer1.setVisible(false);
        this.displayTransaction1.setVisible(false);
        this.employeePage1.setVisible(false);
        this.viewC1.setVisible(false);
        this.openC1.setVisible(false);
        this.deleteC1.setVisible(false);
        
        this.loginCustomerPage1.Employeelbl.addMouseListener(
        new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(true);  
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        
        this.loginCustomerPage1.Creatlbl.addMouseListener(
                new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(true);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }});
        
        this.registerCustomerPage1.OKR.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
       
            String url = "jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String db_user = "root";
            String db_pass = "1234";
            try {
                Connection con = DriverManager.getConnection(url, db_user, db_pass);
                System.out.printf("%s Register Connected Successfully!!!",db_user);
                //register a user
                int xID = Integer.valueOf(registerCustomerPage1.IDtxt.getText());
                //String xusername= registerCustomerPage1.userCtxt.getText();
                String xname = registerCustomerPage1.nameCtxt.getText();
                String xpass = registerCustomerPage1.passCtxt.getText();
                // String xbalance = tb.getText();
                String xphone = registerCustomerPage1.phontxt.getText();
                String xemail = registerCustomerPage1.Emailtxt.getText();
                String xaddress = registerCustomerPage1.addrtxt.getText();
                String xDOB = registerCustomerPage1.DOBtxt.getText();
           
                String sql = String.format("Insert into customer"
                        + "(ID,name,Address,Email,DOB,password,phone)"
                        + "values('%s','%s','%s','%s','%s','%s','%s');", xID,xname,
                        xaddress, xemail, xDOB, xpass,xphone);
                //two lines are important
                Statement s = con.createStatement();
                //use with insert , delete , update
                s.executeUpdate(sql);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        
            }
            
        });
        
        this.loginCustomerPage1.logcbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                
            //jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
            String url = "jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String db_user = "root";
            String db_pass = "1234";
           
            try {
                Connection con = DriverManager.getConnection(url, db_user, db_pass);
                System.out.println("login Connected Successfully!!!");
                //register a user
                String id = loginCustomerPage1.nametxt.getText();
                String xpass = loginCustomerPage1.passtxt.getText();
               
               String query="Select ID, password from customer";
                //two lines are important
                Statement s = con.createStatement();
                // Statement s = cont.createStatement();
                 rs = s.executeQuery(query);
                 boolean flag = false ;
                 while(rs.next()){
                if(xpass.equals(rs.getString("password"))&&id.equals(rs.getString("ID"))){
                    
                     loginCustomerPage1.setVisible(false);
                     loginEmployeePage1.setVisible(false);
                     registerCustomerPage1.setVisible(false);
                     customerPage2.setVisible(true);
                     transactionPage1.setVisible(false);
                     deposit1.setVisible(false);
                     afDeposit2.setVisible(false);
                     withdraw1.setVisible(false);
                     transaction1.setVisible(false);
                     afTransfer1.setVisible(false);
                     displayTransaction1.setVisible(false);
                     employeePage1.setVisible(false);
                     viewC1.setVisible(false);
                     openC1.setVisible(false);
                     deleteC1.setVisible(false);
                     flag=true;
                     break;
                 }
                 }
                 if(flag == false)
                           JOptionPane.showMessageDialog(rootPane,"Username or password is not correct!!!","Login",JOptionPane.ERROR_MESSAGE);
            
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
            }
            
        });
        
        this.loginEmployeePage1.BackEtoC.addMouseListener(
                new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(true);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }      
               });
        this.registerCustomerPage1.BackR.addMouseListener(
                new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(true);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
                    
                });
        this.customerPage2.transactionbtn.addMouseListener(
                new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(true);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
                    
                });
        this.customerPage2.logoutbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(true);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        this.transactionPage1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(true);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        this.transactionPage1.logoutlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(true);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        
        this.transactionPage1.depositbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(true);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        
        this.deposit1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(true);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        this.deposit1.confirmbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
               
            String url = "jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String db_user = "root";
            String db_pass = "1234";
            try {
                Connection con = DriverManager.getConnection(url, db_user, db_pass);
               System.out.println("connection Successfully");
                
               double xbalance = Double.parseDouble(deposit1.moneytxt.getText());       
              int xID=Integer.parseInt(loginCustomerPage1.nametxt.getText());
              
                String query="Select balance from customer where ID="+xID;
                
                Statement s = con.createStatement();
                // Statement s = cont.createStatement();
                 rs = s.executeQuery(query);
                 if(rs.next()){
                     
                 double total=(Double.parseDouble(rs.getString("balance")))+xbalance;

               String sql = String.format("Update customer set balance="+total
                       + "where ID="+xID);
                s = con.createStatement();
                //use with insert , delete , update
               
                s.executeUpdate(sql);
                
                 String Type="deposit";
                String hsql = String.format("Insert into history"
                        + "(custID,type,amount,otherAccount)"
                        + "values('%s','%s','%s','%s');", xID,
                        Type, xbalance,"  ");
                s.executeUpdate(hsql);
                
             // JOptionPane.showMessageDialog(null, "NEW Balance: "+total);
              
                 loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(true);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
                afDeposit2.balancetxt.setText(""+total);
                 }

            }
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
               
            }
            
        });
        

        this.afDeposit2.continuebtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(true);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        this.afDeposit2.logoutlbl.addMouseListener(new MouseAdapter(){ 

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(true);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
        
        this.transactionPage1.withdrawbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(true);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
            
        });
       this.withdraw1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(true);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
        
    });
       this.withdraw1.confirmbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
               
            String url = "jdbc:mysql://localhost/bank1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String db_user = "root";
            String db_pass = "1234";
            try {
                Connection con = DriverManager.getConnection(url, db_user, db_pass);
                
                
                int xbalance = Integer.parseInt(withdraw1.moneytxt.getText());
                    int xID=  Integer.parseInt(loginCustomerPage1.nametxt.getText());
              
                String query="Select balance from customer where ID="+xID;
                
                Statement s = con.createStatement();
                // Statement s = cont.createStatement();
                 rs = s.executeQuery(query);
                 if(rs.next()){
                 double curentbalance=(Double.parseDouble(rs.getString("balance")));
                 
                 if(curentbalance >= xbalance){
                 
                 double total=curentbalance-xbalance;

                 
           
               String sql = String.format("Update customer set balance="+total
                       + "where ID="+xID );
                s = con.createStatement();
                //use with insert , delete , update
                s.executeUpdate(sql);
                
                String Type="withdraw";
                String hsql = String.format("Insert into history"
                        + "(custID,type,amount,otherAccount)"
                        + "values('%s','%s','%s','%s');",xID,
                        Type, xbalance,"  ");
                s.executeUpdate(hsql);
                
              // JOptionPane.showMessageDialog(null, "NEW Balance: "+total);
               
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(true);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
                afDeposit2.balancetxt.setText(""+total);
               
                 }}
                 else
                     JOptionPane.showMessageDialog(null, "Balance dose not enough !");

            }
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
                
            }
           
       });
       this.transactionPage1.transferbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(true);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.transaction1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(true);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       
       this.afTransfer1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(true);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.transaction1.continuebtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(true);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       
       });
       
       this.afTransfer1.confirmbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(true);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       
       });
       
       this.customerPage2.Historybtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(true);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.displayTransaction1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(true);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.loginEmployeePage1.loginEbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(true);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.employeePage1.logoutlbl.addMouseListener(new MouseAdapter(){

        @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(true);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
               });
       this.employeePage1.viewlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(true);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.viewC1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(true);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.employeePage1.openbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(true);
                deleteC1.setVisible(false);
            }
           
       });
       this.viewC1.openbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(true);
                deleteC1.setVisible(false);
            }
           
       });
       this.openC1.viewlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(true);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.openC1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(true);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.employeePage1.deletebtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(true);
            }
           
       });
       this.openC1.deletebtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(true);
            }
           
       });
       this.viewC1.deletebtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(true);
            }
           
       });
       this.deleteC1.openbtn.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(false);
                openC1.setVisible(true);
                deleteC1.setVisible(false);
            }
           
       });
       this.deleteC1.viewlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(false);
                viewC1.setVisible(true);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
       this.deleteC1.backlbl.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
                loginCustomerPage1.setVisible(false);
                loginEmployeePage1.setVisible(false);
                registerCustomerPage1.setVisible(false);
                customerPage2.setVisible(false);
                transactionPage1.setVisible(false);
                deposit1.setVisible(false);
                afDeposit2.setVisible(false);
                withdraw1.setVisible(false);
                transaction1.setVisible(false);
                afTransfer1.setVisible(false);
                displayTransaction1.setVisible(false);
                employeePage1.setVisible(true);
                viewC1.setVisible(false);
                openC1.setVisible(false);
                deleteC1.setVisible(false);
            }
           
       });
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteC1 = new bankmanagment.DeleteC();
        openC1 = new bankmanagment.OpenC();
        viewC1 = new bankmanagment.ViewC();
        employeePage1 = new bankmanagment.EmployeePage();
        displayTransaction1 = new bankmanagment.DisplayTransaction();
        afTransfer1 = new bankmanagment.AfTransfer();
        transaction1 = new bankmanagment.Transaction();
        withdraw1 = new bankmanagment.Withdraw();
        afDeposit2 = new bankmanagment.AfDeposit();
        deposit1 = new bankmanagment.Deposit();
        transactionPage1 = new bankmanagment.TransactionPage();
        customerPage2 = new bankmanagment.CustomerPage();
        registerCustomerPage1 = new bankmanagment.RegisterCustomerPage();
        loginEmployeePage1 = new bankmanagment.LoginEmployeePage();
        loginCustomerPage1 = new bankmanagment.LoginCustomerPage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(840, 500));
        setMinimumSize(new java.awt.Dimension(840, 500));
        setPreferredSize(new java.awt.Dimension(840, 500));

        javax.swing.GroupLayout displayTransaction1Layout = new javax.swing.GroupLayout(displayTransaction1);
        displayTransaction1.setLayout(displayTransaction1Layout);
        displayTransaction1Layout.setHorizontalGroup(
            displayTransaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        displayTransaction1Layout.setVerticalGroup(
            displayTransaction1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        afDeposit2.setMaximumSize(new java.awt.Dimension(840, 500));
        afDeposit2.setMinimumSize(new java.awt.Dimension(840, 500));

        loginCustomerPage1.setForeground(new java.awt.Color(204, 204, 204));
        loginCustomerPage1.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginCustomerPage1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginEmployeePage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(registerCustomerPage1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(customerPage2, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(transactionPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 57, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(deposit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(afDeposit2, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(withdraw1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(transaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(afTransfer1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(displayTransaction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(employeePage1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(viewC1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(openC1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(deleteC1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginCustomerPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(loginEmployeePage1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 46, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(registerCustomerPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 51, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(customerPage2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(transactionPage1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(deposit1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(afDeposit2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(withdraw1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(transaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(afTransfer1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(displayTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(employeePage1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(viewC1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(openC1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(deleteC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private bankmanagment.AfDeposit afDeposit2;
    private bankmanagment.AfTransfer afTransfer1;
    private bankmanagment.CustomerPage customerPage2;
    private bankmanagment.DeleteC deleteC1;
    private bankmanagment.Deposit deposit1;
    private bankmanagment.DisplayTransaction displayTransaction1;
    private bankmanagment.EmployeePage employeePage1;
    private bankmanagment.LoginCustomerPage loginCustomerPage1;
    private bankmanagment.LoginEmployeePage loginEmployeePage1;
    private bankmanagment.OpenC openC1;
    private bankmanagment.RegisterCustomerPage registerCustomerPage1;
    private bankmanagment.Transaction transaction1;
    private bankmanagment.TransactionPage transactionPage1;
    private bankmanagment.ViewC viewC1;
    private bankmanagment.Withdraw withdraw1;
    // End of variables declaration//GEN-END:variables
}
