
public class Temperaturas {

    public Temperaturas() {
    }

    public static void main(String[] args) {

        //fazendo uma lista de vetor
        String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

        //fazendo a lista de matrizes
        int [][] temperaturasCidades = {{-2,33},{-3,32}, {-8,27}, {4,37}, {6,46}, {5,43}, {0,39}, {-7,26}, {-1,31},{-10,35}};

        String cidadeTempMinima = cidades[0];
        String cidadeTempMaxima = cidades[0];
        int temperaturaMinima = temperaturasCidades[0][0];
        int temperaturaMaxima = temperaturasCidades[0][1];

        for (int i = 0; i < temperaturasCidades.length; i++) {

            if (temperaturaMinima > temperaturasCidades [i][0]){
                temperaturaMinima = temperaturasCidades[i][0];
                cidadeTempMinima = cidades[i];
            }
            if (temperaturaMaxima < temperaturasCidades [i][1]){
                temperaturaMaxima = temperaturasCidades [i][1];
                cidadeTempMaxima = cidades[i];
            }
        }

        System.out.println("Cidade com menor temperatura: " + cidadeTempMinima + " = " +temperaturaMinima+ " graus");
        System.out.println("Cidade com maior temperatura: " + cidadeTempMaxima + " = " +temperaturaMaxima+ " graus");




    }
}
