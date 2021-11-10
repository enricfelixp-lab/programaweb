<html>
	<body>
	<% aula05.ContadorDeAcesso.novoAcesso(); %>	Quantidade de acessos a essa página:
	<b>
		<%= aula05.ContadorDeAcesso.getQuantidadeAcessos() %>
	</b>
	</body>
</html>