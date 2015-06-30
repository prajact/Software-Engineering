package GitHubFirst;

public class f1 extends Floor{
	public f1(){
		floorname="1st";
	}

	@Override
	public void switchState(Context c) {
		// TODO Auto-generated method stub
		f2 b= new f2();
		c.setFloor(b);
		System.out.println("This is : "+ b.floorname +" Floor");
	}
}