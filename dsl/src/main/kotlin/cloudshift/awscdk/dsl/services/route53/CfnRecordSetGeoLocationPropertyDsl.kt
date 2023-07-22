@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSet

@CdkDslMarker
public class CfnRecordSetGeoLocationPropertyDsl {
  private val cdkBuilder: CfnRecordSet.GeoLocationProperty.Builder =
      CfnRecordSet.GeoLocationProperty.builder()

  /**
   * @param continentCode For geolocation resource record sets, a two-letter abbreviation that
   * identifies a continent. Route 53 supports the following continent codes:.
   * * *AF* : Africa
   * * *AN* : Antarctica
   * * *AS* : Asia
   * * *EU* : Europe
   * * *OC* : Oceania
   * * *NA* : North America
   * * *SA* : South America
   *
   * Constraint: Specifying `ContinentCode` with either `CountryCode` or `SubdivisionCode` returns
   * an `InvalidInput` error.
   */
  public fun continentCode(continentCode: String) {
    cdkBuilder.continentCode(continentCode)
  }

  /**
   * @param countryCode For geolocation resource record sets, the two-letter code for a country.
   * Route 53 uses the two-letter country codes that are specified in [ISO standard 3166-1
   * alpha-2](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) .
   */
  public fun countryCode(countryCode: String) {
    cdkBuilder.countryCode(countryCode)
  }

  /**
   * @param subdivisionCode For geolocation resource record sets, the two-letter code for a state of
   * the United States.
   * Route 53 doesn't support any other values for `SubdivisionCode` . For a list of state
   * abbreviations, see [Appendix B: Two–Letter State and Possession
   * Abbreviations](https://docs.aws.amazon.com/https://pe.usps.com/text/pub28/28apb.htm) on the United
   * States Postal Service website.
   *
   * If you specify `subdivisioncode` , you must also specify `US` for `CountryCode` .
   */
  public fun subdivisionCode(subdivisionCode: String) {
    cdkBuilder.subdivisionCode(subdivisionCode)
  }

  public fun build(): CfnRecordSet.GeoLocationProperty = cdkBuilder.build()
}
