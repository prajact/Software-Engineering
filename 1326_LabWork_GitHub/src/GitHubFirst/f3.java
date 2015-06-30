package GitHubFirst;


public class f3 extends Floor{
	public f3(){
		floorname="3";
	}

	@Override
	public void switchState(Context c) {
		// TODO Auto-generated method stub
		f2 a= new f2();
		c.setFloor(a);
		System.out.println("State is in : "+ a.floorname +" State");
	}

}
