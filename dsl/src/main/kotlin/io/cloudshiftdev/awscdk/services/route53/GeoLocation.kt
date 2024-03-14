package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class GeoLocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.GeoLocation,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun continentCode(): Continent? =
      unwrap(this).getContinentCode()?.let(Continent::wrap)

  /**
   *
   */
  public open fun countryCode(): String? = unwrap(this).getCountryCode()

  /**
   *
   */
  public open fun subdivisionCode(): String? = unwrap(this).getSubdivisionCode()

  public companion object {
    public fun continent(continentCode: Continent): GeoLocation =
        software.amazon.awscdk.services.route53.GeoLocation.continent(continentCode.let(Continent::unwrap)).let(GeoLocation::wrap)

    public fun country(countryCode: String): GeoLocation =
        software.amazon.awscdk.services.route53.GeoLocation.country(countryCode).let(GeoLocation::wrap)

    public fun doDefault(): GeoLocation =
        software.amazon.awscdk.services.route53.GeoLocation.doDefault().let(GeoLocation::wrap)

    public fun subdivision(subdivisionCode: String): GeoLocation =
        software.amazon.awscdk.services.route53.GeoLocation.subdivision(subdivisionCode).let(GeoLocation::wrap)

    public fun subdivision(subdivisionCode: String, countryCode: String): GeoLocation =
        software.amazon.awscdk.services.route53.GeoLocation.subdivision(subdivisionCode,
        countryCode).let(GeoLocation::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.GeoLocation): GeoLocation =
        GeoLocation(cdkObject)

    internal fun unwrap(wrapped: GeoLocation): software.amazon.awscdk.services.route53.GeoLocation =
        wrapped.cdkObject
  }
}
