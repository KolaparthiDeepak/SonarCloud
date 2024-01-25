package com.zeta.cexception;
import com.zeta.cexception.*;
import com.zeta.helper.Help;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			byte a=100;
			byte b=50;
            byte c=add(a,b);
            Help.helpLogger(Sample.class).info(c);
        } catch (ZetaByteOverflowException e) {
        	Help.helpLogger(Sample.class).error(e);
        }
	}
	public static byte add(byte a,byte b) throws ZetaByteOverflowException 
	{
		int c=a+b;
        if(c>Byte.MAX_VALUE || c<Byte.MIN_VALUE) 
        {
            throw new ZetaByteOverflowException("Byte Overflow");
        }
        return (byte)c;
    }
}
