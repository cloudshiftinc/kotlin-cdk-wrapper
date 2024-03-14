package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CdkObject
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBridgeOutput internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput,
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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The network output name.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The network output name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Add a network output to an existing bridge.
   */
  public open fun networkOutput(): Any = unwrap(this).getNetworkOutput()

  /**
   * Add a network output to an existing bridge.
   */
  public open fun networkOutput(`value`: IResolvable) {
    unwrap(this).setNetworkOutput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Add a network output to an existing bridge.
   */
  public open fun networkOutput(`value`: BridgeNetworkOutputProperty) {
    unwrap(this).setNetworkOutput(`value`.let(BridgeNetworkOutputProperty::unwrap))
  }

  /**
   * Add a network output to an existing bridge.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06b513390b2dc3b8e9e4e7afeba95a6a219a46540554396680abdd2bf8350811")
  public open fun networkOutput(`value`: BridgeNetworkOutputProperty.Builder.() -> Unit): Unit =
      networkOutput(BridgeNetworkOutputProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnBridgeOutput].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-bridgearn)
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    public fun bridgeArn(bridgeArn: String)

    /**
     * The network output name.
     *
     * This name is used to reference the output and must be unique among outputs in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-name)
     * @param name The network output name. 
     */
    public fun name(name: String)

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    public fun networkOutput(networkOutput: IResolvable)

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    public fun networkOutput(networkOutput: BridgeNetworkOutputProperty)

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63c91da5424a8f4038ef57a0a4d6fbaa9b9de0f8567926eec46aad2a834a19d3")
    public fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.Builder.create(scope, id)

    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-bridgearn)
     * @param bridgeArn The ARN of the bridge that you want to describe. 
     */
    override fun bridgeArn(bridgeArn: String) {
      cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * The network output name.
     *
     * This name is used to reference the output and must be unique among outputs in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-name)
     * @param name The network output name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    override fun networkOutput(networkOutput: IResolvable) {
      cdkBuilder.networkOutput(networkOutput.let(IResolvable::unwrap))
    }

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    override fun networkOutput(networkOutput: BridgeNetworkOutputProperty) {
      cdkBuilder.networkOutput(networkOutput.let(BridgeNetworkOutputProperty::unwrap))
    }

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     * @param networkOutput Add a network output to an existing bridge. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63c91da5424a8f4038ef57a0a4d6fbaa9b9de0f8567926eec46aad2a834a19d3")
    override fun networkOutput(networkOutput: BridgeNetworkOutputProperty.Builder.() -> Unit): Unit
        = networkOutput(BridgeNetworkOutputProperty(networkOutput))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBridgeOutput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBridgeOutput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput):
        CfnBridgeOutput = CfnBridgeOutput(cdkObject)

    internal fun unwrap(wrapped: CfnBridgeOutput):
        software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput = wrapped.cdkObject
  }

  public interface BridgeNetworkOutputProperty {
    /**
     * The network output IP Address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-ipaddress)
     */
    public fun ipAddress(): String

    /**
     * The network output's gateway network name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-networkname)
     */
    public fun networkName(): String

    /**
     * The network output port.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-port)
     */
    public fun port(): Number

    /**
     * The network output protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-protocol)
     */
    public fun protocol(): String

    /**
     * The network output TTL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-ttl)
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
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty.builder()

      /**
       * @param ipAddress The network output IP Address. 
       */
      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
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
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty,
    ) : CdkObject(cdkObject), BridgeNetworkOutputProperty {
      /**
       * The network output IP Address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-ipaddress)
       */
      override fun ipAddress(): String = unwrap(this).getIpAddress()

      /**
       * The network output's gateway network name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-networkname)
       */
      override fun networkName(): String = unwrap(this).getNetworkName()

      /**
       * The network output port.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-port)
       */
      override fun port(): Number = unwrap(this).getPort()

      /**
       * The network output protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The network output TTL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-bridgeoutput-bridgenetworkoutput.html#cfn-mediaconnect-bridgeoutput-bridgenetworkoutput-ttl)
       */
      override fun ttl(): Number = unwrap(this).getTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BridgeNetworkOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty):
          BridgeNetworkOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BridgeNetworkOutputProperty):
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput.BridgeNetworkOutputProperty
    }
  }
}
