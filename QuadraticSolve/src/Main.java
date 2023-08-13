//quadraticsolve.java
//this program will have the user enter the variables a, b, c into a gui and then calculate the real roots using the quadratic equation
//a submit button to trigger the event of calculation and the display of the results will be utilized
//last edited 4/27/23 by Lavdrim Islami

//import libraries
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {
        //create frame
        JFrame myJFrame = new JFrame();

        //title, size, exit behavior
        myJFrame.setTitle("Quadratic Equation Solver");
        myJFrame.setSize(500,300);
        myJFrame.setLocation(200,100);
        myJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //add image
        JLabel quadPic = new JLabel(new ImageIcon("quad.jpg"));

        //create text box
        JPanel inputPanel = new JPanel();
        JTextField inpA = new JTextField(10);
        JTextField inpB = new JTextField(10);
        JTextField inpC = new JTextField(10);

        inputPanel.add(new JLabel("A"));
        inputPanel.add(inpA);

        inputPanel.add(new JLabel("B"));
        inputPanel.add(inpB);

        inputPanel.add(new JLabel("C"));
        inputPanel.add(inpC);

        //event button
        JButton calculateEvent = new JButton("Calculate");
        calculateEvent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //values from text box
                double a = Double.parseDouble(inpA.getText());
                double b = Double.parseDouble(inpB.getText());
                double c = Double.parseDouble(inpC.getText());

                //perform calculations
                double disc = b * b - 4 * a * c;
                if(disc > 0) {
                    double root1 = (-b + Math.sqrt(disc)) / (2 * a);
                    double root2 = (-b - Math.sqrt(disc)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Roots are: " + root1 + ", " + root2);
                } // end if
                else if (disc ==0){
                    double root1 = -b/ (2 * a);
                    JOptionPane.showMessageDialog(null, "root is: " + root1);
                }//end else if
                else{
                    JOptionPane.showMessageDialog(null, "no real roots");
                }//end else
            }
        }); //end actionlistener

        //display
        myJFrame.add(inputPanel);
        inputPanel.add(calculateEvent);
        myJFrame.add(quadPic, BorderLayout.SOUTH);
        myJFrame.setVisible(true);
    }//end main method
}//end main class


//1,6,9 1 real
//1,5,6 2 real

