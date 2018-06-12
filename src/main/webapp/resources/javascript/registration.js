 function registration()
	{

		var name= document.getElementById("name").value;
		var password= document.getElementById("password").value;
		var phonenumber= document.getElementById("phonenumber").value;
		var address= document.getElementById("address").value;		
		var letterNumber = /^[0-9a-zA-Z]+$/;
		
		if(name=='')
		{
			document.getElementById("nameError").innerHTML="Enter Alphabet  only";
			return false;
		}
		
		else if(password=='')
		{
			document.getElementById("passError").innerHTML="Enter Password value only";
			/*alert('Please enter Password');*/
			return false;
		}
		else if(isNaN(phonenumber)||phonenumber=='')
		{
			/*alert('Please enter Phonenumber');*/
			 document.getElementById("phoneError").innerHTML="Enter Numeric value only";
			return false;
		}
		else if(phonenumber.length<8)
			{
			 document.getElementById("phoneError").innerHTML="Enter the length greater than 8";
				return false;
			}
		
		
		else if(address=='')
			{
			 document.getElementById("addressError").innerHTML="Enter letter only";
			return false;
			}
		else
		{				                            
             alert('Thank You for Login');
             return true;
			   
		}
		return true;
	}
