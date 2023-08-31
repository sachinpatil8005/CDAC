var h=require("http");
var server=h.createServer(function(req,res)
{
    res.writeHead(200,{'context-type':'text/html'})
    res.write("<h1>welcome to web</h1>");
    res.end();
});

server.listen(9000,function(){
    console.log("server started at port 9000");
});