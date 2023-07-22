@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnWebACL

@CdkDslMarker
public class CfnWebACLRulePropertyDsl {
  private val cdkBuilder: CfnWebACL.RuleProperty.Builder = CfnWebACL.RuleProperty.builder()

  /**
   * @param action The action that AWS WAF takes when a web request matches all conditions in the
   * rule, such as allow, block, or count the request. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action The action that AWS WAF takes when a web request matches all conditions in the
   * rule, such as allow, block, or count the request. 
   */
  public fun action(action: CfnWebACL.ActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param priority The order in which AWS WAF evaluates the rules in a web ACL. 
   * AWS WAF evaluates rules with a lower value before rules with a higher value. The value must be
   * a unique integer. If you have multiple rules in a web ACL, the priority numbers do not need to be
   * consecutive.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param ruleId The ID of an AWS WAF Regional rule to associate with a web ACL. 
   */
  public fun ruleId(ruleId: String) {
    cdkBuilder.ruleId(ruleId)
  }

  public fun build(): CfnWebACL.RuleProperty = cdkBuilder.build()
}
