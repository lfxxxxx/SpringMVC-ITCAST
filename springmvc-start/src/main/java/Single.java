/**
 * @author LFX
 * @create 2019-08-02 16:54
 */
public class Single {
	private static Single single;
	private Single(){};

	public static Single getInstance(){

		return single;
	}



}
