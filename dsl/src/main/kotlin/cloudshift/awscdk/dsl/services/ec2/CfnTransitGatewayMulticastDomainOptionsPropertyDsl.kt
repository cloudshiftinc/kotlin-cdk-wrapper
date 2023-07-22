@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain

@CdkDslMarker
public class CfnTransitGatewayMulticastDomainOptionsPropertyDsl {
  private val cdkBuilder: CfnTransitGatewayMulticastDomain.OptionsProperty.Builder =
      CfnTransitGatewayMulticastDomain.OptionsProperty.builder()

  /**
   * @param autoAcceptSharedAssociations Indicates whether to automatically accept cross-account
   * subnet associations that are associated with the transit gateway multicast domain.
   */
  public fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String) {
    cdkBuilder.autoAcceptSharedAssociations(autoAcceptSharedAssociations)
  }

  /**
   * @param igmpv2Support Specify whether to enable Internet Group Management Protocol (IGMP)
   * version 2 for the transit gateway multicast domain.
   */
  public fun igmpv2Support(igmpv2Support: String) {
    cdkBuilder.igmpv2Support(igmpv2Support)
  }

  /**
   * @param staticSourcesSupport Specify whether to enable support for statically configuring
   * multicast group sources for a domain.
   */
  public fun staticSourcesSupport(staticSourcesSupport: String) {
    cdkBuilder.staticSourcesSupport(staticSourcesSupport)
  }

  public fun build(): CfnTransitGatewayMulticastDomain.OptionsProperty = cdkBuilder.build()
}
