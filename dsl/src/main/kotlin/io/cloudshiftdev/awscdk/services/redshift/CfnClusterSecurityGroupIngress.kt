package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterSecurityGroupIngress internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies an inbound (ingress) rule for an Amazon Redshift security group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The IP range to be added the Amazon Redshift security group.
   */
  public open fun cidrip(): String? = unwrap(this).getCidrip()

  /**
   * The IP range to be added the Amazon Redshift security group.
   */
  public open fun cidrip(`value`: String) {
    unwrap(this).setCidrip(`value`)
  }

  /**
   * The name of the security group to which the ingress rule is added.
   */
  public open fun clusterSecurityGroupName(): String = unwrap(this).getClusterSecurityGroupName()

  /**
   * The name of the security group to which the ingress rule is added.
   */
  public open fun clusterSecurityGroupName(`value`: String) {
    unwrap(this).setClusterSecurityGroupName(`value`)
  }

  /**
   * The EC2 security group to be added the Amazon Redshift security group.
   */
  public open fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  /**
   * The EC2 security group to be added the Amazon Redshift security group.
   */
  public open fun ec2SecurityGroupName(`value`: String) {
    unwrap(this).setEc2SecurityGroupName(`value`)
  }

  /**
   * The AWS account number of the owner of the security group specified by the
   * *EC2SecurityGroupName* parameter.
   */
  public open fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * The AWS account number of the owner of the security group specified by the
   * *EC2SecurityGroupName* parameter.
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
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.redshift.CfnClusterSecurityGroupIngress].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
     * @param cidrip The IP range to be added the Amazon Redshift security group. 
     */
    public fun cidrip(cidrip: String)

    /**
     * The name of the security group to which the ingress rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     * added. 
     */
    public fun clusterSecurityGroupName(clusterSecurityGroupName: String)

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     * group. 
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * The AWS account number of the owner of the security group specified by the
     * *EC2SecurityGroupName* parameter.
     *
     * The AWS Access Key ID is not an acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     * specified by the *EC2SecurityGroupName* parameter. 
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress.Builder.create(scope,
        id)

    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
     * @param cidrip The IP range to be added the Amazon Redshift security group. 
     */
    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    /**
     * The name of the security group to which the ingress rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     * added. 
     */
    override fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
      cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     * group. 
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * The AWS account number of the owner of the security group specified by the
     * *EC2SecurityGroupName* parameter.
     *
     * The AWS Access Key ID is not an acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     * specified by the *EC2SecurityGroupName* parameter. 
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterSecurityGroupIngress {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterSecurityGroupIngress(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress):
        CfnClusterSecurityGroupIngress = CfnClusterSecurityGroupIngress(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroupIngress):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress = wrapped.cdkObject
  }
}
