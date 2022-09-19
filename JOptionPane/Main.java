package JOptionPane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value of informs them of something

        // JOptionPane.showMessageDialog(null,"this is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"here is more useless info","title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"really","title",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"Your computer has a VIRUS!!","title",JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"Call tech support now or else","title",JOptionPane.ERROR_MESSAGE);
        // int answer = JOptionPane.showConfirmDialog(null,"bro , do you even code","this is my title",JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(answer);

        // String name = JOptionPane.showInputDialog("what is your name");
        // System.out.println(name);

        String[] responses = {"ok bro!","no,thanks","fuck you","shut up"};
        JOptionPane.showOptionDialog(
                null,
                "You are awesome",
                "this is my title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                100);

    }
}
