package HuffmanTree;

class Node implements Comparable<Node>{
    private Node leftCh;
    private Node rightCh;
    private int freq;
    private char c;

    public Node(int freq){
        this.freq = freq;
    }
    public Node(char c, int freq){
        this.c = c;
        this.freq = freq;
    }

    public void setLeftCh(Node temp){ this.leftCh = temp; }

    public void setRightCh(Node temp){ this.rightCh = temp; }

    public Node getLeftCh(){ return leftCh; }

    public Node getRightCh(){ return rightCh; }

    public int getFreq(){ return freq; }

    public char getChar(){ return c; }

    public void changeFreq(int freq){ this.freq = freq; }

    public void changeChar(char c){ this.c = c; }

    public void printInf(){
        if(this.c!='~') System.out.println("The char is :" + "'"+this.c+"'"+"   "+"frequent is :"+ this.freq);
        else System.out.println("This is an internal node, the frequent is : "+this.freq);
    }

    public void preOrder(){
        printInf();
        if(this.leftCh!=null) this.leftCh.preOrder();
        if(this.rightCh!=null) this.rightCh.preOrder();
    }

    @Override
    public int compareTo(Node o) {
        return this.freq - o.freq;
    }
}
