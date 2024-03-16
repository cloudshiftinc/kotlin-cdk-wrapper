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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html)
 */
public interface CfnBridgeSourceProps {
  /**
   * The ARN of the bridge that you want to describe.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
   */
  public fun bridgeArn(): String

  /**
   * Add a flow source to an existing bridge.
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
   * Add a network source to an existing bridge.
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
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    public fun bridgeArn(bridgeArn: String)

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: IResolvable)

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty)

    /**
     * @param flowSource Add a flow source to an existing bridge.
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
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: IResolvable)

    /**
     * @param networkSource Add a network source to an existing bridge.
     */
    public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty)

    /**
     * @param networkSource Add a network source to an existing bridge.
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
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    override fun flowSource(flowSource: IResolvable) {
      cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
    }

    /**
     * @param flowSource Add a flow source to an existing bridge.
     */
    override fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
      cdkBuilder.flowSource(flowSource.let(CfnBridgeSource.BridgeFlowSourceProperty::unwrap))
    }

    /**
     * @param flowSource Add a flow source to an existing bridge.
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
     * @param networkSource Add a network source to an existing bridge.
     */
    override fun networkSource(networkSource: IResolvable) {
      cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
    }

    /**
     * @param networkSource Add a network source to an existing bridge.
     */
    override fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
      cdkBuilder.networkSource(networkSource.let(CfnBridgeSource.BridgeNetworkSourceProperty::unwrap))
    }

    /**
     * @param networkSource Add a network source to an existing bridge.
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
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps,
  ) : CdkObject(cdkObject), CfnBridgeSourceProps {
    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgesource.html#cfn-mediaconnect-bridgesource-bridgearn)
     */
    override fun bridgeArn(): String = unwrap(this).getBridgeArn()

    /**
     * Add a flow source to an existing bridge.
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
     * Add a network source to an existing bridge.
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
        CfnBridgeSourceProps = CdkObjectWrappers.wrap(cdkObject) as CfnBridgeSourceProps

    internal fun unwrap(wrapped: CfnBridgeSourceProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
  }
}
