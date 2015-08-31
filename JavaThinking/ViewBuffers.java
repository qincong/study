import java.nio.*;

public class HelloJava {
	private static final int BSIZE = 1024;
	public static void main(String[] args){
		ByteBuffer bb = ByteBuffer.wrap(new byte[] {0,0,0,0,0,0,0,'a'});
		bb.rewind();
		System.out.print("Byte Buffer ");
		while(bb.hasRemaining())
			System.out.print(bb.position() + "->" + bb.get() + ",");
		System.out.println();
		CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
		System.out.print("Char Buffer ");
		while(cb.hasRemaining())
			System.out.print(cb.position() + "->" + cb.get() + ",");
		System.out.println();
		FloatBuffer fb = ((ByteBuffer)bb.rewind()).asFloatBuffer();
		System.out.print("Float Buffer ");
		while(fb.hasRemaining())
			System.out.print(fb.position() + "->" + fb.get() + ",");
	}
}











