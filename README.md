# 📌 TaskManager - Gerenciador de Tarefas em Java

O **TaskManager** é um sistema simples de gerenciamento de tarefas desenvolvido em **Java**. Ele permite que o usuário **adicione, liste, conclua e remova tarefas**, utilizando um **menu interativo** no console.

---

## 🚀 Funcionalidades
✔️ Adicionar uma nova tarefa 📌  
✔️ Listar todas as tarefas 📋  
✔️ Concluir uma tarefa ✅  
✔️ Remover uma tarefa 🗑️  
✔️ Menu interativo para navegação 🎛️  

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**  
- **Eclipse IDE** (ou outra IDE de preferência)  
- **Paradigma: Programação Orientada a Objetos (POO)**  
- **Estruturas de Dados: `ArrayList`**  

---

## 📂 Estrutura do Projeto
```
TaskManager/
│── src/
│   ├── br/com/taskmanager/
│   │   ├── Main.java              # Classe principal do programa
│   │   ├── GerenciadorTarefas.java # Classe que gerencia as tarefas
│   │   ├── models/
│   │   │   ├── Tarefa.java         # Classe modelo de uma Tarefa
│── README.md                      # Documentação do projeto
```

---

## 📥 Como Instalar e Rodar
### 1️⃣ Clonar o repositório
```sh
git clone https://github.com/seu-usuario/taskmanager.git
cd taskmanager
```

### 2️⃣ Abrir no Eclipse
1. No **Eclipse**, vá para **File > Open Projects from File System...**  
2. Selecione a pasta `TaskManager`  
3. Clique em **Finish**  

### 3️⃣ Executar o Projeto
1. No **Eclipse**, abra `Main.java`  
2. Clique com o botão direito > **Run As > Java Application**  
3. O menu interativo será exibido no console.

---

## 📖 Como Usar o Sistema
Após rodar o programa, o seguinte **menu** será exibido no console:

```
📋 MENU:
1️⃣ - Adicionar Tarefa
2️⃣ - Listar Tarefas
3️⃣ - Concluir Tarefa
4️⃣ - Remover Tarefa
0️⃣ - Sair
Escolha uma opção:
```

- **1️⃣ Adicionar Tarefa** → O usuário insere um título e descrição para criar uma nova tarefa.  
- **2️⃣ Listar Tarefas** → Exibe todas as tarefas registradas.  
- **3️⃣ Concluir Tarefa** → Permite marcar uma tarefa como concluída.  
- **4️⃣ Remover Tarefa** → Exclui uma tarefa pelo ID.  
- **0️⃣ Sair** → Encerra o programa.  

---

## 📌 Exemplos de Uso
### ✅ Adicionando uma nova tarefa
```
Digite o título da tarefa: Estudar Java
Digite a descrição da tarefa: Praticar POO e estruturas de dados
✅ Tarefa adicionada com sucesso!
🔵 Pressione Enter para voltar ao menu...
```

### 📋 Listando tarefas
```
📌 Lista de Tarefas:
ID: 1 | Estudar Java - Praticar POO e estruturas de dados [Pendente]
🔵 Pressione Enter para voltar ao menu...
```

### ✅ Concluindo uma tarefa
```
Digite o ID da tarefa que deseja concluir: 1
✅ Tarefa concluída com sucesso!
🔵 Pressione Enter para voltar ao menu...
```

### 🗑️ Removendo uma tarefa
```
Digite o ID da tarefa que deseja remover: 1
🗑️ Tarefa removida com sucesso!
🔵 Pressione Enter para voltar ao menu...
```

---

## 🤝 Contribuindo
Sinta-se à vontade para contribuir com melhorias para este projeto!  
1. **Fork o repositório**  
2. **Crie uma nova branch** (`git checkout -b minha-melhoria`)  
3. **Faça suas alterações**  
4. **Commit suas mudanças** (`git commit -m "Melhoria na listagem de tarefas"`)  
5. **Push para o repositório** (`git push origin minha-melhoria`)  
6. **Crie um Pull Request**  

---

## 📜 Licença
Este projeto é de código aberto e está sob a licença **MIT**.
