var h=require("http");
var u=require("url");
var fs=require("fs");
var server=h.createServer(function(req,res){
    fs.readFile('log.txt',function(err,data) {
        if(req.url=='/favicon.ico')
         return;
        if(!err)
        {    
         r=parseInt(data);
                 r++;
           
                 fs.writeFile('log.txt',""+r,function(err1)
                 { 
                  if(!err1)
                  console.log("writing success")
                 });
         res.writeHead(200,{'content-type':'text/html'});
          res.write("<h1>count is"+r + "</h1>");	
         res.end();		
        }
        });
 });
 server.listen(9000,function() {console.log("SERVER STARTED")})