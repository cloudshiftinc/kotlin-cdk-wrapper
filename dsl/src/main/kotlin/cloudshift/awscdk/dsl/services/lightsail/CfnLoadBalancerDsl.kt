@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancer
import software.constructs.Construct

@CdkDslMarker
public class CfnLoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoadBalancer.Builder = CfnLoadBalancer.Builder.create(scope, id)

  private val _attachedInstances: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun attachedInstances(vararg attachedInstances: String) {
    _attachedInstances.addAll(listOf(*attachedInstances))
  }

  public fun attachedInstances(attachedInstances: Collection<String>) {
    _attachedInstances.addAll(attachedInstances)
  }

  public fun healthCheckPath(healthCheckPath: String) {
    cdkBuilder.healthCheckPath(healthCheckPath)
  }

  public fun instancePort(instancePort: Number) {
    cdkBuilder.instancePort(instancePort)
  }

  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
    cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
  }

  public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
    cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
  }

  public
      fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String) {
    cdkBuilder.sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun tlsPolicyName(tlsPolicyName: String) {
    cdkBuilder.tlsPolicyName(tlsPolicyName)
  }

  public fun build(): CfnLoadBalancer {
    if(_attachedInstances.isNotEmpty()) cdkBuilder.attachedInstances(_attachedInstances)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
