package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombre;
        String apellido;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;
        Boolean tieneLicenciaElConductor;
        String tipoCompra;

        //PROCESO

        System.out.println("***************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("***************");


        System.out.println("Apreciado cliente, usted cuenta con licencia?");
        tieneLicenciaElConductor = leerDato.nextBoolean();
        //PRIMERA PREGUNTA O DECISION

        if (tieneLicenciaElConductor = true ){
            // SI TIENE LICENCIA

            System.out.print("Nombres del cliente: ");
            nombre=leerDato.nextLine();


            System.out.print("Apellidos del cliente: ");
            apellido=leerDato.nextLine();

            System.out.print("Tipo de documento: ");
            tipoDocumento=leerDato.nextLine();

            System.out.print("Numero de documento: ");
            documento=leerDato.nextLine();

            System.out.print("Telefono celular: ");
            telefonoMovil=leerDato.nextLine();

            System.out.print("Telefono fijo: ");
            telefonoFijo=leerDato.nextLine();

            System.out.print("Direccion del cliente: ");
            direccion=leerDato.nextLine();

            System.out.print("Documento fiador: ");
            documentoFiador=leerDato.nextLine();

            System.out.print("Nombre fiador: ");
            nombresFiador=leerDato.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR--- $9000000");
            System.out.println("2. Yamaha CRYPTON FI--- $8000000");
            System.out.println("3. Yamaha XTZ125---- $10500000");
            System.out.println("4. Yamaha MT10---- $72000000");
            System.out.println("5. Yamaha NMAX300----- $34000000");

            Integer motoSeleccionada;
            System.out.print("Digite la motocicleta deseada: ");
            motoSeleccionada=leerDato.nextInt();
            Double valorMoto=0.0;
            if (motoSeleccionada==1){
                valorMoto = 9000000.0;

            } else if (motoSeleccionada==2) {
                valorMoto = 8000000.0;

            } else if (motoSeleccionada==3) {
                valorMoto = 10500000.0;

            } else if (motoSeleccionada==4) {
                valorMoto = 72000000.0;

            } else if (motoSeleccionada==5) {
                valorMoto = 34000000.0;

            }else {
                System.out.println("Moto Invalida");
                System.out.println("Favor digitar un numero valido entre 1 y 5");

            }

            //2. PREGUNTA, LO QUIERE A CREDITO?
            System.out.println("Usuario digite credito o contado para continuar su compra");
            leerDato.nextLine();
            tipoCompra=leerDato.nextLine().toLowerCase();
            if (tipoCompra.equals("credito")){
                //Le pregunto por porcentaje a financiar
                System.out.println("Entraremos a financiarlo");
                Double porcentajeCredito;
                System.out.println("Ingresa el porcentaje a financiar");
                porcentajeCredito = leerDato.nextDouble();
                if (porcentajeCredito==1.0){

                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);



                } else if (porcentajeCredito==0.7) {

                    Double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);



                } else if (porcentajeCredito==0.5) {
                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);



                }else {
                    System.out.println("Opcion invalida");

                }

            }else {
                System.out.println("Excelente le daremos un descuento del 10%");
            }




        }else {
            // NO TIENE LICENCIA
            System.out.println("Apreciado usuario, no podemos continunar con la transacción");
            System.out.println("Lo invitamos a tramitar su licencia, vuelva pronto...");
        }















    }
}