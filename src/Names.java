class Names {
    public static void main(String[] args) {
        System.out.println("Podaj pięć imion: ");
        String[] names = NamesService.addNamesToArray();
        NamesService.reverseNamesAndSayHello(names);
    }
}
