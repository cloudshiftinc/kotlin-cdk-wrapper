@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupBodyPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.BodyProperty.Builder = CfnRuleGroup.BodyProperty.builder()

  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnRuleGroup.BodyProperty = cdkBuilder.build()
}
