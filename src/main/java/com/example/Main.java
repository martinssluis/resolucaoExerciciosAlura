import com.example.entity.Livro;

void main (){

    Scanner sc = new Scanner(System.in);

    IO.print("Informe o nome do Livro: ");
    String tituloLivro = sc.nextLine();
    IO.print("Informe o autor do Livro: ");
    String autorLivro = sc.nextLine();
    IO.print("Informe a quantidade de produto páginas: ");
    int quantidadeDePaginas = sc.nextInt();
    Livro livro = new Livro(tituloLivro, autorLivro, quantidadeDePaginas);
    livro.resumoDoLivro();
}