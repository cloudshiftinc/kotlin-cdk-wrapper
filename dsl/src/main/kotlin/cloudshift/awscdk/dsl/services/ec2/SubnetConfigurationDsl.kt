@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.SubnetConfiguration
import software.amazon.awscdk.services.ec2.SubnetType

@CdkDslMarker
public class SubnetConfigurationDsl {
  private val cdkBuilder: SubnetConfiguration.Builder = SubnetConfiguration.builder()

  /**
   * @param cidrMask The number of leading 1 bits in the routing mask.
   * The number of available IP addresses in each subnet of this group
   * will be equal to `2^(32 - cidrMask) - 2`.
   *
   * Valid values are `16--28`.
   */
  public fun cidrMask(cidrMask: Number) {
    cdkBuilder.cidrMask(cidrMask)
  }

  /**
   * @param mapPublicIpOnLaunch Controls if a public IP is associated to an instance at launch.
   */
  public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
    cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
  }

  /**
   * @param name Logical name for the subnet group. 
   * This name can be used when selecting VPC subnets to distinguish
   * between different subnet groups of the same type.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param reserved Controls if subnet IP space needs to be reserved.
   * When true, the IP space for the subnet is reserved but no actual
   * resources are provisioned. This space is only dependent on the
   * number of availability zones and on `cidrMask` - all other subnet
   * properties are ignored.
   */
  public fun reserved(reserved: Boolean) {
    cdkBuilder.reserved(reserved)
  }

  /**
   * @param subnetType The type of Subnet to configure. 
   * The Subnet type will control the ability to route and connect to the
   * Internet.
   */
  public fun subnetType(subnetType: SubnetType) {
    cdkBuilder.subnetType(subnetType)
  }

  public fun build(): SubnetConfiguration = cdkBuilder.build()
}
