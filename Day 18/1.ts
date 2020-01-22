function add(p:string, q:string):string;     
function add(x:number, y:number):number;
function add(num1: any, num2: any):any
{
    return num1+num2;
}
var concat= add("Typescript", "Function overloading");
console.log(concat);

var sum= add(100,150);
console.log(sum);
