package school.sptech;

public class Time {
    String nome;
    Integer vitorias;
    Integer empates;
    Integer derrotas ;

    public Time(){
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }


    public void registrarVitoria(){
        vitorias ++;
    }
    public void registrarEmpate(){
        empates ++;
    }

    public void registrarDerrota(){
        derrotas ++;
    }

    public Integer getPontos(){
        Integer pontos = (vitorias * 3) + (empates * 1);

        return pontos;
    }

    public Integer getTotalPartidas(){
        Integer totalPartidas;
        totalPartidas = vitorias + empates + derrotas;

        return totalPartidas;
    }

    public Integer getAproveitamento(){
        Integer qtdPartidas = getTotalPartidas();
        double aproveitamento = ((double) vitorias / qtdPartidas) * 100;
        return (int) Math.round(aproveitamento);
    }

    public void compararAproveitamento(Time adversario){

        Integer aproveitamento = this.getAproveitamento();

        Integer aproveitamentoAdversario = getAproveitamento();

        if(aproveitamento > aproveitamentoAdversario){
            System.out.println("Aproveitamento do time 1 é maior que o 2");
        }else{
            System.out.println("Aproveitamento do time 2 é maior que o 1");
        }
    }
    public void exibirInformacoes() {
        int pontos = this.getPontos();
        int totalPartidas = this.getTotalPartidas();
        int aproveitamento = this.getAproveitamento();

        System.out.println("Time: " + this.nome);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Pontos: " + pontos);
        System.out.println("Total de partidas: " + totalPartidas);
        System.out.println("Aproveitamento: " + aproveitamento + "%");
    }
public static void main(String[] args){

        Time t1 = new Time();
        t1.nome = "Flamengo";
        t1.registrarVitoria();
        t1.registrarVitoria();
        t1.registrarEmpate();

        t1.exibirInformacoes();

}

}

