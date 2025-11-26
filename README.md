# Desafio: Combate OO (Java)
Solução do desafio “Combate OO” – Orientação a Objetos (DevSuperior)

## Regras
No jogo:
1. O programa deve instanciar dois campeões, cada um com:
   - Nome
   - Pontos de vida
   - Pontos de ataque
   - Pontos de armadura

     
2. Dinâmica do combate:
   - O combate é organizado em turnos simultâneos.
   - Em cada turno, ambos os campeões se atacam.
   - O dano causado segue as regras:
     - Vida é reduzida por (ataque do inimigo − armadura).
     - O dano mínimo é sempre 1, mesmo que a armadura seja maior que o ataque.
     - A vida nunca pode ficar negativa, logo, deve ser ajustada para 0 quando necessário.


3. Encerramento do combate:
   - O programa deve executar N turnos informados pelo usuário.
   - Se um campeão morrer (vida = 0) em algum turno, o combate é encerrado imediatamente.
   - Ao final, deve ser exibida a mensagem: "FIM DO COMBATE".

   
4. Saída esperada por turno:
   - O status de cada campeão após aplicar o dano do turno.
   - Se a vida for igual a 0, deve aparecer a palavra "morreu".


5. Saída esperada por turno:
   - Método takeDamage(): aplica o dano recebido conforme as regras.
   - Método status(): retorna o nome e o estado atual do campeão.


