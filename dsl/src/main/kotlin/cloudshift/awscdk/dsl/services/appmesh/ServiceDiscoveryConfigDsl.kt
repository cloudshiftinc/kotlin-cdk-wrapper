@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig

@CdkDslMarker
public class ServiceDiscoveryConfigDsl {
  private val cdkBuilder: ServiceDiscoveryConfig.Builder = ServiceDiscoveryConfig.builder()

  /**
   * @param cloudmap Cloud Map based Service Discovery.
   */
  public fun cloudmap(cloudmap: CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl()
    builder.apply(cloudmap)
    cdkBuilder.cloudmap(builder.build())
  }

  /**
   * @param cloudmap Cloud Map based Service Discovery.
   */
  public fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
    cdkBuilder.cloudmap(cloudmap)
  }

  /**
   * @param dns DNS based Service Discovery.
   */
  public fun dns(dns: CfnVirtualNodeDnsServiceDiscoveryPropertyDsl.() -> Unit = {}) {
    val builder = CfnVirtualNodeDnsServiceDiscoveryPropertyDsl()
    builder.apply(dns)
    cdkBuilder.dns(builder.build())
  }

  /**
   * @param dns DNS based Service Discovery.
   */
  public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
    cdkBuilder.dns(dns)
  }

  public fun build(): ServiceDiscoveryConfig = cdkBuilder.build()
}
