function eliminar(IdCliente){
	swal({
  		  title: "Esta seguro de Eliminar?",
  		  text: "Tenga en cuenta que una vez eliminado, no podrà recuperar el registro!",
  		  icon: "warning",
  		  buttons: true,
  		  dangerMode: true,
        })
        .then((OK) => {
  			if (OK) {
				  $.ajax({
					  url:"/eliminar/"+IdCliente,
					  success: function(res){
						  console.log(res);
					  },
				  });
    			swal("¡El registro ha sido eliminado con èxito!", {
      				icon: "success",
    			}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
				} else {
    			swal("No se ha eliminado el registro");
  			}
		  });
}