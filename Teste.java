
class Endereco{
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;	

	//---metodos exibicao---
	
	public String exibirLogradouro(){
		return logradouro;
	}
	public String exibirNumero(){
		return numero;
	}
	public String exibirBairro(){
		return bairro.toUpperCase();
	}
	public String exibirCidade(){
		return cidade.toUpperCase();
	}

	//---prerencher---
	public void preencherLogradouro(String pLogradouro){
		logradouro=pLogradouro;
	}
	public void preencherNumero(String pNumero){
		numero=pNumero;
	}
	public void preencherBairro(String pBairro){
		bairro=pBairro;
	}
	public void preencherCidade(String pCidade){
		cidade=pCidade;
	}

}
class Aluno{
	private String nome;
	private String cpf;
	private int rm; 
	private Endereco endereco;
	
	//---metodos exibicao---

	public String exibirNome(){
		return nome.toUpperCase();
	}
	public String exibirCpf(){
		return cpf.toUpperCase();
	}
	public int exibirRm(){
		return rm;
	}

	//---metodos de preenchimentos---
	public Endereco exibirEndereco(){
		return endereco;
	}

	public void preencherEndereco(Endereco pEndereco){
		endereco=pEndereco;
	}
	public void preencherNome(String pNome){
		nome=pNome;
	}
	public void preencherCpf(String pCpf){
		cpf=pCpf;
	}
        public void preencherRm(int pRm){
		rm=pRm;
	}
		
	
}
	
class Teste{
	public static void main(String args[]){

		Aluno objeto = new Aluno();

		objeto.preencherNome("Braufagelio");
		objeto.preencherCpf("311356369-85");
		objeto.preencherRm(82852);

		System.out.println(objeto.exibirNome());
		System.out.println(objeto.exibirCpf());
		System.out.println(objeto.exibirRm());

		Endereco objeto2 = new Endereco();
		
		objeto2.preencherLogradouro("Girassol");
		objeto2.preencherNumero("1048");
		objeto2.preencherBairro("vila madalena");
		objeto2.preencherCidade("sao paulo");
		
		objeto.preencherEndereco(objeto2);

		System.out.println(objeto.exibirEndereco().exibirLogradouro());
		System.out.println(objeto.exibirEndereco().exibirNumero());
		System.out.println(objeto.exibirEndereco().exibirBairro());
		System.out.println(objeto.exibirEndereco().exibirCidade());


	}

}