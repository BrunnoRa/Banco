class Banco {
	public static void main (String args[]) {
		Conta c1;
		
		c1 = new ContaNormal();
		
		c1.setNumero(new String("1654-3"));
		c1.setSaldo(500);
		
		ContaDebEspecial c2 = new ContaDebEspecial();
		
		c2.setNumero(new String("4067-6"));
		c2.setSaldo(2500);
		c2.setLimite(1000.67);
		
		System.out.println("A conta número " + c1.getNumero() + " possui saldo " + c1.getSaldo());
		
		c1.creditar(1000);
		
		System.out.println("Após o credito de R$ 1000,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());
		c1.debitar(100);
		
		System.out.println("Após o débito de R$ 100,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());
		System.out.println("");

		System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());
		c2.debitar(500);
		
		
		System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " Após débito de R$ 500");
		System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());
		c2.setLimite(10000);
		
		System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e limite de " + c2.getLimite());
	}
}