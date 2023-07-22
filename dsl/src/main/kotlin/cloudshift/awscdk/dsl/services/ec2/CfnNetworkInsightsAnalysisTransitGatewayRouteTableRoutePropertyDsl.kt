@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a route in a transit gateway route table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TransitGatewayRouteTableRouteProperty transitGatewayRouteTableRouteProperty =
 * TransitGatewayRouteTableRouteProperty.builder()
 * .attachmentId("attachmentId")
 * .destinationCidr("destinationCidr")
 * .prefixListId("prefixListId")
 * .resourceId("resourceId")
 * .resourceType("resourceType")
 * .routeOrigin("routeOrigin")
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-transitgatewayroutetableroute.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAnalysisTransitGatewayRouteTableRoutePropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.Builder =
      CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty.builder()

  /**
   * @param attachmentId The ID of the route attachment.
   */
  public fun attachmentId(attachmentId: String) {
    cdkBuilder.attachmentId(attachmentId)
  }

  /**
   * @param destinationCidr The CIDR block used for destination matches.
   */
  public fun destinationCidr(destinationCidr: String) {
    cdkBuilder.destinationCidr(destinationCidr)
  }

  /**
   * @param prefixListId The ID of the prefix list.
   */
  public fun prefixListId(prefixListId: String) {
    cdkBuilder.prefixListId(prefixListId)
  }

  /**
   * @param resourceId The ID of the resource for the route attachment.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param resourceType The resource type for the route attachment.
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param routeOrigin The route origin. The following are the possible values:.
   * * static
   * * propagated
   */
  public fun routeOrigin(routeOrigin: String) {
    cdkBuilder.routeOrigin(routeOrigin)
  }

  /**
   * @param state The state of the route.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnNetworkInsightsAnalysis.TransitGatewayRouteTableRouteProperty =
      cdkBuilder.build()
}
