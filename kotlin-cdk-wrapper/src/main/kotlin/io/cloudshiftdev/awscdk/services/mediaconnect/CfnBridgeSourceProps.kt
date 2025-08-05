@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBridgeSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnBridgeSourceProps cfnBridgeSourceProps = CfnBridgeSourceProps.builder()
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
 * // the properties below are optional
 * .multicastSourceSettings(MulticastSourceSettingsProperty.builder()
 * .multicastSourceIp("multicastSourceIp")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
 */
public interface CfnBridgeSourceProps {
  /**
   * The ARN of the bridge feeding this flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
   */
  public fun bridgeArn(): String

  /**
   * The source of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
   */
  public fun flowSource(): Any? = unwrap(this).getFlowSource()

  /**
   * The name of the flow source.
   *
   * This name is used to reference the source and must be unique among sources in this bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-name)
   */
  public fun name(): String

  /**
   * The source of the network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
   */
  public fun networkSource(): Any? = unwrap(this).getNetworkSource()

  /**
   * A builder for [CfnBridgeSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bridgeArn The ARN of the bridge feeding this flow. 
     */
    public fun bridgeArn(bridgeArn: String)

    /**
     * @param flowSource The source of the flow.
     */
    public fun flowSource(flowSource: IResolvable)

    /**
     * @param flowSource The source of the flow.
     */
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty)

    /**
     * @param flowSource The source of the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671163b1a05c2c8a867c977ca6b807fd696e3cb4df0c764b74f9af2736559cc0")
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty.Builder.() -> Unit)

    /**
     * @param name The name of the flow source. 
     * This name is used to reference the source and must be unique among sources in this bridge.
     */
    public fun name(name: String)

    /**
     * @param networkSource The source of the network.
     */
    public fun networkSource(networkSource: IResolvable)

    /**
     * @param networkSource The source of the network.
     */
    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty)

    /**
     * @param networkSource The source of the network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33d05cf2dfa41a6a9ec4a7c76df17f0a77b8403c4659c75d5e34c8bb83ab018")
    public
        fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps.builder()

    /**
     * @param bridgeArn The ARN of the bridge feeding this flow. 
     */
    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * @param flowSource The source of the flow.
     */
    override fun flowSource(flowSource: IResolvable) {
      cdkBuilder.flowSource(flowSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param flowSource The source of the flow.
     */
    override fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
      cdkBuilder.flowSource(flowSource.let(CfnBridgeSource.BridgeFlowSourceProperty.Companion::unwrap))
    }

    /**
     * @param flowSource The source of the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("671163b1a05c2c8a867c977ca6b807fd696e3cb4df0c764b74f9af2736559cc0")
    override
        fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty.Builder.() -> Unit):
        Unit = flowSource(CfnBridgeSource.BridgeFlowSourceProperty(flowSource))

    /**
     * @param name The name of the flow source. 
     * This name is used to reference the source and must be unique among sources in this bridge.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkSource The source of the network.
     */
    override fun networkSource(networkSource: IResolvable) {
      cdkBuilder.networkSource(networkSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param networkSource The source of the network.
     */
    override fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
      cdkBuilder.networkSource(networkSource.let(CfnBridgeSource.BridgeNetworkSourceProperty.Companion::unwrap))
    }

    /**
     * @param networkSource The source of the network.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33d05cf2dfa41a6a9ec4a7c76df17f0a77b8403c4659c75d5e34c8bb83ab018")
    override
        fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty.Builder.() -> Unit):
        Unit = networkSource(CfnBridgeSource.BridgeNetworkSourceProperty(networkSource))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps,
  ) : CdkObject(cdkObject),
      CfnBridgeSourceProps {
    /**
     * The ARN of the bridge feeding this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
     */
    override fun bridgeArn(): String = unwrap(this).getBridgeArn()

    /**
     * The source of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-flowsource)
     */
    override fun flowSource(): Any? = unwrap(this).getFlowSource()

    /**
     * The name of the flow source.
     *
     * This name is used to reference the source and must be unique among sources in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The source of the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-networksource)
     */
    override fun networkSource(): Any? = unwrap(this).getNetworkSource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps):
        CfnBridgeSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBridgeSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeSourceProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
  }
}
