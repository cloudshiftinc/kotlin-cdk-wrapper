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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.constructs.Construct

/**
 * The `AWS::RDS::DBSecurityGroup` resource creates or updates an Amazon RDS DB security group.
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
 * CfnDBSecurityGroup cfnDBSecurityGroup = CfnDBSecurityGroup.Builder.create(this,
 * "MyCfnDBSecurityGroup")
 * .dbSecurityGroupIngress(List.of(IngressProperty.builder()
 * .cidrip("cidrip")
 * .ec2SecurityGroupId("ec2SecurityGroupId")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build()))
 * .groupDescription("groupDescription")
 * // the properties below are optional
 * .ec2VpcId("ec2VpcId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html)
 */
@CdkDslMarker
public class CfnDBSecurityGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDBSecurityGroup.Builder =
        CfnDBSecurityGroup.Builder.create(scope, id)

    private val _dbSecurityGroupIngress: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     *
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
     */
    public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any) {
        _dbSecurityGroupIngress.addAll(listOf(*dbSecurityGroupIngress))
    }

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     *
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: Collection<Any>) {
        _dbSecurityGroupIngress.addAll(dbSecurityGroupIngress)
    }

    /**
     * Ingress rules to be applied to the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-dbsecuritygroupingress)
     *
     * @param dbSecurityGroupIngress Ingress rules to be applied to the DB security group.
     */
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
        cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
    }

    /**
     * The identifier of an Amazon VPC. This property indicates the VPC that this DB security group
     * belongs to.
     *
     * The `EC2VpcId` property is for backward compatibility with older regions, and is no longer
     * recommended for providing security information to an RDS DB instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-ec2vpcid)
     *
     * @param ec2VpcId The identifier of an Amazon VPC. This property indicates the VPC that this DB
     *   security group belongs to.
     */
    public fun ec2VpcId(ec2VpcId: String) {
        cdkBuilder.ec2VpcId(ec2VpcId)
    }

    /**
     * Provides the description of the DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-groupdescription)
     *
     * @param groupDescription Provides the description of the DB security group.
     */
    public fun groupDescription(groupDescription: String) {
        cdkBuilder.groupDescription(groupDescription)
    }

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional array of key-value pairs to apply to this DB security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroup.html#cfn-rds-dbsecuritygroup-tags)
     *
     * @param tags An optional array of key-value pairs to apply to this DB security group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDBSecurityGroup {
        if (_dbSecurityGroupIngress.isNotEmpty())
            cdkBuilder.dbSecurityGroupIngress(_dbSecurityGroupIngress)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
