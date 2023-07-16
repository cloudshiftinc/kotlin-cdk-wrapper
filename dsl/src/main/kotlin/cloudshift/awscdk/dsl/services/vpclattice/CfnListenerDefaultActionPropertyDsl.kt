@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener

@CdkDslMarker
public class CfnListenerDefaultActionPropertyDsl {
  private val cdkBuilder: CfnListener.DefaultActionProperty.Builder =
      CfnListener.DefaultActionProperty.builder()

  public fun fixedResponse(fixedResponse: IResolvable) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  public fun fixedResponse(fixedResponse: CfnListener.FixedResponseProperty) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  public fun forward(forward: IResolvable) {
    cdkBuilder.forward(forward)
  }

  public fun forward(forward: CfnListener.ForwardProperty) {
    cdkBuilder.forward(forward)
  }

  public fun build(): CfnListener.DefaultActionProperty = cdkBuilder.build()
}
