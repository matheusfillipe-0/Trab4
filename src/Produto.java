public class Produto {
        private String nome;
        private String id;
        private int quantidade;
        private Categoria categoria;


        public Produto(String nome, String id, int quantidade, Categoria categoria) {
            this.nome = nome;
            this.id = id;
            this.quantidade = quantidade;
            this.categoria = categoria;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }
    }



