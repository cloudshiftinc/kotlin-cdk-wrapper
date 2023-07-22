@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct

@CdkDslMarker
public class InterfaceVpcEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: InterfaceVpcEndpoint.Builder = InterfaceVpcEndpoint.Builder.create(scope,
      id)

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * Limit to only those availability zones where the endpoint service can be created.
   *
   * Setting this to 'true' requires a lookup to be performed at synthesis time. Account
   * and region must be set on the containing stack for this to work.
   *
   * Default: false
   *
   * @param lookupSupportedAzs Limit to only those availability zones where the endpoint service can
   * be created. 
   */
  public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
    cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
  }

  /**
   * Whether to automatically allow VPC traffic to the endpoint.
   *
   * If enabled, all traffic to the endpoint from within the VPC will be
   * automatically allowed. This is done based on the VPC's CIDR range.
   *
   * Default: true
   *
   * @param open Whether to automatically allow VPC traffic to the endpoint. 
   */
  public fun `open`(`open`: Boolean) {
    cdkBuilder.`open`(`open`)
  }

  /**
   * Whether to associate a private hosted zone with the specified VPC.
   *
   * This
   * allows you to make requests to the service using its default DNS hostname.
   *
   * Default: set by the instance of IInterfaceVpcEndpointService, or true if
   * not defined by the instance of IInterfaceVpcEndpointService
   *
   * @param privateDnsEnabled Whether to associate a private hosted zone with the specified VPC. 
   */
  public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
    cdkBuilder.privateDnsEnabled(privateDnsEnabled)
  }

  /**
   * The security groups to associate with this interface VPC endpoint.
   *
   * Default: - a new security group is created
   *
   * @param securityGroups The security groups to associate with this interface VPC endpoint. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * The security groups to associate with this interface VPC endpoint.
   *
   * Default: - a new security group is created
   *
   * @param securityGroups The security groups to associate with this interface VPC endpoint. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * The service to use for this interface VPC endpoint.
   *
   * @param service The service to use for this interface VPC endpoint. 
   */
  public fun service(service: IInterfaceVpcEndpointService) {
    cdkBuilder.service(service)
  }

  /**
   * The subnets in which to create an endpoint network interface.
   *
   * At most one
   * per availability zone.
   *
   * Default: - private subnets
   *
   * @param subnets The subnets in which to create an endpoint network interface. 
   */
  public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnets)
    cdkBuilder.subnets(builder.build())
  }

  /**
   * The subnets in which to create an endpoint network interface.
   *
   * At most one
   * per availability zone.
   *
   * Default: - private subnets
   *
   * @param subnets The subnets in which to create an endpoint network interface. 
   */
  public fun subnets(subnets: SubnetSelection) {
    cdkBuilder.subnets(subnets)
  }

  /**
   * The VPC network in which the interface endpoint will be used.
   *
   * @param vpc The VPC network in which the interface endpoint will be used. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): InterfaceVpcEndpoint {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
