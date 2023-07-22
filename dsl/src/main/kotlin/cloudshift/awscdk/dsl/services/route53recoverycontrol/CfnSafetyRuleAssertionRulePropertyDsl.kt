@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule

/**
 * An assertion rule enforces that, when you change a routing control state, that the criteria that
 * you set in the rule configuration is met.
 *
 * Otherwise, the change to the routing control is not accepted. For example, the criteria might be
 * that at least one routing control state is `On` after the transaction so that traffic continues to
 * flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * AssertionRuleProperty assertionRuleProperty = AssertionRuleProperty.builder()
 * .assertedControls(List.of("assertedControls"))
 * .waitPeriodMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53recoverycontrol-safetyrule-assertionrule.html)
 */
@CdkDslMarker
public class CfnSafetyRuleAssertionRulePropertyDsl {
  private val cdkBuilder: CfnSafetyRule.AssertionRuleProperty.Builder =
      CfnSafetyRule.AssertionRuleProperty.builder()

  private val _assertedControls: MutableList<String> = mutableListOf()

  /**
   * @param assertedControls The routing controls that are part of transactions that are evaluated
   * to determine if a request to change a routing control state is allowed. 
   * For example, you might include three routing controls, one for each of three AWS Regions.
   */
  public fun assertedControls(vararg assertedControls: String) {
    _assertedControls.addAll(listOf(*assertedControls))
  }

  /**
   * @param assertedControls The routing controls that are part of transactions that are evaluated
   * to determine if a request to change a routing control state is allowed. 
   * For example, you might include three routing controls, one for each of three AWS Regions.
   */
  public fun assertedControls(assertedControls: Collection<String>) {
    _assertedControls.addAll(assertedControls)
  }

  /**
   * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request
   * against the target routing controls will fail. 
   * This helps prevent flapping of state. The wait period is 5000 ms by default, but you can choose
   * a custom value.
   */
  public fun waitPeriodMs(waitPeriodMs: Number) {
    cdkBuilder.waitPeriodMs(waitPeriodMs)
  }

  public fun build(): CfnSafetyRule.AssertionRuleProperty {
    if(_assertedControls.isNotEmpty()) cdkBuilder.assertedControls(_assertedControls)
    return cdkBuilder.build()
  }
}
