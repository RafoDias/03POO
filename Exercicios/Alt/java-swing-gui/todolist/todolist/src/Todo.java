import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class Todo extends JPanel {
    public JTextField tf;
    public JButton addBtn;
    public JButton edit;
    public JButton delete;
    public JCheckBox checkBox;
    public JLabel label;
    private int WIDTH = 290;
    private int HEIGHT = 60;
    public int index;

    public Todo(int index)
    {
        this.index = index;
        this.tf = new JTextField(20);
        int x = 0;
        int y = index * HEIGHT;
        add(BorderLayout.WEST, this.tf);
        setBounds(x, y, WIDTH, HEIGHT);
        
    }

    public void addTodo() {
        String t = tf.getText();
        remove(tf);
        remove(addBtn);
        
        this.label = new JLabel(t);
        this.edit = new JButton("Edit");
        this.delete = new JButton("Del");
        this.checkBox = new JCheckBox();
        add(BorderLayout.WEST, edit);
        add(BorderLayout.WEST, delete);
        add(BorderLayout.WEST, label);
        add(BorderLayout.EAST, checkBox);
    }
    
    /*
    private void editText() {
        // save instance info
        // change to text field
        // save string input
        // if new string update instance info 
        // if invalid string load initial instance info
        //TODO
    }
    
    */
}
