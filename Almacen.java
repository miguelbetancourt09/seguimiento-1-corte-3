class Almacen<T> {
    private final T[] productos;
    private final int capacidad = 3;
    private int contador = 0;

    @SuppressWarnings("unchecked")
    public Almacen() {
        productos = (T[]) new Object[capacidad];
    }

    public void agregar(T item) {
        if (estaLleno()) {
            System.out.println("El almacén está lleno.");
        } else {
            productos[contador++] = item;
        }
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= contador) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return productos[indice];
    }

    public boolean estaLleno() {
        return contador == capacidad;
    }

    public int tamanoActual() {
        return contador;
    }

    public static void main(String[] args) {
        Almacen<String> almacenStrings = new Almacen<>();
        almacenStrings.agregar("Laptop");
        almacenStrings.agregar("Teléfono");
        almacenStrings.agregar("Tablet");
        System.out.println("Almacén de Strings lleno: " + almacenStrings.estaLleno());
        System.out.println("Elemento en índice 1: " + almacenStrings.obtener(1));

        Almacen<Integer> almacenNumeros = new Almacen<>();
        almacenNumeros.agregar(10);
        almacenNumeros.agregar(20);
        System.out.println("Tamaño actual: " + almacenNumeros.tamanoActual());
    }
}
