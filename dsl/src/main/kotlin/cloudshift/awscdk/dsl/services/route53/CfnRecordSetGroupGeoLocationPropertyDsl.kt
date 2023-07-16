@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnRecordSetGroup

@CdkDslMarker
public class CfnRecordSetGroupGeoLocationPropertyDsl {
  private val cdkBuilder: CfnRecordSetGroup.GeoLocationProperty.Builder =
      CfnRecordSetGroup.GeoLocationProperty.builder()

  public fun continentCode(continentCode: String) {
    cdkBuilder.continentCode(continentCode)
  }

  public fun countryCode(countryCode: String) {
    cdkBuilder.countryCode(countryCode)
  }

  public fun subdivisionCode(subdivisionCode: String) {
    cdkBuilder.subdivisionCode(subdivisionCode)
  }

  public fun build(): CfnRecordSetGroup.GeoLocationProperty = cdkBuilder.build()
}
