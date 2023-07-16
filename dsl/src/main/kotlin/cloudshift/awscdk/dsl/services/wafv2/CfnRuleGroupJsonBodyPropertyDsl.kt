@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupJsonBodyPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.JsonBodyProperty.Builder =
      CfnRuleGroup.JsonBodyProperty.builder()

  public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
    cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
  }

  public fun matchPattern(matchPattern: IResolvable) {
    cdkBuilder.matchPattern(matchPattern)
  }

  public fun matchPattern(matchPattern: CfnRuleGroup.JsonMatchPatternProperty) {
    cdkBuilder.matchPattern(matchPattern)
  }

  public fun matchScope(matchScope: String) {
    cdkBuilder.matchScope(matchScope)
  }

  public fun oversizeHandling(oversizeHandling: String) {
    cdkBuilder.oversizeHandling(oversizeHandling)
  }

  public fun build(): CfnRuleGroup.JsonBodyProperty = cdkBuilder.build()
}
