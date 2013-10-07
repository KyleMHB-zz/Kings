/**
 * @author              :KyleMHB
 * Project Number       :0003 V2.0
 * Project Name         :Kings
 * Project Path         :Kings/SourcePackages/JFrameKings/Kings.java
 * IDE                  :NETBEANS
 * Goal of Project      - 
 * MainFile is a rule based drinking game using cards for 4+ players.
 * The Rules are read in from a rules.txt so that one can easily change the rules.
 * How the game works:
 * Players shuffle a deck of cards, place a glass between them and circle the
 * cards around the base of the glass.
 * The players then take turns picking cards, each card has its own rule associated to it.
 * Most importantly, there are 4 MainFile, each time a King is picked, 
 * the player who picked it can pour as much of his/her drink into the glass between
 * them as they wish.
 * The game ends when the fourth and final King is picked.
 * The player to pick the final King must down the glass in the center of table.
 */

package JFrameKings;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Kings { 
    
    enum Rank {
        ACE   ("Ace"),
        TWO   ("2"),
        THREE ("3"),
        FOUR  ("4"),
        FIVE  ("5"),
        SIX   ("6"),
        SEVEN ("7"),
        EIGHT ("8"),
        NINE  ("9"),
        TEN   ("10"),
        JACK  ("Jack"),
        QUEEN ("Queen"),
        KING  ("King");
        String name;
        Rank(String name) {
            this.name = name;
        }
    } 
    
    enum Suit {
        HEARTS      ("Hearts"),
        DIAMONDS    ("Diamonds"),
        SPADES      ("Spades"),
        CLUBS       ("Clubs");
        String name;
        Suit(String name) {
            this.name = name;
        }
    }
    
    public static class Card {
        public Rank rank;
        public Suit suit;
        
        Card(Suit suit, Rank rank){
                this.rank=rank;
                this.suit=suit;
        }
        public @Override String toString(){
                  return rank.name + " of " + suit.name;
        }
    }

    public static class Deck {
        public static ArrayList<Card> cards;
         Deck()	{
             cards=new ArrayList<>();
                for (Suit suit : Suit.values()){
                        for (Rank rank : Rank.values()){
                           cards.add( new Card(suit,rank));
                         }
                }
                Collections.shuffle(cards, new Random());
                Collections.shuffle(cards, new Random(System.nanoTime()));
         }
         public Card getCard(){
             return cards.get(0);
         }
         public void removeFromDeck(){	   
             cards.remove(0);
         }
    }

    public static List<String> rules;
    public static int playerTurn=1;
    public static final int players=getNum("How many people are going to play",
                        "Number of Players");
    private static int kings=0;
    private static Deck deck=new Deck();

    public static void main(String[] args) throws IOException{     
        setRules("rules.txt");
        GameGUI.main(null);
    }
     
    private static void setRules(String filename) throws IOException{
        File f= new File(filename);
        rules = Files.readAllLines(f.toPath(),Charset.defaultCharset());
        for(int i=0; i!=rules.size(); i++){
            rules.set(i, rules.get(i).replaceAll( "\\\\n","\n"));
        }
    }
   
    private static int getNum(String prompt,String title) {
        return Integer.parseInt
                (JOptionPane.showInputDialog(null,prompt,title,3));
    }

    public static String playGame() {        
        String out;
        if(kings==3 && checkIfKing()==true){
            display();
            System.exit(0);
            return null;
        }
        else if(checkIfKing()==true){
        kings++;
        playerTurn++;
        out="Player "+(playerTurn-1)+" has picked the "+deck.getCard().toString()
                +"\n"+(4-kings)+" Kings remain"
                +"\n\n"+getRule();     
        deck.removeFromDeck();
        if (playerTurn==players+1){playerTurn=1;}
        return out;
        }
        playerTurn++;
        out="Player "+(playerTurn-1)+" has picked the "+deck.getCard().toString()
                +"\n\n"+getRule();     
        deck.removeFromDeck();
        if (playerTurn==players+1){playerTurn=1;}
        return out;

    }
    
    private static boolean checkIfKing() {
        if(deck.getCard().rank==Rank.KING)
            return true;
        return false;
    }
    
    private static String getRule(){
        return rules.get(deck.getCard().rank.ordinal());
    }
    
    public static String skipTurn(){
        String out;
        if (playerTurn==players){
            out="Player "+playerTurn+"'s turn was skipped\n";
            playerTurn=1;
        }else{
            out="Player "+playerTurn+"'s turn was skipped\n";
            playerTurn++;
        }
        return out;
    }
    
    public static String passCard(){      
        return deck.getCard().toString();
    }
    
    private static void display() {
        JOptionPane.showMessageDialog(null,"Player "+playerTurn+" has Drawn the Final King\n\n"+
                        getRule()+"\n\n",
                        "Restart the Program to Play again",1);
    }
}
