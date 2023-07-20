@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeDnsServiceDiscoveryPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder =
      CfnVirtualNode.DnsServiceDiscoveryProperty.builder()

  public fun hostname(hostname: String) {
    cdkBuilder.hostname(hostname)
  }

  public fun ipPreference(ipPreference: String) {
    cdkBuilder.ipPreference(ipPreference)
  }

  public fun responseType(responseType: String) {
    cdkBuilder.responseType(responseType)
  }

  public fun build(): CfnVirtualNode.DnsServiceDiscoveryProperty = cdkBuilder.build()
}
