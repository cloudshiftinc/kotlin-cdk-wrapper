@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Routing based on geographical location.
 *
 * Example:
 *
 * ```
 * HostedZone myZone;
 * // continent
 * // continent
 * ARecord.Builder.create(this, "ARecordGeoLocationContinent")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.0", "5.6.7.0"))
 * .geoLocation(GeoLocation.continent(Continent.EUROPE))
 * .build();
 * // country
 * // country
 * ARecord.Builder.create(this, "ARecordGeoLocationCountry")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.1", "5.6.7.1"))
 * .geoLocation(GeoLocation.country("DE"))
 * .build();
 * // subdivision
 * // subdivision
 * ARecord.Builder.create(this, "ARecordGeoLocationSubDividion")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.2", "5.6.7.2"))
 * .geoLocation(GeoLocation.subdivision("WA"))
 * .build();
 * // default (wildcard record if no specific record is found)
 * // default (wildcard record if no specific record is found)
 * ARecord.Builder.create(this, "ARecordGeoLocationDefault")
 * .zone(myZone)
 * .target(RecordTarget.fromIpAddresses("1.2.3.3", "5.6.7.3"))
 * .geoLocation(GeoLocation.default())
 * .build();
 * ```
 */
public open class GeoLocation(
  cdkObject: software.amazon.awscdk.services.route53.GeoLocation,
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
        wrapped.cdkObject as software.amazon.awscdk.services.route53.GeoLocation
  }
}
