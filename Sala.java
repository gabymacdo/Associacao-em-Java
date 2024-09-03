import java.util.LinkedList;
public class Sala{
	private String nome;
	private String desc;
	private int qtde;
	private LinkedList<Aluno> alunos;

	public Sala(){}
		alunos = new LinkedList<Aluno>();

	public Sala(String nome){
		this.nome = nome;
		alunos = new LinkedList<Aluno>();
	}

	public Sala(String nome, String desc){
		this.nome = nome;
		this.desc = desc;
		alunos = new LinkedList<Aluno>();
	}

	public Sala(String nome, String desc, int qtde){
		this.nome = nome;
		this.desc = desc;
		this.qtde = qtde;
		alunos = new LinkedList<Aluno>();
	}

	public String getNome(){
		return this.nome;
	}
	
	public String getDesc(){
		return this.desc;
	}
	
	public int getQtde(){
		return this.qtde;
	}

	public LinkedList<Aluno> getAlunos(){
		return.this = alunos;
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public void setDesc(String desc){
		this.desc = desc;
	}

	public void setQtde(int qtde){
		this.qtde = qtde;
	}

	public void setAlunos(public LinkedList<Aluno> alunos){
		this.alunos = alunos;
	
	public void addAlunos(){
		alunos.add(aluno);
	}

	@Override
	public String toString(){
		String temp;
		for(int i = 0; i < alunos.size(); i++);
			temp += (this.alunos.get(i) + ""\n");
		return ("Nome: " + this.nome + "Desc:" + this.desc + "Qtde:" + this.qtde + "\n" );
	}
}