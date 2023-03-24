package cifrado_cesar_grupo_3;

/**
 *
 * Grupo 3 Ciberseguridad 
 * Mabel Vargas 
 */
public class CifradoCesar {

    private String mayus;
    private String minus;

    public CifradoCesar(String mayus, String minus) {
        this.mayus = mayus;
        this.minus = minus;
    }

    public String cifrado(String texto, int desaplazar) {
        String salida = "";

        for (int i = 0; i < texto.length(); i++) {
            if ((this.mayus.indexOf(texto.charAt(i)) != -1) || (this.minus.indexOf(texto.charAt(i)) != -1)) {
                salida += (this.mayus.indexOf(texto.charAt(i)) != -1
                        ? this.mayus.charAt(((this.mayus.indexOf(texto.charAt(i))) + desaplazar) % this.mayus.length())
                        : this.minus
                                .charAt(((this.minus.indexOf(texto.charAt(i))) + desaplazar) % this.minus.length()));

            } else {
                salida += texto.charAt(i);
            }
        }

        return salida;
    }

    public String descifrado(String texto, int desaplazar) {
        String salida = "";

        for (int i = 0; i < texto.length(); i++) {
            if ((this.mayus.indexOf(texto.charAt(i)) != -1) || (this.minus.indexOf(texto.charAt(i)) != -1)) {
                if (this.mayus.indexOf(texto.charAt(i)) != -1) {
                    if (this.mayus.indexOf(texto.charAt(i)) < 0) {
                        salida += this.mayus
                                .charAt((this.mayus.length()) + ((this.mayus.indexOf(texto.charAt(i))) - desaplazar));
                    } else {
                        salida += this.mayus
                                .charAt(((this.mayus.indexOf(texto.charAt(i))) - desaplazar) % (this.mayus.length()));
                    }
                } else {
                    if ((this.minus.indexOf(texto.charAt(i)) - desaplazar) < 0) {
                        salida += this.minus
                                .charAt((this.minus.length()) + ((this.minus.indexOf(texto.charAt(i))) - desaplazar));
                    } else {
                        salida += this.minus
                                .charAt(((this.minus.indexOf(texto.charAt(i))) - desaplazar) % (this.minus.length()));
                    }
                }
            } else {
                salida += texto.charAt(i);
            }
        }

        return salida;
    }
}
