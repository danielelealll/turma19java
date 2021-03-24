programa
{
	
	funcao inicio()
	{
		
		real indicePoluicao=0

		escreva("Por favor, informe o índice de poluição atual: ")
		leia(indicePoluicao)

		se (indicePoluicao>0.25 e indicePoluicao  >=0.3)
		{
			escreva("Industrias do primeiro grupo, pare por favor! \n")
		}

		senao se (indicePoluicao>=0.05 e indicePoluicao <=0.25)
		{
			escreva("Cara indústria, seu índice de poluição encontra-se aceitável!")
		}

		se (indicePoluicao==0.4)
		{
			escreva("Indústrias 1 e 2, por gentileza, suspendam suas atividades!")
		}

		senao se (indicePoluicao==0.5)
		{
			escreva("Todas as indústrias, suspendam suas atividades!")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */