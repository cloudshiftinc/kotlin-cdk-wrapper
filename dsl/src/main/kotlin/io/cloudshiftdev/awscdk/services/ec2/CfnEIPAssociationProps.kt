package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface CfnEIPAssociationProps {
  /**
   * The allocation ID.
   *
   * This is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-allocationid)
   */
  public fun allocationId(): String? = unwrap(this).getAllocationId()

  /**
   * (deprecated) The Elastic IP address to associate with the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-eip)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun eip(): String? = unwrap(this).getEip()

  /**
   * The ID of the instance.
   *
   * The instance must have exactly one attached network interface. You can specify either the
   * instance ID or the network interface ID, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-instanceid)
   */
  public fun instanceId(): String? = unwrap(this).getInstanceId()

  /**
   * The ID of the network interface.
   *
   * If the instance has more than one network interface, you must specify a network interface ID.
   *
   * You can specify either the instance ID or the network interface ID, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-networkinterfaceid)
   */
  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The primary or secondary private IP address to associate with the Elastic IP address.
   *
   * If no private IP address is specified, the Elastic IP address is associated with the primary
   * private IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-privateipaddress)
   */
  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  /**
   * A builder for [CfnEIPAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allocationId The allocation ID.
     * This is required.
     */
    public fun allocationId(allocationId: String)

    /**
     * @param eip The Elastic IP address to associate with the instance.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun eip(eip: String)

    /**
     * @param instanceId The ID of the instance.
     * The instance must have exactly one attached network interface. You can specify either the
     * instance ID or the network interface ID, but not both.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param networkInterfaceId The ID of the network interface.
     * If the instance has more than one network interface, you must specify a network interface ID.
     *
     * You can specify either the instance ID or the network interface ID, but not both.
     */
    public fun networkInterfaceId(networkInterfaceId: String)

    /**
     * @param privateIpAddress The primary or secondary private IP address to associate with the
     * Elastic IP address.
     * If no private IP address is specified, the Elastic IP address is associated with the primary
     * private IP address.
     */
    public fun privateIpAddress(privateIpAddress: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPAssociationProps.builder()

    /**
     * @param allocationId The allocation ID.
     * This is required.
     */
    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    /**
     * @param eip The Elastic IP address to associate with the instance.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun eip(eip: String) {
      cdkBuilder.eip(eip)
    }

    /**
     * @param instanceId The ID of the instance.
     * The instance must have exactly one attached network interface. You can specify either the
     * instance ID or the network interface ID, but not both.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param networkInterfaceId The ID of the network interface.
     * If the instance has more than one network interface, you must specify a network interface ID.
     *
     * You can specify either the instance ID or the network interface ID, but not both.
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param privateIpAddress The primary or secondary private IP address to associate with the
     * Elastic IP address.
     * If no private IP address is specified, the Elastic IP address is associated with the primary
     * private IP address.
     */
    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps,
  ) : CdkObject(cdkObject), CfnEIPAssociationProps {
    /**
     * The allocation ID.
     *
     * This is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-allocationid)
     */
    override fun allocationId(): String? = unwrap(this).getAllocationId()

    /**
     * (deprecated) The Elastic IP address to associate with the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-eip)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun eip(): String? = unwrap(this).getEip()

    /**
     * The ID of the instance.
     *
     * The instance must have exactly one attached network interface. You can specify either the
     * instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-instanceid)
     */
    override fun instanceId(): String? = unwrap(this).getInstanceId()

    /**
     * The ID of the network interface.
     *
     * If the instance has more than one network interface, you must specify a network interface ID.
     *
     * You can specify either the instance ID or the network interface ID, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-networkinterfaceid)
     */
    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The primary or secondary private IP address to associate with the Elastic IP address.
     *
     * If no private IP address is specified, the Elastic IP address is associated with the primary
     * private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-privateipaddress)
     */
    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEIPAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps):
        CfnEIPAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEIPAssociationProps):
        software.amazon.awscdk.services.ec2.CfnEIPAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
  }
}
