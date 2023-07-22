@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.regional.CfnIPSet

@CdkDslMarker
public class CfnIPSetIPSetDescriptorPropertyDsl {
  private val cdkBuilder: CfnIPSet.IPSetDescriptorProperty.Builder =
      CfnIPSet.IPSetDescriptorProperty.builder()

  /**
   * @param type Specify `IPV4` or `IPV6` . 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param value Specify an IPv4 address by using CIDR notation. For example:. 
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 192.0.2.44, specify `192.0.2.44/32` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * from 192.0.2.0 to 192.0.2.255, specify `192.0.2.0/24` .
   *
   * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   *
   * Specify an IPv6 address by using CIDR notation. For example:
   *
   * * To configure AWS WAF to allow, block, or count requests that originated from the IP address
   * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * To configure AWS WAF to allow, block, or count requests that originated from IP addresses
   * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
   * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIPSet.IPSetDescriptorProperty = cdkBuilder.build()
}
