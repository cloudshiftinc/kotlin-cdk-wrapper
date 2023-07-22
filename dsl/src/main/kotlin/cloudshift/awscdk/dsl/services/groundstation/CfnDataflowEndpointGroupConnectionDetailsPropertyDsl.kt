@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupConnectionDetailsPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder =
      CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder()

  /**
   * @param mtu the value to be set.
   */
  public fun mtu(mtu: Number) {
    cdkBuilder.mtu(mtu)
  }

  /**
   * @param socketAddress the value to be set.
   */
  public fun socketAddress(socketAddress: IResolvable) {
    cdkBuilder.socketAddress(socketAddress)
  }

  /**
   * @param socketAddress the value to be set.
   */
  public fun socketAddress(socketAddress: CfnDataflowEndpointGroup.SocketAddressProperty) {
    cdkBuilder.socketAddress(socketAddress)
  }

  public fun build(): CfnDataflowEndpointGroup.ConnectionDetailsProperty = cdkBuilder.build()
}
