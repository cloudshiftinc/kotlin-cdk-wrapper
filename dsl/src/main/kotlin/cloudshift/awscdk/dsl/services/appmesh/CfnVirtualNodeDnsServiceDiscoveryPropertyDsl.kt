@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeDnsServiceDiscoveryPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder =
      CfnVirtualNode.DnsServiceDiscoveryProperty.builder()

  /**
   * @param hostname Specifies the DNS service discovery hostname for the virtual node. 
   */
  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  /**
   * @param ipPreference The preferred IP version that this virtual node uses.
   * Setting the IP preference on the virtual node only overrides the IP preference set for the mesh
   * on this specific node.
   */
  public fun ipPreference(ipPreference: String) {
    cdkBuilder.ipPreference(ipPreference)
  }

  /**
   * @param responseType Specifies the DNS response type for the virtual node.
   */
  public fun responseType(responseType: String) {
    cdkBuilder.responseType(responseType)
  }

  public fun build(): CfnVirtualNode.DnsServiceDiscoveryProperty = cdkBuilder.build()
}
