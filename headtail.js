/*var heads = 0;
var tails = 0;
function headtail() {  
   for (var i=1;i<=10;i++){
    x = (Math.floor(Math.random() * 2) == 0);
    if(x){
    	return("heads");
    }else{
        return("tails");
    }
}
};
    document.getElementById("result").innerHTML = headtail();*/
    function coinFlip() {
        return (Math.floor(Math.random() * 2) == 0) ? 'heads' : 'tails';
    };
    var count=0
    for(var i=1;i<=10;i++){
        coinFlip()
        if(coinFlip()=="heads"){
             count =count+1
        }
        document.getElementById("count").innerHTML=count;
    }
    document.getElementById("result").innerHTML=coinFlip();