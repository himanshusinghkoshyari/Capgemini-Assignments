function square(a){
   return (a*a);
}
function double(a){
    return(a*2);
}

function composedValue(){
      return(square(double(5)));
}

document.getElementById("composed").innerHTML=composedValue();
/*function square(x) { return(x*x); }
function double(x) { return(x*2); }
composedValue(square, double, 5); --> 100 // I.e., square(double(5)) */