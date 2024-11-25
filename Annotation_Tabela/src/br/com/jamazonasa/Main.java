package br.com.jamazonasa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Cliente.class;

        if(clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);

            System.out.println("Nome da Tabela: " + tabela.valor());
        } else {
            System.out.println("A classe" + clazz.getSimpleName() + "não se encontra na annotation @Tabela");
        }

    }
}