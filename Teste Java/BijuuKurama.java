class BijuuKurama {
    
    private String habilidades; // só a classe BijuuKurama pode mexer  nisso

    public String getHabilidades() { // porta de acesso controlado
        return habilidades;
        
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public static class Naruto extends BijuuKurama {
        public void mostrarHabilidades() {
            // A classe Naruto pode acessar o atributo habilidades
            System.out.println("Habilidades de Kurama: " + getHabilidades());
        }

        public static void main(String[] args) {
            Naruto ninja = new Naruto();
            ninja.setHabilidades("Força imensa, regeneração rápida, chakra poderoso");
            ninja.mostrarHabilidades();
        }
    }

}
