package Projetos.ContaBancaria;

@SuppressWarnings("All")
public class Person {

    private String Cpf, Name, Email, Tel;

    Person(String Cpf, String Name, String Email, String Tel){
        this.Cpf = Cpf;
        this.Name = Name;
        this.Email = Email;
        this.Tel = Tel;
    }

    public void apresentar() {
        System.out.println(
            Name + "\n" +
                "\tCpf = " + Cpf + '\n' +
                "\tEmail = " + Email + '\n'+
                "\tTel = " + Tel + '\n'
        );
    }
}
