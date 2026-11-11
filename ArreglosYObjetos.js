const numeros=[1,2,3,4,5];

const dobles=numeros.map((n)=>n *2 );

const elementoLista=numeros.map(n=> `<li> Numero: ${n} <\li>`)

console.log(elementoLista.join(""));


const usuario={
    nombre:"Kevin Mendoza",
    edad:26,
    hobbies:["muchas","cosas"],
    direccion:{
        calle:"mon",
        numero:"90",
        ciudad:"obregon"
    },
    saludar: function(){
        return `hola soy ${this.nombre} y tengo ${this.edad}`
    }

}

function puerta(x){
    if(x>=18&&x<=40){
        return;
    }

    if(x>=40){
        console.log("a dormir");
    }

    console.log("no puede pasar");
        
}

let dia=1;
switch(dia){
    case 1:
        console.log("Lunes");
        break;
    
    case 2:
        console.log("Martes");
        break;
    
    case 1:
        console.log("Miercoles");
        break;

    defualt:
        console.log("sepa");
        
}


// for in recorre las llaves de un objeto 

for(const llave in usuario){
    console.log(`${llave}=$(usuario[llave]}`)
}

// for of reccorre los elementos de un arreglo

for(const hobbie of usuario.hobbies){
    console.log(hobbie)
}


// for 

for(let i=0; i<usuario.hobbies.length;i++){
console.log(usuario.hobbies[i]);

}