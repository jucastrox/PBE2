document.getElementById("cep").addEventListener("input", async function(){
	const cep = this.value.replace(/\d/g, "");
	
	if(cep.length === 8){
		try{
			const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
			
			if(!response.ok) throw Error("Erro ao buscar CEP");
			const dados = await response.json();
			
			if(dados.erro){
				alert("CEP não encontrado.")
				return;
			}
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("estado").value = dados.uf;
		} catch(error){
			alert("Erro ao buscar o endereço: "+ error.message);
		}
	}
})

document.addEventListener("DOMContentLoaded",()=>{
	
	const form = document.getElementById("cadastroEnderecoForm");
	
	form.addEventListener("submit", async(event) =>{
		event.preventDefault();
		
		const rua = document.getElementById("rua").value;
		const numero= document.getElementById("numero").value;
		const bairro = document.getElementById("bairro").value;
		const cidade = document.getElementById("cidade").value;
		const estado = document.getElementById("estado").value;
		const cep = document.getElementById("cep").value;
		
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
					estado,
					cep
				}),
			});
			
			if (!response.ok){
				window.location.href = "cadastroproduto.html";
			}else{
				alert("Erro ao cadastrar o Endereco");
			}
		}catch (error) {
			console.error("Erro ao cadastrar o Endereco:", error);
		}
	});
});