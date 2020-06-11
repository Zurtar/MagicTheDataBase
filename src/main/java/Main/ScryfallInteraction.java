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
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class ScryfallInteraction {

    public static ArrayList<Card> search(String query) {
        String prefix = getPrefix();

        System.out.println(prefix + query);
        ArrayList<Card> cardList = MTGCardQuery.search(prefix + query);
        return cardList;
    }

    private static String getPrefix() {
        String prefix = "";

        if (GUI.filterCMCBox.isSelected()) {
            prefix = "cmc=" + GUI.cmcComboBox.getSelectedItem().toString() + " ";
        } else if (GUI.filterCardBox.isSelected()) {
            prefix = "t:" + GUI.cardTypeComboBox.getSelectedItem().toString() + " ";
        } else if (GUI.filterColourBox.isSelected()) {
            prefix = "c:" + GUI.colourComboBox.getSelectedItem().toString() + " ";
        } else if (GUI.filterCreatureTypeBox.isSelected()) {
            prefix = "t:" + GUI.creatureTypeComboBox.getSelectedItem() + " ";
        } else if (GUI.filterOracleBox.isSelected()) {
            prefix = "o:";
        } else if (GUI.filterNameBox.isSelected()) {
            prefix = "";
        }

        return prefix;
    }

    public static ImageIcon getImage(Card c, String imageType) {
        ImageIcon icon = null;
        try {
            URL url = new URL(c.getImageURI(imageType));
            BufferedImage img = ImageIO.read(url);
            icon = new ImageIcon(img);
        } catch (Exception ex) {
        }
        return icon;
    }
}
