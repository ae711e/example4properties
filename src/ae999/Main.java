/*
 * Copyright (c) 2017. Aleksey Eremin
 * 10.01.17 13:44
 */

package ae999;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;

/*
 Читаем назавния кнопок из ресурсного файла
 by novel http://java-course.ru/begin/collections_02/
 
 */
public class Main extends JFrame {
    
  public Main() {
    //
    String upText="up";
    String dnText="down";
    // чтобы отображались правильно русские буквы
    // для файла simple.properties в настройках File/Settings.../Editor/File Encoding/
    // внизу,где Default encoding for properties files надо выставить галку "transparent native-to-ascii conversation"
    PropertyResourceBundle pr = (PropertyResourceBundle) PropertyResourceBundle.getBundle("ae999.simple");
    upText = pr.getString("up.button.title"); 
    dnText = pr.getString("dn.button.title"); 
    
    JButton up=new JButton(upText);
    JButton down = new JButton(dnText);
    add(up, BorderLayout.NORTH);
    add(down, BorderLayout.SOUTH);
    setBounds(210,210, 400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
  }

  public static void main(String[] args) {
	// write your code here
    Main pe = new Main();
  }
  
}
