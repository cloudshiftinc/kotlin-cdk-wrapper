@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

@CdkDslMarker
public class CfnPublicDnsNamespaceSOAPropertyDsl {
  private val cdkBuilder: CfnPublicDnsNamespace.SOAProperty.Builder =
      CfnPublicDnsNamespace.SOAProperty.builder()

  /**
   * @param ttl The time to live (TTL) for purposes of negative caching.
   */
  public fun ttl(ttl: Number) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CfnPublicDnsNamespace.SOAProperty = cdkBuilder.build()
}
