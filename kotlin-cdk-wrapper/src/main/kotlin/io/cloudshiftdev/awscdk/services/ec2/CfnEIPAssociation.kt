@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates an Elastic IP address with an instance or a network interface.
 *
 * Before you can use an Elastic IP address, you must allocate it to your account. For more
 * information about working with Elastic IP addresses, see [Elastic IP address concepts and
 * rules](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#vpc-eip-overview) .
 *
 * You must specify `AllocationId` and either `InstanceId` , `NetworkInterfaceId` , or
 * `PrivateIpAddress` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnEIPAssociation cfnEIPAssociation = CfnEIPAssociation.Builder.create(this,
 * "MyCfnEIPAssociation")
 * .allocationId("allocationId")
 * .eip("eip")
 * .instanceId("instanceId")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html)
 */
public open class CfnEIPAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.CfnEIPAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEIPAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnEIPAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEIPAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEIPAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEIPAssociationProps(props)
  )

  /**
   * The allocation ID.
   */
  public open fun allocationId(): String? = unwrap(this).getAllocationId()

  /**
   * The allocation ID.
   */
  public open fun allocationId(`value`: String) {
    unwrap(this).setAllocationId(`value`)
  }

  /**
   * The ID of the association.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun eip(): String? = unwrap(this).getEip()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun eip(`value`: String) {
    unwrap(this).setEip(`value`)
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
   * The ID of the instance.
   */
  public open fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the instance.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The ID of the network interface.
   */
  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The ID of the network interface.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * The primary or secondary private IP address to associate with the Elastic IP address.
   */
  public open fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * The primary or secondary private IP address to associate with the Elastic IP address.
   */
  public open fun privateIpAddress(`value`: String) {
    unwrap(this).setPrivateIpAddress(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnEIPAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The allocation ID.
     *
     * This is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-allocationid)
     * @param allocationId The allocation ID. 
     */
    public fun allocationId(allocationId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-eip)
     * @deprecated this property has been deprecated
     * @param eip 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun eip(eip: String)

    /**
     * The ID of the instance.
     *
     * The instance must have exactly one attached network interface. You can specify either the
     * instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-instanceid)
     * @param instanceId The ID of the instance. 
     */
    public fun instanceId(instanceId: String)

    /**
     * The ID of the network interface.
     *
     * If the instance has more than one network interface, you must specify a network interface ID.
     *
     * You can specify either the instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-networkinterfaceid)
     * @param networkInterfaceId The ID of the network interface. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * The primary or secondary private IP address to associate with the Elastic IP address.
     *
     * If no private IP address is specified, the Elastic IP address is associated with the primary
     * private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-privateipaddress)
     * @param privateIpAddress The primary or secondary private IP address to associate with the
     * Elastic IP address. 
     */
    public fun privateIpAddress(privateIpAddress: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPAssociation.Builder.create(scope, id)

    /**
     * The allocation ID.
     *
     * This is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-allocationid)
     * @param allocationId The allocation ID. 
     */
    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-eip)
     * @deprecated this property has been deprecated
     * @param eip 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun eip(eip: String) {
      cdkBuilder.eip(eip)
    }

    /**
     * The ID of the instance.
     *
     * The instance must have exactly one attached network interface. You can specify either the
     * instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-instanceid)
     * @param instanceId The ID of the instance. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The ID of the network interface.
     *
     * If the instance has more than one network interface, you must specify a network interface ID.
     *
     * You can specify either the instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-networkinterfaceid)
     * @param networkInterfaceId The ID of the network interface. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * The primary or secondary private IP address to associate with the Elastic IP address.
     *
     * If no private IP address is specified, the Elastic IP address is associated with the primary
     * private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-privateipaddress)
     * @param privateIpAddress The primary or secondary private IP address to associate with the
     * Elastic IP address. 
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPAssociation = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnEIPAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEIPAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEIPAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociation):
        CfnEIPAssociation = CfnEIPAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnEIPAssociation):
        software.amazon.awscdk.services.ec2.CfnEIPAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnEIPAssociation
  }
}
