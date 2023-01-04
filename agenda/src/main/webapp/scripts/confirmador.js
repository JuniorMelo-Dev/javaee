/**
 * Confirmação de exclusão de um contato
 
 * @author Junior Melo
 * @param idcon
 */
 
 function confirmar(idcon) {
	let resposta = confirm("Você confirma a exclusão deste contato ?")
	if (resposta === true){
		window.location.href = "delete?idcon" + idcon
	}
}