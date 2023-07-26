/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap <Node, Node> map = new HashMap();
        return helper(node, map);
    }
    public Node helper(Node node, HashMap <Node, Node> map){
        if(node == null) return node;

        Node start = new Node(node.val, new ArrayList<Node>());
        map.put(node, start);

        for(Node it: node.neighbors){
            if(!map.containsKey(it)) 
                start.neighbors.add(helper(it, map));
            else 
                start.neighbors.add(map.get(it));
        }
        return start;
    }
}