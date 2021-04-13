/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import static ca.sheridancollege.project.Card.Suit.HEARTS;
import static ca.sheridancollege.project.Card.Value.FIVE;
import static ca.sheridancollege.project.Card.Value.SIX;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shado
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Called before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Called after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Called before test case");
    }
    
    @After
    public void tearDown() {
        System.out.println("Called after test case");
    }
    /**
     * GOOD Test of compareCard method, of class Game.
     * when Player one's card is greater than player two
     */
    @Test
    public void testGOODCompareCard() {
        System.out.println("compareCard");
        Card.Value p1Card = SIX;
        Card.Value p2Card = FIVE;
        Game instance = null;
        int expResult = 1;
        int result = p1Card.compareTo(p2Card);
        assertEquals(expResult, result);
    }
    /**
     * BAD Test of compareCard method, of class Game.
     * when Player one's card is less than player two
     */
    @Test
    public void testBADCompareCard() {
        System.out.println("compareCard");
        Card.Value p1Card = FIVE;
        Card.Value p2Card = SIX;
        Game instance = null;
        int expResult = -1;
        int result = p1Card.compareTo(p2Card);
        assertEquals(expResult, result);
    }
    /**
     * BOUNDARY Test of compareCard method, of class Game.
     * when Player one's card is less than player two
     */
    @Test
    public void testBOUNDARYCompareCard() {
        System.out.println("compareCard");
        Card.Value p1Card = FIVE;
        Card.Value p2Card = FIVE;
        Game instance = null;
        int expResult = 0;
        int result = p1Card.compareTo(p2Card);
        assertEquals(expResult, result);
    }

    /**
     * GOOD Test of checkP1Hand method, of class Game.
     * When there is one or more cards left in p1hand.
     */
    @Test
    public void testGOODCheckP1Hand() {
        System.out.println("checkP1Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p1deck = new LinkedList<Card>();
        p1deck.add(e);
        Game instance = null;
        int expResult = 1;
        int result = p1deck.size();
        assertEquals(expResult, result);
    }
    /**
     * BAD Test of checkP1Hand method, of class Game.
     * When there is no more cards left in p1hand.
     */
    @Test
    public void testBADCheckP1Hand() {
        System.out.println("checkP1Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p1deck = new LinkedList<Card>();
        Game instance = null;
        int expResult = 0;
        int result = p1deck.size();
        assertEquals(expResult, result);
    }
    /**
     * BOUNDARY Test of checkP1Hand method, of class Game.
     * When there is zero cards left in p1hand.
     */
    @Test
    public void testBOUNDARYCheckP1Hand() {
        System.out.println("checkP1Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p1deck = new LinkedList<Card>();
        Game instance = null;
        int expResult = 0;
        int result = p1deck.size();
        assertEquals(expResult, result);
    }
    
    /**
     * GOOD Test of checkP2Hand method, of class Game.
     * When there is one or more cards left in p2hand.
     */
    @Test
    public void testGOODCheckP2Hand() {
        System.out.println("checkP1Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p2deck = new LinkedList<Card>();
        p2deck.add(e);
        Game instance = null;
        int expResult = 1;
        int result = p2deck.size();
        assertEquals(expResult, result);
    }
    /**
     * BAD Test of checkP2Hand method, of class Game.
     * When there is no more cards left in p2hand.
     */
    @Test
    public void testBADCheckP2Hand() {
        System.out.println("checkP2Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p2deck = new LinkedList<Card>();
        Game instance = null;
        int expResult = 0;
        int result = p2deck.size();
        assertEquals(expResult, result);
    }
    /**
     * BOUNDARY Test of checkP2Hand method, of class Game.
     * When there is zero cards left in p1hand.
     */
    @Test
    public void testBOUNDARYCheckP2Hand() {
        System.out.println("checkP2Hand");
        Card e = new Card(HEARTS,FIVE);
        LinkedList<Card> p2deck = new LinkedList<Card>();
        Game instance = null;
        int expResult = 0;
        int result = p2deck.size();
        assertEquals(expResult, result);
    }
    
}
