@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation

@CdkDslMarker
public class CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl {
  private val cdkBuilder: CfnServiceNetworkServiceAssociation.DnsEntryProperty.Builder =
      CfnServiceNetworkServiceAssociation.DnsEntryProperty.builder()

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun hostedZoneId(hostedZoneId: String) {
    cdkBuilder.hostedZoneId(hostedZoneId)
  }

  public fun build(): CfnServiceNetworkServiceAssociation.DnsEntryProperty = cdkBuilder.build()
}
