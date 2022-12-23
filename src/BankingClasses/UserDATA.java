/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankingClasses;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 1styrGroupB
 */
public class UserDATA {
    
   
    public static void save(Users user){
        double bal = 0.0;
        String query = "insert into users(BankName, HolderName, AccNumber, Pin, BirthDate,BirthPlace, Balance) values ('"+user.getBankname()+"','"+user.getHoldername()+"','"+user.getAccNumber()+"','"+user.getPin()+"','"+user.getBdate()+"','"+user.getBplace()+"', '"+bal+"')";
        User_db.setDataDelete(query, "Registered Successfully! Please Login");
    }
    
    public static Users login(int accNo, int pin){
        Users user = null;
        try{
             ResultSet rs = User_db.getData("select * from users where AccNumber= '"+accNo+"' and Pin = '"+pin+"' ");
             while (rs.next()){
               user = new Users();
                 user.setAccNumber(rs.getInt("AccNumber"));
                 user.setPin(rs.getInt("Pin"));
//                 user.setPermission(rs.getString("Permission"));  
                 
             }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
        return user;
    } 
    
    

}   
