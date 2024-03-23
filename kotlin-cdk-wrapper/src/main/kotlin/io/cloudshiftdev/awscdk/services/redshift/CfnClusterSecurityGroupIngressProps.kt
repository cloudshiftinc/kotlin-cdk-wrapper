@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnClusterSecurityGroupIngress`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnClusterSecurityGroupIngressProps cfnClusterSecurityGroupIngressProps =
 * CfnClusterSecurityGroupIngressProps.builder()
 * .clusterSecurityGroupName("clusterSecurityGroupName")
 * // the properties below are optional
 * .cidrip("cidrip")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html)
 */
public interface CfnClusterSecurityGroupIngressProps {
  /**
   * The IP range to be added the Amazon Redshift security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
   */
  public fun cidrip(): String? = unwrap(this).getCidrip()

  /**
   * The name of the security group to which the ingress rule is added.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
   */
  public fun clusterSecurityGroupName(): String

  /**
   * The EC2 security group to be added the Amazon Redshift security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
   */
  public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

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
   */
  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  /**
   * A builder for [CfnClusterSecurityGroupIngressProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrip The IP range to be added the Amazon Redshift security group.
     */
    public fun cidrip(cidrip: String)

    /**
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     * added. 
     */
    public fun clusterSecurityGroupName(clusterSecurityGroupName: String)

    /**
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     * group.
     */
    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    /**
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     * specified by the *EC2SecurityGroupName* parameter.
     * The AWS Access Key ID is not an acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     */
    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.builder()

    /**
     * @param cidrip The IP range to be added the Amazon Redshift security group.
     */
    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    /**
     * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
     * added. 
     */
    override fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
      cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
     * group.
     */
    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    /**
     * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
     * specified by the *EC2SecurityGroupName* parameter.
     * The AWS Access Key ID is not an acceptable value.
     *
     * Example: `111122223333`
     *
     * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
     * property.
     */
    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps,
  ) : CdkObject(cdkObject), CfnClusterSecurityGroupIngressProps {
    /**
     * The IP range to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
     */
    override fun cidrip(): String? = unwrap(this).getCidrip()

    /**
     * The name of the security group to which the ingress rule is added.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
     */
    override fun clusterSecurityGroupName(): String = unwrap(this).getClusterSecurityGroupName()

    /**
     * The EC2 security group to be added the Amazon Redshift security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
     */
    override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

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
     */
    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnClusterSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps):
        CfnClusterSecurityGroupIngressProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClusterSecurityGroupIngressProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroupIngressProps):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
  }
}
