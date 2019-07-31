package payroll;

class EntityNotFoundException extends RuntimeException {

    EntityNotFoundException(Long id, String name) {
        System.out.println("Could not find " + name + " " + id);
    }
}
