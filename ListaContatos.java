public class ListaContatos {
    private Node cabeca;

    public void adicionarContato(Contato contato) {
        Node novoNode = new Node(contato);
        if (cabeca == null) {
            cabeca = novoNode;
        } else {
            Node temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNode;
        }
        System.out.println("Contato adicionado: " + contato);
    }

    public void buscarContato(String nomeOuTelefone) {
        Node temp = cabeca;
        while (temp != null) {
            if (temp.contato.getNome().equalsIgnoreCase(nomeOuTelefone) || temp.contato.getNumeroTelefone().equals(nomeOuTelefone)) {
                System.out.println("Contato encontrado: " + temp.contato);
                return;
            }
            temp = temp.proximo;
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerContato(String nomeOuTelefone) {
        if (cabeca == null) {
            System.out.println("Nenhum contato para remover.");
            return;
        }

        if (cabeca.contato.getNome().equalsIgnoreCase(nomeOuTelefone) || cabeca.contato.getNumeroTelefone().equals(nomeOuTelefone)) {
            System.out.println("Removendo contato: " + cabeca.contato);
            cabeca = cabeca.proximo;
            return;
        }

        Node atual = cabeca;
        while (atual.proximo != null && !atual.proximo.contato.getNome().equalsIgnoreCase(nomeOuTelefone)
                && !atual.proximo.contato.getNumeroTelefone().equals(nomeOuTelefone)) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            System.out.println("Removendo contato: " + atual.proximo.contato);
            atual.proximo = atual.proximo.proximo;
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarContatos() {
        if (cabeca == null) {
            System.out.println("Nenhum contato disponível.");
        } else {
            Node temp = cabeca;
            while (temp != null) {
                System.out.println(temp.contato);
                temp = temp.proximo;
            }
        }
    }
}
