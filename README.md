Hello, Git
<!--
## http://localhost:8080/health

## http://localhost:8080/swagger-ui/index.html

## http://localhost:8080/h2-console


# 🧭 Guia Prático de Comandos Maven + Spring Boot

## 🚀 Comandos mais usados

| Etapa | Objetivo | Comando Maven | O que faz | Quando usar |
|-------|-----------|----------------|-------------|--------------|
| 🧹 **Limpar o projeto** | Apagar arquivos antigos e começar do zero | `mvn clean` | Remove a pasta `target/` | Antes de um build novo, quando algo deu erro estranho |

| ⚙️ **Compilar o código** | Verificar se o código compila sem erros | `mvn compile` | Só compila o código-fonte (sem testes, sem gerar JAR) | Quando quer apenas validar se não há erros de compilação |

| 🧪 **Compilar + Rodar testes** | Garantir que o projeto funciona corretamente | `mvn test` | Executa apenas os testes | Durante o desenvolvimento, antes de commit/push |

| 📦 **Gerar o artefato (JAR/WAR)** | Criar o pacote do projeto | `mvn clean package` | Limpa, compila, testa e gera o `.jar`/`.war` em `target/` | Quando quer gerar o executável da aplicação |

| 🚫 **Gerar artefato sem rodar testes** | Build rápido sem testar | `mvn clean package -DskipTests` | Mesmo que o anterior, mas ignora os testes | Quando está ajustando código e quer testar algo rápido |

| 📥 **Instalar no repositório local** | Disponibilizar o artefato para outros projetos Maven | `mvn clean install` | Limpa, compila, roda testes e instala no `~/.m2/repository` | Antes de usar essa lib em outro projeto local |

| ⚡ **Instalar sem rodar testes** | Build rápido e instalação local | `mvn clean install -DskipTests` | Mesmo que acima, mas ignora os testes | Quando só quer compilar e usar localmente |

| 🚀 **Rodar aplicação Spring Boot** | Executar o app direto do código | `mvn spring-boot:run` | Compila e roda o app no servidor embutido | Durante o desenvolvimento, para testar a aplicação |

| 🧰 **Rodar o JAR gerado** | Executar o app já empacotado | `java -jar target/nome-do-app.jar` | Usa o arquivo empacotado pelo Maven | Quando quiser rodar o app fora do Maven |

---

## 💡 Fluxo diário recomendado

| Situação | Passos | Comando |
|-----------|---------|----------|
| Iniciando o dia / limpando tudo | Limpar e rodar app | `mvn clean spring-boot:run` |
| Quer apenas testar código sem testes | Build rápido | `mvn clean install -DskipTests` |
| Quer garantir que tudo está OK | Build completo | `mvn clean install` |
| Gerar o `.jar` para deploy | Empacotar o app | `mvn clean package` |
| Rodar app empacotado | Executar jar | `java -jar target/app.jar` |

-->
