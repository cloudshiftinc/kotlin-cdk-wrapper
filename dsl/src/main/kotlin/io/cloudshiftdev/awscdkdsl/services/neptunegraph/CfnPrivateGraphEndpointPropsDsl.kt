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
import software.amazon.awscdk.services.neptunegraph.CfnPrivateGraphEndpointProps

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
@CdkDslMarker
public class CfnPrivateGraphEndpointPropsDsl {
    private val cdkBuilder: CfnPrivateGraphEndpointProps.Builder =
        CfnPrivateGraphEndpointProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /** @param graphIdentifier The unique identifier of the Neptune Analytics graph. */
    public fun graphIdentifier(graphIdentifier: String) {
        cdkBuilder.graphIdentifier(graphIdentifier)
    }

    /** @param securityGroupIds Security groups to be attached to the private graph endpoint.. */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /** @param securityGroupIds Security groups to be attached to the private graph endpoint.. */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /** @param subnetIds Subnets in which private graph endpoint ENIs are created. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds Subnets in which private graph endpoint ENIs are created. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param vpcId The VPC in which the private graph endpoint needs to be created. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnPrivateGraphEndpointProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
