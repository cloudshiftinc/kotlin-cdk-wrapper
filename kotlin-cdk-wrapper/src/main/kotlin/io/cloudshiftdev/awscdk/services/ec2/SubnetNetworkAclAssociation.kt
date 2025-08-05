@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * NetworkAcl networkAcl;
 * Subnet subnet;
 * SubnetNetworkAclAssociation subnetNetworkAclAssociation =
 * SubnetNetworkAclAssociation.Builder.create(this, "MySubnetNetworkAclAssociation")
 * .networkAcl(networkAcl)
 * .subnet(subnet)
 * // the properties below are optional
 * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
 * .build();
 * ```
 */
public open class SubnetNetworkAclAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation,
) : Resource(cdkObject),
    ISubnetNetworkAclAssociation {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SubnetNetworkAclAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(SubnetNetworkAclAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SubnetNetworkAclAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, SubnetNetworkAclAssociationProps(props)
  )

  /**
   * ID for the current Network ACL.
   */
  public open fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  /**
   * ID of the Subnet.
   */
  public open fun subnet(): ISubnet = unwrap(this).getSubnet().let(ISubnet::wrap)

  /**
   * ID for the current SubnetNetworkAclAssociation.
   */
  public override fun subnetNetworkAclAssociationAssociationId(): String =
      unwrap(this).getSubnetNetworkAclAssociationAssociationId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.SubnetNetworkAclAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Network ACL this association is defined for.
     *
     * @param networkAcl The Network ACL this association is defined for. 
     */
    public fun networkAcl(networkAcl: INetworkAcl)

    /**
     * ID of the Subnet.
     *
     * @param subnet ID of the Subnet. 
     */
    public fun subnet(subnet: ISubnet)

    /**
     * The name of the SubnetNetworkAclAssociation.
     *
     * It is not recommended to use an explicit name.
     *
     * Default: If you don't specify a SubnetNetworkAclAssociationName, AWS CloudFormation generates
     * a
     * unique physical ID and uses that ID for the group name.
     *
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation. 
     */
    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder
        = software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder.create(scope, id)

    /**
     * The Network ACL this association is defined for.
     *
     * @param networkAcl The Network ACL this association is defined for. 
     */
    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl.Companion::unwrap))
    }

    /**
     * ID of the Subnet.
     *
     * @param subnet ID of the Subnet. 
     */
    override fun subnet(subnet: ISubnet) {
      cdkBuilder.subnet(subnet.let(ISubnet.Companion::unwrap))
    }

    /**
     * The name of the SubnetNetworkAclAssociation.
     *
     * It is not recommended to use an explicit name.
     *
     * Default: If you don't specify a SubnetNetworkAclAssociationName, AWS CloudFormation generates
     * a
     * unique physical ID and uses that ID for the group name.
     *
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation. 
     */
    override fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
      cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.PROPERTY_INJECTION_ID

    public fun fromSubnetNetworkAclAssociationAssociationId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      subnetNetworkAclAssociationAssociationId: String,
    ): ISubnetNetworkAclAssociation =
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.fromSubnetNetworkAclAssociationAssociationId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, subnetNetworkAclAssociationAssociationId).let(ISubnetNetworkAclAssociation::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubnetNetworkAclAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubnetNetworkAclAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation):
        SubnetNetworkAclAssociation = SubnetNetworkAclAssociation(cdkObject)

    internal fun unwrap(wrapped: SubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
  }
}
