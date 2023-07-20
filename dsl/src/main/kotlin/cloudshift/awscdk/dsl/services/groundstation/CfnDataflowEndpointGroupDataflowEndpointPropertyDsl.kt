@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

@CdkDslMarker
public class CfnDataflowEndpointGroupDataflowEndpointPropertyDsl {
  private val cdkBuilder: CfnDataflowEndpointGroup.DataflowEndpointProperty.Builder =
      CfnDataflowEndpointGroup.DataflowEndpointProperty.builder()

  public fun address(address: IResolvable) {
    cdkBuilder.address(address)
  }

  public fun address(address: CfnDataflowEndpointGroup.SocketAddressProperty) {
    cdkBuilder.address(address)
  }

  public fun mtu(mtu: Number) {
    cdkBuilder.mtu(mtu)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDataflowEndpointGroup.DataflowEndpointProperty = cdkBuilder.build()
}
