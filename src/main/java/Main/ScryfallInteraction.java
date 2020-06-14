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

    public static ImageIcon getCardImage(Card c) {
        ImageIcon icon = null;
        try {
            BufferedImage img = c.getImage("large");
            icon = new ImageIcon(img.getScaledInstance(258, 360, Image.SCALE_SMOOTH));
        } catch (Exception ex) {
        }
        return icon;
    }

    public static String getCardType(Card c) {
        String typeLine = c.getTypeLine();
        String[] types = {"Creature", "Enchanment", "Instant", "Sorcery"};

        for (String type : types) {
            if (typeLine.contains(type)) {
                return type;
            }
        }
        return null;
    }

}
