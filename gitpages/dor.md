# Definição de Ready (DoR)

## 1. Cadastro de usuário

### Requisitos Técnicos:
- O sistema deve ter uma tela de cadastro com campos obrigatórios como nome completo, data de nascimento, e-mail, e senha.
- O sistema deve ter validação de formato de e-mail e senha.
- O sistema deve permitir ao usuário escolher preferências de interesse e tipos de destino.
- O sistema deve armazenar as preferências do usuário e permitir edições futuras.

### Critérios de Aceitação:
- Todos os campos obrigatórios devem ser validados corretamente, exibindo mensagens de erro apropriadas em caso de falhas.
- O usuário pode editar suas preferências após o cadastro.

### Dependências:
- Banco de dados para armazenamento de informações do usuário.
- Funcionalidade de validação de dados (e-mail, senha,preferências).

---

## 2. Criação de Roteiro

### Requisitos Técnicos:
- O sistema deve permitir ao usuário escolher destinos.
- Oferecer sugestões baseadas nas preferências do usuário.

### Critérios de Aceitação:
- O sistema deve fornecer sugestões de atividades com base nas preferências selecionadas.

### Dependências:
- Base de dados para sugestões de atividades e destinos.

---

## 3. Interação com as Atividades

### Requisitos Técnicos:
- O sistema deve permitir que o usuário visualize uma lista de atividades filtradas por categorias como "Gastronomia" e "Lazer".
- O usuário deve poder marcar ou desmarcar atividades de interesse usando checkboxes.
- O sistema deve permitir que o usuário visualize informações detalhadas sobre cada atividade selecionada, como descrição e localização.

### Critérios de Aceitação:
- A lista de atividades deve ser filtrável com base em categorias como "Gastronomia" e "Lazer".
- O sistema deve exibir informações das atividades assim que o usuário marcar suas preferências.
- O sistema deve permitir ao usuário marcar ou desmarcar atividades sem problemas.

### Dependências:
- Base de dados para armazenar atividades e suas informações detalhadas.
- Sistema de gerenciamento de atividades e destinos.
- Funcionalidade de filtro para categorias de atividades.

---

## 4. Histórico de Roteiros

### Requisitos Técnicos:
- O sistema deve permitir acesso ao histórico de roteiros anteriores.
- O histórico deve incluir nome, datas e atividades realizadas nos destinos.
- Deve permitir busca por nome do roteiro, destinos ou datas.

### Critérios de Aceitação:
- O histórico de roteiros deve ser exibido corretamente.
- A busca deve funcionar de acordo com os parâmetros estabelecidos.

### Dependências:
- Banco de dados para armazenar históricos de roteiros.
- Funcionalidade de busca.


|Data|Versão|Descrição|Autores|
|--|--|--|--|
|15/01/2025|1.0|Adicionando  Definição de Ready (DoR)|[Harleny Angéllica](https://github.com/Angelicahaas)|