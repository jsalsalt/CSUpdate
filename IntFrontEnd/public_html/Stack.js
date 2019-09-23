/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var JStack = function () {
    this.struct = [];
    this.size = 0;
    this.top = undefined;
};

JStack.prototype.push = function (val) {
    ++this.size;
    this.struct.push(val);
    this.top = val;
};

JStack.prototype.pop = function () {
    if (this.size === 0) {
        throw error("Stack is empty");
    }
    --this.size;
    let ret = this.struct.pop();
    this.top = this.struct[this.struct.length - 1];
    return ret;
};


let tmp = new JStack();
tmp.push(1);
tmp.push(2);
