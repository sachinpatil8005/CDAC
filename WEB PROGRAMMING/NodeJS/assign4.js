var h=require("http");
var u=require("url");
var server=h.createServer(function(req,res){
    var u1=u.parse(req.url,true)
    console.log(u1.pathname);
    console.log(u1.query.name);
    console.log(u1.query.c1);
    var name1=u1.query.name;
    var cl=u1.query.c1;
    res.writeHead(200,{'context-type':'text/html'})
     res.write("<h1>welcome to web</h1>");
     res.write("<h1 style=color:"+cl+">"+name1+"</h1>");
     res.end();

}).listen(9000,function(){
    console.log("started");
});