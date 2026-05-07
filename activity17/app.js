
class Task {
    constructor(title) {
        if (new.target === Task) {
            throw new Error("Abstract Class 'Task' cannot be instantiated directly")
        }
        this.title = title
        this.isCompleted = false
    }

    render() {
        throw new Error("Method 'render()' must be implemented by subclasses")
    }


    toggleStatus() {
        this.isCompleted = !this.isCompleted
    }
}


class PersonalTask extends Task {
    constructor(title) {
        super(title);
    }

    render() {
        const taskList = document.getElementById("task-list");
        const item = document.createElement("li");

        item.innerHTML = `
        <strong>${this.title}</strong> <br>
        <i>Done: ${this.isCompleted ? "Yes" : "No"} </i>
    `;

        const btn = document.createElement("button");
        btn.textContent = this.isCompleted ? "Undo" : "Done";

        btn.addEventListener("click", () => {
            this.toggleStatus();

            item.innerHTML = `
        <strong>${this.title}</strong> <br>
        <i>Done: ${this.isCompleted ? "Yes" : "No"} </i>
    `;

            btn.textContent = this.isCompleted ? "Undo" : "Done";

            item.appendChild(btn);
        });
        item.appendChild(btn);
        taskList.appendChild(item);
    }
}

function addTask() {
    const textField = document.getElementById("txt-title");
    let title = textField.value

    if (title.trim() === "")
        return;

    const newTask = new PersonalTask(title);
    newTask.render()
    textField.value = "";
}


document.getElementById("btn-add").addEventListener("click", addTask);
document.getElementById("txt-title").addEventListener("keydown", (event) => {
    if (event.key == "Enter")
        addTask()
});