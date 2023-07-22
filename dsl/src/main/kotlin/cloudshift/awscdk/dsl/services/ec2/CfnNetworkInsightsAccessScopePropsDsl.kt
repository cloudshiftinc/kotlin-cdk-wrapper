@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps

/**
 * Properties for defining a `CfnNetworkInsightsAccessScope`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScopeProps cfnNetworkInsightsAccessScopeProps =
 * CfnNetworkInsightsAccessScopeProps.builder()
 * .excludePaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
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
 * .build())
 * .source(PathStatementRequestProperty.builder()
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
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .matchPaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
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
 * .build())
 * .source(PathStatementRequestProperty.builder()
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
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopePropsDsl {
  private val cdkBuilder: CfnNetworkInsightsAccessScopeProps.Builder =
      CfnNetworkInsightsAccessScopeProps.builder()

  private val _excludePaths: MutableList<Any> = mutableListOf()

  private val _matchPaths: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param excludePaths The paths to exclude.
   */
  public fun excludePaths(vararg excludePaths: Any) {
    _excludePaths.addAll(listOf(*excludePaths))
  }

  /**
   * @param excludePaths The paths to exclude.
   */
  public fun excludePaths(excludePaths: Collection<Any>) {
    _excludePaths.addAll(excludePaths)
  }

  /**
   * @param excludePaths The paths to exclude.
   */
  public fun excludePaths(excludePaths: IResolvable) {
    cdkBuilder.excludePaths(excludePaths)
  }

  /**
   * @param matchPaths The paths to match.
   */
  public fun matchPaths(vararg matchPaths: Any) {
    _matchPaths.addAll(listOf(*matchPaths))
  }

  /**
   * @param matchPaths The paths to match.
   */
  public fun matchPaths(matchPaths: Collection<Any>) {
    _matchPaths.addAll(matchPaths)
  }

  /**
   * @param matchPaths The paths to match.
   */
  public fun matchPaths(matchPaths: IResolvable) {
    cdkBuilder.matchPaths(matchPaths)
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInsightsAccessScopeProps {
    if(_excludePaths.isNotEmpty()) cdkBuilder.excludePaths(_excludePaths)
    if(_matchPaths.isNotEmpty()) cdkBuilder.matchPaths(_matchPaths)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
