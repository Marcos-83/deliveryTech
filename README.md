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




classDiagram
    class Cliente {
        -Long id
        -String nome
        -String telefone
        -String endereco
        -String email
        -Boolean ativo
        -LocalDateTime dataCriacao
    }
    
    class Usuario {
        -Long id
        -String nome
        -String email
        -String senha
        -Role role
        -Boolean ativo
        -LocalDateTime dataCriacao
        -Long restauranteId
    }
    
    class Restaurante {
        -Long id
        -String nome
        -String categoria
        -String telefone
        -BigDecimal avaliacao
        -BigDecimal taxaEntrega
        -Integer tempoEntregaMinutos
        -Boolean ativo
    }
    
    class Produto {
        -Long id
        -String nome
        -String categoria
        -String descricao
        -BigDecimal preco
        -Boolean disponivel
    }
    
    class Pedido {
        -Long id
        -BigDecimal valorTotal
        -String numeroPedido
        -BigDecimal subtotal
        -String observacoes
        -StatusPedido status
        -LocalDateTime dataPedido
    }
    
    class ItemPedido {
        -Long id
        -Integer quantidade
        -BigDecimal precoUnitario
        -BigDecimal subtotal
    }
    
    class Endereco {
        -String rua
        -String numero
        -String bairro
        -String cidade
        -String estado
        -String cep
        -String complemento
    }
    
    class StatusPedido {
        <<enumeration>>
        CRIADO
        PENDENTE
        CONFIRMADO
        PREPARANDO
        SAIU_PARA_ENTREGA
        ENTREGUE
        CANCELADO
    }
    
    class Role {
        <<enumeration>>
        ADMIN
        CLIENTE
        RESTAURANTE
        ENTREGADOR
        USER
    }
    
    class ClienteRepository {
        <<interface>>
    }
    
    class UsuarioRepository {
        <<interface>>
    }
    
    class RestauranteRepository {
        <<interface>>
    }
    
    class ProdutoRepository {
        <<interface>>
    }
    
    class PedidoRepository {
        <<interface>>
    }
    
    class ClienteService {
        <<interface>>
    }
    
    class ClienteServiceImpl {
    }
    
    class UsuarioService {
        <<interface>>
    }
    
    class UsuarioServiceImpl {
    }
    
    class AuthService {
        <<interface>>
    }
    
    class AuthServiceImpl {
    }
    
    class RestauranteService {
        <<interface>>
    }
    
    class RestauranteServiceImpl {
    }
    
    class ProdutoService {
        <<interface>>
    }
    
    class ProdutoServiceImpl {
    }
    
    class PedidoService {
        <<interface>>
    }
    
    class PedidoServiceImpl {
    }
    
    class RelatorioService {
        <<interface>>
    }
    
    class RelatorioServiceImpl {
    }
    
    class ClienteController {
    }
    
    class AuthController {
    }
    
    class RestauranteController {
    }
    
    class ProdutoController {
    }
    
    class PedidoController {
    }
    
    class RelatorioController {
    }
    
    class JwtUtil {
    }
    
    class JwtAuthenticationFilter {
    }
    
    class SecurityConfig {
    }
    
    class DataLoader {
    }
    
    class DeliveryApiApplication {
    }
    
    class GlobalExceptionHandler {
    }
    
    class EntityNotFoundException {
    }
    
    class BusinessException {
    }
    
    class ConflictException {
    }
    
    Cliente "1" --> "*" Pedido
    Restaurante "1" --> "*" Pedido
    Restaurante "1" --> "*" Produto
    Pedido "1" --> "*" ItemPedido
    ItemPedido "*" --> "1" Produto
    Pedido --> StatusPedido
    Pedido --> Endereco
    Usuario --> Role
    
    ClienteRepository ..> Cliente
    UsuarioRepository ..> Usuario
    RestauranteRepository ..> Restaurante
    ProdutoRepository ..> Produto
    PedidoRepository ..> Pedido
    
    ClienteServiceImpl ..|> ClienteService
    ClienteServiceImpl --> ClienteRepository
    
    UsuarioServiceImpl ..|> UsuarioService
    UsuarioServiceImpl --> UsuarioRepository
    
    AuthServiceImpl ..|> AuthService
    AuthServiceImpl --> UsuarioRepository
    AuthServiceImpl --> JwtUtil
    
    RestauranteServiceImpl ..|> RestauranteService
    RestauranteServiceImpl --> RestauranteRepository
    
    ProdutoServiceImpl ..|> ProdutoService
    ProdutoServiceImpl --> ProdutoRepository
    ProdutoServiceImpl --> RestauranteRepository
    
    PedidoServiceImpl ..|> PedidoService
    PedidoServiceImpl --> PedidoRepository
    PedidoServiceImpl --> ClienteRepository
    PedidoServiceImpl --> RestauranteRepository
    PedidoServiceImpl --> ProdutoRepository
    
    RelatorioServiceImpl ..|> RelatorioService
    RelatorioServiceImpl --> PedidoRepository
    RelatorioServiceImpl --> ClienteRepository
    RelatorioServiceImpl --> ProdutoRepository
    
    ClienteController --> ClienteService
    AuthController --> AuthService
    RestauranteController --> RestauranteService
    ProdutoController --> ProdutoService
    PedidoController --> PedidoService
    RelatorioController --> RelatorioService
    
    JwtAuthenticationFilter --> JwtUtil
    SecurityConfig --> JwtAuthenticationFilter
    
    DataLoader --> ClienteRepository
    DataLoader --> RestauranteRepository
    DataLoader --> ProdutoRepository
    DataLoader --> PedidoRepository
    DeliveryApiApplication --> DataLoader
    
    GlobalExceptionHandler --> EntityNotFoundException
    GlobalExceptionHandler --> BusinessException
    GlobalExceptionHandler --> ConflictException
