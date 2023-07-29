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

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.neptune.CfnDBCluster

/**
 * Describes an Amazon Identity and Access Management (IAM) role that is associated with a DB
 * cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.neptune.*;
 * DBClusterRoleProperty dBClusterRoleProperty = DBClusterRoleProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .featureName("featureName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-neptune-dbcluster-dbclusterrole.html)
 */
@CdkDslMarker
public class CfnDBClusterDBClusterRolePropertyDsl {
    private val cdkBuilder: CfnDBCluster.DBClusterRoleProperty.Builder =
        CfnDBCluster.DBClusterRoleProperty.builder()

    /**
     * @param featureName The name of the feature associated with the Amazon Identity and Access
     *   Management (IAM) role. For the list of supported feature names, see
     *   [DescribeDBEngineVersions](https://docs.aws.amazon.com/neptune/latest/userguide/api-other-apis.html#DescribeDBEngineVersions)
     *   .
     */
    public fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the DB
     *   cluster.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDBCluster.DBClusterRoleProperty = cdkBuilder.build()
}
