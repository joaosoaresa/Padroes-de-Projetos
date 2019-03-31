package composite;

public class Composite {
    
    public static void main(String[] args) {
        Elemento E1 = new Composto("Composto 1");
        Elemento E2 = new Folha("Folha 1");
        Elemento E3 = new Folha("Folha 2");
        Elemento E4 = new Composto("Composto 2");
        
        
        
        try{
            E2.getTexto();
            System.out.println("===============================");
            ((Composto) E1).add(E2);
            ((Composto) E1).add(E3);
            E1.getTexto();
            System.out.println("===============================");
            ((Composto) E4).add(E1);
            ((Composto) E4).add(E3);
            E4.getTexto();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
