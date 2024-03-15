@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds sources to an existing bridge.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnBridgeSource cfnBridgeSource = CfnBridgeSource.Builder.create(this, "MyCfnBridgeSource")
 * .bridgeArn("bridgeArn")
 * .name("name")
 * // the properties below are optional
 * .flowSource(BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .networkSource(BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
 */
public open class CfnBridgeSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the bridge that you want to describe.
   */
  public open fun bridgeArn(): String = unwrap(this).getBridgeArn()

  /**
   * The ARN of the bridge that you want to describe.
   */
  public open fun bridgeArn(`value`: String) {
    unwrap(this).setBridgeArn(`value`)
  }

  /**
   * Add a flow source to an existing bridge.
   */
  public open fun flowSource(): Any? = unwrap(this).getFlowSource()

  /**
   * Add a flow source to an existing bridge.
   */
  public open fun flowSource(`value`: IResolvable) {
    unwrap(this).setFlowSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Add a flow source to an existing bridge.
   */
  public open fun flowSource(`value`: BridgeFlowSourceProperty) {
    unwrap(this).setFlowSource(`value`.let(BridgeFlowSourceProperty::unwrap))
  }

  /**
   * Add a flow source to an existing bridge.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f35bd9d9dce9c21e47c1c586b44f3cd49d19e35ef4924b38c43a6e8bb09d0ad0")
  public open fun flowSource(`value`: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
      flowSource(BridgeFlowSourceProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the flow source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the flow source.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Add a network source to an existing bridge.
   */
  public open fun networkSource(): Any? = unwrap(this).getNetworkSource()

  /**
   * Add a network source to an existing bridge.
   */
  public open fun networkSource(`value`: IResolvable) {
    unwrap(this).setNetworkSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * Add a network source to an existing bridge.
   */
  public open fun networkSource(`value`: BridgeNetworkSourceProperty) {
    unwrap(this).setNetworkSource(`value`.let(BridgeNetworkSourceProperty::unwrap))
  }

  /**
   * Add a network source to an existing bridge.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10b7826c27059c2c2192a3b1e1af166be2e9076e8f9397fa1299854f59705561")
  public open fun networkSource(`value`: BridgeNetworkSourceProperty.Builder.() -> Unit): Unit =
      networkSource(BridgeNetworkSourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnBridgeSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    public fun bridgeArn(bridgeArn: String)

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    public fun flowSource(flowSource: IResolvable)

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    public fun flowSource(flowSource: BridgeFlowSourceProperty)

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14219218af9bf4119d9a300e98e1eba9e68fb69255d59134be5c58b26a0a3266")
    public fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit)

    /**
     * The name of the flow source.
     *
     * This name is used to reference the source and must be unique among sources in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-name)
     * @param name The name of the flow source. 
     */
    public fun name(name: String)

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    public fun networkSource(networkSource: IResolvable)

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    public fun networkSource(networkSource: BridgeNetworkSourceProperty)

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c433b768300479d0195d0079aaf4b5ad0d06975e9878cb5629961d760ccb830")
    public fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.Builder.create(scope, id)

    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    override fun flowSource(flowSource: IResolvable) {
      cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
    }

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    override fun flowSource(flowSource: BridgeFlowSourceProperty) {
      cdkBuilder.flowSource(flowSource.let(BridgeFlowSourceProperty::unwrap))
    }

    /**
     * Add a flow source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     * @param flowSource Add a flow source to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14219218af9bf4119d9a300e98e1eba9e68fb69255d59134be5c58b26a0a3266")
    override fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
        flowSource(BridgeFlowSourceProperty(flowSource))

    /**
     * The name of the flow source.
     *
     * This name is used to reference the source and must be unique among sources in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-name)
     * @param name The name of the flow source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    override fun networkSource(networkSource: IResolvable) {
      cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
    }

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    override fun networkSource(networkSource: BridgeNetworkSourceProperty) {
      cdkBuilder.networkSource(networkSource.let(BridgeNetworkSourceProperty::unwrap))
    }

    /**
     * Add a network source to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     * @param networkSource Add a network source to an existing bridge. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c433b768300479d0195d0079aaf4b5ad0d06975e9878cb5629961d760ccb830")
    override fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit): Unit
        = networkSource(BridgeNetworkSourceProperty(networkSource))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridgeSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridgeSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource):
        CfnBridgeSource = CfnBridgeSource(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeSource):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSource = wrapped.cdkObject
  }

  /**
   * The VPC interface that you want to send your output to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
   * VpcInterfaceAttachmentProperty.builder()
   * .vpcInterfaceName("vpcInterfaceName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-vpcinterfaceattachment.html)
   */
  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-vpcinterfaceattachment.html#cfn-mediaconnect-bridgesource-vpcinterfaceattachment-vpcinterfacename)
     */
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * A builder for [VpcInterfaceAttachmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
      /**
       * The name of the VPC interface that you want to send your output to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-vpcinterfaceattachment.html#cfn-mediaconnect-bridgesource-vpcinterfaceattachment-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.VpcInterfaceAttachmentProperty
    }
  }

  /**
   * The source of the bridge.
   *
   * A network source originates at your premises.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * BridgeNetworkSourceProperty bridgeNetworkSourceProperty = BridgeNetworkSourceProperty.builder()
   * .multicastIp("multicastIp")
   * .networkName("networkName")
   * .port(123)
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html)
   */
  public interface BridgeNetworkSourceProperty {
    /**
     * The network source multicast IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-multicastip)
     */
    public fun multicastIp(): String

    /**
     * The network source's gateway network name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-networkname)
     */
    public fun networkName(): String

    /**
     * The network source port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-port)
     */
    public fun port(): Number

    /**
     * The network source protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-protocol)
     */
    public fun protocol(): String

    /**
     * A builder for [BridgeNetworkSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param multicastIp The network source multicast IP. 
       */
      public fun multicastIp(multicastIp: String)

      /**
       * @param networkName The network source's gateway network name. 
       */
      public fun networkName(networkName: String)

      /**
       * @param port The network source port. 
       */
      public fun port(port: Number)

      /**
       * @param protocol The network source protocol. 
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty.builder()

      /**
       * @param multicastIp The network source multicast IP. 
       */
      override fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
      }

      /**
       * @param networkName The network source's gateway network name. 
       */
      override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      /**
       * @param port The network source port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The network source protocol. 
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty,
    ) : CdkObject(cdkObject), BridgeNetworkSourceProperty {
      /**
       * The network source multicast IP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-multicastip)
       */
      override fun multicastIp(): String = unwrap(this).getMulticastIp()

      /**
       * The network source's gateway network name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-networkname)
       */
      override fun networkName(): String = unwrap(this).getNetworkName()

      /**
       * The network source port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The network source protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgenetworksource.html#cfn-mediaconnect-bridgesource-bridgenetworksource-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty):
          BridgeNetworkSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeNetworkSourceProperty
    }
  }

  /**
   * The source of the bridge.
   *
   * A flow source originates in MediaConnect as an existing cloud flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * BridgeFlowSourceProperty bridgeFlowSourceProperty = BridgeFlowSourceProperty.builder()
   * .flowArn("flowArn")
   * // the properties below are optional
   * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
   * .vpcInterfaceName("vpcInterfaceName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html)
   */
  public interface BridgeFlowSourceProperty {
    /**
     * The ARN of the cloud flow used as a source of this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html#cfn-mediaconnect-bridgesource-bridgeflowsource-flowarn)
     */
    public fun flowArn(): String

    /**
     * The name of the VPC interface attachment to use for this source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html#cfn-mediaconnect-bridgesource-bridgeflowsource-flowvpcinterfaceattachment)
     */
    public fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

    /**
     * A builder for [BridgeFlowSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flowArn The ARN of the cloud flow used as a source of this bridge. 
       */
      public fun flowArn(flowArn: String)

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable)

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f5dfd0f80287bd748769d5a24c4c5a1aba5deafd383f87751193631c586b24c")
      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty.builder()

      /**
       * @param flowArn The ARN of the cloud flow used as a source of this bridge. 
       */
      override fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
      }

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      override fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      /**
       * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f5dfd0f80287bd748769d5a24c4c5a1aba5deafd383f87751193631c586b24c")
      override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit =
          flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty(flowVpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty,
    ) : CdkObject(cdkObject), BridgeFlowSourceProperty {
      /**
       * The ARN of the cloud flow used as a source of this bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html#cfn-mediaconnect-bridgesource-bridgeflowsource-flowarn)
       */
      override fun flowArn(): String = unwrap(this).getFlowArn()

      /**
       * The name of the VPC interface attachment to use for this source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgesource-bridgeflowsource.html#cfn-mediaconnect-bridgesource-bridgeflowsource-flowvpcinterfaceattachment)
       */
      override fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeFlowSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty):
          BridgeFlowSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeFlowSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridgeSource.BridgeFlowSourceProperty
    }
  }
}
