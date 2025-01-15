# Padrões de Desenvolvimento

Para melhor organização do projeto, uma série de padrões foram adotadas, como padrão de commit, template de issues, template de pull requests, padrão de ATAS e padrões de código. 

## Padrões de Código
Para um desenvolvimento coerente dos códigos do software e para uma melhor legibilidade e compreensão de todos os membros do grupo, este artefato foi desenvolvido para resolver todas essas questões, construindo Padrões de Código como solução. 

Para todas as contribuições externas neste projeto, também é necessário seguir estas diretrizes. 

Os padrões apresentados abaixo são fortemente inspirados pelo <a href="https://en.wikipedia.org/wiki/Camel_case" target="_blank">CamelCase</a>, um estilo de código muito popular, marcado pela junção de palavras, tornando sua divisão por letras maiúsculas. 

### Classes e Métodos
O nome das classes seguirá o clássico CamelCase, onde a primeira letra de cada palavra, incluindo a primeira de todas, será maiúscula. Os métodos, por outro lado, terão a primeira letra em minúsculo, enquanto as próximas palavras terão a primeira letra em maiúsculo.

### Atributos
Os atributos seguirão as mesmas diretrizes dos métodos. 

### Cenas e Objetos do Jogo
Ambos seguirão as mesmas diretrizes das classes, tendo a primeira letra de cada palavra em maiúscula. 

## Padrões de Commit
Para padronizar os commits do projeto, este artefato foi criado tendo o <a href="https://www.conventionalcommits.org/en/v1.0.0/" target="_blank">Conventional Commits</a> como inspiração. 

O padrão básico consiste em:"tipo", "issue", "mensagem" e "contribuidores" 

- **Tipo**: que é o tipo do commit, como **docs** para documentação, **fix** para correção de conteúdo, ou mesmo **feat** para commits de novas funcionalidades;
- **Issue**: este commit corrige qual das issues abertas no momento?
- **Mensagem**: a mensagem precisa ser curta, mas eficaz, transmitindo uma pequena ideia do conteúdo do commit;
- **Contribuidores**: se houver um coautor no commit, você deve incluí-lo no final;

O estilo deve se parecer com algo assim: 

```bash
<Tipo> #(Issue): <Mensagem> Co-autoria: <Contribuidor> <E-mail do Contribuidor>
```

## Template de Issue

Para padronizar as issues do projeto, foi criado o seguinte template: 

    ## Descrição da Tarefa

    Descreva o que precisa ser feito aqui.

    ## Critérios de Aceitação

    - [ ] Critério 1
    - [ ] Critério 2
    - [ ] ...

    ## Requisitos

    A quais requisitos do projeto esta tarefa se refere?
    - []()
    - []()

    ## Informações Adicionais

    Adicione qualquer informação adicional que possa ser útil.


## Template de PR

<Para padronizar as PRs do projeto, foi criado o seguinte template: 
    ## Descrição

    Inclua um resumo da mudança e qual problema está sendo corrigido. Inclua também motivação e contexto relevantes. Liste quaisquer dependências necessárias para essa mudança.

    Corrige # (número da issue)

    ## Tipo de Mudança

    Por favor, exclua as opções que não são relevantes.

    - [ ] Correção de bug (mudança que não quebra o sistema e resolve um problema)
    - [ ] Nova funcionalidade (mudança que não quebra o sistema e adiciona uma nova funcionalidade)
    - [ ] Mudança que quebra o sistema (correção ou funcionalidade que pode fazer com que a funcionalidade existente não funcione como esperado)
    - [ ] Atualização de documentação

    ## Checklist:

    - [ ] Meu código segue as diretrizes de estilo deste projeto
    - [ ] Eu revisei meu próprio código
    - [ ] Comentei meu código, especialmente em áreas de difícil compreensão
    - [ ] Fiz mudanças correspondentes na documentação
    - [ ] Minhas mudanças não geram novos avisos

## Template de ata de reunião

O template de ata de reunião pode ser encontrado <a href="" target="_blank">aqui</a>.

## Histórico de versão

|Data|Versão|Descrição|Autores|
|--|--|--|--|
|15/01/2025|1.0|Adicionando padrões de commit e templates|Miguel Arthur|
|15/01/2025|1.1|Adicionando padrões de commit e templates|Amanda Abreu|