@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupTextTransformationPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.TextTransformationProperty.Builder =
      CfnRuleGroup.TextTransformationProperty.builder()

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnRuleGroup.TextTransformationProperty = cdkBuilder.build()
}
