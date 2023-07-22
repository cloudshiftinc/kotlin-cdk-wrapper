@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceInstanceIpv6AddressPropertyDsl {
  private val cdkBuilder: CfnInstance.InstanceIpv6AddressProperty.Builder =
      CfnInstance.InstanceIpv6AddressProperty.builder()

  /**
   * @param ipv6Address The IPv6 address. 
   */
  public fun ipv6Address(ipv6Address: String) {
    cdkBuilder.ipv6Address(ipv6Address)
  }

  public fun build(): CfnInstance.InstanceIpv6AddressProperty = cdkBuilder.build()
}
