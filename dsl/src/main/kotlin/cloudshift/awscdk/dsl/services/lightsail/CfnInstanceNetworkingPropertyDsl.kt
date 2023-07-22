@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `Networking` is a property of the
 * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 * resource. It describes the public ports and the monthly amount of data transfer allocated for the
 * instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * NetworkingProperty networkingProperty = NetworkingProperty.builder()
 * .ports(List.of(PortProperty.builder()
 * .accessDirection("accessDirection")
 * .accessFrom("accessFrom")
 * .accessType("accessType")
 * .cidrListAliases(List.of("cidrListAliases"))
 * .cidrs(List.of("cidrs"))
 * .commonName("commonName")
 * .fromPort(123)
 * .ipv6Cidrs(List.of("ipv6Cidrs"))
 * .protocol("protocol")
 * .toPort(123)
 * .build()))
 * // the properties below are optional
 * .monthlyTransfer(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
 */
@CdkDslMarker
public class CfnInstanceNetworkingPropertyDsl {
  private val cdkBuilder: CfnInstance.NetworkingProperty.Builder =
      CfnInstance.NetworkingProperty.builder()

  private val _ports: MutableList<Any> = mutableListOf()

  /**
   * @param monthlyTransfer The monthly amount of data transfer, in GB, allocated for the instance.
   */
  public fun monthlyTransfer(monthlyTransfer: Number) {
    cdkBuilder.monthlyTransfer(monthlyTransfer)
  }

  /**
   * @param ports An array of ports to open on the instance. 
   */
  public fun ports(vararg ports: Any) {
    _ports.addAll(listOf(*ports))
  }

  /**
   * @param ports An array of ports to open on the instance. 
   */
  public fun ports(ports: Collection<Any>) {
    _ports.addAll(ports)
  }

  /**
   * @param ports An array of ports to open on the instance. 
   */
  public fun ports(ports: IResolvable) {
    cdkBuilder.ports(ports)
  }

  public fun build(): CfnInstance.NetworkingProperty {
    if(_ports.isNotEmpty()) cdkBuilder.ports(_ports)
    return cdkBuilder.build()
  }
}
