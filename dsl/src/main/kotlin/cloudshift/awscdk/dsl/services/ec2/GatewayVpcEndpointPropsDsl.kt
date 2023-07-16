@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.GatewayVpcEndpointProps
import software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection

@CdkDslMarker
public class GatewayVpcEndpointPropsDsl {
  private val cdkBuilder: GatewayVpcEndpointProps.Builder = GatewayVpcEndpointProps.builder()

  private val _subnets: MutableList<SubnetSelection> = mutableListOf()

  public fun service(service: IGatewayVpcEndpointService) {
    cdkBuilder.service(service)
  }

  public fun subnets(subnets: SubnetSelectionDsl.() -> Unit) {
    _subnets.add(SubnetSelectionDsl().apply(subnets).build())
  }

  public fun subnets(subnets: Collection<SubnetSelection>) {
    _subnets.addAll(subnets)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): GatewayVpcEndpointProps {
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    return cdkBuilder.build()
  }
}
