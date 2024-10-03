@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDBSecurityGroupIngress`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
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
public interface CfnDBSecurityGroupIngressProps {
  /**
   * The IP range to authorize.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-cidrip)
   */
  public fun cidrip(): String? = unwrap(this).getCidrip()

  /**
   * The name of the DB security group to add authorization to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-dbsecuritygroupname)
   */
  public fun dbSecurityGroupName(): String

  /**
   * Id of the EC2 security group to authorize.
   *
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupid)
   */
  public fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

  /**
   * Name of the EC2 security group to authorize.
   *
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupname)
   */
  public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  /**
   * AWS account number of the owner of the EC2 security group specified in the
   * `EC2SecurityGroupName` parameter.
   *
   * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
   * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
   * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupownerid)
   */
  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * A builder for [CfnDBSecurityGroupIngressProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrip The IP range to authorize.
     */
    public fun cidrip(cidrip: String)

    /**
     * @param dbSecurityGroupName The name of the DB security group to add authorization to. 
     */
    public fun dbSecurityGroupName(dbSecurityGroupName: String)

    /**
     * @param ec2SecurityGroupId Id of the EC2 security group to authorize.
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     */
    public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

    /**
     * @param ec2SecurityGroupName Name of the EC2 security group to authorize.
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
     * specified in the `EC2SecurityGroupName` parameter.
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps.builder()

    /**
     * @param cidrip The IP range to authorize.
     */
    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    /**
     * @param dbSecurityGroupName The name of the DB security group to add authorization to. 
     */
    override fun dbSecurityGroupName(dbSecurityGroupName: String) {
      cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupId Id of the EC2 security group to authorize.
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     */
    override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
      cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    /**
     * @param ec2SecurityGroupName Name of the EC2 security group to authorize.
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
     * specified in the `EC2SecurityGroupName` parameter.
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps,
  ) : CdkObject(cdkObject),
      CfnDBSecurityGroupIngressProps {
    /**
     * The IP range to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-cidrip)
     */
    override fun cidrip(): String? = unwrap(this).getCidrip()

    /**
     * The name of the DB security group to add authorization to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-dbsecuritygroupname)
     */
    override fun dbSecurityGroupName(): String = unwrap(this).getDbSecurityGroupName()

    /**
     * Id of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupid)
     */
    override fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

    /**
     * Name of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupname)
     */
    override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

    /**
     * AWS account number of the owner of the EC2 security group specified in the
     * `EC2SecurityGroupName` parameter.
     *
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupownerid)
     */
    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps):
        CfnDBSecurityGroupIngressProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDBSecurityGroupIngressProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupIngressProps):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
  }
}
