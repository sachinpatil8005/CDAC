var h=require("http");
var u=require("url");
var f=require("fs");
var server=h.createServer(function(req,res){
    var u1=u.parse(req.url,true)
    var path=u1.pathname;
    var fname=path.substring(1);
    f.readFile(fname,function(err,data){
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