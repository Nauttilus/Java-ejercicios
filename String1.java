
package javaejer;


public class String1 {
    public static void main(String[] args) {
        String custName = "maria pelayo";
       String firstName;
        int space;
        space = custName.indexOf(' ');//marca donde esta la posicion del espacio en blanco 
        System.out.println(" ' ' : " + space);
        firstName = custName.substring(0,space);
        System.out.println(firstName);
        String lastName =custName.substring(space + 1);
        System.out.println(lastName);
        
    }
}
