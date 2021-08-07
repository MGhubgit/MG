var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
/*var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "Formget" && password == "formget#123"){
alert ("Login successfully");
window.location = "C:/Users/MONIKA/Desktop/PTS/REgistration.html"; // Redirecting to other page.
return false;
}
else{
attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("username").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}*/
var text=document.getElementById("username").value;
	  var x=/[a-z]/;
	
      if(x.test(text))
	  {
		  document.getElementById("id1").innerHTML="valid";
		  document.getElementById("id1").style.visibility="hidden";
		  document.getElementById("id1").style.color="green";
          var flag1=true;
	  }
	  else{
		  document.getElementById("id1").innerHTML="Enter valid UserName";
		  document.getElementById("id1").style.visibility="visible";
		  document.getElementById("id1").style.color="red";
          var flag1=false;
	  }
	  var text1=document.getElementById("password").value;
	  var x=/[a-z A-Z][0-9]/;
	  if(x.test(text1))
	  {
		  document.getElementById("id2").innerHTML="valid";
		  document.getElementById("id2").style.visibility="hidden";
		  document.getElementById("id2").style.color="green";
          var flag2=true;
	  }
	  else{
		  document.getElementById("id2").innerHTML="Enter valid Password";
		  document.getElementById("id2").style.visibility="visible";
		  document.getElementById("id2").style.color="red";
          var flag2=false;
	  }
      if(flag1==true && flag2==true){
        window.location = "C:/Users/MONIKA/Desktop/PTS/REgistration.html";
      }
      else{
        attempt --;// Decrementing by one.
        alert("You have left "+attempt+" attempt;");
        // Disabling fields after 3 attempts.
        if( attempt == 0){
        document.getElementById("username").disabled = true;
        document.getElementById("password").disabled = true;
        document.getElementById("submit").disabled = true;
        return false;
        }
      }

}