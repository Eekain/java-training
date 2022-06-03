package inheritance                                                                                                     ;

public class ContractMain                                                                                               {

    public static void main(String[] args)                                                                              {
        Contract contract = new Contract                                                                                (
                "Puskás kalandjai"
                                                                                                                        )
                                                                                                                        ;
        contract.getTitle()                                                                                             ;

        ContractWithAttachment another
                = new ContractWithAttachment
                                                                                                                        (
                        "Perifériás gépelés", "A perifériás látás hépelés közben.xml"
                                                                                                                        )
                                                                                                                        ;
        another.getTitle()                                                                                              ;
        another.getAttachment()                                                                                         ;
                                                                                                                        }
                                                                                                                        }
