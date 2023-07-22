@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import software.amazon.awscdk.services.ec2.VpcEndpointService
import software.amazon.awscdk.services.iam.ArnPrincipal
import software.constructs.Construct

@CdkDslMarker
public class VpcEndpointServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: VpcEndpointService.Builder = VpcEndpointService.Builder.create(scope, id)

  private val _allowedPrincipals: MutableList<ArnPrincipal> = mutableListOf()

  private val _vpcEndpointServiceLoadBalancers: MutableList<IVpcEndpointServiceLoadBalancer> =
      mutableListOf()

  /**
   * Whether requests from service consumers to connect to the service through an endpoint must be
   * accepted.
   *
   * Default: true
   *
   * @param acceptanceRequired Whether requests from service consumers to connect to the service
   * through an endpoint must be accepted. 
   */
  public fun acceptanceRequired(acceptanceRequired: Boolean) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  /**
   * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
   *
   * These principals can connect to your service using VPC endpoints. Takes a
   * list of one or more ArnPrincipal.
   *
   * Default: - no principals
   *
   * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
   * from. 
   */
  public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal) {
    _allowedPrincipals.addAll(listOf(*allowedPrincipals))
  }

  /**
   * IAM users, IAM roles, or AWS accounts to allow inbound connections from.
   *
   * These principals can connect to your service using VPC endpoints. Takes a
   * list of one or more ArnPrincipal.
   *
   * Default: - no principals
   *
   * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
   * from. 
   */
  public fun allowedPrincipals(allowedPrincipals: Collection<ArnPrincipal>) {
    _allowedPrincipals.addAll(allowedPrincipals)
  }

  /**
   * One or more load balancers to host the VPC Endpoint Service.
   *
   * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
   * Service. 
   */
  public fun vpcEndpointServiceLoadBalancers(vararg
      vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer) {
    _vpcEndpointServiceLoadBalancers.addAll(listOf(*vpcEndpointServiceLoadBalancers))
  }

  /**
   * One or more load balancers to host the VPC Endpoint Service.
   *
   * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
   * Service. 
   */
  public
      fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: Collection<IVpcEndpointServiceLoadBalancer>) {
    _vpcEndpointServiceLoadBalancers.addAll(vpcEndpointServiceLoadBalancers)
  }

  public fun build(): VpcEndpointService {
    if(_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
    if(_vpcEndpointServiceLoadBalancers.isNotEmpty())
        cdkBuilder.vpcEndpointServiceLoadBalancers(_vpcEndpointServiceLoadBalancers)
    return cdkBuilder.build()
  }
}
