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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.neptunegraph.CfnGraph
import software.amazon.awscdk.services.neptunegraph.CfnGraphProps
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps
import software.constructs.Construct

public object neptunegraph {
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
    public inline fun cfnGraph(
        scope: Construct,
        id: String,
        block: CfnGraphDsl.() -> Unit = {},
    ): CfnGraph {
        val builder = CfnGraphDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnGraphProps(block: CfnGraphPropsDsl.() -> Unit = {}): CfnGraphProps {
        val builder = CfnGraphPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The vector-search configuration for the graph, which specifies the vector dimension to use in
     * the vector index, if any.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.neptunegraph.*;
     * VectorSearchConfigurationProperty vectorSearchConfigurationProperty =
     * VectorSearchConfigurationProperty.builder()
     * .vectorSearchDimension(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptunegraph-graph-vectorsearchconfiguration.html)
     */
    public inline fun cfnGraphVectorSearchConfigurationProperty(
        block: CfnGraphVectorSearchConfigurationPropertyDsl.() -> Unit = {}
    ): CfnGraph.VectorSearchConfigurationProperty {
        val builder = CfnGraphVectorSearchConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Create a private graph endpoint to allow private access from to the graph from within a VPC.
     *
     * You can attach security groups to the private graph endpoint.
     *
     * VPC endpoint charges apply.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.neptunegraph.*;
     * CfnPrivateGraphEndpoint cfnPrivateGraphEndpoint = CfnPrivateGraphEndpoint.Builder.create(this,
     * "MyCfnPrivateGraphEndpoint")
     * .graphIdentifier("graphIdentifier")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html)
     */
    public inline fun cfnPrivateGraphEndpoint(
        scope: Construct,
        id: String,
        block: CfnPrivateGraphEndpointDsl.() -> Unit = {},
    ): CfnPrivateGraphEndpoint {
        val builder = CfnPrivateGraphEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPrivateGraphEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.neptunegraph.*;
     * CfnPrivateGraphEndpointProps cfnPrivateGraphEndpointProps =
     * CfnPrivateGraphEndpointProps.builder()
     * .graphIdentifier("graphIdentifier")
     * .vpcId("vpcId")
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html)
     */
    public inline fun cfnPrivateGraphEndpointProps(
        block: CfnPrivateGraphEndpointPropsDsl.() -> Unit = {}
    ): CfnPrivateGraphEndpointProps {
        val builder = CfnPrivateGraphEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
