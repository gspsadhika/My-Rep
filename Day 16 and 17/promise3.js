const myPromise = new Promise((resolve, reject) => {
    if(Math.random() * 100 >=50) {
        resolve('HELLO PROMISES');
    }
    reject(new Error('In 10% of the cases, I fail miserable'));
    });
const onResolved= (resolvedValue) => console.log(resolvedValue);
const onRejected= (error) => console.log(error);

myPromise.then(onResolved, onRejected);