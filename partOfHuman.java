public enum partOfHuman {

    LEG("нога"),
    ARM("рука"),
    BODY("тело"),
    NECK("шея"),
    FACE("лицо"),
    HAIR("волосы"),
    KNEES("колени"),
    ELBOWS("локти");

    private String inRussian;

    partOfHuman(String inRussian) {
        this.inRussian = inRussian;
    }

    public String getInRussian() {
        return inRussian;
    }

}
