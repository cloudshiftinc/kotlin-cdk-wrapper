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
import software.constructs.Construct

/**
 * The `AWS ::NeptuneGraph::Graph` resource creates an graph.
 *
 * is a memory-optimized graph database engine for analytics. For more information, see
 * [](https://docs.aws.amazon.com/neptune-analytics/latest/userguide/what-is-neptune-analytics.html)
 * .
 *
 * You can use `AWS ::NeptuneGraph::Graph.DeletionProtection` to help guard against unintended
 * deletion of your graph.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptunegraph.*;
 * CfnGraph cfnGraph = CfnGraph.Builder.create(this, "MyCfnGraph")
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
public class CfnGraphDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGraph.Builder = CfnGraph.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     *
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * A value that indicates whether the graph has deletion protection enabled.
     *
     * The graph can't be deleted when deletion protection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-deletionprotection)
     *
     * @param deletionProtection A value that indicates whether the graph has deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: IResolvable) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * The graph name. For example: `my-graph-1` .
     *
     * The name must contain from 1 to 63 letters, numbers, or hyphens, and its first character must
     * be a letter. It cannot end with a hyphen or contain two consecutive hyphens.
     *
     * If you don't specify a graph name, a unique graph name is generated for you using the prefix
     * `graph-for` , followed by a combination of `Stack Name` and a `UUID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-graphname)
     *
     * @param graphName The graph name. For example: `my-graph-1` .
     */
    public fun graphName(graphName: String) {
        cdkBuilder.graphName(graphName)
    }

    /**
     * The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to use for the graph.
     *
     * Min = 128
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-provisionedmemory)
     *
     * @param provisionedMemory The provisioned memory-optimized Neptune Capacity Units (m-NCUs) to
     *   use for the graph.
     */
    public fun provisionedMemory(provisionedMemory: Number) {
        cdkBuilder.provisionedMemory(provisionedMemory)
    }

    /**
     * Specifies whether or not the graph can be reachable over the internet. All access to graphs
     * is IAM authenticated.
     *
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to
     * create a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private
     * IP address that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-publicconnectivity)
     *
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     *   internet. All access to graphs is IAM authenticated.
     */
    public fun publicConnectivity(publicConnectivity: Boolean) {
        cdkBuilder.publicConnectivity(publicConnectivity)
    }

    /**
     * Specifies whether or not the graph can be reachable over the internet. All access to graphs
     * is IAM authenticated.
     *
     * When the graph is publicly available, its domain name system (DNS) endpoint resolves to the
     * public IP address from the internet. When the graph isn't publicly available, you need to
     * create a `PrivateGraphEndpoint` in a given VPC to ensure the DNS name resolves to a private
     * IP address that is reachable from the VPC.
     *
     * Default: If not specified, the default value is false.
     *
     * If enabling public connectivity for the first time, there will be a delay while it is
     * enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-publicconnectivity)
     *
     * @param publicConnectivity Specifies whether or not the graph can be reachable over the
     *   internet. All access to graphs is IAM authenticated.
     */
    public fun publicConnectivity(publicConnectivity: IResolvable) {
        cdkBuilder.publicConnectivity(publicConnectivity)
    }

    /**
     * The number of replicas in other AZs.
     *
     * Default: If not specified, the default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-replicacount)
     *
     * @param replicaCount The number of replicas in other AZs.
     */
    public fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
    }

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     *
     * @param tags Adds metadata tags to the new graph.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Adds metadata tags to the new graph.
     *
     * These tags can also be used with cost allocation reporting, or used in a Condition statement
     * in an IAM policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-tags)
     *
     * @param tags Adds metadata tags to the new graph.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     *
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     *   that will be loaded into the graph.
     */
    public fun vectorSearchConfiguration(vectorSearchConfiguration: IResolvable) {
        cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration)
    }

    /**
     * Specifies the number of dimensions for vector embeddings that will be loaded into the graph.
     *
     * The value is specified as `dimension=` value. Max = 65,535
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-graph.html#cfn-neptunegraph-graph-vectorsearchconfiguration)
     *
     * @param vectorSearchConfiguration Specifies the number of dimensions for vector embeddings
     *   that will be loaded into the graph.
     */
    public fun vectorSearchConfiguration(
        vectorSearchConfiguration: CfnGraph.VectorSearchConfigurationProperty
    ) {
        cdkBuilder.vectorSearchConfiguration(vectorSearchConfiguration)
    }

    public fun build(): CfnGraph {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
