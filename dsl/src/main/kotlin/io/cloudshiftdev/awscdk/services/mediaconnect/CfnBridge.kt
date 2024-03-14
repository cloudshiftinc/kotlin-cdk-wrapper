package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBridge internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The Amazon Resource Name (ARN) of the bridge.
   */
  public open fun attrBridgeArn(): String = unwrap(this).getAttrBridgeArn()

  /**
   * The current status of the bridge.
   *
   * Possible values are: ACTIVE or STANDBY.
   */
  public open fun attrBridgeState(): String = unwrap(this).getAttrBridgeState()

  /**
   * Create a bridge with the egress bridge type.
   */
  public open fun egressGatewayBridge(): Any? = unwrap(this).getEgressGatewayBridge()

  /**
   * Create a bridge with the egress bridge type.
   */
  public open fun egressGatewayBridge(`value`: IResolvable) {
    unwrap(this).setEgressGatewayBridge(`value`.let(IResolvable::unwrap))
  }

  /**
   * Create a bridge with the egress bridge type.
   */
  public open fun egressGatewayBridge(`value`: EgressGatewayBridgeProperty) {
    unwrap(this).setEgressGatewayBridge(`value`.let(EgressGatewayBridgeProperty::unwrap))
  }

  /**
   * Create a bridge with the egress bridge type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70fb1c84e742a3e95c3bab10489b85dab946dd3d65202b8b1eafbdceb732229e")
  public open fun egressGatewayBridge(`value`: EgressGatewayBridgeProperty.Builder.() -> Unit): Unit
      = egressGatewayBridge(EgressGatewayBridgeProperty(`value`))

  /**
   * Create a bridge with the ingress bridge type.
   */
  public open fun ingressGatewayBridge(): Any? = unwrap(this).getIngressGatewayBridge()

  /**
   * Create a bridge with the ingress bridge type.
   */
  public open fun ingressGatewayBridge(`value`: IResolvable) {
    unwrap(this).setIngressGatewayBridge(`value`.let(IResolvable::unwrap))
  }

  /**
   * Create a bridge with the ingress bridge type.
   */
  public open fun ingressGatewayBridge(`value`: IngressGatewayBridgeProperty) {
    unwrap(this).setIngressGatewayBridge(`value`.let(IngressGatewayBridgeProperty::unwrap))
  }

  /**
   * Create a bridge with the ingress bridge type.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c770bd80ef4aac3e8ba9121245762b8868e5bd45bd039957214b6f9c513167b1")
  public open fun ingressGatewayBridge(`value`: IngressGatewayBridgeProperty.Builder.() -> Unit):
      Unit = ingressGatewayBridge(IngressGatewayBridgeProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the bridge.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the bridge.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The outputs that you want to add to this bridge.
   */
  public open fun outputs(): Any? = unwrap(this).getOutputs()

  /**
   * The outputs that you want to add to this bridge.
   */
  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable::unwrap))
  }

  /**
   * The outputs that you want to add to this bridge.
   */
  public open fun outputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputs(__idx_ac66f0)
  }

  /**
   * The outputs that you want to add to this bridge.
   */
  public open fun outputs(vararg __idx_ac66f0: Any): Unit = outputs(__idx_ac66f0.toList())

  /**
   * The bridge placement Amazon Resource Number (ARN).
   */
  public open fun placementArn(): String = unwrap(this).getPlacementArn()

  /**
   * The bridge placement Amazon Resource Number (ARN).
   */
  public open fun placementArn(`value`: String) {
    unwrap(this).setPlacementArn(`value`)
  }

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(`value`: IResolvable) {
    unwrap(this).setSourceFailoverConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty) {
    unwrap(this).setSourceFailoverConfig(`value`.let(FailoverConfigProperty::unwrap))
  }

  /**
   * The settings for source failover.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3162252ac2aeda6c684f71034bb13e000c16bd60b64a157569b49ef8ca461bf")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

  /**
   * The sources that you want to add to this bridge.
   */
  public open fun sources(): Any = unwrap(this).getSources()

  /**
   * The sources that you want to add to this bridge.
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The sources that you want to add to this bridge.
   */
  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  /**
   * The sources that you want to add to this bridge.
   */
  public open fun sources(vararg __idx_ac66f0: Any): Unit = sources(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnBridge].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    public fun egressGatewayBridge(egressGatewayBridge: IResolvable)

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    public fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty)

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4e47ca6e679dc8a042e36f6f677bb466453247f12689dee9a713dc94ee64e5")
    public
        fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty.Builder.() -> Unit)

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable)

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    public fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty)

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79ee9332cc61112458697a9323457833ddf24d8bb615b3fb77d585d5ef31c910")
    public
        fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty.Builder.() -> Unit)

    /**
     * The name of the bridge.
     *
     * This name can not be modified after the bridge is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-name)
     * @param name The name of the bridge. 
     */
    public fun name(name: String)

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    public fun outputs(outputs: IResolvable)

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    public fun outputs(outputs: List<Any>)

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    public fun outputs(vararg outputs: Any)

    /**
     * The bridge placement Amazon Resource Number (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-placementarn)
     * @param placementArn The bridge placement Amazon Resource Number (ARN). 
     */
    public fun placementArn(placementArn: String)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7040cbc2c28d5d704b49433fec10cbe8b1f77470dcaa5c83df6fab2ed2295b2f")
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit)

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(sources: IResolvable)

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(sources: List<Any>)

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    public fun sources(vararg sources: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridge.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridge.Builder.create(scope, id)

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    override fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(IResolvable::unwrap))
    }

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    override fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty) {
      cdkBuilder.egressGatewayBridge(egressGatewayBridge.let(EgressGatewayBridgeProperty::unwrap))
    }

    /**
     * Create a bridge with the egress bridge type.
     *
     * An egress bridge is a cloud-to-ground bridge. The content comes from an existing MediaConnect
     * flow and is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-egressgatewaybridge)
     * @param egressGatewayBridge Create a bridge with the egress bridge type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4e47ca6e679dc8a042e36f6f677bb466453247f12689dee9a713dc94ee64e5")
    override
        fun egressGatewayBridge(egressGatewayBridge: EgressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = egressGatewayBridge(EgressGatewayBridgeProperty(egressGatewayBridge))

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    override fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IResolvable::unwrap))
    }

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    override fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty) {
      cdkBuilder.ingressGatewayBridge(ingressGatewayBridge.let(IngressGatewayBridgeProperty::unwrap))
    }

    /**
     * Create a bridge with the ingress bridge type.
     *
     * An ingress bridge is a ground-to-cloud bridge. The content originates at your premises and is
     * delivered to the cloud.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge)
     * @param ingressGatewayBridge Create a bridge with the ingress bridge type. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("79ee9332cc61112458697a9323457833ddf24d8bb615b3fb77d585d5ef31c910")
    override
        fun ingressGatewayBridge(ingressGatewayBridge: IngressGatewayBridgeProperty.Builder.() -> Unit):
        Unit = ingressGatewayBridge(IngressGatewayBridgeProperty(ingressGatewayBridge))

    /**
     * The name of the bridge.
     *
     * This name can not be modified after the bridge is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-name)
     * @param name The name of the bridge. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    /**
     * The outputs that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-outputs)
     * @param outputs The outputs that you want to add to this bridge. 
     */
    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    /**
     * The bridge placement Amazon Resource Number (ARN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-placementarn)
     * @param placementArn The bridge placement Amazon Resource Number (ARN). 
     */
    override fun placementArn(placementArn: String) {
      cdkBuilder.placementArn(placementArn)
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty::unwrap))
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7040cbc2c28d5d704b49433fec10cbe8b1f77470dcaa5c83df6fab2ed2295b2f")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(FailoverConfigProperty(sourceFailoverConfig))

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    /**
     * The sources that you want to add to this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridge.html#cfn-mediaconnect-bridge-sources)
     * @param sources The sources that you want to add to this bridge. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridge = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridge {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridge(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge): CfnBridge
        = CfnBridge(cdkObject)

    internal fun unwrap(wrapped: CfnBridge): software.amazon.awscdk.services.mediaconnect.CfnBridge
        = wrapped.cdkObject
  }

  public interface BridgeNetworkOutputProperty {
    /**
     * The network output IP Address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-ipaddress)
     */
    public fun ipAddress(): String

    /**
     * The network output name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-name)
     */
    public fun name(): String

    /**
     * The network output's gateway network name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-networkname)
     */
    public fun networkName(): String

    /**
     * The network output port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-port)
     */
    public fun port(): Number

    /**
     * The network output protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-protocol)
     */
    public fun protocol(): String

    /**
     * The network output TTL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-ttl)
     */
    public fun ttl(): Number

    /**
     * A builder for [BridgeNetworkOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ipAddress The network output IP Address. 
       */
      public fun ipAddress(ipAddress: String)

      /**
       * @param name The network output name. 
       */
      public fun name(name: String)

      /**
       * @param networkName The network output's gateway network name. 
       */
      public fun networkName(networkName: String)

      /**
       * @param port The network output port. 
       */
      public fun port(port: Number)

      /**
       * @param protocol The network output protocol. 
       */
      public fun protocol(protocol: String)

      /**
       * @param ttl The network output TTL. 
       */
      public fun ttl(ttl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty.builder()

      /**
       * @param ipAddress The network output IP Address. 
       */
      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      /**
       * @param name The network output name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param networkName The network output's gateway network name. 
       */
      override fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
      }

      /**
       * @param port The network output port. 
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The network output protocol. 
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param ttl The network output TTL. 
       */
      override fun ttl(ttl: Number) {
        cdkBuilder.ttl(ttl)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty,
    ) : BridgeNetworkOutputProperty {
      /**
       * The network output IP Address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-ipaddress)
       */
      override fun ipAddress(): String = unwrap(this).getIpAddress()

      /**
       * The network output name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The network output's gateway network name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-networkname)
       */
      override fun networkName(): String = unwrap(this).getNetworkName()

      /**
       * The network output port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The network output protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The network output TTL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworkoutput.html#cfn-mediaconnect-bridge-bridgenetworkoutput-ttl)
       */
      override fun ttl(): Number = unwrap(this).getTtl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty):
          BridgeNetworkOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkOutputProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FailoverConfigProperty {
    /**
     * The type of failover you choose for this flow.
     *
     * MERGE combines the source streams into a single stream, allowing graceful recovery from any
     * single-source loss. FAILOVER allows switching between different streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-failovermode)
     */
    public fun failoverMode(): String

    /**
     * The priority you want to assign to a source.
     *
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-sourcepriority)
     */
    public fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

    /**
     * The state of source failover on the flow.
     *
     * If the state is inactive, the flow can have only one source. If the state is active, the flow
     * can have one or two sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [FailoverConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failoverMode The type of failover you choose for this flow. 
       * MERGE combines the source streams into a single stream, allowing graceful recovery from any
       * single-source loss. FAILOVER allows switching between different streams.
       */
      public fun failoverMode(failoverMode: String)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      public fun sourcePriority(sourcePriority: IResolvable)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      public fun sourcePriority(sourcePriority: SourcePriorityProperty)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7418a01e3373546a55fa87100fa1ffc695721eb0587c200ba81655dc45139f31")
      public fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit)

      /**
       * @param state The state of source failover on the flow.
       * If the state is inactive, the flow can have only one source. If the state is active, the
       * flow can have one or two sources.
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty.builder()

      /**
       * @param failoverMode The type of failover you choose for this flow. 
       * MERGE combines the source streams into a single stream, allowing graceful recovery from any
       * single-source loss. FAILOVER allows switching between different streams.
       */
      override fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7418a01e3373546a55fa87100fa1ffc695721eb0587c200ba81655dc45139f31")
      override fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit): Unit =
          sourcePriority(SourcePriorityProperty(sourcePriority))

      /**
       * @param state The state of source failover on the flow.
       * If the state is inactive, the flow can have only one source. If the state is active, the
       * flow can have one or two sources.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty,
    ) : FailoverConfigProperty {
      /**
       * The type of failover you choose for this flow.
       *
       * MERGE combines the source streams into a single stream, allowing graceful recovery from any
       * single-source loss. FAILOVER allows switching between different streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-failovermode)
       */
      override fun failoverMode(): String = unwrap(this).getFailoverMode()

      /**
       * The priority you want to assign to a source.
       *
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-sourcepriority)
       */
      override fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

      /**
       * The state of source failover on the flow.
       *
       * If the state is inactive, the flow can have only one source. If the state is active, the
       * flow can have one or two sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-failoverconfig.html#cfn-mediaconnect-bridge-failoverconfig-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty):
          FailoverConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.FailoverConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface that you want to send your output to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-vpcinterfaceattachment.html#cfn-mediaconnect-bridge-vpcinterfaceattachment-vpcinterfacename)
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
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty,
    ) : VpcInterfaceAttachmentProperty {
      /**
       * The name of the VPC interface that you want to send your output to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-vpcinterfaceattachment.html#cfn-mediaconnect-bridge-vpcinterfaceattachment-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.VpcInterfaceAttachmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BridgeNetworkSourceProperty {
    /**
     * The network source multicast IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-multicastip)
     */
    public fun multicastIp(): String

    /**
     * The name of the network source.
     *
     * This name is used to reference the source and must be unique among sources in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-name)
     */
    public fun name(): String

    /**
     * The network source's gateway network name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-networkname)
     */
    public fun networkName(): String

    /**
     * The network source port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-port)
     */
    public fun port(): Number

    /**
     * The network source protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-protocol)
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
       * @param name The name of the network source. 
       * This name is used to reference the source and must be unique among sources in this bridge.
       */
      public fun name(name: String)

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
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty.builder()

      /**
       * @param multicastIp The network source multicast IP. 
       */
      override fun multicastIp(multicastIp: String) {
        cdkBuilder.multicastIp(multicastIp)
      }

      /**
       * @param name The name of the network source. 
       * This name is used to reference the source and must be unique among sources in this bridge.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
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
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty,
    ) : BridgeNetworkSourceProperty {
      /**
       * The network source multicast IP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-multicastip)
       */
      override fun multicastIp(): String = unwrap(this).getMulticastIp()

      /**
       * The name of the network source.
       *
       * This name is used to reference the source and must be unique among sources in this bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The network source's gateway network name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-networkname)
       */
      override fun networkName(): String = unwrap(this).getNetworkName()

      /**
       * The network source port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The network source protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgenetworksource.html#cfn-mediaconnect-bridge-bridgenetworksource-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty):
          BridgeNetworkSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeNetworkSourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BridgeSourceProperty {
    /**
     * The source of the bridge.
     *
     * A flow source originates in MediaConnect as an existing cloud flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html#cfn-mediaconnect-bridge-bridgesource-flowsource)
     */
    public fun flowSource(): Any? = unwrap(this).getFlowSource()

    /**
     * The source of the bridge.
     *
     * A network source originates at your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html#cfn-mediaconnect-bridge-bridgesource-networksource)
     */
    public fun networkSource(): Any? = unwrap(this).getNetworkSource()

    /**
     * A builder for [BridgeSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      public fun flowSource(flowSource: IResolvable)

      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      public fun flowSource(flowSource: BridgeFlowSourceProperty)

      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45d2eff2fd255d30ed98d40feff6e53f403ac34a4c7daf243a57686b87e54af5")
      public fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit)

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      public fun networkSource(networkSource: IResolvable)

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      public fun networkSource(networkSource: BridgeNetworkSourceProperty)

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca4ea347a4cdfc805830fcde7e6f90b961d0460b8b8db96c5c78aa12aaeccc7")
      public fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty.builder()

      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      override fun flowSource(flowSource: IResolvable) {
        cdkBuilder.flowSource(flowSource.let(IResolvable::unwrap))
      }

      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      override fun flowSource(flowSource: BridgeFlowSourceProperty) {
        cdkBuilder.flowSource(flowSource.let(BridgeFlowSourceProperty::unwrap))
      }

      /**
       * @param flowSource The source of the bridge.
       * A flow source originates in MediaConnect as an existing cloud flow.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45d2eff2fd255d30ed98d40feff6e53f403ac34a4c7daf243a57686b87e54af5")
      override fun flowSource(flowSource: BridgeFlowSourceProperty.Builder.() -> Unit): Unit =
          flowSource(BridgeFlowSourceProperty(flowSource))

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      override fun networkSource(networkSource: IResolvable) {
        cdkBuilder.networkSource(networkSource.let(IResolvable::unwrap))
      }

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      override fun networkSource(networkSource: BridgeNetworkSourceProperty) {
        cdkBuilder.networkSource(networkSource.let(BridgeNetworkSourceProperty::unwrap))
      }

      /**
       * @param networkSource The source of the bridge.
       * A network source originates at your premises.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca4ea347a4cdfc805830fcde7e6f90b961d0460b8b8db96c5c78aa12aaeccc7")
      override fun networkSource(networkSource: BridgeNetworkSourceProperty.Builder.() -> Unit):
          Unit = networkSource(BridgeNetworkSourceProperty(networkSource))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty,
    ) : BridgeSourceProperty {
      /**
       * The source of the bridge.
       *
       * A flow source originates in MediaConnect as an existing cloud flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html#cfn-mediaconnect-bridge-bridgesource-flowsource)
       */
      override fun flowSource(): Any? = unwrap(this).getFlowSource()

      /**
       * The source of the bridge.
       *
       * A network source originates at your premises.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgesource.html#cfn-mediaconnect-bridge-bridgesource-networksource)
       */
      override fun networkSource(): Any? = unwrap(this).getNetworkSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty):
          BridgeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SourcePriorityProperty {
    /**
     * The name of the source you choose as the primary source for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-sourcepriority.html#cfn-mediaconnect-bridge-sourcepriority-primarysource)
     */
    public fun primarySource(): String? = unwrap(this).getPrimarySource()

    /**
     * A builder for [SourcePriorityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primarySource The name of the source you choose as the primary source for this flow.
       */
      public fun primarySource(primarySource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty.builder()

      /**
       * @param primarySource The name of the source you choose as the primary source for this flow.
       */
      override fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty,
    ) : SourcePriorityProperty {
      /**
       * The name of the source you choose as the primary source for this flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-sourcepriority.html#cfn-mediaconnect-bridge-sourcepriority-primarysource)
       */
      override fun primarySource(): String? = unwrap(this).getPrimarySource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourcePriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty):
          SourcePriorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.SourcePriorityProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface BridgeFlowSourceProperty {
    /**
     * The ARN of the cloud flow used as a source of this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-flowarn)
     */
    public fun flowArn(): String

    /**
     * The name of the VPC interface attachment to use for this source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-flowvpcinterfaceattachment)
     */
    public fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

    /**
     * The name of the flow source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-name)
     */
    public fun name(): String

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d23f1afc5e019a814f9266f05f382243aa3930501625b26daa562ac61008c25")
      public
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)

      /**
       * @param name The name of the flow source. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty.builder()

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d23f1afc5e019a814f9266f05f382243aa3930501625b26daa562ac61008c25")
      override
          fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit =
          flowVpcInterfaceAttachment(VpcInterfaceAttachmentProperty(flowVpcInterfaceAttachment))

      /**
       * @param name The name of the flow source. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty,
    ) : BridgeFlowSourceProperty {
      /**
       * The ARN of the cloud flow used as a source of this bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-flowarn)
       */
      override fun flowArn(): String = unwrap(this).getFlowArn()

      /**
       * The name of the VPC interface attachment to use for this source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-flowvpcinterfaceattachment)
       */
      override fun flowVpcInterfaceAttachment(): Any? = unwrap(this).getFlowVpcInterfaceAttachment()

      /**
       * The name of the flow source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeflowsource.html#cfn-mediaconnect-bridge-bridgeflowsource-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeFlowSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty):
          BridgeFlowSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeFlowSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeFlowSourceProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EgressGatewayBridgeProperty {
    /**
     * The maximum expected bitrate (in bps) of the egress bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-egressgatewaybridge.html#cfn-mediaconnect-bridge-egressgatewaybridge-maxbitrate)
     */
    public fun maxBitrate(): Number

    /**
     * A builder for [EgressGatewayBridgeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxBitrate The maximum expected bitrate (in bps) of the egress bridge. 
       */
      public fun maxBitrate(maxBitrate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty.builder()

      /**
       * @param maxBitrate The maximum expected bitrate (in bps) of the egress bridge. 
       */
      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty,
    ) : EgressGatewayBridgeProperty {
      /**
       * The maximum expected bitrate (in bps) of the egress bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-egressgatewaybridge.html#cfn-mediaconnect-bridge-egressgatewaybridge-maxbitrate)
       */
      override fun maxBitrate(): Number = unwrap(this).getMaxBitrate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EgressGatewayBridgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty):
          EgressGatewayBridgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EgressGatewayBridgeProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.EgressGatewayBridgeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BridgeOutputProperty {
    /**
     * The output of the bridge.
     *
     * A network output is delivered to your premises.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeoutput.html#cfn-mediaconnect-bridge-bridgeoutput-networkoutput)
     */
    public fun networkOutput(): Any? = unwrap(this).getNetworkOutput()

    /**
     * A builder for [BridgeOutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      public fun networkOutput(networkOutput: IResolvable)

      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      public fun networkOutput(networkOutput: BridgeNetworkOutputProperty)

      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78717ab00e5fb8eb26b94f79a4a0b158b7039dd47d8f8bfec02c150daa38fc97")
      public fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty.builder()

      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      override fun networkOutput(networkOutput: IResolvable) {
        cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
      }

      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      override fun networkOutput(networkOutput: BridgeNetworkOutputProperty) {
        cdkBuilder.networkOutput(networkOutput.let(BridgeNetworkOutputProperty::unwrap))
      }

      /**
       * @param networkOutput The output of the bridge.
       * A network output is delivered to your premises.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78717ab00e5fb8eb26b94f79a4a0b158b7039dd47d8f8bfec02c150daa38fc97")
      override fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit):
          Unit = networkOutput(BridgeNetworkOutputProperty(networkOutput))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty,
    ) : BridgeOutputProperty {
      /**
       * The output of the bridge.
       *
       * A network output is delivered to your premises.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-bridgeoutput.html#cfn-mediaconnect-bridge-bridgeoutput-networkoutput)
       */
      override fun networkOutput(): Any? = unwrap(this).getNetworkOutput()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty):
          BridgeOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.BridgeOutputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IngressGatewayBridgeProperty {
    /**
     * The maximum expected bitrate (in bps) of the ingress bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge-maxbitrate)
     */
    public fun maxBitrate(): Number

    /**
     * The maximum number of outputs on the ingress bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge-maxoutputs)
     */
    public fun maxOutputs(): Number

    /**
     * A builder for [IngressGatewayBridgeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxBitrate The maximum expected bitrate (in bps) of the ingress bridge. 
       */
      public fun maxBitrate(maxBitrate: Number)

      /**
       * @param maxOutputs The maximum number of outputs on the ingress bridge. 
       */
      public fun maxOutputs(maxOutputs: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty.builder()

      /**
       * @param maxBitrate The maximum expected bitrate (in bps) of the ingress bridge. 
       */
      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      /**
       * @param maxOutputs The maximum number of outputs on the ingress bridge. 
       */
      override fun maxOutputs(maxOutputs: Number) {
        cdkBuilder.maxOutputs(maxOutputs)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty,
    ) : IngressGatewayBridgeProperty {
      /**
       * The maximum expected bitrate (in bps) of the ingress bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge-maxbitrate)
       */
      override fun maxBitrate(): Number = unwrap(this).getMaxBitrate()

      /**
       * The maximum number of outputs on the ingress bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridge-ingressgatewaybridge.html#cfn-mediaconnect-bridge-ingressgatewaybridge-maxoutputs)
       */
      override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngressGatewayBridgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty):
          IngressGatewayBridgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressGatewayBridgeProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridge.IngressGatewayBridgeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
