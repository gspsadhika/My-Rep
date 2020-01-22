"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(7, 'Dhoni', new Date());
console.log("Date of Birth: " + employee.dob);
