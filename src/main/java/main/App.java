package main;
import static data.LocalUserData.getUserData;
import models.UserData;
import pages.InitialDashboard;
import pages.LoginPage;

public class App {

    public static void main(String[] args) {
                
        UserData retrievedUserData = getUserData();
        if (retrievedUserData != null) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new InitialDashboard().setVisible(true);
                }
            });            
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LoginPage().setVisible(true);
                }
            });           
        };

 
    }
}
