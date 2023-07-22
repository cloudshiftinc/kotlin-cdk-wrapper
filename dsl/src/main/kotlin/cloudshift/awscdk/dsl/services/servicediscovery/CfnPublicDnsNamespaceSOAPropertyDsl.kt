@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

/**
 * Start of Authority (SOA) properties for a public or private DNS namespace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * SOAProperty sOAProperty = SOAProperty.builder()
 * .ttl(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-soa.html)
 */
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
