/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserver;

/**
 *
 * @author Ricky
 */

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class WebServer {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        WSConsumer webService = new WSConsumer();
        int scelta = -1;
        String nomeImpegno = "", descrizione = "", tipo = "", data = "", ora = "", id = "", voce="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("BENVENUTO NELLA GESTIONE DI CIRCOLARI E NOTIZIE");
        System.out.println("1 - Effettua il login");
        System.out.println("2 - Effettua la registrazione");
        scelta = scanner.nextInt();
        //switch (scelta) {
            //case 1: {
                //System.out.println("Username o email:");
               // String username_email = input.next();
//                System.out.println("password:");
//                String password = input.next();
//                int result = webService.verificaUtente(username_email, password);
//                webService.printResult();
//                System.out.println("RISULTATO: " + result);
               // if (result == 200) {
                    do {
                        System.out.println("1-Inserimento categorie delle circolari e notizie");
                        System.out.println("2-inserimento da parte di un utente autorizzato di una circolare o notizia ");
                        System.out.println("3-importazione di una circolare o notizia memorizzata in formato PDF/XML ");
                        System.out.println("4-visualizzazione elenco circolari o notizie ");
                        System.out.println("0- Esci");

                        scelta = scanner.nextInt();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        switch (scelta) {
                            case 1:{ //webService.getAllImpegno();
                        System.out.println("Inserimento categorie delle circolari e notizie");
                       // System.out.println("2- deleteImpegno");
                        //System.out.println("3- updateImpegno");
                        //System.out.println("4- getAllImpegno");
                        //System.out.println("0- Esci");
                        System.out.println("1- docenti");
                        System.out.println("2- ATA");
                        System.out.println("3- studenti");
                        System.out.println("4- genitori");
                        System.out.println("0- Esci");

                        scelta = scanner.nextInt();
                        /*System.out.println();
                        System.out.println();
                        System.out.println();*/
                        switch (scelta) {
                           
                            case 1:{
                               System.out.println("Scrivi il nome della tipologia");
                                 nomeImpegno = scanner.next();
                                 voce="DOCENTI";
                                 
                                System.out.println("Scrivi la descrizione della circolare");
                                descrizione = scanner.next();
//                               
                                if(nomeImpegno != null){
                                //webService.addImpegno(nomeImpegno, descrizione,voce);
                                //webService.printResult();
                                System.out.println(voce+"-"+nomeImpegno+ "-"+ descrizione);
                                }
                                else
                                        System.out.println("Nome già utilizzato");
                                break;
                               
                            }
                            case 2:{
                            System.out.println("Scrivi il nome della tipologia");
                                 nomeImpegno = scanner.nextLine();
                                 
                               voce="ATA";
                                System.out.println("Scrivi la descrizione della circolare");
                                descrizione = scanner.nextLine();
                                 if(nomeImpegno != null){
                                webService.addImpegno(nomeImpegno, descrizione, voce);
                                webService.printResult();
                                 
                                }else
                                        System.out.println("Nome già utilizzato");
                                 
                                break;}
                            case 3:{
                            System.out.println("Scrivi il nome della tipologia");
                                 nomeImpegno = scanner.nextLine();
                               voce="STUDENTI";
                               
                                System.out.println("Scrivi la descrizione della circolare");
                                descrizione = scanner.nextLine();
                                 if(nomeImpegno != null){
                                webService.addImpegno(nomeImpegno, descrizione,voce);
                                webService.printResult();
                                }
                                 else
                                        System.out.println("Nome già utilizzato");
                                break;}
                            case 4:{
                            System.out.println("Scrivi il nome della tipologia");
                                 nomeImpegno = scanner.nextLine();
                                
                               voce="GENITORI";
                                System.out.println("Scrivi la descrizione della circolare");
                                descrizione = scanner.nextLine();
                                 if(nomeImpegno != null){
                                webService.addImpegno(nomeImpegno, descrizione,voce);
                                webService.printResult();
                                }
                                 else
                                        System.out.println("Nome già utilizzato");
                                break;}
                        
                        }}
                                    case 2:{
										 
                                System.out.println("Scrivi il nome della circolare");
                                nomeImpegno = scanner.next();
                                
                                System.out.println("Scrivi la descrizione della circolare");
                                descrizione = scanner.next();
                                
                                System.out.println("Scrivi la data");
                                data = scanner.next();
                              
                                //webService.inserisciCircolare(nomeImpegno, descrizione,data);
                                //webService.printResult();
                                System.out.print(nomeImpegno+descrizione+                                    data);
                                break;
                                        
                                    }
                                    case 3:{}
                                    case 4:{}
                                    
                        }
                        
                      
                                
                            
//                            

                        

                    } while (scelta != 0);
                //&&}
                //break;
            //}
            //case 2: {
                System.out.println("Inserisci l'username:");
                String username = scanner.next();
                System.out.println("Inserisci la password:");
                String password = scanner.next();
                System.out.println("Inserisci la tua email:");
                String email = scanner.next();
                System.out.println("Inserisci il tuo nome:");
                String nomeUtente = scanner.next();
                System.out.println("Inserisci il tuo cognome:");
                String cognomeUtente = scanner.next();
                System.out.println("Inserisci la tua classe:");
                String classe = scanner.next();
                webService.aggUtente(username, password, email, nomeUtente, cognomeUtente, classe);
                webService.printResult();
               // break;
           // }
        //}

    }

}

