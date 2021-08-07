var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
//Validation for first name
var text1=document.getElementById("fname").value;
	  var x1=/[a-z A-Z]/;
	
      if(x1.test(text1))
	  {
		  document.getElementById("id1").innerHTML="valid";
		  document.getElementById("id1").style.visibility="hidden";
		  document.getElementById("id1").style.color="green";
          var flag1=true;
	  }
	  else{
		  document.getElementById("id1").innerHTML="Enter this field";
		  document.getElementById("id1").style.visibility="visible";
		  document.getElementById("id1").style.color="red";
          var flag1=false;
	  }
      //Validation for last name
      var text2=document.getElementById("lname").value;
	  var x2=/[a-z A-Z]/;
	
      if(x2.test(text2))
	  {
		  document.getElementById("id2").innerHTML="valid";
		  document.getElementById("id2").style.visibility="hidden";
		  document.getElementById("id2").style.color="green";
          var flag2=true;
	  }
	  else{
		  document.getElementById("id2").innerHTML="Enter this field";
		  document.getElementById("id2").style.visibility="visible";
		  document.getElementById("id2").style.color="red";
          var flag2=false;
	  }
     //Validation for email
      var text3=document.getElementById("emailid").value;
	  var x3=/^([a-z A-Z 0-9 \. -]+)@([a-z A-Z 0-9 -]+).([a-z]{2,10})$/;
	
      if(x3.test(text3))
	  {
		  document.getElementById("id3").innerHTML="valid";
		  document.getElementById("id3").style.visibility="hidden";
		  document.getElementById("id3").style.color="green";
          var flag3=true;
	  }
	  else{
		  document.getElementById("id3").innerHTML="Must be abc@abc.com";
		  document.getElementById("id3").style.visibility="visible";
		  document.getElementById("id3").style.color="red";
          var flag3=false;
	  }
      //Validation for phone Number
      var text4=document.getElementById("phNo").value;
	  var x4=/^[7-9]\d{9}/;
	
      if(x4.test(text4))
	  {
		  document.getElementById("id4").innerHTML="valid";
		  document.getElementById("id4").style.visibility="hidden";
		  document.getElementById("id4").style.color="green";
          var flag4=true;
	  }
	  else{
		  document.getElementById("id4").innerHTML="Enter valid Phone Number";
		  document.getElementById("id4").style.visibility="visible";
		  document.getElementById("id4").style.color="red";
          var flag4=false;
	  }
      //Validation for password
	  var text5=document.getElementById("password").value;
	  var x5=/[a-z A-Z][0-9]/;
	  if(x5.test(text5))
	  {
		  document.getElementById("id5").innerHTML="valid";
		  document.getElementById("id5").style.visibility="hidden";
		  document.getElementById("id5").style.color="green";
          var flag5=true;
	  }
	  else{
		  document.getElementById("id5").innerHTML="Enter valid Password";
		  document.getElementById("id5").style.visibility="visible";
		  document.getElementById("id5").style.color="red";
          var flag5=false;
	  }
      if(flag1==true && flag2==true && flag3==true && flag4==true && flag5==true){
        window.location = "C:/Users/MONIKA/Desktop/PTS/HomePage.html";
      }
      else{
       
        alert("Fill All Detail");
        
        }
      }

