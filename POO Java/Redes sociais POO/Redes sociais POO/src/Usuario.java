public class Usuario {

    private String nome;
    private String email;

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(RedeSocial[] redeSociais) {

        for (int i = 0; i < redeSociais.length; i++) {

            if (redeSociais[i] != null) {

                if (redeSociais[i] instanceof Instagram) {

                    Instagram auxInsta = (Instagram) redeSociais[i];

                    auxInsta.postarComentario();
                    auxInsta.postarFoto();
                    auxInsta.postarVideo();

                }

                else if (redeSociais[i] instanceof Facebook) {

                    Facebook auxFace = (Facebook) redeSociais[i];

                    auxFace.curtirPublicacao();
                    auxFace.fazStreaming();
                    auxFace.compartilhar();

                }

                else if (redeSociais[i] instanceof GooglePlus) {

                    GooglePlus auxGoogle = (GooglePlus) redeSociais[i];

                    auxGoogle.curtirPublicacao();
                    auxGoogle.fazStreaming();
                    auxGoogle.compartilhar();

                }

                else {

                    Twitter auxTwitter = (Twitter) redeSociais[i];

                    auxTwitter.curtirPublicacao();
                    auxTwitter.postarVideo();
                    auxTwitter.compartilhar();

                }

            }

        }
    }

}
