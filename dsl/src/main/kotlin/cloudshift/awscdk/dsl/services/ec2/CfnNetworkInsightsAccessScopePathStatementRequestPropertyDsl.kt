@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

/**
 * Describes a path statement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PathStatementRequestProperty pathStatementRequestProperty =
 * PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopePathStatementRequestPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAccessScope.PathStatementRequestProperty.Builder =
      CfnNetworkInsightsAccessScope.PathStatementRequestProperty.builder()

  /**
   * @param packetHeaderStatement The packet header statement.
   */
  public fun packetHeaderStatement(packetHeaderStatement: IResolvable) {
    cdkBuilder.packetHeaderStatement(packetHeaderStatement)
  }

  /**
   * @param packetHeaderStatement The packet header statement.
   */
  public
      fun packetHeaderStatement(packetHeaderStatement: CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty) {
    cdkBuilder.packetHeaderStatement(packetHeaderStatement)
  }

  /**
   * @param resourceStatement The resource statement.
   */
  public fun resourceStatement(resourceStatement: IResolvable) {
    cdkBuilder.resourceStatement(resourceStatement)
  }

  /**
   * @param resourceStatement The resource statement.
   */
  public
      fun resourceStatement(resourceStatement: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty) {
    cdkBuilder.resourceStatement(resourceStatement)
  }

  public fun build(): CfnNetworkInsightsAccessScope.PathStatementRequestProperty =
      cdkBuilder.build()
}
