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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery

/**
 * Query input for looking up a security group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * SecurityGroupContextQuery securityGroupContextQuery = SecurityGroupContextQuery.builder()
 * .account("account")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .securityGroupId("securityGroupId")
 * .securityGroupName("securityGroupName")
 * .vpcId("vpcId")
 * .build();
 * ```
 */
@CdkDslMarker
public class SecurityGroupContextQueryDsl {
    private val cdkBuilder: SecurityGroupContextQuery.Builder = SecurityGroupContextQuery.builder()

    /** @param account Query account. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /** @param region Query region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /** @param securityGroupId Security group id. */
    public fun securityGroupId(securityGroupId: String) {
        cdkBuilder.securityGroupId(securityGroupId)
    }

    /** @param securityGroupName Security group name. */
    public fun securityGroupName(securityGroupName: String) {
        cdkBuilder.securityGroupName(securityGroupName)
    }

    /** @param vpcId VPC ID. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): SecurityGroupContextQuery = cdkBuilder.build()
}
