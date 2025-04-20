package modele;

public class Client {
    private int id;
    private String nom;
    private String email;
    private String motDePasse;
    private java.sql.Date dateNaissance;
    private String typeClient;
    private int pointsFidelite;

    // Constructeurs
    public Client() {}
    
    public Client(int id, String nom, String email, String motDePasse, java.sql.Date dateNaissance, String typeClient, int pointsFidelite) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.dateNaissance = dateNaissance;
        this.typeClient = typeClient;
        this.pointsFidelite = pointsFidelite;
    }

    // Getters / Setters
    // (à générer automatiquement dans ton IDE)

    public int getId() {
        return id;

    }
}
