@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNetworkInterfaceAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInterfaceAttachmentProps cfnNetworkInterfaceAttachmentProps =
 * CfnNetworkInterfaceAttachmentProps.builder()
 * .deviceIndex("deviceIndex")
 * .instanceId("instanceId")
 * .networkInterfaceId("networkInterfaceId")
 * // the properties below are optional
 * .deleteOnTermination(false)
 * .enaSrdSpecification(EnaSrdSpecificationProperty.builder()
 * .enaSrdEnabled(false)
 * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
 * .enaSrdUdpEnabled(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html)
 */
public interface CfnNetworkInterfaceAttachmentProps {
  /**
   * Whether to delete the network interface when the instance terminates.
   *
   * By default, this value is set to `true` .
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
   */
  public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

  /**
   * The network interface's position in the attachment order.
   *
   * For example, the first attached network interface has a `DeviceIndex` of 0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deviceindex)
   */
  public fun deviceIndex(): String

  /**
   * Configures ENA Express for the network interface that this action attaches to the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
   */
  public fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

  /**
   * The ID of the instance to which you will attach the ENI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-instanceid)
   */
  public fun instanceId(): String

  /**
   * The ID of the ENI that you want to attach.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-networkinterfaceid)
   */
  public fun networkInterfaceId(): String

  /**
   * A builder for [CfnNetworkInterfaceAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates.
     * By default, this value is set to `true` .
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    /**
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates.
     * By default, this value is set to `true` .
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable)

    /**
     * @param deviceIndex The network interface's position in the attachment order. 
     * For example, the first attached network interface has a `DeviceIndex` of 0.
     */
    public fun deviceIndex(deviceIndex: String)

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    public fun enaSrdSpecification(enaSrdSpecification: IResolvable)

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    public
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty)

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b1dc0ecbc9c51385c4709e3e8f65751095bfdac61c3283e937b611eb7e43fcb")
    public
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder.() -> Unit)

    /**
     * @param instanceId The ID of the instance to which you will attach the ENI. 
     */
    public fun instanceId(instanceId: String)

    /**
     * @param networkInterfaceId The ID of the ENI that you want to attach. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps.builder()

    /**
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates.
     * By default, this value is set to `true` .
     */
    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates.
     * By default, this value is set to `true` .
     */
    override fun deleteOnTermination(deleteOnTermination: IResolvable) {
      cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
    }

    /**
     * @param deviceIndex The network interface's position in the attachment order. 
     * For example, the first attached network interface has a `DeviceIndex` of 0.
     */
    override fun deviceIndex(deviceIndex: String) {
      cdkBuilder.deviceIndex(deviceIndex)
    }

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    override
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty::unwrap))
    }

    /**
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b1dc0ecbc9c51385c4709e3e8f65751095bfdac61c3283e937b611eb7e43fcb")
    override
        fun enaSrdSpecification(enaSrdSpecification: CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder.() -> Unit):
        Unit =
        enaSrdSpecification(CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty(enaSrdSpecification))

    /**
     * @param instanceId The ID of the instance to which you will attach the ENI. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param networkInterfaceId The ID of the ENI that you want to attach. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps,
  ) : CdkObject(cdkObject), CfnNetworkInterfaceAttachmentProps {
    /**
     * Whether to delete the network interface when the instance terminates.
     *
     * By default, this value is set to `true` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
     */
    override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    /**
     * The network interface's position in the attachment order.
     *
     * For example, the first attached network interface has a `DeviceIndex` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deviceindex)
     */
    override fun deviceIndex(): String = unwrap(this).getDeviceIndex()

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     */
    override fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

    /**
     * The ID of the instance to which you will attach the ENI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-instanceid)
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * The ID of the ENI that you want to attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-networkinterfaceid)
     */
    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInterfaceAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps):
        CfnNetworkInterfaceAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnNetworkInterfaceAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps
  }
}
