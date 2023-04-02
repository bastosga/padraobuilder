package org.example;

import java.util.Date;

public class Cliente {

        private int login;
        private String nome;
        private String cpf;
        private String rg;
        private String enderecoLogradouro;
        private int enderecoNumero;
        private String enderecoComplemento;
        private String enderecoBairro;
        private String enderecoCidade;
        private String enderecoUF;
        private String cep;
        private String email;
        private String celular;

        public Cliente() {
            this.login = 0;
            this.nome = "";
        }

        public int getLogin() {
            return login;
        }

        public void setLogin(int login) {
            this.login = login;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }


        public String getEnderecoLogradouro() {
            return enderecoLogradouro;
        }

        public void setEnderecoLogradouro(String enderecoLogradouro) {
            this.enderecoLogradouro = enderecoLogradouro;
        }

        public int getEnderecoNumero() {
            return enderecoNumero;
        }

        public void setEnderecoNumero(int enderecoNumero) {
            this.enderecoNumero = enderecoNumero;
        }

        public String getEnderecoComplemento() {
            return enderecoComplemento;
        }

        public void setEnderecoComplemento(String enderecoComplemento) {
            this.enderecoComplemento = enderecoComplemento;
        }

        public String getEnderecoBairro() {
            return enderecoBairro;
        }

        public void setEnderecoBairro(String enderecoBairro) {
            this.enderecoBairro = enderecoBairro;
        }

        public String getEnderecoCidade() {
            return enderecoCidade;
        }

        public void setEnderecoCidade(String enderecoCidade) {
            this.enderecoCidade = enderecoCidade;
        }

        public String getEnderecoUF() {
            return enderecoUF;
        }

        public void setEnderecoUF(String enderecoUF) {
            this.enderecoUF = enderecoUF;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }
    }
