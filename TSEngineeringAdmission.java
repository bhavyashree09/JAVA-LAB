class NotEligibleForEngineering extends RuntimeException {
    NotEligibleForEngineering(String s) {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException {
    NotEligibleForVJIT(String s) {
        super(s);
    }
}

class TSEngineeringAdmission {
    public static void main(String[] args) {
        try {
            int score = Integer.parseInt(args[0]);

            if (score < 50) {
                throw new NotEligibleForEngineering("Not eligible for Engineering");
            }

            if (score < 70) {
                throw new NotEligibleForVJIT("Not eligible for VJIT");
            }

            System.out.println("Welcome to VJIT-Thanks For Your Registration!");
        }
        catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("Rest of the Code");
    }
}