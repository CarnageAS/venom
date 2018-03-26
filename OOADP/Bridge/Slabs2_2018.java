
public class Slabs2_2018 {
	static float returnSlab(String item) {
		if(item.equals("cycle"))
			return 0.3f;
		else if(item.equals("racket"))
			return 0.4f;
		else if(item.equals("tread mill"))
			return .6f;
		else return 0.2f;
	}
}
