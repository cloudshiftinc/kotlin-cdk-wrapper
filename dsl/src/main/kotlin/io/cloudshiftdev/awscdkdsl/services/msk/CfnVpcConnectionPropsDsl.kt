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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps

/**
 * Properties for defining a `CfnVpcConnection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnVpcConnectionProps cfnVpcConnectionProps = CfnVpcConnectionProps.builder()
 * .authentication("authentication")
 * .clientSubnets(List.of("clientSubnets"))
 * .securityGroups(List.of("securityGroups"))
 * .targetClusterArn("targetClusterArn")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html)
 */
@CdkDslMarker
public class CfnVpcConnectionPropsDsl {
    private val cdkBuilder: CfnVpcConnectionProps.Builder = CfnVpcConnectionProps.builder()

    private val _clientSubnets: MutableList<String> = mutableListOf()

    private val _securityGroups: MutableList<String> = mutableListOf()

    /** @param authentication The type of private link authentication. */
    public fun authentication(authentication: String) {
        cdkBuilder.authentication(authentication)
    }

    /** @param clientSubnets The list of subnets in the client VPC to connect to. */
    public fun clientSubnets(vararg clientSubnets: String) {
        _clientSubnets.addAll(listOf(*clientSubnets))
    }

    /** @param clientSubnets The list of subnets in the client VPC to connect to. */
    public fun clientSubnets(clientSubnets: Collection<String>) {
        _clientSubnets.addAll(clientSubnets)
    }

    /** @param securityGroups The security groups to attach to the ENIs for the broker nodes. */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups to attach to the ENIs for the broker nodes. */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param tags Create tags when creating the VPC connection. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param targetClusterArn The Amazon Resource Name (ARN) of the cluster. */
    public fun targetClusterArn(targetClusterArn: String) {
        cdkBuilder.targetClusterArn(targetClusterArn)
    }

    /** @param vpcId The VPC id of the remote client. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVpcConnectionProps {
        if (_clientSubnets.isNotEmpty()) cdkBuilder.clientSubnets(_clientSubnets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
