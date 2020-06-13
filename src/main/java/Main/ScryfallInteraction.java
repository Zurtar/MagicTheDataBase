package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stevep
 */
import forohfor.scryfall.api.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ScryfallInteraction {

    public static ArrayList<Card> search(String query) {
        String prefix = getPrefix();

        System.out.println(prefix + " " + query);
        ArrayList<Card> cardList = MTGCardQuery.search(prefix + query);
        return cardList;
    }

    private static String getPrefix() {
        String prefix = "";

        if (GUI.filterCMCBox.isSelected()) {
            prefix += "cmc=" + GUI.cmcComboBox.getSelectedItem().toString() + " ";
        }
        if (GUI.filterCardBox.isSelected()) {
            prefix += "t:" + GUI.cardTypeComboBox.getSelectedItem().toString() + " ";
        }
        if (GUI.filterColourBox.isSelected()) {
            prefix += "c:" + GUI.colourComboBox.getSelectedItem().toString() + " ";
        }
        if (GUI.filterCreatureTypeBox.isSelected()) {
            prefix += "t:" + GUI.creatureTypeComboBox.getSelectedItem() + " ";
        }

        if (GUI.filterOracleBox.isSelected()) {
            prefix += "o:\" " + GUI.oracleText.getText() + "\"";
        }

        //wrong!
        if (GUI.filterNameBox.isSelected()) {
            prefix = "";
        }

        return prefix;
    }

    public static ImageIcon getImage(Card c) {
        ImageIcon icon = null;
        try {
            URL url = new URL(c.getImageURI("large"));
            BufferedImage img = ImageIO.read(url);
            icon = new ImageIcon(img.getScaledInstance(258, 360, Image.SCALE_SMOOTH));
        } catch (Exception ex) {
        }
        return icon;
    }
}
