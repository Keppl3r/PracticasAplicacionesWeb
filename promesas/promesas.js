function obtenerDatosDelServidor(){
//envolver todo con la promesa    
    return new Promise((resolve, reject) => {
    //simular que es asincrona
    setTimeout(()=>{
        let exito=true;
        if(exito){
            let usuario={
                nombre:"kevin",
                edad:26
            }
            resolve(usuario)
        }else{
            reject("ocurrio un error al obtener los datos")
        }
    },2000)
})
} 

obtenerDatosDelServidor()
    .then(resp=>{
        return resp.nombre.toUpperCase();
    })
    .then(nombreEnMayus=>{
        console.log("nombre en mayusculas, ", nombreEnMayus);
    })
    .catch(err=>{
        console.log("Entro en el .catch")
    })
    .finally(()=>{
        console.log("fin de la tarea");
    })


    async function obtenerPosts() {
       try{
         let response= await fetch("https://jsonplaceholder.typicode.com/posts/1");
        console.log(response);
       }catch(error){

       }finally{

       }
    }

    obtenerPosts();
    