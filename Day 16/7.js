var arr= new Array(10)
for(let index=0; index<arr.length; index++)
{
    arr[index]=Math.floor(Math.random()*100)
}
let div1= arr.filter((x) => ((x%2==0) && (x%5==0)))
console.log("Numbers divisible by 2 and 5: " +div1)

let inc1= arr.map((x)=>parseInt(x*1.1))
console.log("Map value is : " +inc1)
