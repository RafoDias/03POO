
import javax.swing.*;

public class panelItem {
    JPanel panel;
    String itemName;
    boolean done = false;
    JCheckBox checkButton = new JCheckBox();
    

    public panelItem(String text) {
        this.itemName = text;
        panel = new JPanel();
    }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
}
