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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * RdsDbInstanceProperty rdsDbInstanceProperty = RdsDbInstanceProperty.builder()
 * .dbPassword("dbPassword")
 * .dbUser("dbUser")
 * .rdsDbInstanceArn("rdsDbInstanceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-rdsdbinstance.html)
 */
@CdkDslMarker
public class CfnStackRdsDbInstancePropertyDsl {
    private val cdkBuilder: CfnStack.RdsDbInstanceProperty.Builder =
        CfnStack.RdsDbInstanceProperty.builder()

    /**
     * @param dbPassword AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual
     *   value.
     */
    public fun dbPassword(dbPassword: String) {
        cdkBuilder.dbPassword(dbPassword)
    }

    /** @param dbUser The master user name. */
    public fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
    }

    /** @param rdsDbInstanceArn The instance's ARN. */
    public fun rdsDbInstanceArn(rdsDbInstanceArn: String) {
        cdkBuilder.rdsDbInstanceArn(rdsDbInstanceArn)
    }

    public fun build(): CfnStack.RdsDbInstanceProperty = cdkBuilder.build()
}
