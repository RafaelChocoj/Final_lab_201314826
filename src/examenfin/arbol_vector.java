/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfin;

/**
 *
 * @author RAFAEL
 */
public class arbol_vector {
    
    //int root; 
    NodeAlum root[]; 
    int size;
    public arbol_vector(){
        //this.root = null;
        //this.root = 0;
        this.root = new NodeAlum[100];
        this.root[0] = null;
    }
    
    public void insert(String carnet, String nombre){
        //return insert(this.root, carnet, nombre);
        int index = 0;
        //return 
        //////////insert(this.root, carnet, nombre,index);
    }
    //////////////////////////aqui lo coemnte para que se pueda coorer :v
//    public NodeAlum insert(NodeAlum root_actual[], String carnet, String nombre, int index){
//        if (root_actual[index] == null){
//            this.root[index] = new NodeAlum(carnet, nombre);
//            size = size +1;
//            return this.root[index];   
//        }
//        
//        if (carnet.compareTo(root_actual[index].nombre) < 0){
//            //root_actual.left = insert(root_actual.left, nombre, key); 
//            int left = 2*index + 1;
//            root_actual[left] = insert(root_actual, carnet, nombre, left ); 
//        }  
//        else if (carnet.compareTo(root_actual[index].nombre) > 0){
//            int derec = 2*index +2;
//            root_actual[derec] = insert(root_actual,carnet, nombre, derec);  
//        }
//        else // si son iguales
//            return root_actual[index];  
//        
//        /*# pas 2 -actulizar altura
//        # anterior node */
//        int left = 2*index + 1; //left
//        int derec = 2*index +2;
//        root_actual[index].height = 1 + max(get_altura(root_actual[left]),  
//                            get_altura(root_actual[derec]));  
//  
//        //# pas 3 - factor fe 
//        int balance = getBalance(root_actual[index], index);  
//        root_actual[index].fe =  get_altura(root_actual[derec]) - get_altura(root_actual[left]);
//  
//        //  1 - simpre izquierda
//        //if (balance > 1 && key < root_actual.left.key)  {
//        if (balance > 1 && carnet.compareTo(root_actual[left].carne) < 0)  {    
//            this.root = rot_derecha(root_actual[index]);
//            //return rot_derecha(root_actual);  
//            return this.root;  
//        }
//        // 2 - simpre derecha Right Right Case  
//        //if (balance < -1 && key > root_actual.right.key)  {
//        if (balance < -1 && carnet.compareTo(root_actual[derec].carne) > 0)  {
//            //return rot_izquierda(root_actual);
//            this.root = rot_izquierda(root_actual[index]);
//            return this.root;  
//        }
//        // 3 - doble izquierda IZQ-DER
//        //if (balance > 1 && key > root_actual.left.key)
//        if (balance > 1 && carnet.compareTo(root_actual[left].carne) > 0 )
//        {  
//            root_actual[left] = rot_izquierda(root_actual[left]);  
//            //return rot_derecha(root_actual); 
//            this.root = rot_derecha(root_actual); 
//            return this.root; 
//        }  
//  
//        //  4 - doble derecha DER-IZQ Right Left Case  
//        //if (balance < -1 && key < root_actual.right.key)
//        if (balance < -1 && carnet.compareTo(root_actual[derec].carne) < 0)
//        {  
//            root_actual[derec] = rot_derecha(root_actual[derec]);  
//            //return rot_izquierda(root_actual);  
//            this.root =  rot_izquierda(root_actual);  
//            return this.root;   
//        }  
//  
//        this.root = root_actual;
//        return root_actual; 
//        
//    }
//    
//    int max(int a, int b)  {  
//        //return (a > b) ? a : b;  
//        return Math.max(a, b);
//    } 
//    
//    NodeAVL rot_izquierda(NodeAVL z) {  
//        NodeAVL y = z.right;  
//        NodeAVL T2 = y.left;  
//
//        // rotacion
//        y.left = z;  
//        z.right = T2;  
//
//        // actulizar altura 
//        z.height = max(get_altura(z.left), get_altura(z.right)) + 1;  
//        y.height = max(get_altura(y.left), get_altura(y.right)) + 1;  
//
//        z.fe =  get_altura(z.right) - get_altura(z.left);
//        y.fe =  get_altura(y.right) - get_altura(y.left);
//
//        // Return nuevo root  
//        return y;  
//    }
//    
//    NodeAVL rot_derecha(NodeAVL z){  
//        NodeAVL y = z.left;  
//        NodeAVL T2 = y.right;  
//  
//        // rotation
//        y.right = z;  
//        z.left = T2;  
//  
//        // actulizar altura 
//        z.height = max(get_altura(z.left), get_altura(z.right)) + 1;  
//        y.height = max(get_altura(y.left), get_altura(y.right)) + 1;  
//        
//        z.fe =  get_altura(z.right) - get_altura(z.left);
//        y.fe =  get_altura(y.right) - get_altura(y.left);
//  
//        // Return nuevo root  
//        return y;  
//    }
//        
//    int get_altura(NodeAlum root){  
//        if (root == null)  
//            return 0;  
//        return root.height;  
//    }
//    
//    int getBalance(NodeAlum root_a, int index){  
//        if (root_a == null) {
//            return 0;  
//        }
//        
//        int left = 2*index + 1; //left
//        int derec = 2*index +2;
//        return get_altura(root_a[left]) - get_altura(root_a[derec]);  
//    }
    
}
