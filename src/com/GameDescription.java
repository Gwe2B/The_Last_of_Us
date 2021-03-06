package com;

public enum GameDescription {
    intro("À l'été 2033, les villes sont désormais abandonnées et la nature a repris ses droits. Infectés et bandits rôdent et les rares zones sécurisées sont sous le contrôle de l’armée ou des Lucioles. Joel est désormais âgé d’environ 50 ans et vit dans une zone militaire de la ville de Boston. Le colis en question n’est autre qu’Ellie, une orpheline de 14 ans. Le duo accepte à contre-cœur l'offre de la cheffe rebelle."),
    firstCombat("Après avoir traversé divers passages en surface et en souterrain, ils sont arrêtés dans leur fuite par des militaires, qui procèdent alors à un contrôle d'infectiosité. Lorsque le soldat scanne Ellie, elle se retourne et l'attaque sauvagement. Joel découvre alors que l'adolescente réagit positivement au test d'infection. Le test établit qu'elle est contaminée depuis trois semaines, alors que l’infection se propage normalement au sein d'un hôte en un laps de temps maximum de deux jours. Ellie est donc une porteuse saine, immunisée aux spores. et la un rodeur LE COMBAT COMMENCE"),
    secondCombat("Apres ce combat Joel et Ellie se rende au Capitol et la toute les lucioles sont morte et decide d'aller rendre visite a tommy le frere de joel car il fesait partie des luciole avant. Mais en route il tombe sur un coureur. LE COMBAT COMMENCE"),
    thirdCombat("Apres ces evenement il trouve enfin Tommy et joel lui demande de s'occuper de Ellie et de l'emmener pour lui au luciole. Ellie entend tout et s'enfuit. Apres que joel et Tommy se soit mis a la recherche de l'adolecentes, Ils la touve ,joel commence discuter avec ellie et elle lui avoue que c'est la seule personne qui ne l'avait pas abandonner jusqu'a maintenant. donc joel decide de continuer le voyage avec ellie. en reprennant le voyage Ellie et Joel tombe sur un claqueurs. LE COMBAT COMMENCE"),
    lastCombat("Printemps 2034. Le duo arrive à Salt Lake City par l’interstate 15. Ils y sont notamment médusés à la vue d'un troupeau de girafes se baladant librement en ville. Ils traversent ensuite un tunnel menant à l’hôpital Sainte-Marie, où résident les Lucioles. Les survivants tombe sur le pire des infecter un colosse. LE COMBAT COMMENCE"),
    lastPart("Ellie ne sachant pas nager et le tunnel étant inondé, cette dernière se noie. Joel tente alors de lui pratiquer un massage cardiaque lorsque des Lucioles l’accostent. Ce dernier les ignore, mais un des soldats le frappe avec son fusil et il s’évanouit sur le coup. Une fois réveillé, Joel se retrouve dans une salle de l’hôpital, et apprend par le biais de Marlene qu’Ellie est sur le point d’être opérée, afin de fabriquer le vaccin contre l’infection. Cependant, l’opération consiste à déloger le champignon mutant qui se trouve dans, le cerveau de la fille. Le dernier choix arrive aller vous sauver ellie ou la laiser mourir pour faire un vaccins qui ne pourras peut etre pas marcher"),
    gameOver("Vous etes mort, c'est un Game over");

/* --------------------------- Instance Attribute --------------------------- */
    private String description;

    /**
     * Constructor
     * @param description The description
     */
    GameDescription(String description) { this.description = description; }

/* -------------------------- Accessors & mutators -------------------------- */
    /**
     * Get the description
     * @return The description
     */
    public String getDescription() { return this.description; }
}
