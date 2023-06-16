var express = require('express');
var app = express();

app.get('/hi/:name',function(req,res){
    res.send("hello ,"+req.params.name);

});

app.post('/hello',function(req,res){
    res.send("hello from post request");
});

app.all("\hey",function(req,res){
    res.send("hey,any http will do");
})

console.log("express server started @9999");
app.listen(999);
