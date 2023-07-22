@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnGeoMatchSet

@CdkDslMarker
public class CfnGeoMatchSetGeoMatchConstraintPropertyDsl {
  private val cdkBuilder: CfnGeoMatchSet.GeoMatchConstraintProperty.Builder =
      CfnGeoMatchSet.GeoMatchConstraintProperty.builder()

  /**
   * @param type The type of geographical area you want AWS WAF to search for. 
   * Currently `Country` is the only valid value.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value The country that you want AWS WAF to search for. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnGeoMatchSet.GeoMatchConstraintProperty = cdkBuilder.build()
}
