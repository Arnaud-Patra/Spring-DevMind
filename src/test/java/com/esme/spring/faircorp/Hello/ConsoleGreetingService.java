package com.emse.spring.faircorp.hello;



@Service
public class ConsoleGreetingService{

    @Autowired
    public void greet(String name){
        System.out.println(name);

    }

}



@Service
public class AuthenticationService {

    private final UserStore userStore;
    private final CertificateManager certManager;

    @Autowired
    public AuthenticationService(UserStore userStore, CertificateManager certManager) {
        this.userStore = userStore;
        this.certManager = certManager;
    }

    public AcccountStatus getAccountStatus(UserAccount account) {
        // here we can use the UserStore with this.userStore
    }
}