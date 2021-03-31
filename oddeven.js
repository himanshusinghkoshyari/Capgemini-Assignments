function oddeven(data){
var data=20;
  if(data%2==0){
      return("even")
  }
  else{
      return("odd")
  }
}
//document.write(oddeven());
document.getElementById("demo").innerHTML=oddeven();