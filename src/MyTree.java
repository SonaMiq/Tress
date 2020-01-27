import java.util.TreeSet;

public class MyTree {

    Node root;


    class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }
     void insertEl(int val){
        if(root==null) {
            root = new Node(val);
            return;
        }
          insertEl(root,val);
    }
  private  void insertEl(Node node,int val){

       if (val<=node.val)
           if(node.left!=null)
             insertEl(node.left,val);
           else
               node.left=new Node(val);
        if (val>node.val)
            if(node.right!=null)
               insertEl(node.right,val);
            else
                node.right=new Node(val);

    }

    Node searchEl(int val){
       return searchEl(root,val);
    }


   private Node searchEl(Node node,int val) {

        if (val == node.val) {
            return node;
        }
        if (val < node.val) {
            if (node.left != null)
                return searchEl(node.left,val);
             else
                return null;
        }

        if (val > node.val) {
            if (node.right != null)
                return searchEl(node.right,val);
             else
                return null;
        }
        return null;
    }


  //  Node deleteEl(int val) {
//
    //   if(searchEl(val)==null)
    //       return null;
      //    Node delEl=null;//deleting element
        //  Node delPrev=root;//deleting element previous element
        // if(val==root.val){
          //   Node lastLeft=root.right.left;
            // while (lastLeft.left!=null)
              //   lastLeft=lastLeft.left;
            //lastLeft.left= root.left.right;
            //delEl=root;
            //root=delEl.left;
            //root.right=delEl.right;
            //count--;
           // return root;
         //}

      //       while (delPrev.left.val != val && delPrev.right.val != val) {
             //    if (val < delPrev.val)
               //      delPrev = delPrev.left;
                 //if (val > delPrev.val)
                   //  delPrev = delPrev.right;
         //    }

        //  if(val==delPrev.left.val) {
         //     delEl=delPrev.left;
           //   delPrev.left = delEl.right;
            // Node lastLeft=delEl.right;
            // while (lastLeft.left!=null)
              //   lastLeft=lastLeft.left;
             //lastLeft.left=delEl.left;

          //}
     //else    {
       //     delEl=delPrev.right;
         //   delPrev.right = delEl.left;
           // Node lastRight=delEl.left;
           // while (lastRight.right!=null)
             //   lastRight=lastRight.right;
            //lastRight.right=delEl.right;

        //}
          //    count--;
            // return delEl;
       }


