document.addEventListener("DOMContentLoaded",()=>{
	
	const form = document.getElementById("cadastroEnderecoForm");
	
	form.addEventListener("submit", async(event) =>{
		event.preventDefault();
		
		const rua = document.getElementById("rua").value;
		const numero= document.getElementById("numero").value;
		const bairro = document.getElementById("bairro").value;
		const cidade = document.getElementById("cidade").value;
		const estado = document.getElementById("estado").value;
		
		try{
			const response = await fetch ("http://localhost:8080/cadastroendereco", {
				method: "POST",
				headers: {
					"content-type":"application/json"
				},
				body:JSON.stringify({
					rua,
					numero,
					bairro, 
					cidade, 
					estado
				}),
			});
			
			if (response.ok){
				alert("Endereço cadastrado com sucesso!");
			}else{
				alert("Erro ao cadastrar o Endereco");
			}
		}catch (error) {
			console.error("Erro ao cadastrar o Endereco:", error);
		}
	});
});