public class Main {
    public static void main(String[] args) {

        RedeSocial[] redesSociais = new RedeSocial[4];

        // entrada de dados de cada rede social

        Facebook facebook = new Facebook();
        facebook.numAmigos = 220;
        facebook.senha = "111";

        Twitter twitter = new Twitter();
        twitter.numAmigos = 4000;
        twitter.senha = "seven";

        GooglePlus googlePlus = new GooglePlus();
        googlePlus.numAmigos = 501309;
        googlePlus.senha = "4921030kffewi";

        Instagram instagram = new Instagram();
        googlePlus.numAmigos = 1;
        googlePlus.senha = "Pedro Vilas";

        // inclusão de duas redes socias ao vetor do usuario
        redesSociais[0] = facebook;
        redesSociais[1] = twitter;
        redesSociais[2] = googlePlus;
        redesSociais[3] = instagram;

        // Incluindo redes sociais nos usuarios

        Usuario usuario = new Usuario(redesSociais);

        usuario.setEmail("Jm@outlook.com");
        usuario.setNome("Pedro Vilas");

    }
}