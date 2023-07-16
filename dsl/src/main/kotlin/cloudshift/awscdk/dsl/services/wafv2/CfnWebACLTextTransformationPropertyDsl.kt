@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLTextTransformationPropertyDsl {
  private val cdkBuilder: CfnWebACL.TextTransformationProperty.Builder =
      CfnWebACL.TextTransformationProperty.builder()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnWebACL.TextTransformationProperty = cdkBuilder.build()
}
