var express = require('express');
var app = express();

app.set("view engine","pug");

app.get("/",(req,res)=>res.render("person"));

app.post('/save',(req,res)=>{
    var params= req.body;
    res.render('personresp',{
        name: params.name,
        age:params.age,
        city:params.city
    });
});

app.listen(9000);