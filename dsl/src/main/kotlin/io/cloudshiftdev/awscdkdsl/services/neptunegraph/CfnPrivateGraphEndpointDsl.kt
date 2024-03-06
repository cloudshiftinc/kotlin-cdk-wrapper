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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpoint
import software.constructs.Construct

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
@CdkDslMarker
public class CfnPrivateGraphEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPrivateGraphEndpoint.Builder =
        CfnPrivateGraphEndpoint.Builder.create(scope, id)

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * The unique identifier of the Neptune Analytics graph.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-graphidentifier)
     *
     * @param graphIdentifier The unique identifier of the Neptune Analytics graph.
     */
    public fun graphIdentifier(graphIdentifier: String) {
        cdkBuilder.graphIdentifier(graphIdentifier)
    }

    /**
     * Security groups to be attached to the private graph endpoint..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-securitygroupids)
     *
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * Security groups to be attached to the private graph endpoint..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-securitygroupids)
     *
     * @param securityGroupIds Security groups to be attached to the private graph endpoint..
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * Subnets in which private graph endpoint ENIs are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-subnetids)
     *
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * Subnets in which private graph endpoint ENIs are created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-subnetids)
     *
     * @param subnetIds Subnets in which private graph endpoint ENIs are created.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * The VPC in which the private graph endpoint needs to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptunegraph-privategraphendpoint.html#cfn-neptunegraph-privategraphendpoint-vpcid)
     *
     * @param vpcId The VPC in which the private graph endpoint needs to be created.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnPrivateGraphEndpoint {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
