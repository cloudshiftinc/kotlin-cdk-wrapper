@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse

@CdkDslMarker
public class LoadBalancerListenerContextResponseDsl {
  private val cdkBuilder: LoadBalancerListenerContextResponse.Builder =
      LoadBalancerListenerContextResponse.builder()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun build(): LoadBalancerListenerContextResponse {
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
