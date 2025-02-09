# Definition of Done (DoD)

O Definition of Done (DoD) é um conjunto de critérios que define quando uma tarefa ou funcionalidade pode ser considerada concluída dentro do processo de desenvolvimento de software. Ele garante que o trabalho atenda a um padrão de qualidade acordado pela equipe, reduzindo retrabalho e melhorando a previsibilidade das entregas.

## 1. Cadastro de Usuário

### Requisitos Técnicos
- **Funcionalidades:** O sistema deve permitir o cadastro de novos usuários com nome completo, data de nascimento, e-mail e senha, incluindo validação de formato para e-mail e senha antes do envio. O usuário deve ter a opção de escolher preferências de interesse e tipos de destino, com estas preferências sendo armazenadas no banco de dados e editáveis posteriormente.

### Critérios de Aceitação
- [x] Todos os campos obrigatórios são validados corretamente e exibem mensagens de erro apropriadas quando necessário.
- [x] O usuário pode editar suas preferências após o cadastro, e as alterações são refletidas no banco de dados.
- [x] A criação de conta deve ser confirmada por um retorno adequado (mensagem na tela ou e-mail de confirmação).
- [x]  O fluxo de cadastro foi revisado pela equipe de QA e aprovado em uma demonstração.

### Validação e Qualidade
- [x] O código foi revisado por outro desenvolvedor e não apresenta problemas de lógica ou segurança.
- [x] A funcionalidade foi validada pela equipe de QA por meio de uma revisão de usabilidade e testes manuais.
- [x] O processo de cadastro foi validado.

---

## 2. Criação de Roteiro

### Requisitos Técnicos
- **Funcionalidades:** O sistema deve permitir que o usuário selecione destinos para criar um roteiro. O sistema deve oferecer sugestões de atividades e destinos com base nas preferências do usuário.

### Critérios de Aceitação
- [x] O usuário consegue criar um roteiro escolhendo destinos.
- [x] O sistema fornece sugestões de atividades compatíveis com as preferências do usuário.
- [x] O roteiro criado é salvo corretamente e pode ser acessado posteriormente.
- [x] O fluxo de criação de roteiro foi revisado pela equipe de QA e aprovado em uma demonstração.

### Validação e Qualidade
- [x] O código foi revisado por outro desenvolvedor e não apresenta problemas de lógica ou segurança.
- [x] A funcionalidade foi validada pela equipe de QA por meio de uma revisão de usabilidade e testes manuais.
- [x] O fluxo de criação de roteiro foi validado em diferentes cenários de uso, garantindo que todos os casos de borda sejam cobertos.

---

## 3. Interação com as Atividades

### Requisitos Técnicos
- **Funcionalidades:** O sistema deve apresentar uma lista de atividades que podem ser filtradas por categorias como "Gastronomia" e "Lazer". O usuário poderá marcar ou desmarcar atividades de interesse por meio de checkboxes. Ao selecionar uma atividade, o sistema exibirá informações detalhadas sobre ela, incluindo descrição e localização.

### Critérios de Aceitação
- [x] A lista de atividades pode ser filtrada corretamente pelas categorias disponíveis.
- [x] O sistema exibe automaticamente informações das atividades quando o usuário as seleciona.
- [x] O usuário pode marcar ou desmarcar atividades sem erros e as mudanças são salvas corretamente.
- [x] O fluxo de interação com as atividades foi revisado pela equipe de QA e aprovado em uma demonstração.

### Validação e Qualidade
- [x] O código foi revisado por outro desenvolvedor e não apresenta problemas de lógica ou segurança.
- [x] A funcionalidade foi validada pela equipe de QA por meio de uma revisão de usabilidade e testes manuais.
- [x] A funcionalidade foi validada com um grupo de usuários para garantir que os filtros e a interação sejam intuitivos.

---

## 4. Histórico de Roteiros

### Requisitos Técnicos
- **Funcionalidades:** O sistema deve permitir que o usuário acesse seus roteiros antigos. O histórico de roteiros deve incluir o nome do roteiro, as datas em que ele foi realizado e as atividades que foram feitas em cada um dos destinos. O usuário deve ter a capacidade de pesquisar roteiros antigos usando filtros por nome, destino ou datas.

### Critérios de Aceitação
- [x] O histórico de roteiros é exibido corretamente na interface.
- [x] A busca retorna resultados corretamente conforme os filtros aplicados.
- [x] O sistema mantém a integridade e precisão dos dados históricos.
 [x] O fluxo de histórico foi revisado pela equipe de QA e aprovado em uma demonstração.

### Validação e Qualidade
- [x] O código foi revisado por outro desenvolvedor e não apresenta problemas de lógica ou segurança.
- [x] A funcionalidade foi validada pela equipe de QA por meio de uma revisão de usabilidade e testes manuais.
- [x] O sistema foi validado com diferentes cenários de dados históricos, garantindo que a busca funcione corretamente para grandes volumes de dados.

---

## Conclusão

O DoD existe para evitar ambiguidades sobre o que significa "finalizado". Ele estabelece um entendimento comum entre desenvolvedores, testers, gerentes de produto e demais stakeholders, garantindo que todas as partes envolvidas compartilhem a mesma visão do que é um software pronto para ser entregue.

Portanto, um item só pode ser considerado **"Done"** quando todos os critérios acima forem atendidos, garantindo que a entrega seja de alta qualidade, revisada e validada pela equipe.

---


## Referências

- [PM3 - Glossário: Definition of Done (DoD)](https://pm3.com.br/glossario/definition-of-done-dod/)
- [Scrum.org - Entenda de uma vez por todas o que é Definition of Done](https://www.scrum.org/resources/blog/entenda-de-uma-vez-por-todas-o-que-e-definition-done)
- [Atlassian - O que é o Definition of Done?](https://www.atlassian.com/agile/project-management/definition-of-done)

---

|Data|Versão|Descrição|Autores|
|--|--|--|--|
|08/02/2025|1.0|Adicionando  Definição de Done (DoD)|[Harleny Angéllica](https://github.com/Angelicahaas)|