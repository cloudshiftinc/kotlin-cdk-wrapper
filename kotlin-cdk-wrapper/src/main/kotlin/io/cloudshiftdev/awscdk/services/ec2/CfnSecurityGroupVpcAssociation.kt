@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A security group association with a VPC.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSecurityGroupVpcAssociation cfnSecurityGroupVpcAssociation =
 * CfnSecurityGroupVpcAssociation.Builder.create(this, "MyCfnSecurityGroupVpcAssociation")
 * .groupId("groupId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html)
 */
public open class CfnSecurityGroupVpcAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupVpcAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityGroupVpcAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupVpcAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityGroupVpcAssociationProps(props)
  )

  /**
   * The association's state.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The association's state reason.
   */
  public open fun attrStateReason(): String = unwrap(this).getAttrStateReason()

  /**
   * The AWS account ID of the owner of the VPC.
   */
  public open fun attrVpcOwnerId(): String = unwrap(this).getAttrVpcOwnerId()

  /**
   * The association's security group ID.
   */
  public open fun groupId(): String = unwrap(this).getGroupId()

  /**
   * The association's security group ID.
   */
  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The association's VPC ID.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The association's VPC ID.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSecurityGroupVpcAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The association's security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-groupid)
     * @param groupId The association's security group ID. 
     */
    public fun groupId(groupId: String)

    /**
     * The association's VPC ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-vpcid)
     * @param vpcId The association's VPC ID. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation.Builder.create(scope, id)

    /**
     * The association's security group ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-groupid)
     * @param groupId The association's security group ID. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * The association's VPC ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-securitygroupvpcassociation.html#cfn-ec2-securitygroupvpcassociation-vpcid)
     * @param vpcId The association's VPC ID. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroupVpcAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroupVpcAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation):
        CfnSecurityGroupVpcAssociation = CfnSecurityGroupVpcAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupVpcAssociation):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation
  }
}
