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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps

/**
 * Properties for defining a `CfnDBSecurityGroupIngress`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBSecurityGroupIngressProps cfnDBSecurityGroupIngressProps =
 * CfnDBSecurityGroupIngressProps.builder()
 * .dbSecurityGroupName("dbSecurityGroupName")
 * // the properties below are optional
 * .cidrip("cidrip")
 * .ec2SecurityGroupId("ec2SecurityGroupId")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html)
 */
@CdkDslMarker
public class CfnDBSecurityGroupIngressPropsDsl {
    private val cdkBuilder: CfnDBSecurityGroupIngressProps.Builder =
        CfnDBSecurityGroupIngressProps.builder()

    /** @param cidrip The IP range to authorize. */
    public fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
    }

    /** @param dbSecurityGroupName The name of the DB security group to add authorization to. */
    public fun dbSecurityGroupName(dbSecurityGroupName: String) {
        cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupId Id of the EC2 security group to authorize. For VPC DB security
     *   groups, `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and
     *   either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     */
    public fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
        cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    /**
     * @param ec2SecurityGroupName Name of the EC2 security group to authorize. For VPC DB security
     *   groups, `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and
     *   either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
     *   specified in the `EC2SecurityGroupName` parameter. The AWS access key ID isn't an
     *   acceptable value. For VPC DB security groups, `EC2SecurityGroupId` must be provided.
     *   Otherwise, `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or
     *   `EC2SecurityGroupId` must be provided.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): CfnDBSecurityGroupIngressProps = cdkBuilder.build()
}
