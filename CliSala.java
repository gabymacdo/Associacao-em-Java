public class CliSala{
	public static void maid(String [] args){
		String strTemp; int intTemp; char charTemp;
		Scanner sc = newScanner(System.in);
		LinkedList<Aluno> lAlunos = new LinkedList<Aluno>();
		Sala sala1 = new Sala();
		System.out.println("Informe o nome da sala:");
		strTemp = sc.nextLine();
		sala1.setNome(strTemp);
		System.out.println("Informe a descricao da sala:");
		strTemp = sc.nextLine();
		sala1.setDesc(strTemp);
		System.out.println("Informe o nro de alunos da sala:");
		intTemp = sc.nextInt();
		sala1.setQtde(intTemp);
		do{

			sc.nextLine();
			System.out.println("Informe o nome do aluno:");
			strTemp = sc.nextLine();
			System.out.println("Informe o rg do aluno:");
			intTemp = sc.nextInt();
			lAlunos.add(new Aluno(strTemp, intTemp, sala1));
			System.out.println("Pressione c/C para continuar, s/S para sair.");
			strTemp = sc.Next();

		}while(strTemp.charAt(0) != 's' && strTemp.charAt(0) != 'S');
		sala1.setAlunos(lAlunos);
		System.out.println("Listando sala e alunos");
		System.out.println(sala1);
	}
}	