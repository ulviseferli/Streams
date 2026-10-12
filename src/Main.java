//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    //Task1

    List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

    List<Integer> result = list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .toList();

    System.out.println(result);

    //Task2

    List<String> list = List.of("java", "stream", "is", "powerful", "java",
            "api", "lambda", "stream", "code");

    List<String> result =  list.stream()
            .distinct()
            .filter(x -> x.length() > 3)
            .sorted(Comparator.comparing(String :: length).reversed())
            .limit(3)
            .toList();

    System.out.println(list);
    System.out.println(result);

    //Task3

    List<Employee> employees = Arrays.asList(
            new Employee("Ali", "IT", 2000d, 25),
            new Employee("Aysel", "HR", 1500d, 32),
            new Employee("Murad", "IT", 3000d, 35),
            new Employee("Nigar", "Finance", 2500d, 28)
    );

    Optional<Employee> maxSalary = employees.stream()
            .max(Comparator.comparingDouble(Employee::getSalary));

    Double average = employees.stream()
            .mapToDouble(x -> x.getSalary())
            .average()
            .orElse(0);

    System.out.println(average);

    double sum = employees.stream()
            .filter(e -> e.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .sum();

    System.out.println(sum);

    //Task5

    List<String> epoct = List.of("a@gmail.com","b@gmail.com","a@gmail.com","c@gmail.com");


     Long count =  epoct.stream()
            .map(x -> x.toLowerCase())
            .filter(x -> x.endsWith("@gmail.com"))
            .distinct()
            .count();

    System.out.println(count);


    //Task6

    List<String> names = List.of("Aysel","Orxan","Leyla");
    names.forEach(x -> System.out.println("Telebe: " + x));



    //Task7

    List<Integer> nums = List.of(5,12,8,15,20);

    nums.stream()
            .filter(x -> x > 10)
            .forEach(x -> System.out.println("Eded: " + x));


    //Task8

    Map<String,Integer> map = new HashMap<>();
    map.put("Riyaziyyat",75);
    map.put("Tarix",65);
    map.put("Fizika",90);

    map.forEach((key,value) -> {
        System.out.println(key + " -> " + value);
    });



}