public class Notas
{
	public static void main(String[] args) {
	    
	    for(int i=0; i<args.length; i++){
	        int nota = Integer.parseInt(args[i]);
			if((i+1) < 10){
				System.out.print("Aluno 0" + (i+1) + " ");
			} else {
				System.out.print("Aluno " + (i+1) + " ");
			}
	            for(int j=0; j<nota; j++){
	                System.out.print("*");
	       }
		   System.out.println();
	    }
	}
}

