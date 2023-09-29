/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Country;
import model.Text;
import view.Menu;

/**
 *
 * @author Thao Chi
 */
public class ManagerEastAsiaCountries extends Menu<String>{
    private Text list= new Text();
    public ManagerEastAsiaCountries(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.inputCountry();
                break;
            case 2:
                list.printCountry();
                break;
            case 3:
                list.searchByName();
                break;
            case 4:
                list.printCountrySorted();
                break;
            case 5:
                System.exit(0);        
        }
    }
}
