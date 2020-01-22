var asynchronousFunction= function()
    {
        return new Promise(function(resolve,reject)
        {
            console.log("Keep every promise you make and make promises which you can keep");
            setTimeout(resolve,5000)
        })
    }
asynchronousFunction()
.then(asynchronousFunction)
.then(asynchronousFunction)