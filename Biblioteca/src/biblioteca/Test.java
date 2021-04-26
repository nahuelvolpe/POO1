package biblioteca;

public class Test {

	public static void main(String[] args) {
		Volumen l1 = new Libro("Harry Potter",1);
		Volumen l2 = new Libro("Hunger Games",2);
		Volumen l3 = new Libro("Maze Runner",1);
		Volumen l4 = new Libro("Maze Runner 2",2);
		Volumen r1 = new Revista("Users",103);
		Volumen r2 = new Revista("Playboy",130);
		Volumen r3 = new Revista("TKM",430);
		Volumen r4 = new Revista("Hola", 100);
		
		Biblioteca b1 = new Biblioteca(5,5);

		b1.incluir(l1);
		b1.incluir(l2);
		b1.incluir(l3);
		b1.incluir(l4);
		b1.incluir(r1);
		b1.incluir(r2);
		b1.incluir(r3);
		b1.mostrarBiblioteca();
		
	}

}
