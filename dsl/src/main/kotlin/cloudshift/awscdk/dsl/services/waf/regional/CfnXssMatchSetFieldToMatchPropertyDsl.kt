@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSet

@CdkDslMarker
public class CfnXssMatchSetFieldToMatchPropertyDsl {
  private val cdkBuilder: CfnXssMatchSet.FieldToMatchProperty.Builder =
      CfnXssMatchSet.FieldToMatchProperty.builder()

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnXssMatchSet.FieldToMatchProperty = cdkBuilder.build()
}
