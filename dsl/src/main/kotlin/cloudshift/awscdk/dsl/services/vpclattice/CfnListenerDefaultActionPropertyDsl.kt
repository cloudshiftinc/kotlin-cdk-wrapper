@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnListener

@CdkDslMarker
public class CfnListenerDefaultActionPropertyDsl {
  private val cdkBuilder: CfnListener.DefaultActionProperty.Builder =
      CfnListener.DefaultActionProperty.builder()

  /**
   * @param fixedResponse Information about an action that returns a custom HTTP response.
   */
  public fun fixedResponse(fixedResponse: IResolvable) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  /**
   * @param fixedResponse Information about an action that returns a custom HTTP response.
   */
  public fun fixedResponse(fixedResponse: CfnListener.FixedResponseProperty) {
    cdkBuilder.fixedResponse(fixedResponse)
  }

  /**
   * @param forward Describes a forward action.
   * You can use forward actions to route requests to one or more target groups.
   */
  public fun forward(forward: IResolvable) {
    cdkBuilder.forward(forward)
  }

  /**
   * @param forward Describes a forward action.
   * You can use forward actions to route requests to one or more target groups.
   */
  public fun forward(forward: CfnListener.ForwardProperty) {
    cdkBuilder.forward(forward)
  }

  public fun build(): CfnListener.DefaultActionProperty = cdkBuilder.build()
}
