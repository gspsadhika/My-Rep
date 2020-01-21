function isBigEnough(element, index, array) { 
    return (element >= 10); 
 }  
 var passed = [12, 5, 8, 130, 44].every(isBigEnough); 
 console.log("Test Value : " + passed );

 

 var arr= new Array( "teju", "Meghna", "Srinija", "Hima")
 var length= arr.unshift("Sadhika")
 console.log("return array is : " +arr)
console.log("Length of the array is : " +length)

