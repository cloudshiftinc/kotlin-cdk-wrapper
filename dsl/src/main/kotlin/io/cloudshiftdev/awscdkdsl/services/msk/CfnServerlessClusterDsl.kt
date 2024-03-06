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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.constructs.Construct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnServerlessCluster cfnServerlessCluster = CfnServerlessCluster.Builder.create(this,
 * "MyCfnServerlessCluster")
 * .clientAuthentication(ClientAuthenticationProperty.builder()
 * .sasl(SaslProperty.builder()
 * .iam(IamProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .build())
 * .clusterName("clusterName")
 * .vpcConfigs(List.of(VpcConfigProperty.builder()
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroups(List.of("securityGroups"))
 * .build()))
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html)
 */
@CdkDslMarker
public class CfnServerlessClusterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServerlessCluster.Builder =
        CfnServerlessCluster.Builder.create(scope, id)

    private val _vpcConfigs: MutableList<Any> = mutableListOf()

    /**
     * Includes all client authentication information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
     *
     * @param clientAuthentication Includes all client authentication information.
     */
    public fun clientAuthentication(clientAuthentication: IResolvable) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    /**
     * Includes all client authentication information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
     *
     * @param clientAuthentication Includes all client authentication information.
     */
    public fun clientAuthentication(
        clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty
    ) {
        cdkBuilder.clientAuthentication(clientAuthentication)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
     *
     * @param clusterName
     */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
     *
     * @param tags A key-value pair to associate with a resource.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
     *
     * @param vpcConfigs
     */
    public fun vpcConfigs(vararg vpcConfigs: Any) {
        _vpcConfigs.addAll(listOf(*vpcConfigs))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
     *
     * @param vpcConfigs
     */
    public fun vpcConfigs(vpcConfigs: Collection<Any>) {
        _vpcConfigs.addAll(vpcConfigs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
     *
     * @param vpcConfigs
     */
    public fun vpcConfigs(vpcConfigs: IResolvable) {
        cdkBuilder.vpcConfigs(vpcConfigs)
    }

    public fun build(): CfnServerlessCluster {
        if (_vpcConfigs.isNotEmpty()) cdkBuilder.vpcConfigs(_vpcConfigs)
        return cdkBuilder.build()
    }
}
