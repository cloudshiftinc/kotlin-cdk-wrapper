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
 * .maxSyncBuffer(123)
 * .mediaStreamSourceConfigurations(List.of(MediaStreamSourceConfigurationProperty.builder()
 * .encodingName("encodingName")
 * .mediaStreamName("mediaStreamName")
 * // the properties below are optional
 * .inputConfigurations(List.of(InputConfigurationProperty.builder()
 * .inputPort(123)
 * .interface(InterfaceProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .build()))
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
 * .maintenance(MaintenanceProperty.builder()
 * .maintenanceDay("maintenanceDay")
 * .maintenanceStartHour("maintenanceStartHour")
 * .build())
 * .mediaStreams(List.of(MediaStreamProperty.builder()
 * .mediaStreamId(123)
 * .mediaStreamName("mediaStreamName")
 * .mediaStreamType("mediaStreamType")
 * // the properties below are optional
 * .attributes(MediaStreamAttributesProperty.builder()
 * .fmtp(FmtpProperty.builder()
 * .channelOrder("channelOrder")
 * .colorimetry("colorimetry")
 * .exactFramerate("exactFramerate")
 * .par("par")
 * .range("range")
 * .scanMode("scanMode")
 * .tcs("tcs")
 * .build())
 * .lang("lang")
 * .build())
 * .clockRate(123)
 * .description("description")
 * .fmt(123)
 * .videoFormat("videoFormat")
 * .build()))
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * .recoveryWindow(123)
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .sourceMonitoringConfig(SourceMonitoringConfigProperty.builder()
 * .thumbnailState("thumbnailState")
 * .build())
 * .vpcInterfaces(List.of(VpcInterfaceProperty.builder()
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetId("subnetId")
 * // the properties below are optional
 * .networkInterfaceIds(List.of("networkInterfaceIds"))
 * .networkInterfaceType("networkInterfaceType")
 * .build()))
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
   * The maintenance settings you want to use for the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
   */
  public fun maintenance(): Any? = unwrap(this).getMaintenance()

  /**
   * The media streams associated with the flow.
   *
   * You can associate any of these media streams with sources and outputs on the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
   */
  public fun mediaStreams(): Any? = unwrap(this).getMediaStreams()

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
   * The settings for source monitoring.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
   */
  public fun sourceMonitoringConfig(): Any? = unwrap(this).getSourceMonitoringConfig()

  /**
   * The VPC interfaces that you added to this flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
   */
  public fun vpcInterfaces(): Any? = unwrap(this).getVpcInterfaces()

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
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    public fun maintenance(maintenance: IResolvable)

    /**
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    public fun maintenance(maintenance: CfnFlow.MaintenanceProperty)

    /**
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e4bbeafe30f52752ffd112960ef751f1e82f13becb5a37f52d03e2ac614f06a")
    public fun maintenance(maintenance: CfnFlow.MaintenanceProperty.Builder.() -> Unit)

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    public fun mediaStreams(mediaStreams: IResolvable)

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    public fun mediaStreams(mediaStreams: List<Any>)

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    public fun mediaStreams(vararg mediaStreams: Any)

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

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    public fun sourceMonitoringConfig(sourceMonitoringConfig: IResolvable)

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    public
        fun sourceMonitoringConfig(sourceMonitoringConfig: CfnFlow.SourceMonitoringConfigProperty)

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68c4c1296e7f91814a8f598a234fb495d88be1ab9ff823b5e596c2fd2721052a")
    public
        fun sourceMonitoringConfig(sourceMonitoringConfig: CfnFlow.SourceMonitoringConfigProperty.Builder.() -> Unit)

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    public fun vpcInterfaces(vpcInterfaces: IResolvable)

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    public fun vpcInterfaces(vpcInterfaces: List<Any>)

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    public fun vpcInterfaces(vararg vpcInterfaces: Any)
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
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    override fun maintenance(maintenance: CfnFlow.MaintenanceProperty) {
      cdkBuilder.maintenance(maintenance.let(CfnFlow.MaintenanceProperty.Companion::unwrap))
    }

    /**
     * @param maintenance The maintenance settings you want to use for the flow.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e4bbeafe30f52752ffd112960ef751f1e82f13becb5a37f52d03e2ac614f06a")
    override fun maintenance(maintenance: CfnFlow.MaintenanceProperty.Builder.() -> Unit): Unit =
        maintenance(CfnFlow.MaintenanceProperty(maintenance))

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    override fun mediaStreams(mediaStreams: IResolvable) {
      cdkBuilder.mediaStreams(mediaStreams.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    override fun mediaStreams(mediaStreams: List<Any>) {
      cdkBuilder.mediaStreams(mediaStreams.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mediaStreams The media streams associated with the flow.
     * You can associate any of these media streams with sources and outputs on the flow.
     */
    override fun mediaStreams(vararg mediaStreams: Any): Unit = mediaStreams(mediaStreams.toList())

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
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: CfnFlow.SourceProperty) {
      cdkBuilder.source(source.let(CfnFlow.SourceProperty.Companion::unwrap))
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
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(CfnFlow.FailoverConfigProperty.Companion::unwrap))
    }

    /**
     * @param sourceFailoverConfig The settings for source failover.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605e84d7038f36749ef82bb5d123ad174c0f22bf4883a1719e210e853f3c3adf")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(CfnFlow.FailoverConfigProperty(sourceFailoverConfig))

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    override fun sourceMonitoringConfig(sourceMonitoringConfig: IResolvable) {
      cdkBuilder.sourceMonitoringConfig(sourceMonitoringConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    override
        fun sourceMonitoringConfig(sourceMonitoringConfig: CfnFlow.SourceMonitoringConfigProperty) {
      cdkBuilder.sourceMonitoringConfig(sourceMonitoringConfig.let(CfnFlow.SourceMonitoringConfigProperty.Companion::unwrap))
    }

    /**
     * @param sourceMonitoringConfig The settings for source monitoring.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68c4c1296e7f91814a8f598a234fb495d88be1ab9ff823b5e596c2fd2721052a")
    override
        fun sourceMonitoringConfig(sourceMonitoringConfig: CfnFlow.SourceMonitoringConfigProperty.Builder.() -> Unit):
        Unit =
        sourceMonitoringConfig(CfnFlow.SourceMonitoringConfigProperty(sourceMonitoringConfig))

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    override fun vpcInterfaces(vpcInterfaces: IResolvable) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    override fun vpcInterfaces(vpcInterfaces: List<Any>) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param vpcInterfaces The VPC interfaces that you added to this flow.
     */
    override fun vpcInterfaces(vararg vpcInterfaces: Any): Unit =
        vpcInterfaces(vpcInterfaces.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps,
  ) : CdkObject(cdkObject),
      CfnFlowProps {
    /**
     * The Availability Zone that you want to create the flow in.
     *
     * These options are limited to the Availability Zones within the current AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     */
    override fun maintenance(): Any? = unwrap(this).getMaintenance()

    /**
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     */
    override fun mediaStreams(): Any? = unwrap(this).getMediaStreams()

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

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     */
    override fun sourceMonitoringConfig(): Any? = unwrap(this).getSourceMonitoringConfig()

    /**
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     */
    override fun vpcInterfaces(): Any? = unwrap(this).getVpcInterfaces()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowProps):
        CfnFlowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.mediaconnect.CfnFlowProps
  }
}
