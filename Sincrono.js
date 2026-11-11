function consultarPublicaciones(callback){
    fetch('https://jsonplaceholder.typicode.com/posts')
  .then((r)=> {console.log("termine de obtener los post")
    callback(r);
  })
}

function terminarPrograma(pubs){
console.log(pubs);
console.log("finaliza la ejecucion");
}

console.log("inicia la ejecucion");
consultarPublicaciones(terminarPrograma);
