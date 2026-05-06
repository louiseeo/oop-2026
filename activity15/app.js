const ouputBox = document.getElementById("output")

let operands = [];
let currentOperand = "";

/*
    function numClick(num){
    
    }
*/
const numClick = (num) => {
    if (currentOperand === "")
        ouputBox.textContent = "";

    ouputBox.textContent += num
    currentOperand = ouputBox.textContent
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
document.getElementById("btndec").addEventListener("click", () => { numClick(".") })
document.getElementById("btnplus").addEventListener("click", () => {
    if (currentOperand === "")
        return;

    operands.push(parseFloat(currentOperand))
    console.log(operands)
    currentOperand = ""; //clear current operand
})

document.getElementById("btnequal").addEventListener("click", () => {
    if (currentOperand !== "") {
        operands.push(parseFloat(currentOperand))
        currentOperand = "";
    }



    let sum = 0;
    for (let o of operands) {
        sum += o;
    }

    ouputBox.textContent = sum;
    operands = [];

});