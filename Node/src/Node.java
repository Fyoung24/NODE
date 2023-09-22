/*  Node
Franklin Young
9/22/23
Luke O'Drobinak, Roan Silver
Citations: Google, Stack Overflow, Oracle java Docs


**/
public class Node<T> {
    //instance data
    private Node parentNode;
    private Node childNode;
    private T value;

    public Node (){
        parentNode=null;
        childNode=null;
        value=null;
    }
    public Node (T value){//value constructor

    }
    private void set(T value){//
        this.value=value;
    }
    public T getValue(){//gets T val
        return value;
    }
    public Node getParentNode(){//gets ParentNode val
        return parentNode;
    }
    public void setParentNode(Node parentNode){ //sets parent node
        this.parentNode=parentNode;
    }
    public Node getChildNode(){//gets childnode
        return childNode;
    }
    public void setChildNode(Node childNode){
        this.childNode=childNode;
    }
    public String toString(){//to string method
        if(value==null){ return "Node: Null";}
            else {
                return "Node "+ value.toString();
            }
    }
    public boolean equals(Node node){//equals method
        return this.value.equals(node.getValue());
    }
}
