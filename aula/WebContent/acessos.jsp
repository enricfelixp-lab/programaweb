<html>
	<body>
	<% aula05.ContadorDeAcesso.novoAcesso(); %>	Quantidade de acessos a essa p�gina:
	<b>
		<%= aula05.ContadorDeAcesso.getQuantidadeAcessos() %>
	</b>
	</body>
</html>