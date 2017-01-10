/*
 * Copyright (c) 2017. Aleksey Eremin
 * 10.01.17 13:44
 */

package ae999;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 Читаем свойства из текстового файл свойств
 by novel http://java-course.ru/begin/collections_02/
 */
public class Main extends JFrame {
    
  public Main() {
    //
    String upText="up";
    String dnText="down";
    
    try {
      Properties pr = new Properties();
      pr.load(new FileReader("simple.properties")); // читаем файл свойст
      upText = pr.getProperty("up.button.title"); // читаем свойство, если свойства нет, то NULL
      dnText = pr.getProperty("dn.button.title"); // читаем свойство
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    JButton up=new JButton(upText);
    JButton down = new JButton(dnText);
    add(up, BorderLayout.NORTH);
    add(down, BorderLayout.SOUTH);
    setBounds(200,200, 500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
  }

  public static void main(String[] args) {
	// write your code here
    Main pe = new Main();
  }
  
}
