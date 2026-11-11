import Estudiante from "./estudiante.mjs";

let estudiante= new Estudiante();
estudiante.nombre="kevin";
estudiante.carrera="ISW";

console.log(estudiante);
console.log(estudiante.saludar());
console.log(estudiante.verPromedio);