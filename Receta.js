function cortarIngredientes(ingredientes,callback){
    setTimeout(()=>{
        console.log(`cortando: ${ingredientes}`)
    }, 2500)
    
}

function cocinar(accion, callback){
 setTimeout(()=>{
        console.log(`cocinando: ${accion}`)
    }, 3500)
    
}

function servirPlato(plato){
console.log(`listo puedes disfrutar de ${plato}`)
}

function prepararReceta(plato, callback){
    console.log(`iniciamos la preparacion de ${plato}`);

    cortarIngredientes("vegetales",
        ()=>{
            cocinar("saltear",()=>{
                cortarIngredientes("Pollo",()=>{
                    cocinar("freir",()=>{
                        servirPlato(plato);
                        callback();
                    })
                })
            })
        }
    )

}

prepararReceta("Pollo al wok",()=>{ console.log("receta completa")})