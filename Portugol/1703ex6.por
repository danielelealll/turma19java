programa
{
	
	funcao inicio()
	{
		inteiro idade=0
		inteiro idadeAluno=0

		escreva("Olá, aluno. Insira a sua idade: ")
		leia(idadeAluno)

		se (idadeAluno>=5 e idadeAluno<=7)
		{
			escreva("Aluno, você está inserido na categoria Infantil A.")	
		}

		senao se (idadeAluno>=8 e idadeAluno<=11)
		{
			escreva("Aluno, você está inserido na categoria Infantil B.")
		}

		senao se (idadeAluno>=12 e  idadeAluno<=13)
		{
			escreva("Aluno, você está inserido na categoria Juvenil A.")
		}

		senao se (idadeAluno>=14 e idadeAluno<=17)
		{
			escreva("Aluno, você está inserido na categoria Juvenil B.")
		}

		senao se (idadeAluno>=18)
		{
			escreva("Aluno, você está inserido na categoria Adultos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */