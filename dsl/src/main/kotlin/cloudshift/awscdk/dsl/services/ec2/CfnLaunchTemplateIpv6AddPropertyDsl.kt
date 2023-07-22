@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateIpv6AddPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.Ipv6AddProperty.Builder =
      CfnLaunchTemplate.Ipv6AddProperty.builder()

  /**
   * @param ipv6Address One or more specific IPv6 addresses from the IPv6 CIDR block range of your
   * subnet.
   * You can't use this option if you're specifying a number of IPv6 addresses.
   */
  public fun ipv6Address(ipv6Address: String) {
    cdkBuilder.ipv6Address(ipv6Address)
  }

  public fun build(): CfnLaunchTemplate.Ipv6AddProperty = cdkBuilder.build()
}
