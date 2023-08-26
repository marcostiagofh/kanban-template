package com.devribeiro;

import java.util.ArrayList;
import java.util.List;

import com.devribeiro.enums.Status;
import com.devribeiro.models.Task;

public class Kanban {

    List<Task> tasks;

    public Kanban(){
        this.tasks = new ArrayList<>();
    }

    public void createTask(String name) {
        Integer id = tasks.size() + 1;
        Task register = new Task(id, name, Status.PARA_FAZER);
        this.tasks.add(register);
    }

    public void listAllTasks(){
        for(Task task : this.tasks){
            System.out.println("====================================");
            System.out.println(task.getId());
            System.out.println(task.getName());
            System.out.println(task.getStatus());
            System.out.println("====================================");
        }
    }

    public void getTaskById(Integer id){
        boolean not_found = true;
        for(Task task : this.tasks)
            if(task.getId() == id){
                not_found = false;
                System.out.println("====================================");
                System.out.println(task.getId());
                System.out.println(task.getName());
                System.out.println(task.getStatus());
                System.out.println("====================================");
            }
        if(not_found)
            System.out.println("Não há tarefas cadastradas com o id "+id);
    }

    public void getTasksByStatus(Status status){
        boolean not_found = true;
        for(Task task : this.tasks)
            if(task.getStatus() == status){
                not_found = false;
                System.out.println("====================================");
                System.out.println(task.getId());
                System.out.println(task.getName());
                System.out.println(task.getStatus());
                System.out.println("====================================");
            }
        if(not_found)
            System.out.println("Não há tarefas cadastradas com o status "+status);
    }
    public void updateTaskStatus(Integer id, Status newStatus){
        boolean not_found = true;
        for(Task task : this.tasks)
            if(task.getId() == id){
                not_found = false;
                task.setStatus(newStatus);
            }
        if(not_found)
            System.out.println("Não há tarefas cadastradas com o id "+id);
    }
    public void removeTask(Integer id){
        boolean not_found = true;
        int index = 0;
        for(Task task : this.tasks){
            if(task.getId() == id){
                not_found = false;
                this.tasks.remove(index);
                break;
            }
            index++;
        }
        if(not_found)
            System.out.println("Não há tarefas cadastradas com o id "+id);
    }
}
