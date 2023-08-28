exports.isPrime=function(num){
    if(num<=1)
    return false;
    for(i=2;i<=num/2;i++)
    {
       if(num%i==0)
       {
         return false;
       }
    }
   return true;
}


exports.calFact=function(num){
     fact=1;
     while(num>0)
     {
       fact=fact*num;
       num--;
     }
    return fact;
}


exports.isPerfect=function(num){
    sum=0;
    for(i=1;i<=num/2;i++)
    {
         if(num%i==0)
          {
              sum+=i;
          }
    }
    if(sum==num)
    {
      return true;
    }
    else
    return false;
}

