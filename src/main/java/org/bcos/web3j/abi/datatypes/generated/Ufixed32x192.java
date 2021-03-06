package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed32x192 extends Ufixed {
    public static final Ufixed32x192 DEFAULT = new Ufixed32x192(BigInteger.ZERO);

    public Ufixed32x192(BigInteger value) {
        super(32, 192, value);
    }

    public Ufixed32x192(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(32, 192, m, n);
    }
}
