@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleActionPropertyDsl {
  private val cdkBuilder: CfnRule.ActionProperty.Builder = CfnRule.ActionProperty.builder()

  /**
   * @param fixedResponse Describes the rule action that returns a custom HTTP response.
   */
  public fun fixedResponse(fixedResponse: IResolvable) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  /**
   * @param fixedResponse Describes the rule action that returns a custom HTTP response.
   */
  public fun fixedResponse(fixedResponse: CfnRule.FixedResponseProperty) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  /**
   * @param forward The forward action.
   * Traffic that matches the rule is forwarded to the specified target groups.
   */
  public fun forward(forward: IResolvable) {
    cdkBuilder.forward(forward)
  }

  /**
   * @param forward The forward action.
   * Traffic that matches the rule is forwarded to the specified target groups.
   */
  public fun forward(forward: CfnRule.ForwardProperty) {
    cdkBuilder.forward(forward)
  }

  public fun build(): CfnRule.ActionProperty = cdkBuilder.build()
}
