/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import forohfor.scryfall.api.Card;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Steve
 */
public class TreeInteraction {

    static DefaultTreeModel treeModel;
    static DefaultMutableTreeNode root;
    static String[] types = {"Creature", "Enchanment", "Instant", "Sorcery"};
    static ArrayList<DefaultMutableTreeNode> typeNodeList = new ArrayList<>();

    public static void setupTree() {
        root = new DefaultMutableTreeNode("Deck");
        for (String type : types) {
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(type);
            typeNodeList.add(child);
            root.add(child);
        }
        treeModel = new DefaultTreeModel(root);
        GUI.deckTree.setModel(treeModel);
    }

    public static void addTreeNode(Card c) {
        DefaultMutableTreeNode parent = null;
        for (int i = 0; i < types.length; i++) {
            if (ScryfallInteraction.getCardType(c).equals(types[i])) {
                parent = typeNodeList.get(i);
                break;
            }
        }

        DefaultMutableTreeNode child = new DefaultMutableTreeNode(c.getName());
        int childCount = parent.getChildCount();

        if (childCount != 0) {
            treeModel.insertNodeInto(child, parent, childCount + 1);
        }
        treeModel.insertNodeInto(child, parent, 0);
        treeModel.reload();
    }

    public static void setRootText(String text) {
        root.setUserObject(text);
        treeModel.reload();
    }

    public static DefaultTreeModel getModel() {
        return treeModel;
    }
}
