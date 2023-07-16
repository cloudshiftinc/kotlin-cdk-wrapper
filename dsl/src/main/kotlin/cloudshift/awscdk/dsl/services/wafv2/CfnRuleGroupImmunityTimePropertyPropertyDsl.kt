@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupImmunityTimePropertyPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.ImmunityTimePropertyProperty.Builder =
      CfnRuleGroup.ImmunityTimePropertyProperty.builder()

  public fun immunityTime(immunityTime: Number) {
    cdkBuilder.immunityTime(immunityTime)
  }

  public fun build(): CfnRuleGroup.ImmunityTimePropertyProperty = cdkBuilder.build()
}
