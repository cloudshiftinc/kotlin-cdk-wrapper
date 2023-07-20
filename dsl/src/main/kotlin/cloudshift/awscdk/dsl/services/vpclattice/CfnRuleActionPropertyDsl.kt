@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule

@CdkDslMarker
public class CfnRuleActionPropertyDsl {
  private val cdkBuilder: CfnRule.ActionProperty.Builder = CfnRule.ActionProperty.builder()

  public fun fixedResponse(fixedResponse: IResolvable) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  public fun fixedResponse(fixedResponse: CfnRule.FixedResponseProperty) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  public fun forward(forward: IResolvable) {
    cdkBuilder.forward(forward)
  }

  public fun forward(forward: CfnRule.ForwardProperty) {
    cdkBuilder.forward(forward)
  }

  public fun build(): CfnRule.ActionProperty = cdkBuilder.build()
}
