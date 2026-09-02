import com.example.entity.Conta;

void main (){

    Scanner sc = new Scanner(System.in);

    IO.print("Informe o saldo da conta: ");
    double saldo = sc.nextDouble();
    Conta minhaConta = new Conta(saldo);
    minhaConta.exibirSaldo();
    minhaConta.zerarSaldo();
    minhaConta.exibirSaldo();
}