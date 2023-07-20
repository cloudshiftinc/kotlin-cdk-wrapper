@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterface

@CdkDslMarker
public class CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl {
  private val cdkBuilder: CfnNetworkInterface.PrivateIpAddressSpecificationProperty.Builder =
      CfnNetworkInterface.PrivateIpAddressSpecificationProperty.builder()

  public fun primary(primary: Boolean) {
    cdkBuilder.primary(primary)
  }

  public fun primary(primary: IResolvable) {
    cdkBuilder.primary(primary)
  }

  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  public fun build(): CfnNetworkInterface.PrivateIpAddressSpecificationProperty = cdkBuilder.build()
}
