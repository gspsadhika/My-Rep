export class Employee{
id: number;
name: string;
dob: Date;
constructor(id:number, name:string, dob:Date)
{
    this.id=id;
    this.name=name;
    this.dob=dob;

}
}
let employee = new Employee(7, 'Dhoni', new Date())
console.log("Date of Birth: " +employee.dob);
