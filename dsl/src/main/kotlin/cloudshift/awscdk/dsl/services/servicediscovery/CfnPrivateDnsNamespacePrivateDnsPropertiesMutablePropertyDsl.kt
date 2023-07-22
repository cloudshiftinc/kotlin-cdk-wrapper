@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace

@CdkDslMarker
public class CfnPrivateDnsNamespacePrivateDnsPropertiesMutablePropertyDsl {
  private val cdkBuilder: CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder =
      CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.builder()

  /**
   * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the private
   * DNS namespace.
   */
  public fun soa(soa: IResolvable) {
    cdkBuilder.soa(soa)
  }

  /**
   * @param soa Fields for the Start of Authority (SOA) record for the hosted zone for the private
   * DNS namespace.
   */
  public fun soa(soa: CfnPrivateDnsNamespace.SOAProperty) {
    cdkBuilder.soa(soa)
  }

  public fun build(): CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty =
      cdkBuilder.build()
}
