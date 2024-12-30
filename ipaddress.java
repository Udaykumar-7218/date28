
public class ipaddress {

	public static void main(String[] args) {
		String input = "172.16.254.1.-1";
		input= input.replace('.',' ');
		String [] data = input.split("");
		//172 16 254 1
		int num=0;
		boolean isvalid=false;
		if (data.length !=4) isvalid=true;
		else {
			for (int i=0;i<data.length ;i++) {
				//system.out.print(data[i]+" ");
				 num= Integer.parseInt(data[i]);
				 if((num<0) ||(num>255)) {
					 isvalid=false;
					 break;
				 }//if
				 
				 }// for
			}
		if (isvalid= true) {
			System.out.println("valid ipv4 address");
		}else {
				System.out.println("not a valid ipv4 address");
		}

	}

}
