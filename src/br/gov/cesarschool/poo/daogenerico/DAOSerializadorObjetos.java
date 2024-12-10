package br.gov.cesarschool.poo.daogenerico;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOSerializadorObjetos<T extends Entidade & Serializable> {

    private String nomediretorio;

    public DAOSerializadorObjetos(Class<?> tipoEntidade) {
        this.nomediretorio = "." + File.separator + tipoEntidade.getSimpleName();
        File dir = new File(nomediretorio);
        if (!dir.exists()) {
            dir.mkdir();
        }
    }

    public boolean incluir(Entidade entidade) {
        String filePath = nomediretorio + File.separator + entidade.getIdUnico();
        File file = new File(filePath);

        if (file.exists()) {
            return false;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(entidade);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Entidade entidade) {
        String filePath = nomediretorio + File.separator + entidade.getIdUnico();
        File file = new File(filePath);

        if (!file.exists()) {
            return false;
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false))) {
            oos.writeObject(entidade);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(String idUnico) {
        String filePath = nomediretorio + File.separator + idUnico;
        File file = new File(filePath);

        if (!file.exists()) {
            return false;
        }

        if (!file.delete()) {
            System.err.println("Erro ao excluir o arquivo: " + filePath);
            return false;
        }

        return true;
    }

    public Entidade buscar(String idUnico) {
        String filePath = nomediretorio + File.separator + idUnico;
        File file = new File(filePath);

        if (!file.exists()) {
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Entidade) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Entidade[] buscarTodos() {
        File directory = new File(nomediretorio);
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            return new Entidade[0];
        }

        List<Entidade> entidades = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    Entidade entidade = (Entidade) ois.readObject();
                    entidades.add(entidade);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

        return entidades.toArray(new Entidade[0]);
    }
}
