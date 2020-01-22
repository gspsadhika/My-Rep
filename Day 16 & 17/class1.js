class Hello
{
    constructor(fname, lname, age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    full_name()
    {
        return this.fn + ' ' +this.ln;
    }
}
let she = new Hello('Sadhika', 'Gorti', 21)
console.log("full name: " +she.full_name())