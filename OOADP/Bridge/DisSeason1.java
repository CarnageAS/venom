
public class DisSeason1 implements Discount {

	@Override
	public float slab(String item) {
		return Slabs1_2018.returnSlab(item);
		
	}

}
