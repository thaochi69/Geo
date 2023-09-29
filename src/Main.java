
import controller.ManagerEastAsiaCountries;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
     public static void main(String[] args) {
        String title = "Menu";
        String[] s = new String[]{"Input the information of 11 countries in East Asia ", "Display the information of country you've just input", 
            "Search the information of country by user-entered name", "Display the information of countries sorted name in ascending order", "Exit"};
        Menu<String> menu = new ManagerEastAsiaCountries(title, s);
        menu.run();
    }
}
