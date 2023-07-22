@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnService

@CdkDslMarker
public class CfnServiceDnsEntryPropertyDsl {
  private val cdkBuilder: CfnService.DnsEntryProperty.Builder =
      CfnService.DnsEntryProperty.builder()

  /**
   * @param domainName The domain name of the service.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param hostedZoneId The ID of the hosted zone.
   */
  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): CfnService.DnsEntryProperty = cdkBuilder.build()
}
