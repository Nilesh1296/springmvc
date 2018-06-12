function validate() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            if (username == null || username == "") {
             document.getElementById("unameError").innerHTML = "Please enter username";                
                return false;
            }
            else if (password == null || password == "") {
                document.getElementById("passError").innerHTML = "Please enter the password";
                return false;
            }
            
            return true;
        } 
