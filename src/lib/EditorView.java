package lib;

import javax.swing.*;
import javax.swing.event.DocumentListener;

public class EditorView extends JTextArea {
    private Model model;

    public EditorView(Model model) {
        setModel(model);
        setLineWrap(true);
    }


    public void setModel(Model model) {
        this.model = model;
        model.addActionListener(
                e -> {
                    this.repaint();
                });
    }
}
