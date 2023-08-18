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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

/**
 * Describes an AWS Identity and Access Management (IAM) role that is associated with a DB instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * DBInstanceRoleProperty dBInstanceRoleProperty = DBInstanceRoleProperty.builder()
 * .featureName("featureName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbinstance-dbinstancerole.html)
 */
@CdkDslMarker
public class CfnDBInstanceDBInstanceRolePropertyDsl {
    private val cdkBuilder: CfnDBInstance.DBInstanceRoleProperty.Builder =
        CfnDBInstance.DBInstanceRoleProperty.builder()

    /**
     * @param featureName The name of the feature associated with the AWS Identity and Access
     *   Management (IAM) role. IAM roles that are associated with a DB instance grant permission
     *   for the DB instance to access other AWS services on your behalf. For the list of supported
     *   feature names, see the `SupportedFeatureNames` description in
     *   [DBEngineVersion](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_DBEngineVersion.html)
     *   in the *Amazon RDS API Reference* .
     */
    public fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that is associated with the DB
     *   instance.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDBInstance.DBInstanceRoleProperty = cdkBuilder.build()
}
