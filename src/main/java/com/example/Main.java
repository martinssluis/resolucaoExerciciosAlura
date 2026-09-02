import com.example.services.Produto;

void main (){

    Scanner sc = new Scanner(System.in);

    IO.print("Informe o nome do produto: ");
    String nomeProduto = sc.nextLine();
    IO.print("Informe o preço do produto: ");
    double precoProduto = sc.nextDouble();
    IO.print("Informe a quantidade do produto no estoque: ");
    int quantidadeDeProdutos = sc.nextInt();
    Produto mouse = new Produto(nomeProduto,precoProduto, quantidadeDeProdutos);
    mouse.exibirRelatorio();
}