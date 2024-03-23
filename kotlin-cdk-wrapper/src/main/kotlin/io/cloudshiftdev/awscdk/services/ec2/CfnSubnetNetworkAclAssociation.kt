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
 * Associates a subnet with a network ACL. For more information, see
 * [ReplaceNetworkAclAssociation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-ReplaceNetworkAclAssociation.html)
 * in the *Amazon EC2 API Reference* .
 *
 * When `AWS::EC2::SubnetNetworkAclAssociation` resources are created during create or update
 * operations, AWS CloudFormation adopts existing resources that share the same key properties (the
 * properties that contribute to uniquely identify the resource). However, if the operation fails and
 * rolls back, AWS CloudFormation deletes the previously out-of-band resources. You can protect against
 * this behavior by using `Retain` deletion policies. For more information, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSubnetNetworkAclAssociation cfnSubnetNetworkAclAssociation =
 * CfnSubnetNetworkAclAssociation.Builder.create(this, "MyCfnSubnetNetworkAclAssociation")
 * .networkAclId("networkAclId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
 */
public open class CfnSubnetNetworkAclAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubnetNetworkAclAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSubnetNetworkAclAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubnetNetworkAclAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubnetNetworkAclAssociationProps(props)
  )

  /**
   * Returns the value of this object's AssociationId property.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the network ACL.
   */
  public open fun networkAclId(): String = unwrap(this).getNetworkAclId()

  /**
   * The ID of the network ACL.
   */
  public open fun networkAclId(`value`: String) {
    unwrap(this).setNetworkAclId(`value`)
  }

  /**
   * The ID of the subnet.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The ID of the subnet.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSubnetNetworkAclAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the network ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
     * @param networkAclId The ID of the network ACL. 
     */
    public fun networkAclId(networkAclId: String)

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
     * @param subnetId The ID of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder.create(scope, id)

    /**
     * The ID of the network ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
     * @param networkAclId The ID of the network ACL. 
     */
    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
     * @param subnetId The ID of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetNetworkAclAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetNetworkAclAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation):
        CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
  }
}
