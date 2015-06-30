package GitHubFirst;

public class f2 extends Floor{
	public f2(){
		floorname="2nd";
	}

	@Override
	public void switchState(Context c) {
		// TODO Auto-generated method stub
		f3 cc= new f3();
		c.setFloor(cc);
		System.out.println("This is : "+ cc.floorname +" Floor");
	}
}