package org.tnsif.acc.c2tc.sr_developer;

public class KIA_Internal {

	public static void main(String[] args) {
		// KIA_Airbags airbags=new KIA_Airbags();
		// airbags.disp_airbags();
		// KIA_Speedlimit speedlimit=new KIA_Speedlimit();
		// speedlimit.disp_Speedlimit();
		org.tnsif.acc.c2tc.jr_developer.KIA_Airbags airbag=new org.tnsif.acc.c2tc.jr_developer.KIA_Airbags();
		airbag.disp_airbags();
		org.tnsif.acc.c2tc.jr_developer.KIA_Speedlimit speedlimit=new org.tnsif.acc.c2tc.jr_developer.KIA_Speedlimit ();
		speedlimit.disp_Speedlimit();

	}

}
