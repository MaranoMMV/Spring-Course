package br.com.maranoart.service.impl;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.maranoart.domain.entity.Usuario;
import br.com.maranoart.domain.repository.UsuarioRepository; 

@Service
public class UsuarioServiceImpl implements UserDetailsService{

    @Autowired
    private PasswordEncoder encoder;

    @Autowired UsuarioRepository userRepository;
    
    public Usuario salvar(Usuario usuario){
        return userRepository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     
        Usuario usuario = userRepository.findByLogin(username)
                        .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));

        String[] roles = usuario.isAdmin() 
            ? new String[]{"ADMIN", "USER"} 
            : new String[]{"USER"};

        return User.builder()
                    .username(usuario.getLogin())
                    .password(usuario.getSenha())
                    .roles(roles)
                    .build();
    }
}