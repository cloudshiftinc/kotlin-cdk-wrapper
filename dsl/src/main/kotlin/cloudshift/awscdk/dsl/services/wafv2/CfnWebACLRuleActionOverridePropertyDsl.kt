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

  /**
   * @param actionToUse The override action to use, in place of the configured action of the rule in
   * the rule group. 
   */
  public fun actionToUse(actionToUse: IResolvable) {
    cdkBuilder.actionToUse(actionToUse)
  }

  /**
   * @param actionToUse The override action to use, in place of the configured action of the rule in
   * the rule group. 
   */
  public fun actionToUse(actionToUse: CfnWebACL.RuleActionProperty) {
    cdkBuilder.actionToUse(actionToUse)
  }

  /**
   * @param name The name of the rule to override. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnWebACL.RuleActionOverrideProperty = cdkBuilder.build()
}
