# Product Backlog - SAFe

O Scaled Agile Framework (SAFe) é uma metodologia que permite a aplicação de práticas ágeis em larga escala dentro de organizações. Desenvolvido em 2011 por Dean Leffingwell e Drew Jemilo, o SAFe combina princípios de desenvolvimento ágil de software, desenvolvimento enxuto de produtos e pensamento sistêmico. Ele auxilia empresas a entregarem soluções de forma eficiente e alinhada aos objetivos estratégicos, promovendo colaboração entre equipes e melhoria contínua.

No contexto deste projeto, o backlog foi estruturado considerando os objetivos estratégicos, as funcionalidades desejadas e os requisitos não funcionais, garantindo um produto escalável, seguro e eficiente para os usuários finais.

A seguir, apresentamos o backlog detalhado da aplicação Fast Travel.


## Epics

**Definição:** Grandes iniciativas estratégicas ou de negócios que exigem esforço significativo e podem levar meses para serem concluídas. São divididos em partes menores para facilitar a execução.

**1. Criação de Roteiros Personalizados**

**Objetivo:** Desenvolver um sistema que permita aos usuários criar roteiros de viagem personalizados com base em suas preferências, oferecendo sugestões relevantes e contextualizadas.

**2. Gestão de Destinos e Viagens**

**Objetivo:** Oferecer funcionalidades robustas para cadastro e gerenciamento de destinos e viagens, garantindo integridade e usabilidade das informações.

**3. Planejamento de Itinerários**

**Objetivo:** Automatizar o planejamento de itinerários, garantindo organização e flexibilidade para os usuários ajustarem os planos conforme necessário.

**4. Integração com Serviços Externos**

**Objetivo:**  Integrar o sistema com serviços externos para fornecer informações atualizadas sobre atrações turísticas.

**5. Gestão de Conta de Usuário**

**Objetivo:**Fornecer ferramentas para os usuários gerenciarem suas contas, mantendo informações atualizadas e protegidas.


## Capabilities

**Definição:** Representam entregas amplas e de alto nível dentro de Agile Release Train que permitem atingir um objetivo estratégico. Estão abaixo dos épicos e são divididas em Features.

**1. Planejamento de Itinerários**

**Descrição:** Planejamento automático e manual de itinerários, garantindo organização, flexibilidade e personalização com base nas preferências do usuário.

**2. Critérios de Aceitação:**

- O itinerário deve ser gerado automaticamente sem sobreposição de horários e permitir ajustes manuais.
- Exibir horários e atividades de forma clara e visualmente organizada.

**3. Integração com Serviços**

**Descrição:** Conexão com serviços externos para enriquecer as recomendações e oferecer informações atualizadas sobre hotéis, atrações e eventos locais.

**Critérios de Aceitação:**

- Atualizar informações automaticamente a partir das APIs conectadas, garantindo precisão e atualidade dos dados.

**4. Visualização de Mapas**

**Descrição:** Exibir destinos, atividades e sugestões em mapas interativos com recursos avançados, permitindo filtros e navegação dinâmica.

**Critérios de Aceitação:**

- Permitir filtros como "Restaurantes", "Atrações" e "Populares" aplicáveis em tempo real.
- O mapa deve ser responsivo e oferecer uma navegação fluida em dispositivos móveis e desktops.
- Dados sensíveis ou relacionados ao histórico de visualização do usuário devem ser protegidos por autenticação segura.

**5. Criação de Roteiros**

**Descrição:** Ferramentas para configurar roteiros baseados em destinos e atividades preferidas, com sugestões automatizadas.

**Critérios de Aceitação:**

- Permitir personalização de atividades por categoria.
- Sugestões devem ser contextuais e dinâmicas.


## Features

**Definição:**Funcionalidades específicas ou entregas que oferecem valor direto ao cliente ou ao sistema. Elas podem ser completadas em um ou dois Program Increments (PI) e são divididas em Histórias de Usuário.

**1. Sugestões de Atividades**

**Descrição:** Exibir atividades com base nas preferências e no perfil do usuário.

**Critérios de Aceitação:**

- Sugestões devem ser atualizadas dinamicamente.

2. Filtros por Categorias

**Descrição:** Permitir aplicação de filtros para encontrar atividades específicas.

**Critérios de Aceitação:**

- As atividades cadastradas devem estar sempre atualizadas 

**3. Edição de Roteiros**

**Descrição:** Oferecer opções para editar roteiros mesmo após o planejamento inicial.

**Critérios de Aceitação:**

-O sistema deve permitir ao usuário editar os destinos e atividades.



## User Stories

**Definição:** Descrições curtas e simples de uma funcionalidade desejada do ponto de vista do usuário final. 

**1. Cadastro de usuário**

Como usuário, quero criar minha conta e configurar minhas preferências pessoais, Como usuário, quero criar minha conta e configurar minhas preferências pessoais, para acessar sugestões relevantes de atividades ao meu destinos.

**Critérios de Aceitação:**

- O sistema deve permitir o cadastro com campos obrigatórios como:
    - Nome completo
    - Data de nascimento 
    - E-mail (com validação de formato)
    - Senha 
- O sistema deve oferecer a opção de selecionar preferências iniciais, como:
    - Categorias de interesse (ex.: gastronomia, lazer, cultura)
- O sistema deve armazenar as preferências do usuário para personalizar sugestões futuras.
- Caso algum campo obrigatório esteja faltando ou inválido, o sistema deve exibir mensagens claras de erro.
- Deve permitir que o usuário edite suas preferências após o cadastro inicial.

**2. Criação de Roteiro**

Como usuário, quero criar um roteiro com base nas minhas preferências, para aproveitar minha viagem do meu próprio jeito.

**Critérios de Aceitação:**

- O sistema deve permitir ao usuário escolher os destinos. 
- O sistema deve oferecer sugestões relevantes baseadas nas preferências do usuário.

**3. Interação com as Atividades**

Como usuário, quero selecionar atividades de interesse de uma lista filtrada, para que eu possa planejar meu roteiro de forma personalizada e eficiente.

**Critérios de Aceitação:**

- O sistema deve permitir que o usuário visualize uma lista de atividades filtradas por categorias como "Gastronomia" e "Lazer".
- O usuário deve ser capaz de marcar ou desmarcar atividades usando checkboxes.
- O sistema deve exibir informações de cada atividade quando gerar o roteiro, como descrição e localização.
- O sistema deve permitir que o usuário edite suas preferências de atividades a qualquer momento.


**4. Histórico de Roteiros**

Como usuário, quero acessar roteiros antigos para lembrar de detalhes de viagens anteriores.

**Critérios de Aceitação:**

- O histórico de roteiros deve ser exibido de maneira clara e acessível.
- Permitir que o usuário pesquise roteiros antigos.
- O sistema deve garantir que o histórico esteja atualizado e seja consultável sem falhas.


## Histórico de versão

|Data|Versão|Descrição|Autores|
|--|--|--|--|
|15/01/2025|1.0|Adicionando backlog|[Danielle Rodrigues](https://github.com/Danizelle)|
|08/02/2025|2.0|Atualizando  Epics, Features e User Story|[Harleny Angéllica](https://github.com/Angelicahaas)|
