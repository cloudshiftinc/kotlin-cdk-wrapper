@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.constructs.Construct

/**
 * Creates an empty receipt rule set.
 *
 * For information about setting up receipt rule sets, see the [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-concepts.html#receiving-email-concepts-rules)
 * .
 *
 * You can execute this operation no more than once per second.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnReceiptRuleSet cfnReceiptRuleSet = CfnReceiptRuleSet.Builder.create(this,
 * "MyCfnReceiptRuleSet")
 * .ruleSetName("ruleSetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html)
 */
@CdkDslMarker
public class CfnReceiptRuleSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReceiptRuleSet.Builder = CfnReceiptRuleSet.Builder.create(scope, id)

  /**
   * The name of the receipt rule set to reorder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname)
   * @param ruleSetName The name of the receipt rule set to reorder. 
   */
  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun build(): CfnReceiptRuleSet = cdkBuilder.build()
}
