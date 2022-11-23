# EjercicioGit3

1. Creamos un repositorio nuevo en github con un README y un .gitignore

![crear nuevo repositorio](https://user-images.githubusercontent.com/114091264/203599313-e907ff29-f99d-40ca-8162-8764cf0d3fad.png)

2. Creamos un proyecto nuevo marcando la opción "Create Git repository"

![crear proyecto](https://user-images.githubusercontent.com/114091264/203599390-2f653fa1-fb30-4abe-8ddd-87aa0f00741d.png)

```bash
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3 (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .gitignore
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/vcs.xml
        new file:   .idea/workspace.xml
        new file:   Ejercicio git3.iml
        new file:   src/Main.java

```
3. Añadimos el repo de github como remoto e intentamos hacer un pull
(recordemos que lo hemos creado con un README y un .gitignore)

```bash
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3 (master)
$ git remote add origin https://github.com/1999rebeca/EjercicioGit3.git

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git pull origin main
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), 857 bytes | 65.00 KiB/s, done.
From https://github.com/1999rebeca/EjercicioGit3
 * branch            main       -> FETCH_HEAD
 * [new branch]      main       -> origin/main
error: Your local changes to the following files would be overwritten by merge:
        .gitignore
Please commit your changes or stash them before you merge.
Aborting
```

A mi no me aparece lo mismo que en el ejemplo y me sale directamente que
hay conflicto entre los dos archivos de .gitignore

4. Elimino el .gitignore local

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ rm .gitignore

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   .gitignore
        new file:   .idea/misc.xml
        new file:   .idea/modules.xml
        new file:   .idea/vcs.xml
        new file:   .idea/workspace.xml
        new file:   Ejercicio git3.iml
        new file:   src/Main.java

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    .gitignore
```
Vuelvo a intentar hacer pull

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git pull origin main
From https://github.com/1999rebeca/EjercicioGit3
 * branch            main       -> FETCH_HEAD
error: Your local changes to the following files would be overwritten by merge:
        .gitignore
Please commit your changes or stash them before you merge.
Aborting
```
5. Ahora si que voy a hacer caso al ejemplo y deshacer el git add

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git rm --cached -r .
rm '.gitignore'
rm '.idea/misc.xml'
rm '.idea/modules.xml'
rm '.idea/vcs.xml'
rm '.idea/workspace.xml'
rm 'Ejercicio git3.iml'
rm 'src/Main.java'

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .idea/
        Ejercicio git3.iml
        src/

nothing added to commit but untracked files present (use "git add" to track)
```

6. Hago el pull

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git pull origin main
From https://github.com/1999rebeca/EjercicioGit3
 * branch            main       -> FETCH_HEAD
```

7. Ya tenemos descargado lo que estaba en remoto (el README y el .gitignore de GitHub)
en la rama main (rama por defecto en GitHub) a nuestra rama master local.

Ahora commiteamos el proyecto local y lo subimos al repositorio.

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git add .
warning: in the working copy of '.idea/workspace.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/Main.java', LF will be replaced by CRLF the next time Git touches it

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git commit -m "primer commit local"
[master d1709a1] primer commit local
 6 files changed, 80 insertions(+)
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/modules.xml
 create mode 100644 .idea/vcs.xml
 create mode 100644 .idea/workspace.xml
 create mode 100644 Ejercicio git3.iml
 create mode 100644 src/Main.java
 
 a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git status
On branch master
nothing to commit, working tree clean

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git log --oneline
d1709a1 (HEAD -> master) primer commit local
1d0a7ac (origin/main) Initial commit

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git push -u origin master

fatal: unable to access 'https://github.com/1999rebeca/EjercicioGit3.git/': Failed to connect to github.com port 443 after 21087 ms: Timed out
```

Se fue el internet lol

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git push -u origin master
Enumerating objects: 11, done.
Counting objects: 100% (11/11), done.
Delta compression using up to 4 threads
Compressing objects: 100% (9/9), done.
Writing objects: 100% (10/10), 2.14 KiB | 2.14 MiB/s, done.
Total 10 (delta 0), reused 0 (delta 0), pack-reused 0
remote:
remote: Create a pull request for 'master' on GitHub by visiting:
remote:      https://github.com/1999rebeca/EjercicioGit3/pull/new/master
remote:
To https://github.com/1999rebeca/EjercicioGit3.git
 * [new branch]      master -> master
branch 'master' set up to track 'origin/master'.

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git log --oneline
d1709a1 (HEAD -> master, origin/master) primer commit local
1d0a7ac (origin/main) Initial commit
```

Observamos que se ha subido correctamente pero en la rama master (que era en la que estábamos trabajando en local), 
mientras que la rama main se mantiene con su primer commit.

![msin mster](https://user-images.githubusercontent.com/114091264/203599549-5cc44782-23bb-44dc-bbad-c5aa377c65a0.png)
![mastr](https://user-images.githubusercontent.com/114091264/203599571-00bf3848-14ee-4a6e-810d-7768b1ff9cd6.png)


8. Eliminamos la rama main en el repositorio de GitHub
   
Tengo que cambiar la rama por defecto
![switch default branch](https://user-images.githubusercontent.com/114091264/203599742-e40ea511-31f4-4d09-afb0-da051b953e01.png)
![delete main](https://user-images.githubusercontent.com/114091264/203599764-a6cbc00c-84d1-432c-8410-5b403b49b9b8.png)
eliminada la rama main                ---->  ![main deleted](https://user-images.githubusercontent.com/114091264/203599781-fffe54c9-1b61-4f12-ac56-525638e67dfa.png)


9. Modificamos el proyecto local (commit: "añadiendo código para probar las propiedades de Java")

![añado codigo al proyecto](https://user-images.githubusercontent.com/114091264/203600546-910ca67a-05b2-453a-95b7-6fb75d283274.png)

```
a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   .idea/workspace.xml
        modified:   src/Main.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .idea/.name

no changes added to commit (use "git add" and/or "git commit -a")

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git commit -m "añadiendo código para probar las propiedades de java"
[master 8ecf26a] añadiendo código para probar las propiedades de java
 3 files changed, 35 insertions(+), 5 deletions(-)
 create mode 100644 .idea/.name

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

a22rebecabo@W10N-I9E07 MINGW64 ~/Documents/contornos/Ejercicio git3/Ejercicio git3 (master)
$ git log --oneline
8ecf26a (HEAD -> master) añadiendo código para probar las propiedades de java
d1709a1 (origin/master) primer commit local
1d0a7ac (origin/main) Initial commit

```

10.
