package pashogus.subraction;

public class SubractionImpl implements Subraction {

	@Override
	public int sub(int a, int b) {
	if(a>b)
	{
		return a-b;
	}
	else
	{
		return b-a;
	}

}
}
