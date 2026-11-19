const lista= document.getElementBy("taskList");

export const render (tasks) => {
    lista.innerHTML= '';
        tasks.forEach(t =>){
        const li= document.createElement('li');
        li.className= 'task-item' ${t.completed}
        }
}