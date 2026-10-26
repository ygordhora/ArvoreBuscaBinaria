Nome: Ygor de Jesus Araujo da Hora

Descrição:O projeto representa uma arvore binaria onde possui a regra de entrada como se o nó for
          igual a null será criado um novo nó, se o nó já possuir valor ele vai fazer uma verifica
          começando da raiz e decendo conforme tiver nós, primeiro se o valor for
          maior que o valor atual do nó ele entra a direita se for menor entra a esquerda, ele fara
          essa verificação sucessivamente pelos nós até encontrar um valor null

Extrutura implementada:

Main: Foi criado o objeto Tree, utilizado para inserir os valores na árvore e testar o funcionamento da contagem de folhas.

Node: Foram implementados os atributos básicos de cada nó, utilizados para armazenar os valores e percorrer a árvore por meio das referências aos filhos esquerdo e direito.

Tree: Primeiro, foi declarada a variável root, que representa a raiz da árvore e começa vazia (null). Depois, temos os métodos insert e insertNode. O insert é um método público, chamado no Main para inserir os valores na árvore. Ele chama o insertNode, que é um método privado responsável por executar a lógica de inserção dos nós.
Em seguida, temos os métodos countLeaves e countLeavesNode, que funcionam de maneira semelhante aos métodos de
inserção. O primeiro é público e pode ser chamado no Main, enquanto o segundo é privado e contém toda a lógica de contagem das folhas da árvore.