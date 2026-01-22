//use case 6: e} Voting App :encapsulate user voting rights and identity
package ashwini.cm;

public class VotingApp {
	
		private String VotingRights;
		private String Identity;
		
		public void setVotingRights(String VotingRights) {
			this.VotingRights=VotingRights;
		}
		public void setIdentity(String Identity) {
			this.Identity=Identity;
		}
		
		public String getVotingRights() {
			return VotingRights;
		}
		public String getIdentity() {
			return Identity;
		}
		
	 
		public static void main(String[] args) {
			VotingApp v= new VotingApp();
			v.setVotingRights("Eligible");
			v.setIdentity("Ash");
			
			System.out.println("Voting Rights:" +v.getVotingRights());
			System.out.println("Identity:" +v.getIdentity());
	
		}
}
