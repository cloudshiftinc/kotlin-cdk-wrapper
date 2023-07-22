@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes

/**
 * Construction properties for an ImportedInterfaceVpcEndpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SecurityGroup securityGroup;
 * InterfaceVpcEndpointAttributes interfaceVpcEndpointAttributes =
 * InterfaceVpcEndpointAttributes.builder()
 * .port(123)
 * .vpcEndpointId("vpcEndpointId")
 * // the properties below are optional
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class InterfaceVpcEndpointAttributesDsl {
  private val cdkBuilder: InterfaceVpcEndpointAttributes.Builder =
      InterfaceVpcEndpointAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param port The port of the service of the interface VPC endpoint. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param securityGroups The security groups associated with the interface VPC endpoint.
   * If you wish to manage the network connections associated with this endpoint,
   * you will need to specify its security groups.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups associated with the interface VPC endpoint.
   * If you wish to manage the network connections associated with this endpoint,
   * you will need to specify its security groups.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param vpcEndpointId The interface VPC endpoint identifier. 
   */
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  public fun build(): InterfaceVpcEndpointAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
