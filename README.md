# Sistema de Músicas e Podcasts — Java

Sistema de gerenciamento de músicas e podcasts desenvolvido em Java com Programação Orientada a Objetos.

## Funcionalidades

- Cadastrar músicas com título, artista, álbum e gênero
- Cadastrar podcasts com título, apresentador e convidado
- Registrar reproduções e curtidas
- Classificação automática baseada em curtidas (músicas) e reproduções (podcasts)
- Lista de preferidas que avalia e exibe a classificação de cada áudio

## Estrutura do projeto

```
src/br/com/gui/musics/principal/
├── modelos/
│   ├── Audio.java       # Classe base com título, reproduções, curtidas e classificação
│   ├── Musica.java      # Herda de Audio, adiciona artista, álbum e gênero
│   ├── Podcast.java     # Herda de Audio, adiciona apresentador e convidado
│   └── Preferidas.java  # Avalia e exibe áudios conforme classificação
└── principal/
    └── Principal.java   # Classe principal de execução
```

## Conceitos praticados

- Herança (`Musica` e `Podcast` estendem `Audio`)
- Polimorfismo (sobrescrita de `getClassificacao()` e `getTotalDeReproducoes()`)
- Encapsulamento (getters, setters e métodos `curte()` e `reproducoes()`)

## Como executar

**Pré-requisitos:** JDK instalado e IntelliJ IDEA (recomendado).

```bash
git clone https://github.com/Gu1Dantas/sistema-de-musicas-e-podcasts-em-java.git
```

Abra o projeto no IntelliJ IDEA e execute a classe `Principal.java`.

## Tecnologias

- Java
- POO (Programação Orientada a Objetos)

---

Desenvolvido por [Guilherme Dantas](https://github.com/Gu1Dantas)
