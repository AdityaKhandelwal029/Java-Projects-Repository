package atm_plugin_project_employeedata;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Employeedata {
	String userAccountno;
	String userName;
    String userAddress;
	String userEmail;
	String userMobile;
	double userBalance=0;
	String userPin;
	

	public Employeedata(String accountno,String name,String address,String email,String mobile,double balance,String pin){

		this.userAccountno=accountno;
		this.userName=name;
		this.userAddress=address;
		this.userEmail=email;
		this.userMobile=mobile;
		this.userBalance=balance;
		this.userPin=pin;
}
	
	public String getAccountno() {
		return userAccountno;
	}
	public String getPin()
	{
		return userPin;
	}
	public double getBalance()
	{
		return this.userBalance;
	}
	public String getName()
	{
		return userName;
	}
	public String getAddress()
	{
		return userAddress;
	}
	public String getEmail()
	{
		return userEmail;
	}
	public String getMobile()
	{
		return userMobile;
	}
	public void setPin(String pin)
	{
		this.userPin=pin;
	}
	public void setBalance(double newbalance)
	{
		this.userBalance=newbalance;
	}
}
