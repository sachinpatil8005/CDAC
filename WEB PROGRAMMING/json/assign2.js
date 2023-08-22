var exp=require("express");
var mysql=require("mysql2");
var bp=require("body-parser");
var app=exp();

app.use(exp.static('resouces'));
app.use(bp.urlencoded({extended: false}));

var con=mysql.createConnection({
     host:"localhost",
     user:"root",
     password:"root",
     database:"pgdac"
})

con.connect(function(err){
    if(!err)
       console.log("connection is connect");
    else
      console.log("connection is failed");
})

app.get('/getform',function(req,res){
    res.sendFile(__dirname+"/assign2.html");
})

app.post('/getemp',function(req,res){
      var dno=req.body.deptno;
      console.log(dno);
     con.query("select * from emp10 where deptno="+dno,function(err,result){
        if(!err)
        {
            
        }
     })
})