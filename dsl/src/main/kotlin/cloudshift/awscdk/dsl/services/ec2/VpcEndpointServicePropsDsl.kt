@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.amazon.awscdk.services.iam.ArnPrincipal

@CdkDslMarker
public class VpcEndpointServicePropsDsl {
  private val cdkBuilder: VpcEndpointServiceProps.Builder = VpcEndpointServiceProps.builder()

  private val _allowedPrincipals: MutableList<ArnPrincipal> = mutableListOf()

  private val _vpcEndpointServiceLoadBalancers: MutableList<IVpcEndpointServiceLoadBalancer> =
      mutableListOf()

  public fun acceptanceRequired(acceptanceRequired: Boolean) {
    cdkBuilder.acceptanceRequired(acceptanceRequired)
  }

  public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal) {
    _allowedPrincipals.addAll(listOf(*allowedPrincipals))
  }

  public fun allowedPrincipals(allowedPrincipals: Collection<ArnPrincipal>) {
    _allowedPrincipals.addAll(allowedPrincipals)
  }

  public fun vpcEndpointServiceLoadBalancers(vararg
      vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer) {
    _vpcEndpointServiceLoadBalancers.addAll(listOf(*vpcEndpointServiceLoadBalancers))
  }

  public
      fun vpcEndpointServiceLoadBalancers(vpcEndpointServiceLoadBalancers: Collection<IVpcEndpointServiceLoadBalancer>) {
    _vpcEndpointServiceLoadBalancers.addAll(vpcEndpointServiceLoadBalancers)
  }

  public fun build(): VpcEndpointServiceProps {
    if(_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
    if(_vpcEndpointServiceLoadBalancers.isNotEmpty())
        cdkBuilder.vpcEndpointServiceLoadBalancers(_vpcEndpointServiceLoadBalancers)
    return cdkBuilder.build()
  }
}
