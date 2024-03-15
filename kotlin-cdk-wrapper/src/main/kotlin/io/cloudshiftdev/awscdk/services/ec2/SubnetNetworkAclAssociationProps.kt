@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties to create a SubnetNetworkAclAssociation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * NetworkAcl networkAcl;
 * Subnet subnet;
 * SubnetNetworkAclAssociationProps subnetNetworkAclAssociationProps =
 * SubnetNetworkAclAssociationProps.builder()
 * .networkAcl(networkAcl)
 * .subnet(subnet)
 * // the properties below are optional
 * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
 * .build();
 * ```
 */
public interface SubnetNetworkAclAssociationProps {
  /**
   * The Network ACL this association is defined for.
   */
  public fun networkAcl(): INetworkAcl

  /**
   * ID of the Subnet.
   */
  public fun subnet(): ISubnet

  /**
   * The name of the SubnetNetworkAclAssociation.
   *
   * It is not recommended to use an explicit name.
   *
   * Default: If you don't specify a SubnetNetworkAclAssociationName, AWS CloudFormation generates a
   * unique physical ID and uses that ID for the group name.
   */
  public fun subnetNetworkAclAssociationName(): String? =
      unwrap(this).getSubnetNetworkAclAssociationName()

  /**
   * A builder for [SubnetNetworkAclAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param networkAcl The Network ACL this association is defined for. 
     */
    public fun networkAcl(networkAcl: INetworkAcl)

    /**
     * @param subnet ID of the Subnet. 
     */
    public fun subnet(subnet: ISubnet)

    /**
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation.
     * It is not recommended to use an explicit name.
     */
    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.builder()

    /**
     * @param networkAcl The Network ACL this association is defined for. 
     */
    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
    }

    /**
     * @param subnet ID of the Subnet. 
     */
    override fun subnet(subnet: ISubnet) {
      cdkBuilder.subnet(subnet.let(ISubnet::unwrap))
    }

    /**
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation.
     * It is not recommended to use an explicit name.
     */
    override fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
      cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps,
  ) : CdkObject(cdkObject), SubnetNetworkAclAssociationProps {
    /**
     * The Network ACL this association is defined for.
     */
    override fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

    /**
     * ID of the Subnet.
     */
    override fun subnet(): ISubnet = unwrap(this).getSubnet().let(ISubnet::wrap)

    /**
     * The name of the SubnetNetworkAclAssociation.
     *
     * It is not recommended to use an explicit name.
     *
     * Default: If you don't specify a SubnetNetworkAclAssociationName, AWS CloudFormation generates
     * a
     * unique physical ID and uses that ID for the group name.
     */
    override fun subnetNetworkAclAssociationName(): String? =
        unwrap(this).getSubnetNetworkAclAssociationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetNetworkAclAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps):
        SubnetNetworkAclAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetNetworkAclAssociationProps):
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
  }
}
