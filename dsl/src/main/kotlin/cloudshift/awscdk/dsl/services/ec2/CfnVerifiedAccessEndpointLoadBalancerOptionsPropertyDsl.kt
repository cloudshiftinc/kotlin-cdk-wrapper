@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint

@CdkDslMarker
public class CfnVerifiedAccessEndpointLoadBalancerOptionsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.Builder =
      CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty.builder()

  private val _subnetIds: MutableList<String> = mutableListOf()

  public fun loadBalancerArn(loadBalancerArn: String) {
    cdkBuilder.loadBalancerArn(loadBalancerArn)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  public fun build(): CfnVerifiedAccessEndpoint.LoadBalancerOptionsProperty {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
