class Patient {
    private int patientId = 101;
    protected String disease = "Fever";

    public int getId() {
        return patientId;
    }

    public void getDetails() {
        System.out.println("ID: " + patientId + ", Disease: " + disease);
    }
}

class DoctorAccess extends Patient {
    public static void main(String[] args) {
        DoctorAccess d = new DoctorAccess();
        System.out.println("Disease: " + d.disease);
        System.out.println("ID: " + d.getId());
    }
}
