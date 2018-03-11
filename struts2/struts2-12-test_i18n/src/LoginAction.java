import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
           private String username;
           private String password;
           private String tip;
           
           public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTip() {
			return tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}

		public String checkLogin(){
        	     
        	      String[] a={this.username};
        	      this.tip=getText("login.success",a);
        	      return "success";
           }
}
