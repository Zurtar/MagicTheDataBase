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
import java.util.ArrayList;

public class ScryfallInteraction {

    public static ArrayList<Card> search(String query) {
        ArrayList<Card> cardList;
        String prefix = getPrefix();

        cardList = MTGCardQuery.search(prefix +" "+ query);

        if (cardList.isEmpty()) {
            GUI.resultTable.setValueAt("No Cards Were Found With The Given Search Term.", 0, 0);
        }

        return cardList;
    }

    private static String getPrefix() {
        String prefix = "";

        if (GUI.filterCMCRadio.isSelected()) {
            prefix = "c:" + GUI.cardTypeComboBox.getSelectedItem().toString();
        } else if (GUI.filterCardRadio.isSelected()) {
            prefix = "t:" + GUI.cardTypeComboBox.getSelectedItem().toString();
        } else if (GUI.filterColourRadio.isSelected()) {
            prefix = "c:" + GUI.colourComboBox.getSelectedItem().toString();
        } else if (GUI.filterCreatureTypeRadio.isSelected()) {
            prefix = "t:";
        } else if (GUI.filterOracleRadio.isSelected()) {
            prefix = "o:";
        } else {
            prefix = "";
        }

        return prefix;
    }
}
