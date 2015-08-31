import java.nio.*;

public class HelloJava {
	private static final int BSIZE = 1024;
	private static void symmetricScramble(CharBuffer buffer) {
		while(buffer.hasRemaining()) {
			buffer.mark();	//标记
			char c1 = buffer.get();
			char c2 = buffer.get();
			buffer.reset();//	回到标记的值
			buffer.put(c2).put(c1);
		}
	}
	public static void main(String[] args){
		char[] data = "UsingBuffers".toCharArray();
		ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
		CharBuffer cb = bb.asCharBuffer();
		cb.put(data);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
	}
}











