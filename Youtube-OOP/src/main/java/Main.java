public class Main {
    public static void main(String[] args) {

        // interface çok önemli abstrack sınıf ile arasındaki fark nedir.
        // iş yapan operasyonların sınıfların operasyonlarını sadece
        // imza seviyesinde yazarak yazılımda bağımlılığı korumak adına yapılan çalışmalardır.

        System.out.println("-------------------------------------------------------");
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();
        System.out.println("-------------------------------------------------------");
        CustomerManager customerManager2 = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();




    }
}

/** Öğrenme aşamasında verimsiz de olsa mantığı kavramak için adım adım yazılan kodlar | Hocayı takip ederek yazıldı.
 * CreditManager creditManager = new CreditManager();
 *         creditManager.Save();
 *         creditManager.Calculate();
 *
 *         Customer customer = new Customer(); // instance creation !!0
 *         customer.setId(1);
 *         customer.setCity("Dalyan");
 *
 *
 *         CustomerManager customerManager = new CustomerManager(customer);
 *         customerManager.Save();
 *         customerManager.Delete();
 *
 *
 *         Comany comany = new Comany();
 *         comany.setTaxNumber("88888888888");
 *         comany.setCompanyName("Beko");
 *         comany.setId(100);
 *
 *         CustomerManager customerManager2=new CustomerManager(new Person());
 *
 *         Person person = new Person();
 *         person.setFristName("Melisa");
 *         person.setNationalIdentity("1111111111111");
 *
 *         Customer c1 = new Customer();
 *         Customer c2 = new Person();
 *         Customer c3 = new Comany();
 */