
public class ascii {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		System.out.println("here");
		int i =0;
	/*	while (i < s.length()) {
		//	type type = (type) en.nextElement();
			int s1=s.charAt(i);
			System.out.println(s1);
		
			i++;
		}
		*/
		StringBuilder max=new StringBuilder(),min=new StringBuilder();
		int smax,smin;
		smax=0;
		
		String ssmaple= "HElloBoss";
		int g=3;
		int g1=g;
		char z='z';
		char a= 'a';
		while(g1>0){
			max.append(a);
			min.append(z);
			g1--;
		}
		String maxs=max.toString();
		String mins=min.toString();
	
		
		for (int j = 0; j < ssmaple.length(); j++) {
			
			if (j+g <= ssmaple.length()) {
				String gg=ssmaple.subSequence(j, j+g).toString();
			//	System.out.println(gg);
			if(maxs.compareTo(gg)<0){
				maxs = gg;
			}
			if(mins.compareTo(gg) > 0){
			mins = gg;
			//min = ssmaple.subSequence(j, j+g).toString();
			}
			}
			}
		
		System.out.println(mins);
		System.out.println(maxs);
		}
		
		
	}


