@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSubnetNetworkAclAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSubnetNetworkAclAssociationProps cfnSubnetNetworkAclAssociationProps =
 * CfnSubnetNetworkAclAssociationProps.builder()
 * .networkAclId("networkAclId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
 */
public interface CfnSubnetNetworkAclAssociationProps {
  /**
   * The ID of the network ACL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
   */
  public fun networkAclId(): String

  /**
   * The ID of the subnet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnSubnetNetworkAclAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param networkAclId The ID of the network ACL. 
     */
    public fun networkAclId(networkAclId: String)

    /**
     * @param subnetId The ID of the subnet. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.builder()

    /**
     * @param networkAclId The ID of the network ACL. 
     */
    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    /**
     * @param subnetId The ID of the subnet. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps,
  ) : CdkObject(cdkObject), CfnSubnetNetworkAclAssociationProps {
    /**
     * The ID of the network ACL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-networkaclid)
     */
    override fun networkAclId(): String = unwrap(this).getNetworkAclId()

    /**
     * The ID of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html#cfn-ec2-subnetnetworkaclassociation-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnSubnetNetworkAclAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps):
        CfnSubnetNetworkAclAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetNetworkAclAssociationProps):
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps
  }
}
