@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps

@CdkDslMarker
public class CfnResolverDNSSECConfigPropsDsl {
  private val cdkBuilder: CfnResolverDNSSECConfigProps.Builder =
      CfnResolverDNSSECConfigProps.builder()

  /**
   * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC
   * validation status for.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverDNSSECConfigProps = cdkBuilder.build()
}
