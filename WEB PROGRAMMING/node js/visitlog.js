 var h=require("http");
var u=require("url");
var f=require("fs");
var server=h.createServer(function(req,res){
    var u1=u.parse(req.url,true)
    var path=u1.pathname;
    var fname=path.substring(1);
    fs.readFile('logre.txt',function(err,data) {
        if(!err)
        {    
         date=new Date();
         str=data+" "+date+"\n";
           
                 fs.writeFile('logre.txt',""+str,function(err1)
                 { 
                  if(!err1)
                  console.log("writing success")
                 });	
        }
    });
        res.writeHead(200,{'context-type':'text/html'})
        if(!err)
        {
            res.write(data.toString());
        }
          else
          {
            res.write("resource not found")
          }
           res.end();
    })
      

}).listen(9000,function(){
    console.log("started");
});

 