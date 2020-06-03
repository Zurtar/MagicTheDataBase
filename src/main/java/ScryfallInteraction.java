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

        cardList = MTGCardQuery.search(query);
        
        if(cardList.isEmpty()){
            GUI.resultTable.setValueAt("No Cards Were Found With The Given Search Term.", 0, 0);
        }
        
        return cardList;
    }

    private static String getPrefix() {
        String prefix = "";
        return prefix;
    }
}
