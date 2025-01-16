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

**Objetivo:**  Integrar o sistema com serviços externos para fornecer informações atualizadas sobre hotéis e atrações turísticas.

**5. Gestão de Conta de Usuário**

**Objetivo:**Fornecer ferramentas para os usuários gerenciarem suas contas, mantendo informações atualizadas e protegidas.

**6. Visualização de Mapas e Sugestões**

**Objetivo:**Exibir destinos e atividades em mapas interativos, oferecendo filtros e personalização das sugestões.


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

**Descrição:** Permitir aplicação de filtros para encontrar atividades específicas no mapa.

**Critérios de Aceitação:**

- As atividades cadastradas no mapa devem estar sempre atualizadas 

**3. Edição de Roteiros**

**Descrição:** Oferecer opções para editar roteiros mesmo após o planejamento inicial.

**Critérios de Aceitação:**

- Alterações devem ser refletidas imediatamente no itinerário.
- Não permitir sobreposição de atividades com o mesmo horário 



## User Stories

**1. Cadastro de usuário**

Como usuário, quero criar minha conta e configurar minhas preferências pessoais, Como usuário, quero criar minha conta e configurar minhas preferências pessoais, para acessar sugestões relevantes de atividades ao meu destinos.

**Critérios de Aceitação:**

- O sistema deve permitir o cadastro com campos obrigatórios como:
    - Nome completo
    - Data de nascimento (com validação para idade mínima de 18 anos)
    - E-mail (com validação de formato)
    - Senha (mínimo de 8 caracteres, incluindo pelo menos uma letra maiúscula, um número e um caractere especial)

- O sistema deve oferecer a opção de selecionar preferências iniciais, como:
    - Categorias de interesse (ex.: gastronomia, aventura, cultura)
    - Tipos de destinos preferidos (ex.: praias, montanhas, cidades históricas).

- O sistema deve armazenar as preferências do usuário para personalizar sugestões futuras.
- Caso algum campo obrigatório esteja faltando ou inválido, o sistema deve exibir mensagens claras de erro.
- Deve permitir que o usuário edite suas preferências após o cadastro inicial.

**2. Criação de Roteiro**

Como usuário, quero criar um roteiro com base nas minhas preferências, para aproveitar minha viagem do meu próprio jeito.

**Critérios de Aceitação:**

- Permitir escolha de destinos e a duração da estadia no destino. 
- Oferecer sugestões relevantes baseadas nos gostos e na proximidade do destino.
- As sugestões de atividade deve

**3. Planejamento de Itinerário**

Como usuário, quero que o sistema organize meu itinerário automaticamente, para evitar sobreposição de horários.

**Critérios de Aceitação:**

- Gerar itinerários que respeitem os horários já previamente selecionados.

**4. Interação com o mapa**

Como usuário, quero visualizar atividades e destinos em um mapa interativo, para planejar melhor meu roteiro.

**Critérios de Aceitação:**

- Permitir uso de filtros como "Restaurantes" e "Atrações" no mapa.
- Permitir navegação livre pelo mapa, respeitando o local de destino. 
- O sistema deve permitir que o usuário clique em marcadores no mapa para visualizar informações detalhadas das atividades, como descrição, horários de funcionamento e avaliações.
- Permitir que o usuário ajuste a escala do mapa para visualizações mais amplas ou detalhadas.

**5. Histórico de Roteiros**

Como usuário, quero acessar roteiros antigos, para reutilizá-los em futuras viagens ou lembrar de detalhes de viagens anteriores.

**Critérios de Aceitação:**

- Cada roteiro deve exibir:
    - Nome do roteiro (personalizável pelo usuário).
    - Datas de início e término da viagem.
    - Destinos visitados.
    - Atividades realizadas em cada destino.
- Permitir que o usuário pesquise roteiros antigos por:
    - Nome do roteiro.
    - Destinos.
    - Datas.

 ## Histórico de versão

|Data|Versão|Descrição|Autores|
|--|--|--|--|
|15/01/2025|1.0|Adicionando backlog|Danielle Rodrigues|