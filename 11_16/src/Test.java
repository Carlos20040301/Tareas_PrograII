/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
public class Test {

	public static void main(String[] args) {
		try {
			throw new ExepcionB("Exepcion B");
		} catch (ExepcionA e) {
			e.printStackTrace();
		}

		try {
			throw new ExepcionC("Exepcion C");
		} catch (ExepcionA e) {
			e.printStackTrace();
		}
	}

}
