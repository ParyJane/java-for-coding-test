import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Stack;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    
    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size + 1];
        for(int i = 1; i < size + 1; i++) {
            nodes[i] = new Node(i);
        }
    }
    
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }
    
    int dfs() {
        int cnt = 0;
        Stack<Node> stack = new Stack<Node>();
        Node root = nodes[1];
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()) {
            Node r = stack.pop();
            for(Node n : r.adjacent) {
                if(n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int nodes = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());
        
        Graph g = new Graph(nodes);
        for(int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            g.addEdge(i1, i2);
        }
        
        int answer = g.dfs();
        System.out.println(answer);
    }
}
