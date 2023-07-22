@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.constructs.Construct

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
