import org.junit.Test;

import com.abbapp.ABB;

import static org.junit.Assert.*;

import org.junit.Before;

public class ABBTest {

    ABB tree = new ABB();

    @Before
    public void setUp() throws Exception {
        tree.addNewNode(10);
        tree.addNewNode(5);
        tree.addNewNode(15);
        tree.addNewNode(20);
        tree.addNewNode(25);
        tree.addNewNode(30);
        tree.addNewNode(35);
        tree.addNewNode(40);
        tree.addNewNode(45);
        tree.addNewNode(50);
        tree.addNewNode(55);
        tree.addNewNode(60);
        tree.addNewNode(65);
        tree.addNewNode(70);
        tree.addNewNode(75);
        tree.addNewNode(80);
        tree.addNewNode(85);
        tree.addNewNode(90);
        tree.addNewNode(95);
        tree.addNewNode(100);
        tree.addNewNode(105);
        tree.addNewNode(110);
    }

    @Test
    public void testAddNewNode() {
        assertEquals("The node 450 should not be in the tree", false, tree.searchABB(tree.getRoot(), 450));
        assertEquals("The node 5 should be in the tree", true, tree.searchABB(tree.getRoot(), 5));
        assertEquals("The node 15 should be in the tree", true, tree.searchABB(tree.getRoot(), 15));
        assertEquals("The node 10 should be in the tree", true, tree.searchABB(tree.getRoot(), 10));
        assertEquals("The node 200 should not be in the tree", false, tree.searchABB(tree.getRoot(), 200));
    }

    @Test
    public void testDeleteNode() {
        tree.deleteNode(5);
        assertEquals("The node 5 should not be in the tree", false, tree.searchABB(tree.getRoot(), 5));
        tree.deleteNode(15);
        assertEquals("The node 15 should not be in the tree", false, tree.searchABB(tree.getRoot(), 15));
        tree.deleteNode(10);
        assertEquals("The node 10 should not be in the tree", false, tree.searchABB(tree.getRoot(), 10));
        tree.deleteNode(200);
        assertEquals("The node 200 should not be in the tree", false, tree.searchABB(tree.getRoot(), 200));
    }
}
