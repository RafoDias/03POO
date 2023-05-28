import java.awt.*;
import java.awt.List;

import javax.swing.*;
import java.util.*;

public class App {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Todo List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 600);
        
        int[] todoCounter = { -1 };
        ArrayList<Todo> todos = new ArrayList<Todo>();

        addNewTodo(todos, todoCounter, frame);

        // JCheckBox checkBox = new JCheckBox("Fugir", null, false);
        JScrollBar scrollBar = new JScrollBar(1);

        // frame.getContentPane().add(BorderLayout.WEST, todos.get(todoCounter[0]));
        frame.getContentPane().add(BorderLayout.EAST, scrollBar);
        frame.setVisible(true);
    }

    public static void clicked(Todo update, JFrame frame, ArrayList<Todo> todos, int[] index) {
        frame.remove(update);
        update.addTodo();
        frame.add(update);
        
        addNewTodo(todos, index, frame);
        
        frame.getContentPane().add(todos.get(index[0]));
        frame.revalidate();
    }

    public static void addNewTodo(ArrayList<Todo> todos, int[] index, JFrame frame) 
    {
        index[0]++;
        Todo todo = new Todo(index[0]);
        todo.addBtn = new JButton("Add");
        todo.addBtn.addActionListener(e -> clicked(todos.get(index[0]), frame, todos, index));
        todo.add(BorderLayout.EAST, todo.addBtn);
        todos.add(index[0], todo);
        
        frame.getContentPane().add(todos.get(index[0]));
    }
}