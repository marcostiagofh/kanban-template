package com.devribeiro;

import java.util.Scanner;

import com.devribeiro.enums.Status;

public class Console {

    private Kanban kanban;

    public Console (){
        this.kanban = new Kanban();
    }
    public void start(){
        while(true){
            System.out.println("MENU\n1 - Criar Task\n2 - Remover Task\n3 - Update Task\n4 - Consulta task por id\n5 - Consultar tasks por status\n6 - Listar todas as tasks\n\nOpção: ");
            Scanner input = new Scanner(System.in);
            int opcao = Integer.parseInt(input.nextLine());
            int id;
            String nome, status_str;
            Status status, newStatus;
            switch (opcao) {
                case 1:
                    System.out.println("Nome Tarefa");
                    nome = input.nextLine();
                    this.kanban.createTask(nome);
                    break;
            
                case 2:
                    System.out.println("Id da tarefa a ser removida");
                    id = Integer.parseInt(input.nextLine());
                    this.kanban.removeTask(id);
                    break;
            
                case 3:
                    System.out.println("Id da tarefa a ser atualizada");
                    id = Integer.parseInt(input.nextLine());
                    System.out.println("Novo status da tarefa");
                    status_str = input.nextLine();
                    newStatus = Status.valueOf(status_str);
                    this.kanban.updateTaskStatus(id, newStatus);
                    break;
            
                case 4:
                    System.out.println("Id da tarefa a ser consultada");
                    id = Integer.parseInt(input.nextLine());
                    this.kanban.getTaskById(id);
                    break;
            
                case 5:
                    System.out.println("Status da tarefa a ser consultada");
                    status_str = input.nextLine();
                    status = Status.valueOf(status_str);
                    this.kanban.getTasksByStatus(status);
                    break;
            
                case 6:
                    this.kanban.listAllTasks();
                    break;
            
                default:
                    System.out.println("Opcao invalida: "+opcao);
                    break;
            }

        }
    }
}
