package br.ufms.cpcx.balan.service;

import br.ufms.cpcx.balan.entity.Cliente;
import br.ufms.cpcx.balan.enuns.EGenero;
import br.ufms.cpcx.balan.repository.LambdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Service
public class LambdaService {
    @Autowired
    private LambdaRepository lambdaRepository;


    public List<Object> findAll() {
        Stream<String> teste = lambdaRepository.findAll()
                .stream()
                .filter(cliente -> cliente.getGenero().equals(EGenero.MASCULINO))
                .filter(cliente -> cliente.getIdade()<=10)
                .sorted(Comparator.comparing(Cliente::getId))
                .map(Cliente::getName);

        System.out.println("1");

         teste.forEach(System.out::println);
        return null;
//        return null;
    }

//6
//    public List<Cliente> findAll() {
//        lambdaRepository.findAll().forEach(System.out::println);
////        lambdaRepository.findAll().forEach(u -> System.out.println(u.toString()));
//        return null;
//    }
//
//5
//    public List<Cliente> findAll() {
//        lambdaRepository.findAll().forEach(u -> System.out.println(u.getName()));
//        return null;
//    }
//4
//    public List<Cliente> findAll() {
//        Consumer<Cliente> mostrador = u -> System.out.println(u.getName());
//        lambdaRepository.findAll().forEach(mostrador);
//        return null;
//    }
//
//3
//    public List<Cliente> findAll() {
//        Consumer<Cliente> mostrador = (Cliente u) -> {System.out.println(u.getName());}
//        lambdaRepository.findAll().forEach(mostrador);
//        return null;
//    }
// 2
//    public List<Cliente> findAll() {
//        lambdaRepository.findAll().forEach(new Consumer<Cliente>() {
//            public void accept(Cliente u) {
//                System.out.println(u.getName());
//            }
//        });
//        return null;
//    }
// 1
//    public List<Cliente> findAll(){
//        Mostrador mostrador = new Mostrador();
//        lambdaRepository.findAll().forEach(mostrador);
//        return null;
//    }
//
//    class Mostrador implements Consumer<Cliente> {
//        public void accept(Cliente u) {
//            System.out.println(u.getName());
//        }
//    }

}
