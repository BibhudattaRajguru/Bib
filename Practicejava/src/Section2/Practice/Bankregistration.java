package Section2.Practice;

public class Bankregistration {
	
private   String name,address,gender,mailid;
 private  long mobileNum,aadharNum ;
public Bankregistration ( String name,String address,String gender,String mailid,long mobileNum,long aadharNum)	{
	 this.name = name;
	 this.address = address;
	 this.gender = gender;
	 this.mailid = mailid;
	 this.mobileNum = mobileNum;
	 this.aadharNum = aadharNum;

}
        public String getName() {
	     return name;
         }
	    public void setname (String name) {
		this.name = name;
	    }
		public String getaddress() {
			return address;
		}
		public void setaddress(String address) {
            this.address = address;	
		}
		public String getgender() {
			return gender;
		}
		public String getMailid() {
			return mailid;
		}
		public void setmailid(String mailid) {
			this.mailid =mailid;
		}
		public long getmobileNum() {
			return mobileNum;
		}
		public void setmobileNum (long mobileNum) {
			this.mobileNum =mobileNum;
		}
		public long getaadharNum() {
			return aadharNum;
		}
}

			
			
			
			
			
			
		
		
		
	

	
 
	
				