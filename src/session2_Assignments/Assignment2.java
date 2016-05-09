package session2_Assignments;

public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int Num=0;
		int NoOfTimesDivided=0;
		
		for(int i=1;i<=100;i++){
			Num=i;
			NoOfTimesDivided=0;
			for(int k=Num;k>=1;k--){
				if(Num%k==0){
					NoOfTimesDivided++;
					if(NoOfTimesDivided>2){
						break;
					}
				}
			}
			if(NoOfTimesDivided==2){
				System.out.println(Num);
			}
			
		}
	
	}
}
