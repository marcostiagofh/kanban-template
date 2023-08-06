# Sistema de Kanban

## Referência

Prova da FGV de Auditor de Controle de Externo - Tecnologia da Informação: Readaptação de questão discursiva.

## Questão

Desenvolva um módulo em Java de sistema de kanban. Você deve desenvolver pelo menos uma aplicação de console, mas se desejar pode desenvolver uma aplicação desktop ou uma aplicação web. As únicas restrições são que não pode haver consulta na web e que não se deve utilizar frameworks.

O tempo de prova é de 2h30min.

Segue uma abstração de como o sistema deve funcionar:

![](/.github/info.png "Créditos da imagem: FGV")

### Requisitos funcionais

- [ ] Deve ser possível cadastrar uma tarefa;
- [ ] Deve ser possível atualizar o status da tarefa;
- [ ] Deve ser possível listar as tarefas.

### Requisitos não funcionais

- [ ] Ao cadastrar uma tarefa, ela deve possuir o status "PENDENTE";
- [ ] Ao atualizar o status de uma tarefa, deve ser possível progredir com uma tarefa como também regredir o status da tarefa (por exemplo do status "TRABALHANDO" para o status "PENDENTE");
- [ ] Deve ser possível listar todas as tarefas, com seus respectivos status;
- [ ] Deve ser possível listar as tarefas por categoria.

Estes requisitos são as funcionalidades mínimas do sistema que deve entregar. Você também pode adicionar outros requisitos funcionais e não funcionais, mas se lembre do tempo de prova e das restrições citadas acima.

#### Status das tarefas

- PENDENTE (estado inicial)
- TRABALHANDO
- CONCLUIDA

### Testes

Você também deve criar pelo menos testes end-to-end (e2e) coerentes com as funcionalidades que implementar nas classes. Também é permitida a criação de testes de integração e unitários, mas leve em consideração o tempo de prova.

Bom teste!


