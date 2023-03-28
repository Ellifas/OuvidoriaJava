import entities.Complaint;
import entities.Praise;
import entities.User;
import services.ComplaintService;
import services.PraiseService;
import services.UserService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        PraiseService praiseService = new PraiseService();
        ComplaintService complaintService = new ComplaintService();

        int opt = 0;
        Long userId = 1L;
        Long praiseId = 1L;
        Long complaintId = 1L;
        boolean isLoggedIn = false;
        User loggedInUser = new User();

        while (opt != 2) {

            System.out.println("1- Login" +
                    "\n2- Sair");

            System.out.print("Opção: ");
            opt = Integer.parseInt(sc.nextLine());

            if (opt == 1)
                while (!isLoggedIn) {
                    System.out.println("""
                            1- Criar usuário
                             2- Login
                             3- Sair""");

                    System.out.print("Opção: ");
                    opt = Integer.parseInt(sc.nextLine());
                    try {
                        {
                            if (opt == 1) {
                                System.out.println("Criar usuário");
                                System.out.print("First name: ");
                                String firstName = sc.nextLine();
                                System.out.print("Last name: ");
                                String lastName = sc.nextLine();
                                System.out.print("Cpf: ");
                                String cpf = sc.nextLine();
                                System.out.print("Birth date: ");
                                String birthDate = sc.nextLine();
                                System.out.print("Password: ");
                                String password = sc.nextLine();

                                userService.addUser(new User(userId, firstName, lastName, cpf, birthDate, password));
                                userId++;
                            } else if (opt == 2) {
                                System.out.println("Login:");
                                System.out.print("Cpf: ");
                                String cpf = sc.nextLine();
                                System.out.print("Password: ");
                                String password = sc.nextLine();
                                if (userService.validateLogin(cpf, password) != null) {
                                    loggedInUser = userService.validateLogin(cpf, password);
                                    isLoggedIn = true;
                                }
                                System.out.println(isLoggedIn);
                            } else if (opt == 3) {
                                break;
                            }
                        }
                        try {
                            if (isLoggedIn) {
                                while (opt != 7) {
                                    System.out.println("""
                                            1- Criar elogio
                                            2- Criar Reclamação
                                            3- Listar Elogios
                                            4- Listar Reclamações
                                            5- Excluir Elogio
                                            6- Excluir Reclamação
                                            7- Sair""");

                                    System.out.print("Opção: ");
                                    opt = Integer.parseInt(sc.nextLine());

                                    if (opt == 1) {
                                        System.out.println("Criar elogio");
                                        System.out.print("Titulo: ");
                                        String title = sc.nextLine();
                                        System.out.print("Descricao: ");
                                        String description = sc.nextLine();
                                        praiseService.addPraise(new Praise(loggedInUser.getId(), praiseId, title, description));
                                        praiseId++;

                                    } else if (opt == 2) {
                                        System.out.println("Criar Reclamação");
                                        System.out.print("Titulo: ");
                                        String title = sc.nextLine();
                                        System.out.print("Descricao: ");
                                        String description = sc.nextLine();
                                        complaintService.addComplaint(new Complaint(loggedInUser.getId(), complaintId, title, description));
                                        complaintId++;
                                    } else if (opt == 3) {
                                        System.out.println("Listar Elogios");
                                        System.out.println(praiseService.getAllPraisesByUserId(loggedInUser.getId()));

                                    } else if (opt == 4) {
                                        System.out.println("Listar Reclamações");
                                        System.out.println(complaintService.getAllComplaintsByUserId(loggedInUser.getId()));

                                    } else if (opt == 5) {
                                        System.out.println("Excluir Elogio");
                                        System.out.println(praiseService.getAllPraisesByUserId(loggedInUser.getId()));
                                        System.out.print("Id do elogio: ");
                                        Long id = Long.parseLong(sc.nextLine());
                                        praiseService.deletePraiseById(id);
                                    } else if (opt == 6) {
                                        System.out.println("Excluir Reclamação");
                                        System.out.println(complaintService.getAllComplaintsByUserId(loggedInUser.getId()));
                                        System.out.print("Id da reclamcao: ");
                                        Long id = Long.parseLong(sc.nextLine());
                                        complaintService.deleteComplaintById(id);
                                    } else if (opt == 7) {
                                        System.out.println("Sair");
                                    }
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Ocorreu um erro:" + e.getMessage());
                        }
                        if (opt == 2) {
                            System.exit(0);
                        }
                    }catch (Exception e){
                        System.out.println("Ocorreu um erro:"+ e.getMessage());
                }
 }       }
    }
}