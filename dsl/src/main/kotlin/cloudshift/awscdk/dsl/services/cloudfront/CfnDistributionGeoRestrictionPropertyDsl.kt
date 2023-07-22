@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionGeoRestrictionPropertyDsl {
  private val cdkBuilder: CfnDistribution.GeoRestrictionProperty.Builder =
      CfnDistribution.GeoRestrictionProperty.builder()

  private val _locations: MutableList<String> = mutableListOf()

  /**
   * @param locations A complex type that contains a `Location` element for each country in which
   * you want CloudFront either to distribute your content ( `whitelist` ) or not distribute your
   * content ( `blacklist` ).
   * The `Location` element is a two-letter, uppercase country code for a country that you want to
   * include in your `blacklist` or `whitelist` . Include one `Location` element for each country.
   *
   * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of countries
   * and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International Organization for
   * Standardization* website. You can also refer to the country list on the CloudFront console, which
   * includes both country names and codes.
   */
  public fun locations(vararg locations: String) {
    _locations.addAll(listOf(*locations))
  }

  /**
   * @param locations A complex type that contains a `Location` element for each country in which
   * you want CloudFront either to distribute your content ( `whitelist` ) or not distribute your
   * content ( `blacklist` ).
   * The `Location` element is a two-letter, uppercase country code for a country that you want to
   * include in your `blacklist` or `whitelist` . Include one `Location` element for each country.
   *
   * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of countries
   * and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International Organization for
   * Standardization* website. You can also refer to the country list on the CloudFront console, which
   * includes both country names and codes.
   */
  public fun locations(locations: Collection<String>) {
    _locations.addAll(locations)
  }

  /**
   * @param restrictionType The method that you want to use to restrict distribution of your content
   * by country:. 
   * * `none` : No geo restriction is enabled, meaning access to content is not restricted by client
   * geo location.
   * * `blacklist` : The `Location` elements specify the countries in which you don't want
   * CloudFront to distribute your content.
   * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront to
   * distribute your content.
   */
  public fun restrictionType(restrictionType: String) {
    cdkBuilder.restrictionType(restrictionType)
  }

  public fun build(): CfnDistribution.GeoRestrictionProperty {
    if(_locations.isNotEmpty()) cdkBuilder.locations(_locations)
    return cdkBuilder.build()
  }
}
