
package empiricus;

import java.util.Scanner;

public class Empiricus {


    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor inicial: ");
        int num = sc.nextInt();
        int suma = 0;
	for(int i = num; i <= num + 100; i += 2){
            suma = suma + i;
	}
	System.out.println("El total es: " + suma);
        
        int vec [] = {944896, 784603, 848335, 176516, 827828, 26641, 715821, 184879, 500756, 775247, 762327, 859084, 
        1103765, 499597, 413471, 851838, 696024, 634453, 457710, 922357, 1031787, 45587, 116939, 94954, 821770, 322646, 
        88388, 537673, 777380, 758748, 312380, 823478, 910077, 21814, 816662, 928553, 1029952, 777310, 357092, 934303, 
        608687, 311305, 156923, 623487, 903849, 546695, 223248, 328772, 695048, 301351, 335574, 1130083, 14528, 443974, 
        59935, 882059, 928378, 211539, 1025809, 184742, 924211, 258633, 644968, 862232, 112050, 37608, 519977, 647058, 
        757389, 633196, 64804, 564603, 1097495, 319672, 454607, 488281, 1059148, 53106, 584878, 220361, 222448, 45551, 
        87525, 304853, 473556, 628474, 325290, 162183, 1114844, 964139, 898992, 536364, 472303, 894722, 378403, 6898, 
        308776, 633505, 16769, 728039, 304503};
        int may = 0;
        for (int i = 0; i < vec.length; i++) {
            if (may < vec[i]) {
                may = vec[i];
            }
        }
        System.out.println("Mayor: " + may);*/
        
        int base = 2, exp = 10;
        System.out.println("Potencia: " + Math.pow((double)base, (double)exp));

    }
    
}
