 import * as state from "./state.js";
 import * as ui from "./ui.js";

 document.addEventListener('DOMContentLoaded', async ()=>{
    const input= document.querySelector('input');
    const addBtn= document.querySelector('.btn-add');
 })



 addBtn.addEventListener('click', async=>(){
 if(input.value.trim()==='') return;

 await state.addTask(input.value);

 input.value='';

 })


 input.addEventListener("keydown", (e)=> {
    if(e.key==='Enter') addTask();
 })
