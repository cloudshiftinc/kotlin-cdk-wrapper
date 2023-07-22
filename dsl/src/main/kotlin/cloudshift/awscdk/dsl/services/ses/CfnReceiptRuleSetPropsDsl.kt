@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps

@CdkDslMarker
public class CfnReceiptRuleSetPropsDsl {
  private val cdkBuilder: CfnReceiptRuleSetProps.Builder = CfnReceiptRuleSetProps.builder()

  /**
   * @param ruleSetName The name of the receipt rule set to reorder.
   */
  public fun ruleSetName(ruleSetName: String) {
    cdkBuilder.ruleSetName(ruleSetName)
  }

  public fun build(): CfnReceiptRuleSetProps = cdkBuilder.build()
}
