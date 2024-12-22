@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSecurityGroupVpcAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroupVpcAssociationProps cfnSecurityGroupVpcAssociationProps =
 * CfnSecurityGroupVpcAssociationProps.builder()
 * .groupId("groupId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html)
 */
public interface CfnSecurityGroupVpcAssociationProps {
  /**
   * The association's security group ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-groupid)
   */
  public fun groupId(): String

  /**
   * The association's VPC ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnSecurityGroupVpcAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupId The association's security group ID. 
     */
    public fun groupId(groupId: String)

    /**
     * @param vpcId The association's VPC ID. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps.builder()

    /**
     * @param groupId The association's security group ID. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * @param vpcId The association's VPC ID. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps,
  ) : CdkObject(cdkObject),
      CfnSecurityGroupVpcAssociationProps {
    /**
     * The association's security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-groupid)
     */
    override fun groupId(): String = unwrap(this).getGroupId()

    /**
     * The association's VPC ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSecurityGroupVpcAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps):
        CfnSecurityGroupVpcAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSecurityGroupVpcAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupVpcAssociationProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps
  }
}
