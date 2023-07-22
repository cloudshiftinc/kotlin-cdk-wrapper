@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

/**
 * Properties for the public DNS namespace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicediscovery.*;
 * PropertiesProperty propertiesProperty = PropertiesProperty.builder()
 * .dnsProperties(PublicDnsPropertiesMutableProperty.builder()
 * .soa(SOAProperty.builder()
 * .ttl(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-publicdnsnamespace-properties.html)
 */
@CdkDslMarker
public class CfnPublicDnsNamespacePropertiesPropertyDsl {
  private val cdkBuilder: CfnPublicDnsNamespace.PropertiesProperty.Builder =
      CfnPublicDnsNamespace.PropertiesProperty.builder()

  /**
   * @param dnsProperties DNS properties for the public DNS namespace.
   */
  public fun dnsProperties(dnsProperties: IResolvable) {
    cdkBuilder.dnsProperties(dnsProperties)
  }

  /**
   * @param dnsProperties DNS properties for the public DNS namespace.
   */
  public
      fun dnsProperties(dnsProperties: CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty) {
    cdkBuilder.dnsProperties(dnsProperties)
  }

  public fun build(): CfnPublicDnsNamespace.PropertiesProperty = cdkBuilder.build()
}
