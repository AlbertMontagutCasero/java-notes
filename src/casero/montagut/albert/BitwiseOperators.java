package casero.montagut.albert;

import java.util.ArrayList;
import java.util.List;

// 00000000 = 0
// 00000001 = 1
// 00000010 = 2
// 00000011 = 3
// 00000100 = 4
// 00000101 = 5
// 00000110 = 6

// 00000001 = 1
// 00000010 = 2
// 00000100 = 4
// 00001000 = 8
// 00010000 = 16
// 00100000 = 32
// 01000000 = 64
// 10000000 = 128

// Desplazar Bits
// Izquierda <<
// Derecha >>
// Al desplazar se pierden bits y se rellenan con 0

// Operadores
//	<<
//	>>
//	& = And Binario
//	^
//	~ = negacion

public class BitwiseOperators {
	public int a = 0x10 ; // 1 -> Mascara standard

	public static void main(String[] args) {
		BitwiseOperators bitwiseOperator = new BitwiseOperators();
		System.out.println(bitwiseOperator.a);

		//Recorrer todos los bits viendo el valor
		for (int i = 0; i < 8 ; i++ ) {
			System.out.println(bitwiseOperator.a << i);
		}

		// Comprobar los bits que seran 1 segun un resultado.
		// por ejempo:
		// resultado = 3
		// los bits que seran 1 seran = 00000011 = 3
		//		true
		//		true
		//		false
		//		false
		//		false
		//		false
		//		false
		//		false
		List<Integer> binary =  new ArrayList<>();
		int a = 3;
		for (int i = 0; i < 8; i++) {
			System.out.println(( a & (0x01 << i )) != 0);
			if (( a & (0x01 << i)) != 0) {
				// el bit es igual a 1
			}
		}
		System.out.println();
		a= 10; // 1010
		int b = 3; // 0011
		int c = a & b; // 0010 -> 2
		System.out.println(bitwiseOperator.getBinary(c).toString());
		
		// 0110101101001100
		// 0010000011111000
		// 0010000001001000
	}

	public List<Integer> getBinary(int number) {
		List<Integer> binary =  new ArrayList<>();
		for (int i = 31; i >= 0; i--) {
			if (( number & (0x01 << i)) != 0) {
				binary.add(1);
			}else {
				binary.add(0);
			}
		}
		return binary;
	}
}
