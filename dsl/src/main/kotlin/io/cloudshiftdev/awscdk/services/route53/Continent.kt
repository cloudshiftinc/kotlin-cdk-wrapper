package io.cloudshiftdev.awscdk.services.route53

public enum class Continent(
    private val cdkObject: software.amazon.awscdk.services.route53.Continent,
) {
    AFRICA(software.amazon.awscdk.services.route53.Continent.AFRICA),
    ANTARCTICA(software.amazon.awscdk.services.route53.Continent.ANTARCTICA),
    ASIA(software.amazon.awscdk.services.route53.Continent.ASIA),
    EUROPE(software.amazon.awscdk.services.route53.Continent.EUROPE),
    OCEANIA(software.amazon.awscdk.services.route53.Continent.OCEANIA),
    NORTH_AMERICA(software.amazon.awscdk.services.route53.Continent.NORTH_AMERICA),
    SOUTH_AMERICA(software.amazon.awscdk.services.route53.Continent.SOUTH_AMERICA),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.Continent): Continent =
            when (cdkObject) {
                software.amazon.awscdk.services.route53.Continent.AFRICA -> Continent.AFRICA
                software.amazon.awscdk.services.route53.Continent.ANTARCTICA -> Continent.ANTARCTICA
                software.amazon.awscdk.services.route53.Continent.ASIA -> Continent.ASIA
                software.amazon.awscdk.services.route53.Continent.EUROPE -> Continent.EUROPE
                software.amazon.awscdk.services.route53.Continent.OCEANIA -> Continent.OCEANIA
                software.amazon.awscdk.services.route53.Continent.NORTH_AMERICA ->
                    Continent.NORTH_AMERICA
                software.amazon.awscdk.services.route53.Continent.SOUTH_AMERICA ->
                    Continent.SOUTH_AMERICA
            }

        internal fun unwrap(wrapped: Continent): software.amazon.awscdk.services.route53.Continent =
            wrapped.cdkObject
    }
}
