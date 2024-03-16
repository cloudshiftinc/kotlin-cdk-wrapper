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
 * Properties for defining a `CfnFlow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnFlowProps cfnFlowProps = CfnFlowProps.builder()
 * .name("name")
 * .source(SourceProperty.builder()
 * .decryption(EncryptionProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .algorithm("algorithm")
 * .constantInitializationVector("constantInitializationVector")
 * .deviceId("deviceId")
 * .keyType("keyType")
 * .region("region")
 * .resourceId("resourceId")
 * .secretArn("secretArn")
 * .url("url")
 * .build())
 * .description("description")
 * .entitlementArn("entitlementArn")
 * .gatewayBridgeSource(GatewayBridgeSourceProperty.builder()
 * .bridgeArn("bridgeArn")
 * // the properties below are optional
 * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build())
 * .build())
 * .ingestIp("ingestIp")
 * .ingestPort(123)
 * .maxBitrate(123)
 * .maxLatency(123)
 * .minLatency(123)
 * .name("name")
 * .protocol("protocol")
 * .senderControlPort(123)
 * .senderIpAddress("senderIpAddress")
 * .sourceArn("sourceArn")
 * .sourceIngestPort("sourceIngestPort")
 * .sourceListenerAddress("sourceListenerAddress")
 * .sourceListenerPort(123)
 * .streamId("streamId")
 * .vpcInterfaceName("vpcInterfaceName")
 * .whitelistCidr("whitelistCidr")
 * .build())
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * .recoveryWindow(123)
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html)
 */
public interface CfnFlowProps {
  /**
   * The Availability Zone that you want to create the flow in.
   *
   * These options are limited to the Availability Zones within the current AWS Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The name of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-name)
   */
  public fun name(): String

  /**
   * The settings for the source that you want to use for the new flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
   */
  public fun source(): Any

  /**
   * The settings for source failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
   */
  public fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  /**
   * A builder for [CfnFlowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone that you want to create the flow in.
     * These options are limited to the Availability Zones within the current AWS Region.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    public fun source(source: CfnFlow.SourceProperty)

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ecb865427adcb4bed201c326a7d9a7da0305d5e811ab20fd4e6e93fc28e05a5")
    public fun source(source: CfnFlow.SourceProperty.Builder.() -> Unit)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty)

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605e84d7038f36749ef82bb5d123ad174c0f22bf4883a1719e210e853f3c3adf")
    public
        fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowProps.builder()

    /**
     * @param availabilityZone The Availability Zone that you want to create the flow in.
     * These options are limited to the Availability Zones within the current AWS Region.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: CfnFlow.SourceProperty) {
      cdkBuilder.source(source.let(CfnFlow.SourceProperty::unwrap))
    }

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ecb865427adcb4bed201c326a7d9a7da0305d5e811ab20fd4e6e93fc28e05a5")
    override fun source(source: CfnFlow.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnFlow.SourceProperty(source))

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(CfnFlow.FailoverConfigProperty::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605e84d7038f36749ef82bb5d123ad174c0f22bf4883a1719e210e853f3c3adf")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(CfnFlow.FailoverConfigProperty(sourceFailoverConfig))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps,
  ) : CdkObject(cdkObject), CfnFlowProps {
    /**
     * The Availability Zone that you want to create the flow in.
     *
     * These options are limited to the Availability Zones within the current AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     */
    override fun source(): Any = unwrap(this).getSource()

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     */
    override fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps):
        CfnFlowProps = CdkObjectWrappers.wrap(cdkObject) as CfnFlowProps

    internal fun unwrap(wrapped: CfnFlowProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mediaconnect.CfnFlowProps
  }
}
