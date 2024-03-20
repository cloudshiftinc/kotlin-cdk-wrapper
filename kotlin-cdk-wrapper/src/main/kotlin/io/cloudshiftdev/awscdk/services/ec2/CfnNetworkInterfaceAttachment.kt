@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Attaches an elastic network interface (ENI) to an Amazon EC2 instance.
 *
 * You can use this resource type to attach additional network interfaces to an instance without
 * interruption.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInterfaceAttachment cfnNetworkInterfaceAttachment =
 * CfnNetworkInterfaceAttachment.Builder.create(this, "MyCfnNetworkInterfaceAttachment")
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
public open class CfnNetworkInterfaceAttachment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInterfaceAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNetworkInterfaceAttachmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkInterfaceAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkInterfaceAttachmentProps(props)
  )

  /**
   * The ID of the network interface attachment.
   */
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  /**
   * Whether to delete the network interface when the instance terminates.
   */
  public open fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

  /**
   * Whether to delete the network interface when the instance terminates.
   */
  public open fun deleteOnTermination(`value`: Boolean) {
    unwrap(this).setDeleteOnTermination(`value`)
  }

  /**
   * Whether to delete the network interface when the instance terminates.
   */
  public open fun deleteOnTermination(`value`: IResolvable) {
    unwrap(this).setDeleteOnTermination(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network interface's position in the attachment order.
   */
  public open fun deviceIndex(): String = unwrap(this).getDeviceIndex()

  /**
   * The network interface's position in the attachment order.
   */
  public open fun deviceIndex(`value`: String) {
    unwrap(this).setDeviceIndex(`value`)
  }

  /**
   * Configures ENA Express for the network interface that this action attaches to the instance.
   */
  public open fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

  /**
   * Configures ENA Express for the network interface that this action attaches to the instance.
   */
  public open fun enaSrdSpecification(`value`: IResolvable) {
    unwrap(this).setEnaSrdSpecification(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures ENA Express for the network interface that this action attaches to the instance.
   */
  public open fun enaSrdSpecification(`value`: EnaSrdSpecificationProperty) {
    unwrap(this).setEnaSrdSpecification(`value`.let(EnaSrdSpecificationProperty::unwrap))
  }

  /**
   * Configures ENA Express for the network interface that this action attaches to the instance.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e647dfadb160fb060624d9f56c0afe5821d00c048e36e155a68c76d57fa704d7")
  public open fun enaSrdSpecification(`value`: EnaSrdSpecificationProperty.Builder.() -> Unit): Unit
      = enaSrdSpecification(EnaSrdSpecificationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the instance to which you will attach the ENI.
   */
  public open fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The ID of the instance to which you will attach the ENI.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The ID of the ENI that you want to attach.
   */
  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  /**
   * The ID of the ENI that you want to attach.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInterfaceAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to delete the network interface when the instance terminates.
     *
     * By default, this value is set to `true` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates. 
     */
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    /**
     * Whether to delete the network interface when the instance terminates.
     *
     * By default, this value is set to `true` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates. 
     */
    public fun deleteOnTermination(deleteOnTermination: IResolvable)

    /**
     * The network interface's position in the attachment order.
     *
     * For example, the first attached network interface has a `DeviceIndex` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deviceindex)
     * @param deviceIndex The network interface's position in the attachment order. 
     */
    public fun deviceIndex(deviceIndex: String)

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    public fun enaSrdSpecification(enaSrdSpecification: IResolvable)

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    public fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty)

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2844026d64cad90b7d73a1297af418e0480836d89ff4786c9c0e5cc0b78cdd8")
    public
        fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit)

    /**
     * The ID of the instance to which you will attach the ENI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-instanceid)
     * @param instanceId The ID of the instance to which you will attach the ENI. 
     */
    public fun instanceId(instanceId: String)

    /**
     * The ID of the ENI that you want to attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-networkinterfaceid)
     * @param networkInterfaceId The ID of the ENI that you want to attach. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder.create(scope, id)

    /**
     * Whether to delete the network interface when the instance terminates.
     *
     * By default, this value is set to `true` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates. 
     */
    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    /**
     * Whether to delete the network interface when the instance terminates.
     *
     * By default, this value is set to `true` .
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
     * @param deleteOnTermination Whether to delete the network interface when the instance
     * terminates. 
     */
    override fun deleteOnTermination(deleteOnTermination: IResolvable) {
      cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
    }

    /**
     * The network interface's position in the attachment order.
     *
     * For example, the first attached network interface has a `DeviceIndex` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deviceindex)
     * @param deviceIndex The network interface's position in the attachment order. 
     */
    override fun deviceIndex(deviceIndex: String) {
      cdkBuilder.deviceIndex(deviceIndex)
    }

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
    }

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    override fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(EnaSrdSpecificationProperty::unwrap))
    }

    /**
     * Configures ENA Express for the network interface that this action attaches to the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-enasrdspecification)
     * @param enaSrdSpecification Configures ENA Express for the network interface that this action
     * attaches to the instance. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2844026d64cad90b7d73a1297af418e0480836d89ff4786c9c0e5cc0b78cdd8")
    override
        fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit):
        Unit = enaSrdSpecification(EnaSrdSpecificationProperty(enaSrdSpecification))

    /**
     * The ID of the instance to which you will attach the ENI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-instanceid)
     * @param instanceId The ID of the instance to which you will attach the ENI. 
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * The ID of the ENI that you want to attach.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-networkinterfaceid)
     * @param networkInterfaceId The ID of the ENI that you want to attach. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInterfaceAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInterfaceAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment):
        CfnNetworkInterfaceAttachment = CfnNetworkInterfaceAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceAttachment):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment = wrapped.cdkObject
  }

  /**
   * ENA Express is compatible with both TCP and UDP transport protocols.
   *
   * When it's enabled, TCP traffic automatically uses it. However, some UDP-based applications are
   * designed to handle network packets that are out of order, without a need for retransmission, such
   * as live video broadcasting or other near-real-time applications. For UDP traffic, you can specify
   * whether to use ENA Express, based on your application environment needs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnaSrdUdpSpecificationProperty enaSrdUdpSpecificationProperty =
   * EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdudpspecification.html)
   */
  public interface EnaSrdUdpSpecificationProperty {
    /**
     * Indicates whether UDP traffic to and from the instance uses ENA Express.
     *
     * To specify this setting, you must first enable ENA Express.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdudpspecification.html#cfn-ec2-networkinterfaceattachment-enasrdudpspecification-enasrdudpenabled)
     */
    public fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()

    /**
     * A builder for [EnaSrdUdpSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean)

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty.builder()

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
      }

      /**
       * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
       * Express.
       * To specify this setting, you must first enable ENA Express.
       */
      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty,
    ) : CdkObject(cdkObject), EnaSrdUdpSpecificationProperty {
      /**
       * Indicates whether UDP traffic to and from the instance uses ENA Express.
       *
       * To specify this setting, you must first enable ENA Express.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdudpspecification.html#cfn-ec2-networkinterfaceattachment-enasrdudpspecification-enasrdudpenabled)
       */
      override fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdUdpSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty):
          EnaSrdUdpSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnaSrdUdpSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdUdpSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty
    }
  }

  /**
   * ENA Express uses AWS Scalable Reliable Datagram (SRD) technology to increase the maximum
   * bandwidth used per stream and minimize tail latency of network traffic between EC2 instances.
   *
   * With ENA Express, you can communicate between two EC2 instances in the same subnet within the
   * same account, or in different accounts. Both sending and receiving instances must have ENA Express
   * enabled.
   *
   * To improve the reliability of network packet delivery, ENA Express reorders network packets on
   * the receiving end by default. However, some UDP-based applications are designed to handle network
   * packets that are out of order to reduce the overhead for packet delivery at the network layer.
   * When ENA Express is enabled, you can specify whether UDP network traffic uses it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * EnaSrdSpecificationProperty enaSrdSpecificationProperty = EnaSrdSpecificationProperty.builder()
   * .enaSrdEnabled(false)
   * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
   * .enaSrdUdpEnabled(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdspecification.html)
   */
  public interface EnaSrdSpecificationProperty {
    /**
     * Indicates whether ENA Express is enabled for the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdspecification.html#cfn-ec2-networkinterfaceattachment-enasrdspecification-enasrdenabled)
     */
    public fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

    /**
     * Configures ENA Express for UDP network traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdspecification.html#cfn-ec2-networkinterfaceattachment-enasrdspecification-enasrdudpspecification)
     */
    public fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()

    /**
     * A builder for [EnaSrdSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      public fun enaSrdEnabled(enaSrdEnabled: Boolean)

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      public fun enaSrdEnabled(enaSrdEnabled: IResolvable)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty)

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8d2766962cbbac50057650c19657945de7468cb1d17da11e865970b1a6348d")
      public
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.builder()

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      override fun enaSrdEnabled(enaSrdEnabled: Boolean) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
      }

      /**
       * @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface.
       */
      override fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(EnaSrdUdpSpecificationProperty::unwrap))
      }

      /**
       * @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8d2766962cbbac50057650c19657945de7468cb1d17da11e865970b1a6348d")
      override
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty(enaSrdUdpSpecification))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty,
    ) : CdkObject(cdkObject), EnaSrdSpecificationProperty {
      /**
       * Indicates whether ENA Express is enabled for the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdspecification.html#cfn-ec2-networkinterfaceattachment-enasrdspecification-enasrdenabled)
       */
      override fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

      /**
       * Configures ENA Express for UDP network traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterfaceattachment-enasrdspecification.html#cfn-ec2-networkinterfaceattachment-enasrdspecification-enasrdudpspecification)
       */
      override fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty):
          EnaSrdSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EnaSrdSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty
    }
  }
}
