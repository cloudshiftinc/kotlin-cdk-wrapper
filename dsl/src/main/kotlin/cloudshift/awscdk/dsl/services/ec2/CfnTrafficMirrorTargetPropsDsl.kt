@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorTargetProps

@CdkDslMarker
public class CfnTrafficMirrorTargetPropsDsl {
  private val cdkBuilder: CfnTrafficMirrorTargetProps.Builder =
      CfnTrafficMirrorTargetProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId: String) {
    cdkBuilder.gatewayLoadBalancerEndpointId(gatewayLoadBalancerEndpointId)
  }

  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun networkLoadBalancerArn(networkLoadBalancerArn: String) {
    cdkBuilder.networkLoadBalancerArn(networkLoadBalancerArn)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnTrafficMirrorTargetProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
