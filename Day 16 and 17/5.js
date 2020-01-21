 var str= "This is a string created today"
 console.log("str.constructor is: " +str.constructor)
 var name="Sri Pallavi Sadhika Gorti"
 console.log(name)
 console.log("The length of my name is: "+name.length)
 console.log("Character at index 2 is : "+name.charAt(2))
 var str1 = new String("Bright Sunny day")
 var index= str1.localeCompare("bright Sunny day")
 console.log("local compare " +index)

 function student(rollno, course) 
 { 
    this.rollno = rollno; 
    this.course = course; 
 } 
 var stu = new student(002, "Mechanical"); 
 student.prototype.email = "ashwin@cts.com"; 
 
 console.log("Student's roll no: " +stu.rollno)
 console.log("Student's course: " +stu.course)
 console.log("Student's email: " +stu.email)
 
 var num= new Number(10)
 console.log(num.toString(8))
 console.log(num.toString(2))

var x = 10; 
var y = 30; 
console.log(`The product of ${a} and ${b} is  ${a*b} `);


