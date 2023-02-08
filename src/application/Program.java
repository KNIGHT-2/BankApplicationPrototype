package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bank.Account;

public class Program {
    public static void main(String[] args) {

        boolean firstLoop = true;
        Scanner scan;
        List<Account> accounts = new ArrayList<>();
        //ArrayList<Account> accounts = new ArrayList<>();

        while(firstLoop) {
            System.out.println("C - Criar uma nova conta."
                    + "\nO - Operar uma conta.");
            scan = new Scanner(System.in);
            String menuOption = scan.next();

            if(menuOption.equals("c")||menuOption.equals("C")) {

                scan = new Scanner(System.in);
                Account currentAccount = new Account();

                System.out.println("Digite o número da conta: ");
                currentAccount.setAccountNumber(scan.nextInt());
                scan.nextLine();

                System.out.println("Digite o seu primeiro nome: ");
                currentAccount.setFirstName(scan.nextLine());
                System.out.println("Digite o seu sobrenome: ");
                currentAccount.setLastName(scan.nextLine());

                System.out.println("Digite o valor que deseja depositar para abrir a conta: ");
                currentAccount.depositMoney(scan.nextDouble());

                accounts.add(currentAccount);
            }else if(menuOption.equals("o")||menuOption.equals("O")) {

                boolean loopGetAccountNumber = true;
                int indexCurrentAccount = -1;

                while(loopGetAccountNumber) {
                    System.out.println("Digite o número da conta que deseja operar: ");
                    int numberAccountOperation = scan.nextInt();
                    scan.nextLine();
                    for(int i = 0; i < accounts.size(); i++) {
                        if(accounts.get(i).getAccountNumber() == numberAccountOperation);
                        indexCurrentAccount = i;
                    }
                    break;
                }

                boolean loopOperationAccount = true;

                while(loopOperationAccount) {
                    System.out.println("D - Depositar dinheiro. \nS - Sacar dinheiro. \nL - Sair");
                    String menuOperationAccount = scan.nextLine();
                    if(menuOperationAccount.equals("D")||menuOperationAccount.equals("d")) {

                        System.out.println("Digite o valor para depositar: ");
                        accounts.get(indexCurrentAccount).depositMoney(scan.nextDouble());
                        scan.nextLine();
                        System.out.println("Valor na conta: " + accounts.get(indexCurrentAccount).getBalance());

                    }else if(menuOperationAccount.equals("S")||menuOperationAccount.equals("s")) {

                        System.out.println("Digite o valor para sacar: ");
                        accounts.get(indexCurrentAccount).withdrawMoney(scan.nextDouble());
                        scan.nextLine();
                        System.out.println("Valor na conta: " + accounts.get(indexCurrentAccount).getBalance());

                    }else if(menuOperationAccount.equals("L")||menuOperationAccount.equals("l")){
                        break;
                    }
                }
            }
            for(Account acc : accounts) {
            	System.out.println(acc.toString());
            }
        }
    }
}