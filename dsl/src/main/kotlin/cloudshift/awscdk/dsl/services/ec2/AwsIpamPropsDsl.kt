@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.AwsIpamProps

@CdkDslMarker
public class AwsIpamPropsDsl {
  private val cdkBuilder: AwsIpamProps.Builder = AwsIpamProps.builder()

  public fun defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength: Number) {
    cdkBuilder.defaultSubnetIpv4NetmaskLength(defaultSubnetIpv4NetmaskLength)
  }

  public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
    cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
  }

  public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
    cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
  }

  public fun build(): AwsIpamProps = cdkBuilder.build()
}
