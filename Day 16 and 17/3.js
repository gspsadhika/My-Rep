var res= new Function('x', 'y', 'return x*y')
function product()
{
    var pro;
    pro=res(4,5)
    console.log('The result is: ' +pro)
}
product()