@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

/**
 * DNS properties for the public DNS namespace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * PublicDnsPropertiesMutableProperty publicDnsPropertiesMutableProperty =
 * PublicDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-publicdnspropertiesmutable.html)
 */
@CdkDslMarker
public class CfnPublicDnsNamespacePublicDnsPropertiesMutablePropertyDsl {
  private val cdkBuilder: CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.Builder =
      CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.builder()

  /**
   * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
   */
  public fun soa(soa: IResolvable) {
    cdkBuilder.soa(soa)
  }

  /**
   * @param soa Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
   */
  public fun soa(soa: CfnPublicDnsNamespace.SOAProperty) {
    cdkBuilder.soa(soa)
  }

  public fun build(): CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty = cdkBuilder.build()
}
