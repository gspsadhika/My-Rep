var promise= new Promise(function(resolve, reject)
{
    setTimeout(resolve, 6000)
})
promise.then(function()
{
    console.log("this is done")

})
promise.then(function()
{
    console.log("this also done")
})
promise.then(function()
{
    console.log("EXIT")
})