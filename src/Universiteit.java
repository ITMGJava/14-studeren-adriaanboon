public class Universiteit {

    public static void main(String[] args) {

        Studie st = new Studie();
        Student s1 = new Student();
        Student s2 = new Student();

        s1.StudentinArray("Alex Zhao", 89789);

        st.studenten[0] = s1.toString();

        s2.StudentinArray("Peter Roest", 72642);

        st.studenten[1] = s2.toString();

            for (int i=0; i<=9; i++) {
                System.out.println(st.studenten[i]);
            }
            st.vakken();
    }
}
