@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace

@CdkDslMarker
public class CfnPrivateDnsNamespacePropertiesPropertyDsl {
  private val cdkBuilder: CfnPrivateDnsNamespace.PropertiesProperty.Builder =
      CfnPrivateDnsNamespace.PropertiesProperty.builder()

  /**
   * @param dnsProperties DNS properties for the private DNS namespace.
   */
  public fun dnsProperties(dnsProperties: IResolvable) {
    cdkBuilder.dnsProperties(dnsProperties)
  }

  /**
   * @param dnsProperties DNS properties for the private DNS namespace.
   */
  public
      fun dnsProperties(dnsProperties: CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty) {
    cdkBuilder.dnsProperties(dnsProperties)
  }

  public fun build(): CfnPrivateDnsNamespace.PropertiesProperty = cdkBuilder.build()
}
