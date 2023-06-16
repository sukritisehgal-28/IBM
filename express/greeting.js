var express = require('');
var router = express.router();


router.get('/',function(red,res){
    res.send("bonjour");
});

router.get('/hola',function(req,res){
    res.send("hola");
})

module.exports= router;