package com.cts.project.bean;

public class User {
		private int id;
		private String email;
		private String password;
		private String confirmPassword;
		private long mobile;
		
		public User(int id, String email, String password, String confirmPassword, long mobile) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.confirmPassword = confirmPassword;
			this.mobile = mobile;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		

	}

}
