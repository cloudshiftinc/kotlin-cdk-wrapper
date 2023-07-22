@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace

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
