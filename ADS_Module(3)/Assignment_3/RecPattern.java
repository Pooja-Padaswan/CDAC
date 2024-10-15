

class RecPattern{

static void patt(int n){

	if(n==0)
	{
		return;
	}
	for(int i=1;i<=n;i++){
		for(int j=1; j<=i; j++){
			
	System.out.print("*");
	}
	System.out.println("");
	}

}
	public static void main(String args[]){
	
	patt(3);
}


}