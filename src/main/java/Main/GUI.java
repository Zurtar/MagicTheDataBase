package Main;

import forohfor.scryfall.api.Card;

import java.util.ArrayList;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Steve
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    DefaultTableModel tableModel;
    ArrayList<Card> cardList;

    public GUI() {
        initComponents();
        clearResultTable();

        ListSelectionModel selectionModel = resultTable.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                /**
                 * we do this so that when the value is changing from selected
                 * to deselected it does not fetch the image for nothing. This
                 * prevents our selectionValueChanged() method from being called
                 * twice every time a card is selected
                 */
                if (e.getValueIsAdjusting()) {
                    return;
                }
                updateCardInfo();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        largeImageFrame = new javax.swing.JFrame();
        largeImageLabel = new javax.swing.JLabel();
        largeImageHeader = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        searchPanel = new javax.swing.JPanel();
        resultScrollPane = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        cmcComboBox = new javax.swing.JComboBox<>();
        cardTypeComboBox = new javax.swing.JComboBox<>();
        titleLabel = new javax.swing.JLabel();
        creatureTypeComboBox = new javax.swing.JComboBox<>();
        colourComboBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        resultPageCountLabel = new javax.swing.JLabel();
        filterCMCBox = new javax.swing.JCheckBox();
        filterColourBox = new javax.swing.JCheckBox();
        filterCardBox = new javax.swing.JCheckBox();
        filterCreatureTypeBox = new javax.swing.JCheckBox();
        filterOracleBox = new javax.swing.JCheckBox();
        filterNameBox = new javax.swing.JCheckBox();
        oracleText = new javax.swing.JTextField();
        cardInfoTabbedPane = new javax.swing.JTabbedPane();
        cardDescriptionPanel = new javax.swing.JPanel();
        cardNameLabel = new javax.swing.JLabel();
        cardNameDisplay = new javax.swing.JTextField();
        setLabel = new javax.swing.JLabel();
        setDisplay = new javax.swing.JTextField();
        manaCostLabel = new javax.swing.JLabel();
        manaCostDisplay = new javax.swing.JTextField();
        cardTypeLabel = new javax.swing.JLabel();
        cardTypeDisplay = new javax.swing.JTextField();
        colourLabel = new javax.swing.JLabel();
        colourDisplay = new javax.swing.JTextField();
        oracelTextLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardOracleDisplay = new javax.swing.JTextArea();
        cardImagePanel = new javax.swing.JPanel();
        cardImageLabel = new javax.swing.JLabel();
        cardImageHeaderLabel1 = new javax.swing.JLabel();
        deckNameLabel = new javax.swing.JLabel();
        deckNameField = new javax.swing.JTextField();
        deckCommentLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        largeImageLabel.setMaximumSize(new java.awt.Dimension(488, 700));
        largeImageLabel.setMinimumSize(new java.awt.Dimension(488, 680));
        largeImageLabel.setPreferredSize(new java.awt.Dimension(488, 690));

        largeImageHeader.setText("Large Image Window");

        javax.swing.GroupLayout largeImageFrameLayout = new javax.swing.GroupLayout(largeImageFrame.getContentPane());
        largeImageFrame.getContentPane().setLayout(largeImageFrameLayout);
        largeImageFrameLayout.setHorizontalGroup(
            largeImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(largeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(largeImageHeader)
        );
        largeImageFrameLayout.setVerticalGroup(
            largeImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(largeImageFrameLayout.createSequentialGroup()
                .addComponent(largeImageHeader)
                .addGap(11, 11, 11)
                .addComponent(largeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 680));

        searchPanel.setMaximumSize(new java.awt.Dimension(999999, 999999));
        searchPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        searchPanel.setPreferredSize(new java.awt.Dimension(1200, 680));
        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultTable.setBackground(new java.awt.Color(204, 204, 204));
        resultTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Sets", "Mana costs", "Card Type", "Color(s)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setRowHeight(24);
        resultScrollPane.setViewportView(resultTable);

        searchPanel.add(resultScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 925, 449));

        searchButton.setText("Search");
        searchPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 75, -1, -1));

        cmcComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3","4","5","6","7","8","9","10","11","12", }));
        searchPanel.add(cmcComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 90, -1));

        cardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enchantment", "Creature", "Artifact", "Land","Insant","Sorcery" }));
        searchPanel.add(cardTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 90, -1));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 0));
        titleLabel.setText("Magic: The Database");
        searchPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        creatureTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Advisor","Aetherborn","Ally","Angel","Antelope","Ape","Archer","Archon","Army","Artificer","Assassin","Assembly-Worker","Atog","Aurochs","Avatar","Azra","Badger","Barbarian","Basilisk","Bat","Bear","Beast","Beeble","Berserker","Bird","Blinkmoth","Boar","Bringer","Brushwagg","Camarid","Camel","Caribou","Carrier","Cat","Centaur","Cephalid","Chimera","Citizen","Cleric","Cockatrice","Construct","Coward","Crab","Crocodile","Cyclops","Dauthi","Demigod","Demon","Deserter","Devil","Dinosaur","Djinn","Dragon","Drake","Dreadnought","Drone","Druid","Dryad","Dwarf","Efreet","Egg","Elder","Eldrazi","Elemental","Elephant","Elf","Elk","Eye","Faerie","Ferret","Fish","Flagbearer","Fox","Frog","Fungus","Gargoyle","Germ","Giant","Gnome","Goat","Goblin","God","Golem","Gorgon","Graveborn","Gremlin","Griffin","Hag","Harpy","Hellion","Hippo","Hippogriff","Homarid","Homunculus","Horror","Horse","Hound","Human","Hydra","Hyena","Illusion","Imp","Incarnation","Insect","Jackal","Jellyfish","Juggernaut","Kavu","Kirin","Kithkin","Knight","Kobold","Kor","Kraken","Lamia","Lammasu","Leech","Leviathan","Lhurgoyf","Licid","Lizard","Manticore","Masticore","Mercenary","Merfolk","Metathran","Minion","Minotaur","Mole","Monger","Mongoose","Monk","Monkey","Moonfolk","Mouse","Mutant","Myr","Mystic","Naga","Nautilus","Nephilim","Nightmare","Nightstalker","Ninja","Noble","Noggle","Nomad","Nymph","Octopus","Ogre","Ooze","Orb","Orc","Orgg","Otter","Ouphe","Ox","Oyster","Pangolin","Peasant","Pegasus","Pentavite","Pest","Phelddagrif","Phoenix","Pilot","Pincher","Pirate","Plant","Praetor","Prism","Processor","Rabbit","Rat","Rebel","Reflection","Rhino","Rigger","Rogue","Sable","Salamander","Samurai","Sand","Saproling","Satyr","Scarecrow","Scion","Scorpion","Scout","Sculpture","Serf","Serpent","Servo","Shade","Shaman","Shapeshifter","Shark","Sheep","Siren","Skeleton","Slith","Sliver","Slug","Snake","Soldier","Soltari","Spawn","Specter","Spellshaper","Sphinx","Spider","Spike","Spirit","Splinter","Sponge","Squid","Squirrel","Starfish","Surrakar","Survivor","Tentacle","Tetravite","Thalakos","Thopter","Thrull","Treefolk","Trilobite","Triskelavite","Troll","Turtle","Unicorn","Vampire","Vedalken","Viashino","Volver","Wall","Warlock","Warrior","Weird","Werewolf","Whale","Wizard","Wolf","Wolverine","Wombat","Worm","Wraith","Wurm","Yeti","Zombie","Zubera" }));
        searchPanel.add(creatureTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 90, -1));

        colourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Blue", "Black", "Red", "Green" }));
        searchPanel.add(colourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 90, -1));
        searchPanel.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 502, -1));
        searchPanel.add(resultPageCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 883, -1, -1));

        filterCMCBox.setText("Filter By CMC");
        searchPanel.add(filterCMCBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        filterColourBox.setText("Filter By Colour");
        searchPanel.add(filterColourBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        filterCardBox.setText("Filter By Cardtype");
        searchPanel.add(filterCardBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        filterCreatureTypeBox.setText("Filter By Creature type");
        searchPanel.add(filterCreatureTypeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        filterOracleBox.setText("Filter By Oracle Text");
        searchPanel.add(filterOracleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        filterNameBox.setText("Filter By Name");
        searchPanel.add(filterNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        oracleText.setMinimumSize(new java.awt.Dimension(28, 20));
        oracleText.setPreferredSize(new java.awt.Dimension(28, 20));
        searchPanel.add(oracleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 110, 23));

        cardInfoTabbedPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cardNameLabel.setText("Card Name:");

        cardNameDisplay.setEditable(false);

        setLabel.setText("Set(s):");

        setDisplay.setEditable(false);

        manaCostLabel.setText("Mana Cost:");

        manaCostDisplay.setEditable(false);

        cardTypeLabel.setText("Card Type:");

        cardTypeDisplay.setEditable(false);

        colourLabel.setText("Colour(s):");

        colourDisplay.setEditable(false);

        oracelTextLabel.setText("Oracle Text:");

        cardOracleDisplay.setEditable(false);
        cardOracleDisplay.setColumns(20);
        cardOracleDisplay.setLineWrap(true);
        cardOracleDisplay.setRows(5);
        jScrollPane1.setViewportView(cardOracleDisplay);

        javax.swing.GroupLayout cardDescriptionPanelLayout = new javax.swing.GroupLayout(cardDescriptionPanel);
        cardDescriptionPanel.setLayout(cardDescriptionPanelLayout);
        cardDescriptionPanelLayout.setHorizontalGroup(
            cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(manaCostLabel)
                        .addGap(12, 12, 12)
                        .addComponent(manaCostDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(oracelTextLabel)
                    .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(cardTypeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cardTypeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                        .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardNameLabel)
                            .addComponent(setLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(colourLabel)
                        .addGap(18, 18, 18)
                        .addComponent(colourDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardDescriptionPanelLayout.setVerticalGroup(
            cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNameLabel)
                    .addComponent(cardNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setLabel)
                    .addComponent(setDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manaCostLabel)
                    .addComponent(manaCostDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardTypeLabel)
                    .addComponent(cardTypeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colourLabel)
                    .addComponent(colourDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(oracelTextLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        cardInfoTabbedPane.addTab("Card Description'", cardDescriptionPanel);

        cardImageLabel.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        cardImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardImageLabel.setPreferredSize(new java.awt.Dimension(146, 204));

        cardImageHeaderLabel1.setText("Click Image For Large Version");

        javax.swing.GroupLayout cardImagePanelLayout = new javax.swing.GroupLayout(cardImagePanel);
        cardImagePanel.setLayout(cardImagePanelLayout);
        cardImagePanelLayout.setHorizontalGroup(
            cardImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardImageHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        cardImagePanelLayout.setVerticalGroup(
            cardImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardImageHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        cardInfoTabbedPane.addTab("Card Image", cardImagePanel);

        searchPanel.add(cardInfoTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, 390));
        cardInfoTabbedPane.getAccessibleContext().setAccessibleName("Card Info");

        deckNameLabel.setText("Deck Name:");
        searchPanel.add(deckNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, -1, -1));
        searchPanel.add(deckNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 140, -1));

        deckCommentLabel.setText("Comments:");
        searchPanel.add(deckCommentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(939, 485, -1, -1));

        jMenu1.setText("Deck Editor");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Deck");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Load Deck");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save Deck");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void updateCardInfo() {
        Card c = cardList.get(resultTable.getSelectedRow());
        cardImageLabel.setIcon(ScryfallInteraction.getImage(c, "small"));

        cardNameDisplay.setText(c.getName());
        setDisplay.setText(c.getSetCode());
        manaCostDisplay.setText(c.getManaCost());
        cardTypeDisplay.setText(c.getTypeLine());
        if (!c.getColorIdentity().isEmpty()) {
            colourDisplay.setText(c.getColorIdentity().get(0));
        }
        cardOracleDisplay.setText(c.getOracleText());
    }

    private void setResultTable(ArrayList<Card> cardList) {
        //updating the size of our JTable
        tableModel.setRowCount(cardList.size());
        resultTable.setModel(tableModel);

        //Filling in the table with our card data
        for (int i = 0; i < cardList.size(); i++) {
            Card currentCard = cardList.get(i);
            resultTable.setValueAt(currentCard.getName(), i, 0);
            resultTable.setValueAt(currentCard.getSetCode(), i, 1);
            resultTable.setValueAt(currentCard.getManaCost(), i, 2);
            resultTable.setValueAt(currentCard.getTypeLine(), i, 3);
            resultTable.setValueAt(currentCard.getColorIdentity(), i, 4);
        }
    }

    private void addRow() {
        tableModel.addRow(new Object[5]);
        tableModel.fireTableDataChanged();
    }

    private void clearResultTable() {
        tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Name", "Sets", "Mana costs", "Card Type", "Color(s)"
                }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        resultTable.setModel(tableModel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
            //lol exception machine go brrrr
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel cardDescriptionPanel;
    public static javax.swing.JLabel cardImageHeaderLabel1;
    public static javax.swing.JLabel cardImageLabel;
    public static javax.swing.JPanel cardImagePanel;
    public static javax.swing.JTabbedPane cardInfoTabbedPane;
    public static javax.swing.JTextField cardNameDisplay;
    public static javax.swing.JLabel cardNameLabel;
    private javax.swing.JTextArea cardOracleDisplay;
    public static javax.swing.JComboBox<String> cardTypeComboBox;
    public static javax.swing.JTextField cardTypeDisplay;
    public static javax.swing.JLabel cardTypeLabel;
    public static javax.swing.JComboBox<String> cmcComboBox;
    public static javax.swing.JComboBox<String> colourComboBox;
    public static javax.swing.JTextField colourDisplay;
    public static javax.swing.JLabel colourLabel;
    public static javax.swing.JComboBox<String> creatureTypeComboBox;
    private javax.swing.JLabel deckCommentLabel;
    private javax.swing.JTextField deckNameField;
    private javax.swing.JLabel deckNameLabel;
    public static javax.swing.JCheckBox filterCMCBox;
    public static javax.swing.JCheckBox filterCardBox;
    public static javax.swing.JCheckBox filterColourBox;
    public static javax.swing.JCheckBox filterCreatureTypeBox;
    public static javax.swing.JCheckBox filterNameBox;
    public static javax.swing.JCheckBox filterOracleBox;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JFrame largeImageFrame;
    private javax.swing.JLabel largeImageHeader;
    private javax.swing.JLabel largeImageLabel;
    public static javax.swing.JTextField manaCostDisplay;
    public static javax.swing.JLabel manaCostLabel;
    public static javax.swing.JLabel oracelTextLabel;
    public static javax.swing.JTextField oracleText;
    private javax.swing.JLabel resultPageCountLabel;
    private javax.swing.JScrollPane resultScrollPane;
    public static javax.swing.JTable resultTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    public static javax.swing.JPanel searchPanel;
    public static javax.swing.JTextField setDisplay;
    public static javax.swing.JLabel setLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
