public class ConcatenaPlus {
	public static void main (String args[]) {
		String nomeCompleto = "";
		for (int i=0; i<args.length; i++) {
			nomeCompleto = nomeCompleto + args[i] + " ";
		}
		System.out.println (nomeCompleto);
	}
}