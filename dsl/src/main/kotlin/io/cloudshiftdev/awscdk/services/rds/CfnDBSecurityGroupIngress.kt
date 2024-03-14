package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBSecurityGroupIngress internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IP range to authorize.
   */
  public open fun cidrip(): String? = unwrap(this).getCidrip()

  /**
   * The IP range to authorize.
   */
  public open fun cidrip(`value`: String) {
    unwrap(this).setCidrip(`value`)
  }

  /**
   * The name of the DB security group to add authorization to.
   */
  public open fun dbSecurityGroupName(): String = unwrap(this).getDbSecurityGroupName()

  /**
   * The name of the DB security group to add authorization to.
   */
  public open fun dbSecurityGroupName(`value`: String) {
    unwrap(this).setDbSecurityGroupName(`value`)
  }

  /**
   * Id of the EC2 security group to authorize.
   */
  public open fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

  /**
   * Id of the EC2 security group to authorize.
   */
  public open fun ec2SecurityGroupId(`value`: String) {
    unwrap(this).setEc2SecurityGroupId(`value`)
  }

  /**
   * Name of the EC2 security group to authorize.
   */
  public open fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  /**
   * Name of the EC2 security group to authorize.
   */
  public open fun ec2SecurityGroupName(`value`: String) {
    unwrap(this).setEc2SecurityGroupName(`value`)
  }

  /**
   * AWS account number of the owner of the EC2 security group specified in the
   * `EC2SecurityGroupName` parameter.
   */
  public open fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * AWS account number of the owner of the EC2 security group specified in the
   * `EC2SecurityGroupName` parameter.
   */
  public open fun ec2SecurityGroupOwnerId(`value`: String) {
    unwrap(this).setEc2SecurityGroupOwnerId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBSecurityGroupIngress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP range to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-cidrip)
     * @param cidrip The IP range to authorize. 
     */
    public fun cidrip(cidrip: String)

    /**
     * The name of the DB security group to add authorization to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-dbsecuritygroupname)
     * @param dbSecurityGroupName The name of the DB security group to add authorization to. 
     */
    public fun dbSecurityGroupName(dbSecurityGroupName: String)

    /**
     * Id of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupid)
     * @param ec2SecurityGroupId Id of the EC2 security group to authorize. 
     */
    public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

    /**
     * Name of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName Name of the EC2 security group to authorize. 
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * AWS account number of the owner of the EC2 security group specified in the
     * `EC2SecurityGroupName` parameter.
     *
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
     * specified in the `EC2SecurityGroupName` parameter. 
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress.Builder.create(scope, id)

    /**
     * The IP range to authorize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-cidrip)
     * @param cidrip The IP range to authorize. 
     */
    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    /**
     * The name of the DB security group to add authorization to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-dbsecuritygroupname)
     * @param dbSecurityGroupName The name of the DB security group to add authorization to. 
     */
    override fun dbSecurityGroupName(dbSecurityGroupName: String) {
      cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    /**
     * Id of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupid)
     * @param ec2SecurityGroupId Id of the EC2 security group to authorize. 
     */
    override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
      cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    /**
     * Name of the EC2 security group to authorize.
     *
     * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
     * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName Name of the EC2 security group to authorize. 
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * AWS account number of the owner of the EC2 security group specified in the
     * `EC2SecurityGroupName` parameter.
     *
     * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
     * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
     * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
     * specified in the `EC2SecurityGroupName` parameter. 
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress):
        CfnDBSecurityGroupIngress = CfnDBSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupIngress):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress = wrapped.cdkObject
  }
}
