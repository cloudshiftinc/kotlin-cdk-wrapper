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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * The access configuration for the cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * AccessConfigProperty accessConfigProperty = AccessConfigProperty.builder()
 * .authenticationMode("authenticationMode")
 * .bootstrapClusterCreatorAdminPermissions(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-accessconfig.html)
 */
@CdkDslMarker
public class CfnClusterAccessConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.AccessConfigProperty.Builder =
        CfnCluster.AccessConfigProperty.builder()

    /**
     * @param authenticationMode The desired authentication mode for the cluster. If you create a
     *   cluster by using the EKS API, AWS SDKs, or AWS CloudFormation , the default is `CONFIG_MAP`
     *   . If you create the cluster by using the AWS Management Console , the default value is
     *   `API_AND_CONFIG_MAP` .
     */
    public fun authenticationMode(authenticationMode: String) {
        cdkBuilder.authenticationMode(authenticationMode)
    }

    /**
     * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
     *   IAM principal was set as a cluster admin access entry during cluster creation time. The
     *   default value is `true` .
     */
    public fun bootstrapClusterCreatorAdminPermissions(
        bootstrapClusterCreatorAdminPermissions: Boolean
    ) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions)
    }

    /**
     * @param bootstrapClusterCreatorAdminPermissions Specifies whether or not the cluster creator
     *   IAM principal was set as a cluster admin access entry during cluster creation time. The
     *   default value is `true` .
     */
    public fun bootstrapClusterCreatorAdminPermissions(
        bootstrapClusterCreatorAdminPermissions: IResolvable
    ) {
        cdkBuilder.bootstrapClusterCreatorAdminPermissions(bootstrapClusterCreatorAdminPermissions)
    }

    public fun build(): CfnCluster.AccessConfigProperty = cdkBuilder.build()
}
