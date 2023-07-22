@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnReceiptRule
import software.constructs.Construct

@CdkDslMarker
public class CfnReceiptRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReceiptRule.Builder = CfnReceiptRule.Builder.create(scope, id)

  /**
   * The name of an existing rule after which the new rule is placed.
   *
   * If this parameter is null, the new rule is inserted at the beginning of the rule list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-after)
   * @param after The name of an existing rule after which the new rule is placed. 
   */
  public fun after(after: String) {
    cdkBuilder.after(after)
  }

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: IResolvable) {
    cdkBuilder.rule(rule)
  }

  /**
   * A data structure that contains the specified rule's name, actions, recipients, domains, enabled
   * status, scan status, and TLS policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rule)
   * @param rule A data structure that contains the specified rule's name, actions, recipients,
   * domains, enabled status, scan status, and TLS policy. 
   */
  public fun rule(rule: CfnReceiptRule.RuleProperty) {
    cdkBuilder.rule(rule)
  }

  /**
   * The name of the rule set where the receipt rule is added.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptrule.html#cfn-ses-receiptrule-rulesetname)
   * @param ruleSetName The name of the rule set where the receipt rule is added. 
   */
  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun build(): CfnReceiptRule = cdkBuilder.build()
}
