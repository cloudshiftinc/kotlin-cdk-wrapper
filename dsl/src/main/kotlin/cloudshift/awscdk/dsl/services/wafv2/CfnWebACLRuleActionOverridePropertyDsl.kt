@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLRuleActionOverridePropertyDsl {
  private val cdkBuilder: CfnWebACL.RuleActionOverrideProperty.Builder =
      CfnWebACL.RuleActionOverrideProperty.builder()

  public fun actionToUse(actionToUse: IResolvable) {
    cdkBuilder.actionToUse(actionToUse)
  }

  public fun actionToUse(actionToUse: CfnWebACL.RuleActionProperty) {
    cdkBuilder.actionToUse(actionToUse)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnWebACL.RuleActionOverrideProperty = cdkBuilder.build()
}
