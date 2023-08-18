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
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

/**
 * The `Ingress` property type specifies an individual ingress rule within an
 * `AWS::RDS::DBSecurityGroup` resource.
 *
 * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we
 * recommend that you migrate as soon as possible. For more information, see
 * [Migrate from EC2-Classic to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html)
 * in the *Amazon EC2 User Guide* , the blog
 * [EC2-Classic Networking is Retiring – Here’s How to Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/)
 * , and
 * [Moving a DB instance not in a VPC into a VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html)
 * in the *Amazon RDS User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * IngressProperty ingressProperty = IngressProperty.builder()
 * .cidrip("cidrip")
 * .ec2SecurityGroupId("ec2SecurityGroupId")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbsecuritygroup-ingress.html)
 */
@CdkDslMarker
public class CfnDBSecurityGroupIngressPropertyDsl {
    private val cdkBuilder: CfnDBSecurityGroup.IngressProperty.Builder =
        CfnDBSecurityGroup.IngressProperty.builder()

    /** @param cidrip The IP range to authorize. */
    public fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
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

    public fun build(): CfnDBSecurityGroup.IngressProperty = cdkBuilder.build()
}
