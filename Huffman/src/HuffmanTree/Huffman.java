package HuffmanTree;

import java.util.*;

public class Huffman {
    StringManage sm = new StringManage();
    List<Node> nodes = new ArrayList<>();
    public Node createHuffmanTree(){
        //创建字符结点，将结点放入结点列表
        Set<Character> set = sm.map.keySet();
        for(char i:set){
            nodes.add(new Node(i,sm.map.get(i)));
        }

        while(nodes.size()>1){
            Collections.sort(nodes);
            Node left = nodes.remove(0);    //获取并删除频率最小字符结点
            Node right = nodes.remove(0);   //获取并删除频率第二小的字符结点
            //创建内部结点
            Node parent = new Node('~',left.getFreq()+right.getFreq());
            parent.setLeftCh(left);
            parent.setRightCh(right);
            nodes.add(parent);  //将父结点加入结点列表
        }
        return nodes.get(0);
    }

    public void createHuffmanCode(Node node, String Code){
        if(node.getChar()!='~'){
            if(Code.equals("")) System.out.println("字符:"+"'"+node.getChar()+"'"+"   "+"编码："+"0");
            else System.out.println("字符:"+"'"+node.getChar()+"'"+"   "+"编码："+Code);
            return;
        }
        createHuffmanCode(node.getLeftCh(),Code+"0");
        createHuffmanCode(node.getRightCh(), Code+"1");
    }
}
