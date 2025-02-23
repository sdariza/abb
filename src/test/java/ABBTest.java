import org.junit.Test;

import com.abbapp.ABB;

import static org.junit.Assert.*;


public class ABBTest {
    @Test
    public void testAddNewNode() {
        ABB tree = new ABB();
        tree.addNewNode(10);
        tree.addNewNode(5);
        tree.addNewNode(15);

        assertEquals("The node 40 should not be in the tree", false, tree.searchABB(tree.getRoot(), 40));
        assertEquals("The node 5 should be in the tree", true, tree.searchABB(tree.getRoot(), 5));
        assertEquals("The node 15 should be in the tree", true, tree.searchABB(tree.getRoot(), 15));
    }
}
