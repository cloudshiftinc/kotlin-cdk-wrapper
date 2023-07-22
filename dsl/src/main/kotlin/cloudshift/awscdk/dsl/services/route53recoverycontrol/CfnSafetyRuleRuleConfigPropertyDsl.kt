@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

@CdkDslMarker
public class CfnSafetyRuleRuleConfigPropertyDsl {
  private val cdkBuilder: CfnSafetyRule.RuleConfigProperty.Builder =
      CfnSafetyRule.RuleConfigProperty.builder()

  /**
   * @param inverted Logical negation of the rule. 
   * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
   */
  public fun inverted(inverted: Boolean) {
    cdkBuilder.inverted(inverted)
  }

  /**
   * @param inverted Logical negation of the rule. 
   * If the rule would usually evaluate true, it's evaluated as false, and vice versa.
   */
  public fun inverted(inverted: IResolvable) {
    cdkBuilder.inverted(inverted)
  }

  /**
   * @param threshold The value of N, when you specify an `ATLEAST` rule type. 
   * That is, `Threshold` is the number of controls that must be set when you specify an `ATLEAST`
   * type.
   */
  public fun threshold(threshold: Number) {
    cdkBuilder.threshold(threshold)
  }

  /**
   * @param type A rule can be one of the following: `ATLEAST` , `AND` , or `OR` . 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSafetyRule.RuleConfigProperty = cdkBuilder.build()
}
