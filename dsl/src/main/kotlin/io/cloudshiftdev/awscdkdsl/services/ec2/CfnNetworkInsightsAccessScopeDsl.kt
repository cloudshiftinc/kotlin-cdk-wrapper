@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.constructs.Construct

/**
 * Describes a Network Access Scope.
 *
 * A Network Access Scope defines outbound (egress) and inbound (ingress) traffic patterns,
 * including sources, destinations, paths, and traffic types.
 *
 * Network Access Analyzer identifies unintended network access to your resources on AWS . When you
 * start an analysis on a Network Access Scope, Network Access Analyzer produces findings. For more
 * information, see the
 * [Network Access Analyzer User Guide](https://docs.aws.amazon.com/vpc/latest/network-access-analyzer/)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScope cfnNetworkInsightsAccessScope =
 * CfnNetworkInsightsAccessScope.Builder.create(this, "MyCfnNetworkInsightsAccessScope")
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
public class CfnNetworkInsightsAccessScopeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInsightsAccessScope.Builder =
        CfnNetworkInsightsAccessScope.Builder.create(scope, id)

    private val _excludePaths: MutableList<Any> = mutableListOf()

    private val _matchPaths: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     *
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(vararg excludePaths: Any) {
        _excludePaths.addAll(listOf(*excludePaths))
    }

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     *
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(excludePaths: Collection<Any>) {
        _excludePaths.addAll(excludePaths)
    }

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     *
     * @param excludePaths The paths to exclude.
     */
    public fun excludePaths(excludePaths: IResolvable) {
        cdkBuilder.excludePaths(excludePaths)
    }

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     *
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(vararg matchPaths: Any) {
        _matchPaths.addAll(listOf(*matchPaths))
    }

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     *
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(matchPaths: Collection<Any>) {
        _matchPaths.addAll(matchPaths)
    }

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     *
     * @param matchPaths The paths to match.
     */
    public fun matchPaths(matchPaths: IResolvable) {
        cdkBuilder.matchPaths(matchPaths)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNetworkInsightsAccessScope {
        if (_excludePaths.isNotEmpty()) cdkBuilder.excludePaths(_excludePaths)
        if (_matchPaths.isNotEmpty()) cdkBuilder.matchPaths(_matchPaths)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
