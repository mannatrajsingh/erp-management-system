//package Test;
//
//import erp.service.*;
//import authen.*;
//import java.util.Map;
//
//public class TestMain {
//    public static void main(String[] args) {
//
//        AuthService auth = new AuthService();
//        Map<String, Double> componentWeights = Map.of(
//                "quiz", 0.4,    // 40%
//                "midsem", 0.6   // 60%
//        );
//
//////        auth.login("prof_rahul", "rahul123");
////        auth.login("varun","varun123");
//        auth.login("admin","admin123");
//        AdminService ss3 = new AdminService();
//        ss3.addUser("mannubadmos","Admin","imadmin","69","lkg",1,"none","none");
//
//        InstructorService ss1 = new InstructorService();
//        StudentService ss2 = new StudentService();
//
//
//
//
//
//
//        System.out.println(ss1.getMySections(2));
////        instructorId, int sectionId, int enrollmentId, String component, double scor
//        System.out.println(ss1.enterScore(2,203,3,"midsem",15));
//
//
//        ss1.registerForSection(201);
//
//
//
//        InstructorService ss = new InstructorService();
//
//        System.out.println(ss.getMySections(2));
//
//        instructorId, int sectionId, int enrollmentId, String component, double scor
//        System.out.println(ss.enterScore(2,201,303,"quiz",10));
//
//    }
//}
