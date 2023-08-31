var mymod=require('./assign2.js')

if(mymod.isPrime(5))
{
    console.log("no is prime no");
}
else
console.log("no is  not prime");

if(mymod.isPerfect(6))
{
    console.log("no is perfect no");
}
else
console.log("no is not perfect");

console.log("factorial of num= "+mymod.calFact(5));


