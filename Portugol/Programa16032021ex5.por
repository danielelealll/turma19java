programa
{
	
	funcao inicio()
	{
		real nota1
		real nota2
		real nota3
		real peso1
		real peso2
		real peso3

		peso1=2
		peso2=3
		peso3=5
		
		escreva("Olá, aluno. ","Insira a sua primeira nota:")
		leia(nota1)
		escreva("Insira a sua segunda nota:")
		leia(nota2)
		escreva("Insira a sua terceira nota:")
		leia(nota3)
		escreva("Por fim, sua média final será de: ", ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 89; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */