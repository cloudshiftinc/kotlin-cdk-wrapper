@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSet

@CdkDslMarker
public class CfnRecordSetGeoLocationPropertyDsl {
  private val cdkBuilder: CfnRecordSet.GeoLocationProperty.Builder =
      CfnRecordSet.GeoLocationProperty.builder()

  public fun continentCode(continentCode: String) {
    cdkBuilder.continentCode(continentCode)
  }

  public fun countryCode(countryCode: String) {
    cdkBuilder.countryCode(countryCode)
  }

  public fun subdivisionCode(subdivisionCode: String) {
    cdkBuilder.subdivisionCode(subdivisionCode)
  }

  public fun build(): CfnRecordSet.GeoLocationProperty = cdkBuilder.build()
}
