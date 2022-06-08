package HuffmanTree;

public class Main {
    public static void main(String[] args) {
        Huffman cht = new Huffman();
        Node HuffmanTree = cht.createHuffmanTree();
        cht.createHuffmanCode(HuffmanTree, "");
    }
}
