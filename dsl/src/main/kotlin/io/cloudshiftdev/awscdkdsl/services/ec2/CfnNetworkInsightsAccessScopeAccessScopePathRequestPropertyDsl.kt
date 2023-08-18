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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

/**
 * Describes a path.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AccessScopePathRequestProperty accessScopePathRequestProperty =
 * AccessScopePathRequestProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopeAccessScopePathRequestPropertyDsl {
    private val cdkBuilder: CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.Builder =
        CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.builder()

    private val _throughResources: MutableList<Any> = mutableListOf()

    /** @param destination The destination. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination The destination. */
    public fun destination(
        destination: CfnNetworkInsightsAccessScope.PathStatementRequestProperty
    ) {
        cdkBuilder.destination(destination)
    }

    /** @param source The source. */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /** @param source The source. */
    public fun source(source: CfnNetworkInsightsAccessScope.PathStatementRequestProperty) {
        cdkBuilder.source(source)
    }

    /** @param throughResources The through resources. */
    public fun throughResources(vararg throughResources: Any) {
        _throughResources.addAll(listOf(*throughResources))
    }

    /** @param throughResources The through resources. */
    public fun throughResources(throughResources: Collection<Any>) {
        _throughResources.addAll(throughResources)
    }

    /** @param throughResources The through resources. */
    public fun throughResources(throughResources: IResolvable) {
        cdkBuilder.throughResources(throughResources)
    }

    public fun build(): CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty {
        if (_throughResources.isNotEmpty()) cdkBuilder.throughResources(_throughResources)
        return cdkBuilder.build()
    }
}
