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

package io.cloudshiftdev.awscdkdsl.services.neptunegraph

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.neptunegraph.CfnGraph
import software.amazon.awscdk.services.neptunegraph.CfnGraphProps

/**
 * Properties for defining a `CfnGraph`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptunegraph.*;
 * CfnGraphProps cfnGraphProps = CfnGraphProps.builder()
 * .provisionedMemory(123)
 * // the properties below are optional
 * .deletionProtection(false)
 * .graphName("graphName")
 * .publicConnectivity(false)
 * .replicaCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vectorSearchConfiguration(VectorSearchConfigurationProperty.builder()
 * .vectorSearchDimension(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html)
 */
@CdkDslMarker
public class CfnGraphPropsDsl {
    private val cdkBuilder: CfnGraphProps.Builder = CfnGraphProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     *   enabled. The graph can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     *   enabled. The graph can't be deleted when deletion protection is enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param graphName The graph name. For example: `my-graph-1` . The name must contain from 1 to
     *   63 letters, numbers, or hyphens, and its first character must be a letter. It cannot end
     *   with a hyphen or contain two consecutive hyphens.
     *
     * If you don't specify a graph name, a unique graph name is generated for you using the prefix
     * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
     */
    public fun graphName(graphName: String) {
        cdkBuilder.graphName(graphName)
    }

    /**
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     *   use for the graph. Min = 128
     */
    public fun provisionedMemory(provisionedMemory: Number) {
        cdkBuilder.provisionedMemory(provisionedMemory)
    }

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     *   internet. All access to graphs is IAM authenticated. When the graph is publicly available,
     *   its domain name system (DNS) endpoint resolves to the public IP address from the internet.
     *   When the graph isn't publicly available, you need to create a `PrivateGraphEndpoint` in a
     *   given VPC to ensure the DNS name resolves to a private IP address that is reachable from
     *   the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    public fun publicConnectivity(publicConnectivity: Boolean) {
        cdkBuilder.publicConnectivity(publicConnectivity)
    }

    /**
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     *   internet. All access to graphs is IAM authenticated. When the graph is publicly available,
     *   its domain name system (DNS) endpoint resolves to the public IP address from the internet.
     *   When the graph isn't publicly available, you need to create a `PrivateGraphEndpoint` in a
     *   given VPC to ensure the DNS name resolves to a private IP address that is reachable from
     *   the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     */
    public fun publicConnectivity(publicConnectivity: IResolvable) {
        cdkBuilder.publicConnectivity(publicConnectivity)
    }

    /**
     * @param replicaCount The number of replicas in other AZs. Default: If not specified, the
     *   default value is 1.
     */
    public fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
    }

    /**
     * @param tags Adds metadata tags to the new graph. These tags can also be used with cost
     *   allocation reporting, or used in a Condition statement in an IAM policy.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Adds metadata tags to the new graph. These tags can also be used with cost
     *   allocation reporting, or used in a Condition statement in an IAM policy.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     *   that will be loaded into the graph. The value is specified as `dimension=` value. Max =
     *   65,535
     */
    public fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable) {
        cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration)
    }

    /**
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     *   that will be loaded into the graph. The value is specified as `dimension=` value. Max =
     *   65,535
     */
    public fun vectorSearchConfiguration(
        vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty
    ) {
        cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration)
    }

    public fun build(): CfnGraphProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
