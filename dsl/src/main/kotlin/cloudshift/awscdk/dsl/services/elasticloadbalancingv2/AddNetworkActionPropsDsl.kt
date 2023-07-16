@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction

@CdkDslMarker
public class AddNetworkActionPropsDsl {
  private val cdkBuilder: AddNetworkActionProps.Builder = AddNetworkActionProps.builder()

  public fun action(action: NetworkListenerAction) {
    cdkBuilder.action(action)
  }

  public fun build(): AddNetworkActionProps = cdkBuilder.build()
}
