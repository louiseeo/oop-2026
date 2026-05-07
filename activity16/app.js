const outputBox = document.getElementById("output");

let operands = [];
let currentOperand = "";
let operator = null;

const numClick = (num) => {
    if (currentOperand === "")
        outputBox.textContent = "";

    outputBox.textContent += num;
    currentOperand = outputBox.textContent;
}

document.getElementById("btn1").addEventListener("click", () => { numClick(1) })
document.getElementById("btn2").addEventListener("click", () => { numClick(2) })
document.getElementById("btn3").addEventListener("click", () => { numClick(3) })
document.getElementById("btn4").addEventListener("click", () => { numClick(4) })
document.getElementById("btn5").addEventListener("click", () => { numClick(5) })
document.getElementById("btn6").addEventListener("click", () => { numClick(6) })
document.getElementById("btn7").addEventListener("click", () => { numClick(7) })
document.getElementById("btn8").addEventListener("click", () => { numClick(8) })
document.getElementById("btn9").addEventListener("click", () => { numClick(9) })
document.getElementById("btn0").addEventListener("click", () => { numClick(0) })

document.getElementById("btnplus").addEventListener("click", () => {
    if (currentOperand === "")
        return;

    operands.push(parseFloat(currentOperand));
    operator = "+";
    currentOperand = "";
})

document.getElementById("btnminus").addEventListener("click", () => {
    if (currentOperand === "")
        return;

    operands.push(parseFloat(currentOperand));
    operator = "-";
    currentOperand = "";
})

document.getElementById("btnequal").addEventListener("click", () => {

    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand));
        currentOperand = "";
    }

    let result = operands[0];

    if (operator === "+") {
        for (let i = 1; i < operands.length; i++) {
            result += operands[i];
        }
    }
    else if (operator === "-") {
        for (let i = 1; i < operands.length; i++) {
            result -= operands[i];
        }
    }

    outputBox.textContent = result;

    operands = [];
    operator = null;
});

document.getElementById("btnc").addEventListener("click", () => {
    operands = [];
    currentOperand = "";
    operator = null;
    outputBox.textContent = "0";
});