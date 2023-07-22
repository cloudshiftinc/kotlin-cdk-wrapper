@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.amazon.awscdk.services.ses.CfnReceiptRuleProps

@CdkDslMarker
public class CfnReceiptRulePropsDsl {
  private val cdkBuilder: CfnReceiptRuleProps.Builder = CfnReceiptRuleProps.builder()

  /**
   * @param after The name of an existing rule after which the new rule is placed.
   * If this parameter is null, the new rule is inserted at the beginning of the rule list.
   */
  public fun after(after: String) {
    cdkBuilder.after(after)
  }

  /**
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: IResolvable) {
    cdkBuilder.rule(rule)
  }

  /**
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: CfnReceiptRule.RuleProperty) {
    cdkBuilder.rule(rule)
  }

  /**
   * @param ruleSetName The name of the rule set where the receipt rule is added. 
   */
  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun build(): CfnReceiptRuleProps = cdkBuilder.build()
}
