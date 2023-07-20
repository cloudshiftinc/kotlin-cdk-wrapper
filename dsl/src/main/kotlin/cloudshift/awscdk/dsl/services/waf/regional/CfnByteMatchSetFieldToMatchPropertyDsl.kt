@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet

@CdkDslMarker
public class CfnByteMatchSetFieldToMatchPropertyDsl {
  private val cdkBuilder: CfnByteMatchSet.FieldToMatchProperty.Builder =
      CfnByteMatchSet.FieldToMatchProperty.builder()

  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnByteMatchSet.FieldToMatchProperty = cdkBuilder.build()
}
