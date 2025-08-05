@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBridge`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnBridgeProps cfnBridgeProps = CfnBridgeProps.builder()
 * .name("name")
 * .placementArn("placementArn")
 * .sources(List.of(BridgeSourceProperty.builder()
 * .flowSource(BridgeFlowSourceProperty.builder()
 * .flowArn("flowArn")
 * .name("name")
 * // the properties below are optional
 * .flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .networkSource(BridgeNetworkSourceProperty.builder()
 * .multicastIp("multicastIp")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * // the properties below are optional
 * .multicastSourceSettings(MulticastSourceSettingsProperty.builder()
 * .multicastSourceIp("multicastSourceIp")
 * .build())
 * .build())
 * .build()))
 * // the properties below are optional
 * .egressGatewayBridge(EgressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .build())
 * .ingressGatewayBridge(IngressGatewayBridgeProperty.builder()
 * .maxBitrate(123)
 * .maxOutputs(123)
 * .build())
 * .outputs(List.of(BridgeOutputProperty.builder()
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .name("name")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build()))
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * // the properties below are optional
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html)
 */
public interface CfnBridgeProps {
  /**
   * An egress bridge is a cloud-to-ground bridge.
   *
   * The content comes from an existing MediaConnect flow and is delivered to your premises.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
   */
  public fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

  /**
   * An ingress bridge is a ground-to-cloud bridge.
   *
   * The content originates at your premises and is delivered to the cloud.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
   */
  public fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

  /**
   * The name of the bridge.
   *
   * This name can not be modified after the bridge is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-name)
   */
  public fun name(): String

  /**
   * The outputs that you want to add to this bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
   */
  public fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * The bridge placement Amazon Resource Number (ARN).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-placementarn)
   */
  public fun placementArn(): String

  /**
   * The settings for source failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
   */
  public fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  /**
   * The sources that you want to add to this bridge.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
   */
  public fun sources(): Any

  /**
   * A builder for [CfnBridgeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable)

    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    public fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty)

    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00a44f5337692dc3b05c2338a1ba9908a67b0abac8e0e7e784cc8992d5f6f43")
    public
        fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty.Builder.() -> Unit)

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable)

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty)

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeb90e11d39737f1807c3f7cb093da150771dfd68ec81f99ae6c2d2f58cc1e22")
    public
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty.Builder.() -> Unit)

    /**
     * @param name The name of the bridge. 
     * This name can not be modified after the bridge is created.
     */
    public fun name(name: String)

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(outputs: IResolvable)

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(outputs: List<Any>)

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    public fun outputs(vararg outputs: Any)

    /**
     * @param placementArn The bridge placement Amazon Resource Number (ARN). 
     */
    public fun placementArn(placementArn: String)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a0476c51cbb40bfb99276f362787e0c6072067a3b021e950144be8b0d33e93e")
    public
        fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty.Builder.() -> Unit)

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(sources: IResolvable)

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(sources: List<Any>)

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(vararg sources: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeProps.builder()

    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    override fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    override fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(CfnBridge.EgressGatewayBridgeProperty.Companion::unwrap))
    }

    /**
     * @param egressGatewayBridge An egress bridge is a cloud-to-ground bridge.
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00a44f5337692dc3b05c2338a1ba9908a67b0abac8e0e7e784cc8992d5f6f43")
    override
        fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = egressGatewayBridge(CfnBridge.EgressGatewayBridgeProperty(egressGatewayBridge))

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    override fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    override
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(CfnBridge.IngressGatewayBridgeProperty.Companion::unwrap))
    }

    /**
     * @param ingressGatewayBridge An ingress bridge is a ground-to-cloud bridge.
     * The content originates at your premises and is delivered to the cloud.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aeb90e11d39737f1807c3f7cb093da150771dfd68ec81f99ae6c2d2f58cc1e22")
    override
        fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = ingressGatewayBridge(CfnBridge.IngressGatewayBridgeProperty(ingressGatewayBridge))

    /**
     * @param name The name of the bridge. 
     * This name can not be modified after the bridge is created.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param outputs The outputs that you want to add to this bridge.
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * @param placementArn The bridge placement Amazon Resource Number (ARN). 
     */
    override fun placementArn(placementArn: String) {
      cdkBuilder.placementArn(placementArn)
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(CfnBridge.FailoverConfigProperty.Companion::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a0476c51cbb40bfb99276f362787e0c6072067a3b021e950144be8b0d33e93e")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(CfnBridge.FailoverConfigProperty(sourceFailoverConfig))

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps,
  ) : CdkObject(cdkObject),
      CfnBridgeProps {
    /**
     * An egress bridge is a cloud-to-ground bridge.
     *
     * The content comes from an existing MediaConnect flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     */
    override fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

    /**
     * An ingress bridge is a ground-to-cloud bridge.
     *
     * The content originates at your premises and is delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     */
    override fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

    /**
     * The name of the bridge.
     *
     * This name can not be modified after the bridge is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     */
    override fun outputs(): Any? = unwrap(this).getOutputs()

    /**
     * The bridge placement Amazon Resource Number (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-placementarn)
     */
    override fun placementArn(): String = unwrap(this).getPlacementArn()

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     */
    override fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     */
    override fun sources(): Any = unwrap(this).getSources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBridgeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeProps):
        CfnBridgeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBridgeProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeProps):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnBridgeProps
  }
}
