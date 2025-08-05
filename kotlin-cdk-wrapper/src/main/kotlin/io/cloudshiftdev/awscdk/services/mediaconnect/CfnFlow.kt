@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::MediaConnect::Flow` resource defines a connection between one or more video sources and
 * one or more outputs.
 *
 * For each flow, you specify the transport protocol to use, encryption information, and details for
 * any outputs or entitlements that you want. AWS Elemental MediaConnect returns an ingest endpoint
 * where you can send your live video as a single unicast stream. The service replicates and
 * distributes the video to every output that you specify, whether inside or outside the AWS Cloud. You
 * can also set up entitlements on a flow to allow other AWS accounts to access your content.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnFlow cfnFlow = CfnFlow.Builder.create(this, "MyCfnFlow")
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
 * .flowSize("flowSize")
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
 * .ndiConfig(NdiConfigProperty.builder()
 * .machineName("machineName")
 * .ndiDiscoveryServers(List.of(NdiDiscoveryServerConfigProperty.builder()
 * .discoveryServerAddress("discoveryServerAddress")
 * .vpcInterfaceAdapter("vpcInterfaceAdapter")
 * // the properties below are optional
 * .discoveryServerPort(123)
 * .build()))
 * .ndiState("ndiState")
 * .build())
 * .sourceFailoverConfig(FailoverConfigProperty.builder()
 * .failoverMode("failoverMode")
 * .recoveryWindow(123)
 * .sourcePriority(SourcePriorityProperty.builder()
 * .primarySource("primarySource")
 * .build())
 * .state("state")
 * .build())
 * .sourceMonitoringConfig(SourceMonitoringConfigProperty.builder()
 * .audioMonitoringSettings(List.of(AudioMonitoringSettingProperty.builder()
 * .silentAudio(SilentAudioProperty.builder()
 * .state("state")
 * .thresholdSeconds(123)
 * .build())
 * .build()))
 * .contentQualityAnalysisState("contentQualityAnalysisState")
 * .thumbnailState("thumbnailState")
 * .videoMonitoringSettings(List.of(VideoMonitoringSettingProperty.builder()
 * .blackFrames(BlackFramesProperty.builder()
 * .state("state")
 * .thresholdSeconds(123)
 * .build())
 * .frozenFrames(FrozenFramesProperty.builder()
 * .state("state")
 * .thresholdSeconds(123)
 * .build())
 * .build()))
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
public open class CfnFlow(
  cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowProps,
  ) :
      this(software.amazon.awscdk.services.mediaconnect.CfnFlow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFlowProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlowProps(props)
  )

  /**
   * The IP address from which video will be sent to output destinations.
   */
  public open fun attrEgressIp(): String = unwrap(this).getAttrEgressIp()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun attrFlowArn(): String = unwrap(this).getAttrFlowArn()

  /**
   * The Availability Zone that the flow was created in.
   *
   * These options are limited to the Availability Zones within the current AWS Region.
   */
  public open fun attrFlowAvailabilityZone(): String = unwrap(this).getAttrFlowAvailabilityZone()

  /**
   * This read-only value represents the automatically-generated NDI machine name that MediaConnect
   * generated for this flow.
   *
   * These NDI machine names are only generated when you don't specify your own custom name.
   */
  public open fun attrFlowNdiMachineName(): String = unwrap(this).getAttrFlowNdiMachineName()

  /**
   * The IP address that the flow listens on for incoming content.
   */
  public open fun attrSourceIngestIp(): String = unwrap(this).getAttrSourceIngestIp()

  /**
   * The ARN of the source.
   */
  public open fun attrSourceSourceArn(): String = unwrap(this).getAttrSourceSourceArn()

  /**
   * The port that the flow listens on for incoming content.
   *
   * If the protocol of the source is Zixi, the port must be set to 2088.
   */
  public open fun attrSourceSourceIngestPort(): String =
      unwrap(this).getAttrSourceSourceIngestPort()

  /**
   * The Availability Zone that you want to create the flow in.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone that you want to create the flow in.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * Determines the processing capacity and feature set of the flow.
   */
  public open fun flowSize(): String? = unwrap(this).getFlowSize()

  /**
   * Determines the processing capacity and feature set of the flow.
   */
  public open fun flowSize(`value`: String) {
    unwrap(this).setFlowSize(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The maintenance settings you want to use for the flow.
   */
  public open fun maintenance(): Any? = unwrap(this).getMaintenance()

  /**
   * The maintenance settings you want to use for the flow.
   */
  public open fun maintenance(`value`: IResolvable) {
    unwrap(this).setMaintenance(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The maintenance settings you want to use for the flow.
   */
  public open fun maintenance(`value`: MaintenanceProperty) {
    unwrap(this).setMaintenance(`value`.let(MaintenanceProperty.Companion::unwrap))
  }

  /**
   * The maintenance settings you want to use for the flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0cee2d8458cdc23c74cc39098c437ac609d7923cba89efeba369215ed92a685")
  public open fun maintenance(`value`: MaintenanceProperty.Builder.() -> Unit): Unit =
      maintenance(MaintenanceProperty(`value`))

  /**
   * The media streams that are associated with the flow.
   */
  public open fun mediaStreams(): Any? = unwrap(this).getMediaStreams()

  /**
   * The media streams that are associated with the flow.
   */
  public open fun mediaStreams(`value`: IResolvable) {
    unwrap(this).setMediaStreams(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The media streams that are associated with the flow.
   */
  public open fun mediaStreams(`value`: List<Any>) {
    unwrap(this).setMediaStreams(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The media streams that are associated with the flow.
   */
  public open fun mediaStreams(vararg `value`: Any): Unit = mediaStreams(`value`.toList())

  /**
   * The name of the flow.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the flow.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the configuration settings for NDI outputs.
   */
  public open fun ndiConfig(): Any? = unwrap(this).getNdiConfig()

  /**
   * Specifies the configuration settings for NDI outputs.
   */
  public open fun ndiConfig(`value`: IResolvable) {
    unwrap(this).setNdiConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the configuration settings for NDI outputs.
   */
  public open fun ndiConfig(`value`: NdiConfigProperty) {
    unwrap(this).setNdiConfig(`value`.let(NdiConfigProperty.Companion::unwrap))
  }

  /**
   * Specifies the configuration settings for NDI outputs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fdb49d6d4bdbd30d29fb73416da67f7128828a661785daa0b12ac39734050d8b")
  public open fun ndiConfig(`value`: NdiConfigProperty.Builder.() -> Unit): Unit =
      ndiConfig(NdiConfigProperty(`value`))

  /**
   * The settings for the source that you want to use for the new flow.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The settings for the source that you want to use for the new flow.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for the source that you want to use for the new flow.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty.Companion::unwrap))
  }

  /**
   * The settings for the source that you want to use for the new flow.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1cab647f51a5450b2a4fcffeffe02c98559948506b0b730b43959630b2684b8c")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(`value`: IResolvable) {
    unwrap(this).setSourceFailoverConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for source failover.
   */
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty) {
    unwrap(this).setSourceFailoverConfig(`value`.let(FailoverConfigProperty.Companion::unwrap))
  }

  /**
   * The settings for source failover.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6ceeb1eb4eed29a4ba3a766c50ca14ac56f766293c5979c53dffa685b655f0c")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

  /**
   * The settings for source monitoring.
   */
  public open fun sourceMonitoringConfig(): Any? = unwrap(this).getSourceMonitoringConfig()

  /**
   * The settings for source monitoring.
   */
  public open fun sourceMonitoringConfig(`value`: IResolvable) {
    unwrap(this).setSourceMonitoringConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for source monitoring.
   */
  public open fun sourceMonitoringConfig(`value`: SourceMonitoringConfigProperty) {
    unwrap(this).setSourceMonitoringConfig(`value`.let(SourceMonitoringConfigProperty.Companion::unwrap))
  }

  /**
   * The settings for source monitoring.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cb822b50eb707e25886a8cb36193c650b721a68c97c09d1eae15b68da4339544")
  public open
      fun sourceMonitoringConfig(`value`: SourceMonitoringConfigProperty.Builder.() -> Unit): Unit =
      sourceMonitoringConfig(SourceMonitoringConfigProperty(`value`))

  /**
   * The VPC Interfaces for this flow.
   */
  public open fun vpcInterfaces(): Any? = unwrap(this).getVpcInterfaces()

  /**
   * The VPC Interfaces for this flow.
   */
  public open fun vpcInterfaces(`value`: IResolvable) {
    unwrap(this).setVpcInterfaces(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC Interfaces for this flow.
   */
  public open fun vpcInterfaces(`value`: List<Any>) {
    unwrap(this).setVpcInterfaces(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The VPC Interfaces for this flow.
   */
  public open fun vpcInterfaces(vararg `value`: Any): Unit = vpcInterfaces(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnFlow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zone that you want to create the flow in.
     *
     * These options are limited to the Availability Zones within the current AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
     * @param availabilityZone The Availability Zone that you want to create the flow in. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * Determines the processing capacity and feature set of the flow.
     *
     * Set this optional parameter to LARGE if you want to enable NDI outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-flowsize)
     * @param flowSize Determines the processing capacity and feature set of the flow. 
     */
    public fun flowSize(flowSize: String)

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    public fun maintenance(maintenance: IResolvable)

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    public fun maintenance(maintenance: MaintenanceProperty)

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86a617b307e8a22f30056f37b2eaeda4f48b575658c3aed368342c8b13b142cd")
    public fun maintenance(maintenance: MaintenanceProperty.Builder.() -> Unit)

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    public fun mediaStreams(mediaStreams: IResolvable)

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    public fun mediaStreams(mediaStreams: List<Any>)

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    public fun mediaStreams(vararg mediaStreams: Any)

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-name)
     * @param name The name of the flow. 
     */
    public fun name(name: String)

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    public fun ndiConfig(ndiConfig: IResolvable)

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    public fun ndiConfig(ndiConfig: NdiConfigProperty)

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad781c65a775dad850f6559f439c9be66a1668f9b7df458e802546da0a5f4483")
    public fun ndiConfig(ndiConfig: NdiConfigProperty.Builder.() -> Unit)

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    public fun source(source: IResolvable)

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    public fun source(source: SourceProperty)

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty)

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit)

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    public fun sourceMonitoringConfig(sourceMonitoringConfig: IResolvable)

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    public fun sourceMonitoringConfig(sourceMonitoringConfig: SourceMonitoringConfigProperty)

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ca25d37eb46d61122db966864b6a3a81675da33fac2c90b3b732b9fca18b38c")
    public
        fun sourceMonitoringConfig(sourceMonitoringConfig: SourceMonitoringConfigProperty.Builder.() -> Unit)

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    public fun vpcInterfaces(vpcInterfaces: IResolvable)

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    public fun vpcInterfaces(vpcInterfaces: List<Any>)

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    public fun vpcInterfaces(vararg vpcInterfaces: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder.create(scope, id)

    /**
     * The Availability Zone that you want to create the flow in.
     *
     * These options are limited to the Availability Zones within the current AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
     * @param availabilityZone The Availability Zone that you want to create the flow in. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * Determines the processing capacity and feature set of the flow.
     *
     * Set this optional parameter to LARGE if you want to enable NDI outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-flowsize)
     * @param flowSize Determines the processing capacity and feature set of the flow. 
     */
    override fun flowSize(flowSize: String) {
      cdkBuilder.flowSize(flowSize)
    }

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable.Companion::unwrap))
    }

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    override fun maintenance(maintenance: MaintenanceProperty) {
      cdkBuilder.maintenance(maintenance.let(MaintenanceProperty.Companion::unwrap))
    }

    /**
     * The maintenance settings you want to use for the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-maintenance)
     * @param maintenance The maintenance settings you want to use for the flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("86a617b307e8a22f30056f37b2eaeda4f48b575658c3aed368342c8b13b142cd")
    override fun maintenance(maintenance: MaintenanceProperty.Builder.() -> Unit): Unit =
        maintenance(MaintenanceProperty(maintenance))

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    override fun mediaStreams(mediaStreams: IResolvable) {
      cdkBuilder.mediaStreams(mediaStreams.let(IResolvable.Companion::unwrap))
    }

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    override fun mediaStreams(mediaStreams: List<Any>) {
      cdkBuilder.mediaStreams(mediaStreams.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The media streams that are associated with the flow.
     *
     * After you associate a media stream with a source, you can also associate it with outputs on
     * the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams that are associated with the flow. 
     */
    override fun mediaStreams(vararg mediaStreams: Any): Unit = mediaStreams(mediaStreams.toList())

    /**
     * The name of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-name)
     * @param name The name of the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    override fun ndiConfig(ndiConfig: IResolvable) {
      cdkBuilder.ndiConfig(ndiConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    override fun ndiConfig(ndiConfig: NdiConfigProperty) {
      cdkBuilder.ndiConfig(ndiConfig.let(NdiConfigProperty.Companion::unwrap))
    }

    /**
     * Specifies the configuration settings for NDI outputs.
     *
     * Required when the flow includes NDI outputs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-ndiconfig)
     * @param ndiConfig Specifies the configuration settings for NDI outputs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad781c65a775dad850f6559f439c9be66a1668f9b7df458e802546da0a5f4483")
    override fun ndiConfig(ndiConfig: NdiConfigProperty.Builder.() -> Unit): Unit =
        ndiConfig(NdiConfigProperty(ndiConfig))

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty.Companion::unwrap))
    }

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty.Companion::unwrap))
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(FailoverConfigProperty(sourceFailoverConfig))

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    override fun sourceMonitoringConfig(sourceMonitoringConfig: IResolvable) {
      cdkBuilder.sourceMonitoringConfig(sourceMonitoringConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    override fun sourceMonitoringConfig(sourceMonitoringConfig: SourceMonitoringConfigProperty) {
      cdkBuilder.sourceMonitoringConfig(sourceMonitoringConfig.let(SourceMonitoringConfigProperty.Companion::unwrap))
    }

    /**
     * The settings for source monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcemonitoringconfig)
     * @param sourceMonitoringConfig The settings for source monitoring. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ca25d37eb46d61122db966864b6a3a81675da33fac2c90b3b732b9fca18b38c")
    override
        fun sourceMonitoringConfig(sourceMonitoringConfig: SourceMonitoringConfigProperty.Builder.() -> Unit):
        Unit = sourceMonitoringConfig(SourceMonitoringConfigProperty(sourceMonitoringConfig))

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    override fun vpcInterfaces(vpcInterfaces: IResolvable) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    override fun vpcInterfaces(vpcInterfaces: List<Any>) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The VPC Interfaces for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC Interfaces for this flow. 
     */
    override fun vpcInterfaces(vararg vpcInterfaces: Any): Unit =
        vpcInterfaces(vpcInterfaces.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.mediaconnect.CfnFlow =
        wrapped.cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlow
  }

  /**
   * Specifies the configuration for audio stream metrics monitoring.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * AudioMonitoringSettingProperty audioMonitoringSettingProperty =
   * AudioMonitoringSettingProperty.builder()
   * .silentAudio(SilentAudioProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-audiomonitoringsetting.html)
   */
  public interface AudioMonitoringSettingProperty {
    /**
     * Detects periods of silence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-audiomonitoringsetting.html#cfn-mediaconnect-flow-audiomonitoringsetting-silentaudio)
     */
    public fun silentAudio(): Any? = unwrap(this).getSilentAudio()

    /**
     * A builder for [AudioMonitoringSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param silentAudio Detects periods of silence.
       */
      public fun silentAudio(silentAudio: IResolvable)

      /**
       * @param silentAudio Detects periods of silence.
       */
      public fun silentAudio(silentAudio: SilentAudioProperty)

      /**
       * @param silentAudio Detects periods of silence.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f1cbf4581f7acf128cd53fde9d72454cb8fe1f538075df0a77f965b6fed83a")
      public fun silentAudio(silentAudio: SilentAudioProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty.builder()

      /**
       * @param silentAudio Detects periods of silence.
       */
      override fun silentAudio(silentAudio: IResolvable) {
        cdkBuilder.silentAudio(silentAudio.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param silentAudio Detects periods of silence.
       */
      override fun silentAudio(silentAudio: SilentAudioProperty) {
        cdkBuilder.silentAudio(silentAudio.let(SilentAudioProperty.Companion::unwrap))
      }

      /**
       * @param silentAudio Detects periods of silence.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57f1cbf4581f7acf128cd53fde9d72454cb8fe1f538075df0a77f965b6fed83a")
      override fun silentAudio(silentAudio: SilentAudioProperty.Builder.() -> Unit): Unit =
          silentAudio(SilentAudioProperty(silentAudio))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty,
    ) : CdkObject(cdkObject),
        AudioMonitoringSettingProperty {
      /**
       * Detects periods of silence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-audiomonitoringsetting.html#cfn-mediaconnect-flow-audiomonitoringsetting-silentaudio)
       */
      override fun silentAudio(): Any? = unwrap(this).getSilentAudio()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AudioMonitoringSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty):
          AudioMonitoringSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioMonitoringSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioMonitoringSettingProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.AudioMonitoringSettingProperty
    }
  }

  /**
   * Configures settings for the `BlackFrames` metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * BlackFramesProperty blackFramesProperty = BlackFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-blackframes.html)
   */
  public interface BlackFramesProperty {
    /**
     * Indicates whether the `BlackFrames` metric is enabled or disabled..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-blackframes.html#cfn-mediaconnect-flow-blackframes-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * Specifies the number of consecutive seconds of black frames that triggers an event or alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-blackframes.html#cfn-mediaconnect-flow-blackframes-thresholdseconds)
     */
    public fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()

    /**
     * A builder for [BlackFramesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Indicates whether the `BlackFrames` metric is enabled or disabled..
       */
      public fun state(state: String)

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of black frames that
       * triggers an event or alert.
       */
      public fun thresholdSeconds(thresholdSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty.builder()

      /**
       * @param state Indicates whether the `BlackFrames` metric is enabled or disabled..
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of black frames that
       * triggers an event or alert.
       */
      override fun thresholdSeconds(thresholdSeconds: Number) {
        cdkBuilder.thresholdSeconds(thresholdSeconds)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty,
    ) : CdkObject(cdkObject),
        BlackFramesProperty {
      /**
       * Indicates whether the `BlackFrames` metric is enabled or disabled..
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-blackframes.html#cfn-mediaconnect-flow-blackframes-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * Specifies the number of consecutive seconds of black frames that triggers an event or
       * alert.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-blackframes.html#cfn-mediaconnect-flow-blackframes-thresholdseconds)
       */
      override fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BlackFramesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty):
          BlackFramesProperty = CdkObjectWrappers.wrap(cdkObject) as? BlackFramesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BlackFramesProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.BlackFramesProperty
    }
  }

  /**
   * Information about the encryption of the flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html)
   */
  public interface EncryptionProperty {
    /**
     * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
     * aes256).
     *
     * If you are using SPEKE or SRT-password encryption, this property must be left blank.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-algorithm)
     */
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
     * for encrypting content.
     *
     * This parameter is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM)
     * platform key provider.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-deviceid)
     */
    public fun deviceId(): String? = unwrap(this).getDeviceId()

    /**
     * The type of key that is used for the encryption.
     *
     * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
     * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
     *
     * Default: - "static-key"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-keytype)
     */
    public fun keyType(): String? = unwrap(this).getKeyType()

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * An identifier for the content.
     *
     * The service sends this value to the key server to identify the current endpoint. The resource
     * ID is also known as the content ID. This parameter is required for SPEKE encryption and is not
     * valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-resourceid)
     */
    public fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The ARN of the role that you created during setup (when you set up MediaConnect as a trusted
     * entity).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
     *
     * This parameter is required for static key encryption and is not valid for SPEKE encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server.
     *
     * This parameter is required for SPEKE encryption and is not valid for static key encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256).
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      public fun algorithm(algorithm: String)

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun deviceId(deviceId: String)

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      public fun keyType(keyType: String)

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun region(region: String)

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      public fun resourceId(resourceId: String)

      /**
       * @param roleArn The ARN of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity). 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       * This parameter is required for static key encryption and is not valid for SPEKE encryption.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.builder()

      /**
       * @param algorithm The type of algorithm that is used for static key encryption (such as
       * aes128, aes192, or aes256).
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, to be used with the key for encrypting content.
       * This parameter is not valid for static key encryption.
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param deviceId The value of one of the devices that you configured with your digital
       * rights management (DRM) platform key provider.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      /**
       * @param keyType The type of key that is used for the encryption.
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       */
      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      /**
       * @param region The AWS Region that the API Gateway proxy endpoint was created in.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param resourceId An identifier for the content.
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param roleArn The ARN of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
       * This parameter is required for static key encryption and is not valid for SPEKE encryption.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param url The URL from the API Gateway proxy that you set up to talk to your key server.
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty,
    ) : CdkObject(cdkObject),
        EncryptionProperty {
      /**
       * The type of algorithm that is used for static key encryption (such as aes128, aes192, or
       * aes256).
       *
       * If you are using SPEKE or SRT-password encryption, this property must be left blank.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-algorithm)
       */
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key
       * for encrypting content.
       *
       * This parameter is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * The value of one of the devices that you configured with your digital rights management
       * (DRM) platform key provider.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-deviceid)
       */
      override fun deviceId(): String? = unwrap(this).getDeviceId()

      /**
       * The type of key that is used for the encryption.
       *
       * If you don't specify a `keyType` value, the service uses the default setting ( `static-key`
       * ). Valid key types are: `static-key` , `speke` , and `srt-password` .
       *
       * Default: - "static-key"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-keytype)
       */
      override fun keyType(): String? = unwrap(this).getKeyType()

      /**
       * The AWS Region that the API Gateway proxy endpoint was created in.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-region)
       */
      override fun region(): String? = unwrap(this).getRegion()

      /**
       * An identifier for the content.
       *
       * The service sends this value to the key server to identify the current endpoint. The
       * resource ID is also known as the content ID. This parameter is required for SPEKE encryption
       * and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-resourceid)
       */
      override fun resourceId(): String? = unwrap(this).getResourceId()

      /**
       * The ARN of the role that you created during setup (when you set up MediaConnect as a
       * trusted entity).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
       *
       * This parameter is required for static key encryption and is not valid for SPEKE encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The URL from the API Gateway proxy that you set up to talk to your key server.
       *
       * This parameter is required for SPEKE encryption and is not valid for static key encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty):
          EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty
    }
  }

  /**
   * The settings for source failover.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * FailoverConfigProperty failoverConfigProperty = FailoverConfigProperty.builder()
   * .failoverMode("failoverMode")
   * .recoveryWindow(123)
   * .sourcePriority(SourcePriorityProperty.builder()
   * .primarySource("primarySource")
   * .build())
   * .state("state")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html)
   */
  public interface FailoverConfigProperty {
    /**
     * The type of failover you choose for this flow.
     *
     * MERGE combines the source streams into a single stream, allowing graceful recovery from any
     * single-source loss. FAILOVER allows switching between different streams. The string for this
     * property must be entered as MERGE or FAILOVER. No other string entry is valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-failovermode)
     */
    public fun failoverMode(): String? = unwrap(this).getFailoverMode()

    /**
     * Search window time to look for dash-7 packets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-recoverywindow)
     */
    public fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

    /**
     * The priority you want to assign to a source.
     *
     * You can have a primary stream and a backup stream or two equally prioritized streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-sourcepriority)
     */
    public fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

    /**
     * The state of source failover on the flow.
     *
     * If the state is inactive, the flow can have only one source. If the state is active, the flow
     * can have one or two sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-state)
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
       * single-source loss. FAILOVER allows switching between different streams. The string for this
       * property must be entered as MERGE or FAILOVER. No other string entry is valid.
       */
      public fun failoverMode(failoverMode: String)

      /**
       * @param recoveryWindow Search window time to look for dash-7 packets.
       */
      public fun recoveryWindow(recoveryWindow: Number)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      public fun sourcePriority(sourcePriority: IResolvable)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      public fun sourcePriority(sourcePriority: SourcePriorityProperty)

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
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
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.builder()

      /**
       * @param failoverMode The type of failover you choose for this flow.
       * MERGE combines the source streams into a single stream, allowing graceful recovery from any
       * single-source loss. FAILOVER allows switching between different streams. The string for this
       * property must be entered as MERGE or FAILOVER. No other string entry is valid.
       */
      override fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
      }

      /**
       * @param recoveryWindow Search window time to look for dash-7 packets.
       */
      override fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty.Companion::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
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
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty,
    ) : CdkObject(cdkObject),
        FailoverConfigProperty {
      /**
       * The type of failover you choose for this flow.
       *
       * MERGE combines the source streams into a single stream, allowing graceful recovery from any
       * single-source loss. FAILOVER allows switching between different streams. The string for this
       * property must be entered as MERGE or FAILOVER. No other string entry is valid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-failovermode)
       */
      override fun failoverMode(): String? = unwrap(this).getFailoverMode()

      /**
       * Search window time to look for dash-7 packets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-recoverywindow)
       */
      override fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

      /**
       * The priority you want to assign to a source.
       *
       * You can have a primary stream and a backup stream or two equally prioritized streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-sourcepriority)
       */
      override fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

      /**
       * The state of source failover on the flow.
       *
       * If the state is inactive, the flow can have only one source. If the state is active, the
       * flow can have one or two sources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty):
          FailoverConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? FailoverConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty
    }
  }

  /**
   * A set of parameters that define the media stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * FmtpProperty fmtpProperty = FmtpProperty.builder()
   * .channelOrder("channelOrder")
   * .colorimetry("colorimetry")
   * .exactFramerate("exactFramerate")
   * .par("par")
   * .range("range")
   * .scanMode("scanMode")
   * .tcs("tcs")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html)
   */
  public interface FmtpProperty {
    /**
     * The format of the audio channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-channelorder)
     */
    public fun channelOrder(): String? = unwrap(this).getChannelOrder()

    /**
     * The format used for the representation of color.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-colorimetry)
     */
    public fun colorimetry(): String? = unwrap(this).getColorimetry()

    /**
     * The frame rate for the video stream, in frames/second.
     *
     * For example: 60000/1001.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-exactframerate)
     */
    public fun exactFramerate(): String? = unwrap(this).getExactFramerate()

    /**
     * The pixel aspect ratio (PAR) of the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-par)
     */
    public fun par(): String? = unwrap(this).getPar()

    /**
     * The encoding range of the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-range)
     */
    public fun range(): String? = unwrap(this).getRange()

    /**
     * The type of compression that was used to smooth the video’s appearance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-scanmode)
     */
    public fun scanMode(): String? = unwrap(this).getScanMode()

    /**
     * The transfer characteristic system (TCS) that is used in the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-tcs)
     */
    public fun tcs(): String? = unwrap(this).getTcs()

    /**
     * A builder for [FmtpProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param channelOrder The format of the audio channel.
       */
      public fun channelOrder(channelOrder: String)

      /**
       * @param colorimetry The format used for the representation of color.
       */
      public fun colorimetry(colorimetry: String)

      /**
       * @param exactFramerate The frame rate for the video stream, in frames/second.
       * For example: 60000/1001.
       */
      public fun exactFramerate(exactFramerate: String)

      /**
       * @param par The pixel aspect ratio (PAR) of the video.
       */
      public fun par(par: String)

      /**
       * @param range The encoding range of the video.
       */
      public fun range(range: String)

      /**
       * @param scanMode The type of compression that was used to smooth the video’s appearance.
       */
      public fun scanMode(scanMode: String)

      /**
       * @param tcs The transfer characteristic system (TCS) that is used in the video.
       */
      public fun tcs(tcs: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty.builder()

      /**
       * @param channelOrder The format of the audio channel.
       */
      override fun channelOrder(channelOrder: String) {
        cdkBuilder.channelOrder(channelOrder)
      }

      /**
       * @param colorimetry The format used for the representation of color.
       */
      override fun colorimetry(colorimetry: String) {
        cdkBuilder.colorimetry(colorimetry)
      }

      /**
       * @param exactFramerate The frame rate for the video stream, in frames/second.
       * For example: 60000/1001.
       */
      override fun exactFramerate(exactFramerate: String) {
        cdkBuilder.exactFramerate(exactFramerate)
      }

      /**
       * @param par The pixel aspect ratio (PAR) of the video.
       */
      override fun par(par: String) {
        cdkBuilder.par(par)
      }

      /**
       * @param range The encoding range of the video.
       */
      override fun range(range: String) {
        cdkBuilder.range(range)
      }

      /**
       * @param scanMode The type of compression that was used to smooth the video’s appearance.
       */
      override fun scanMode(scanMode: String) {
        cdkBuilder.scanMode(scanMode)
      }

      /**
       * @param tcs The transfer characteristic system (TCS) that is used in the video.
       */
      override fun tcs(tcs: String) {
        cdkBuilder.tcs(tcs)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty,
    ) : CdkObject(cdkObject),
        FmtpProperty {
      /**
       * The format of the audio channel.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-channelorder)
       */
      override fun channelOrder(): String? = unwrap(this).getChannelOrder()

      /**
       * The format used for the representation of color.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-colorimetry)
       */
      override fun colorimetry(): String? = unwrap(this).getColorimetry()

      /**
       * The frame rate for the video stream, in frames/second.
       *
       * For example: 60000/1001.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-exactframerate)
       */
      override fun exactFramerate(): String? = unwrap(this).getExactFramerate()

      /**
       * The pixel aspect ratio (PAR) of the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-par)
       */
      override fun par(): String? = unwrap(this).getPar()

      /**
       * The encoding range of the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-range)
       */
      override fun range(): String? = unwrap(this).getRange()

      /**
       * The type of compression that was used to smooth the video’s appearance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-scanmode)
       */
      override fun scanMode(): String? = unwrap(this).getScanMode()

      /**
       * The transfer characteristic system (TCS) that is used in the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-fmtp.html#cfn-mediaconnect-flow-fmtp-tcs)
       */
      override fun tcs(): String? = unwrap(this).getTcs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FmtpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty):
          FmtpProperty = CdkObjectWrappers.wrap(cdkObject) as? FmtpProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FmtpProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlow.FmtpProperty
    }
  }

  /**
   * Configures settings for the `FrozenFrames` metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * FrozenFramesProperty frozenFramesProperty = FrozenFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-frozenframes.html)
   */
  public interface FrozenFramesProperty {
    /**
     * Indicates whether the `FrozenFrames` metric is enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-frozenframes.html#cfn-mediaconnect-flow-frozenframes-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * Specifies the number of consecutive seconds of a static image that triggers an event or
     * alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-frozenframes.html#cfn-mediaconnect-flow-frozenframes-thresholdseconds)
     */
    public fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()

    /**
     * A builder for [FrozenFramesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Indicates whether the `FrozenFrames` metric is enabled or disabled.
       */
      public fun state(state: String)

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of a static image that
       * triggers an event or alert.
       */
      public fun thresholdSeconds(thresholdSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty.builder()

      /**
       * @param state Indicates whether the `FrozenFrames` metric is enabled or disabled.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of a static image that
       * triggers an event or alert.
       */
      override fun thresholdSeconds(thresholdSeconds: Number) {
        cdkBuilder.thresholdSeconds(thresholdSeconds)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty,
    ) : CdkObject(cdkObject),
        FrozenFramesProperty {
      /**
       * Indicates whether the `FrozenFrames` metric is enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-frozenframes.html#cfn-mediaconnect-flow-frozenframes-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * Specifies the number of consecutive seconds of a static image that triggers an event or
       * alert.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-frozenframes.html#cfn-mediaconnect-flow-frozenframes-thresholdseconds)
       */
      override fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrozenFramesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty):
          FrozenFramesProperty = CdkObjectWrappers.wrap(cdkObject) as? FrozenFramesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrozenFramesProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FrozenFramesProperty
    }
  }

  /**
   * The source configuration for cloud flows receiving a stream from a bridge.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * GatewayBridgeSourceProperty gatewayBridgeSourceProperty = GatewayBridgeSourceProperty.builder()
   * .bridgeArn("bridgeArn")
   * // the properties below are optional
   * .vpcInterfaceAttachment(VpcInterfaceAttachmentProperty.builder()
   * .vpcInterfaceName("vpcInterfaceName")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html)
   */
  public interface GatewayBridgeSourceProperty {
    /**
     * The ARN of the bridge feeding this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html#cfn-mediaconnect-flow-gatewaybridgesource-bridgearn)
     */
    public fun bridgeArn(): String

    /**
     * The name of the VPC interface attachment to use for this bridge source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html#cfn-mediaconnect-flow-gatewaybridgesource-vpcinterfaceattachment)
     */
    public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

    /**
     * A builder for [GatewayBridgeSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bridgeArn The ARN of the bridge feeding this flow. 
       */
      public fun bridgeArn(bridgeArn: String)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      public
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.builder()

      /**
       * @param bridgeArn The ARN of the bridge feeding this flow. 
       */
      override fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty.Companion::unwrap))
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty,
    ) : CdkObject(cdkObject),
        GatewayBridgeSourceProperty {
      /**
       * The ARN of the bridge feeding this flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html#cfn-mediaconnect-flow-gatewaybridgesource-bridgearn)
       */
      override fun bridgeArn(): String = unwrap(this).getBridgeArn()

      /**
       * The name of the VPC interface attachment to use for this bridge source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-gatewaybridgesource.html#cfn-mediaconnect-flow-gatewaybridgesource-vpcinterfaceattachment)
       */
      override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayBridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty):
          GatewayBridgeSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GatewayBridgeSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty
    }
  }

  /**
   * The transport parameters that are associated with an incoming media stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * InputConfigurationProperty inputConfigurationProperty = InputConfigurationProperty.builder()
   * .inputPort(123)
   * .interface(InterfaceProperty.builder()
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-inputconfiguration.html)
   */
  public interface InputConfigurationProperty {
    /**
     * The port that the flow listens on for an incoming media stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-inputconfiguration.html#cfn-mediaconnect-flow-inputconfiguration-inputport)
     */
    public fun inputPort(): Number

    /**
     * The VPC interface where the media stream comes in from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-inputconfiguration.html#cfn-mediaconnect-flow-inputconfiguration-interface)
     */
    public fun interfaceValue(): Any

    /**
     * A builder for [InputConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputPort The port that the flow listens on for an incoming media stream. 
       */
      public fun inputPort(inputPort: Number)

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      public fun interfaceValue(interfaceValue: IResolvable)

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      public fun interfaceValue(interfaceValue: InterfaceProperty)

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fab1b472973b4e4cf145022f85079c35c17f546fa633e2478dc2bdefb99b4f23")
      public fun interfaceValue(interfaceValue: InterfaceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty.builder()

      /**
       * @param inputPort The port that the flow listens on for an incoming media stream. 
       */
      override fun inputPort(inputPort: Number) {
        cdkBuilder.inputPort(inputPort)
      }

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      override fun interfaceValue(interfaceValue: IResolvable) {
        cdkBuilder.interfaceValue(interfaceValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      override fun interfaceValue(interfaceValue: InterfaceProperty) {
        cdkBuilder.interfaceValue(interfaceValue.let(InterfaceProperty.Companion::unwrap))
      }

      /**
       * @param interfaceValue The VPC interface where the media stream comes in from. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fab1b472973b4e4cf145022f85079c35c17f546fa633e2478dc2bdefb99b4f23")
      override fun interfaceValue(interfaceValue: InterfaceProperty.Builder.() -> Unit): Unit =
          interfaceValue(InterfaceProperty(interfaceValue))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty,
    ) : CdkObject(cdkObject),
        InputConfigurationProperty {
      /**
       * The port that the flow listens on for an incoming media stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-inputconfiguration.html#cfn-mediaconnect-flow-inputconfiguration-inputport)
       */
      override fun inputPort(): Number = unwrap(this).getInputPort()

      /**
       * The VPC interface where the media stream comes in from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-inputconfiguration.html#cfn-mediaconnect-flow-inputconfiguration-interface)
       */
      override fun interfaceValue(): Any = unwrap(this).getInterfaceValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty):
          InputConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputConfigurationProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InputConfigurationProperty
    }
  }

  /**
   * The VPC interface that is used for the media stream associated with the source or output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * InterfaceProperty interfaceProperty = InterfaceProperty.builder()
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-interface.html)
   */
  public interface InterfaceProperty {
    /**
     * The name of the VPC interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-interface.html#cfn-mediaconnect-flow-interface-name)
     */
    public fun name(): String

    /**
     * A builder for [InterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the VPC interface. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty.builder()

      /**
       * @param name The name of the VPC interface. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty,
    ) : CdkObject(cdkObject),
        InterfaceProperty {
      /**
       * The name of the VPC interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-interface.html#cfn-mediaconnect-flow-interface-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty):
          InterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? InterfaceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InterfaceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty
    }
  }

  /**
   * The maintenance setting of a flow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * MaintenanceProperty maintenanceProperty = MaintenanceProperty.builder()
   * .maintenanceDay("maintenanceDay")
   * .maintenanceStartHour("maintenanceStartHour")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-maintenance.html)
   */
  public interface MaintenanceProperty {
    /**
     * A day of a week when the maintenance will happen.
     *
     * Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-maintenance.html#cfn-mediaconnect-flow-maintenance-maintenanceday)
     */
    public fun maintenanceDay(): String

    /**
     * UTC time when the maintenance will happen.
     *
     * Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-maintenance.html#cfn-mediaconnect-flow-maintenance-maintenancestarthour)
     */
    public fun maintenanceStartHour(): String

    /**
     * A builder for [MaintenanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maintenanceDay A day of a week when the maintenance will happen. 
       * Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
       */
      public fun maintenanceDay(maintenanceDay: String)

      /**
       * @param maintenanceStartHour UTC time when the maintenance will happen. 
       * Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
       */
      public fun maintenanceStartHour(maintenanceStartHour: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty.builder()

      /**
       * @param maintenanceDay A day of a week when the maintenance will happen. 
       * Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
       */
      override fun maintenanceDay(maintenanceDay: String) {
        cdkBuilder.maintenanceDay(maintenanceDay)
      }

      /**
       * @param maintenanceStartHour UTC time when the maintenance will happen. 
       * Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
       */
      override fun maintenanceStartHour(maintenanceStartHour: String) {
        cdkBuilder.maintenanceStartHour(maintenanceStartHour)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty,
    ) : CdkObject(cdkObject),
        MaintenanceProperty {
      /**
       * A day of a week when the maintenance will happen.
       *
       * Use Monday/Tuesday/Wednesday/Thursday/Friday/Saturday/Sunday.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-maintenance.html#cfn-mediaconnect-flow-maintenance-maintenanceday)
       */
      override fun maintenanceDay(): String = unwrap(this).getMaintenanceDay()

      /**
       * UTC time when the maintenance will happen.
       *
       * Use 24-hour HH:MM format. Minutes must be 00. Example: 13:00. The default value is 02:00.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-maintenance.html#cfn-mediaconnect-flow-maintenance-maintenancestarthour)
       */
      override fun maintenanceStartHour(): String = unwrap(this).getMaintenanceStartHour()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MaintenanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty):
          MaintenanceProperty = CdkObjectWrappers.wrap(cdkObject) as? MaintenanceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MaintenanceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MaintenanceProperty
    }
  }

  /**
   * Attributes that are related to the media stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * MediaStreamAttributesProperty mediaStreamAttributesProperty =
   * MediaStreamAttributesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamattributes.html)
   */
  public interface MediaStreamAttributesProperty {
    /**
     * The settings that you want to use to define the media stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamattributes.html#cfn-mediaconnect-flow-mediastreamattributes-fmtp)
     */
    public fun fmtp(): Any? = unwrap(this).getFmtp()

    /**
     * The audio language, in a format that is recognized by the receiver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamattributes.html#cfn-mediaconnect-flow-mediastreamattributes-lang)
     */
    public fun lang(): String? = unwrap(this).getLang()

    /**
     * A builder for [MediaStreamAttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      public fun fmtp(fmtp: IResolvable)

      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      public fun fmtp(fmtp: FmtpProperty)

      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dac843c0c4c8ac032a583fbbafc6a584aade8d2b36387f91611a8eb34dfd7562")
      public fun fmtp(fmtp: FmtpProperty.Builder.() -> Unit)

      /**
       * @param lang The audio language, in a format that is recognized by the receiver.
       */
      public fun lang(lang: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty.builder()

      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      override fun fmtp(fmtp: IResolvable) {
        cdkBuilder.fmtp(fmtp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      override fun fmtp(fmtp: FmtpProperty) {
        cdkBuilder.fmtp(fmtp.let(FmtpProperty.Companion::unwrap))
      }

      /**
       * @param fmtp The settings that you want to use to define the media stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dac843c0c4c8ac032a583fbbafc6a584aade8d2b36387f91611a8eb34dfd7562")
      override fun fmtp(fmtp: FmtpProperty.Builder.() -> Unit): Unit = fmtp(FmtpProperty(fmtp))

      /**
       * @param lang The audio language, in a format that is recognized by the receiver.
       */
      override fun lang(lang: String) {
        cdkBuilder.lang(lang)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty,
    ) : CdkObject(cdkObject),
        MediaStreamAttributesProperty {
      /**
       * The settings that you want to use to define the media stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamattributes.html#cfn-mediaconnect-flow-mediastreamattributes-fmtp)
       */
      override fun fmtp(): Any? = unwrap(this).getFmtp()

      /**
       * The audio language, in a format that is recognized by the receiver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamattributes.html#cfn-mediaconnect-flow-mediastreamattributes-lang)
       */
      override fun lang(): String? = unwrap(this).getLang()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaStreamAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty):
          MediaStreamAttributesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaStreamAttributesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaStreamAttributesProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamAttributesProperty
    }
  }

  /**
   * A media stream represents one component of your content, such as video, audio, or ancillary
   * data.
   *
   * After you add a media stream to your flow, you can associate it with sources and outputs that
   * use the ST 2110 JPEG XS or CDI protocol.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * MediaStreamProperty mediaStreamProperty = MediaStreamProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html)
   */
  public interface MediaStreamProperty {
    /**
     * Attributes that are related to the media stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The sample rate for the stream.
     *
     * This value is measured in Hz.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-clockrate)
     */
    public fun clockRate(): Number? = unwrap(this).getClockRate()

    /**
     * A description that can help you quickly identify what your media stream is used for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The format type number (sometimes referred to as RTP payload type) of the media stream.
     *
     * MediaConnect assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need to
     * provide this value to the receiver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-fmt)
     */
    public fun fmt(): Number? = unwrap(this).getFmt()

    /**
     * A unique identifier for the media stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamid)
     */
    public fun mediaStreamId(): Number

    /**
     * A name that helps you distinguish one media stream from another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamname)
     */
    public fun mediaStreamName(): String

    /**
     * The type of media stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamtype)
     */
    public fun mediaStreamType(): String

    /**
     * The resolution of the video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-videoformat)
     */
    public fun videoFormat(): String? = unwrap(this).getVideoFormat()

    /**
     * A builder for [MediaStreamProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes Attributes that are related to the media stream.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes Attributes that are related to the media stream.
       */
      public fun attributes(attributes: MediaStreamAttributesProperty)

      /**
       * @param attributes Attributes that are related to the media stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda8d931b026e26d35275af27049ae85aa42e2cc257a1d64cc83aff8f7750fb0")
      public fun attributes(attributes: MediaStreamAttributesProperty.Builder.() -> Unit)

      /**
       * @param clockRate The sample rate for the stream.
       * This value is measured in Hz.
       */
      public fun clockRate(clockRate: Number)

      /**
       * @param description A description that can help you quickly identify what your media stream
       * is used for.
       */
      public fun description(description: String)

      /**
       * @param fmt The format type number (sometimes referred to as RTP payload type) of the media
       * stream.
       * MediaConnect assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need
       * to provide this value to the receiver.
       */
      public fun fmt(fmt: Number)

      /**
       * @param mediaStreamId A unique identifier for the media stream. 
       */
      public fun mediaStreamId(mediaStreamId: Number)

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      public fun mediaStreamName(mediaStreamName: String)

      /**
       * @param mediaStreamType The type of media stream. 
       */
      public fun mediaStreamType(mediaStreamType: String)

      /**
       * @param videoFormat The resolution of the video.
       */
      public fun videoFormat(videoFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty.builder()

      /**
       * @param attributes Attributes that are related to the media stream.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param attributes Attributes that are related to the media stream.
       */
      override fun attributes(attributes: MediaStreamAttributesProperty) {
        cdkBuilder.attributes(attributes.let(MediaStreamAttributesProperty.Companion::unwrap))
      }

      /**
       * @param attributes Attributes that are related to the media stream.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dda8d931b026e26d35275af27049ae85aa42e2cc257a1d64cc83aff8f7750fb0")
      override fun attributes(attributes: MediaStreamAttributesProperty.Builder.() -> Unit): Unit =
          attributes(MediaStreamAttributesProperty(attributes))

      /**
       * @param clockRate The sample rate for the stream.
       * This value is measured in Hz.
       */
      override fun clockRate(clockRate: Number) {
        cdkBuilder.clockRate(clockRate)
      }

      /**
       * @param description A description that can help you quickly identify what your media stream
       * is used for.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param fmt The format type number (sometimes referred to as RTP payload type) of the media
       * stream.
       * MediaConnect assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need
       * to provide this value to the receiver.
       */
      override fun fmt(fmt: Number) {
        cdkBuilder.fmt(fmt)
      }

      /**
       * @param mediaStreamId A unique identifier for the media stream. 
       */
      override fun mediaStreamId(mediaStreamId: Number) {
        cdkBuilder.mediaStreamId(mediaStreamId)
      }

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      override fun mediaStreamName(mediaStreamName: String) {
        cdkBuilder.mediaStreamName(mediaStreamName)
      }

      /**
       * @param mediaStreamType The type of media stream. 
       */
      override fun mediaStreamType(mediaStreamType: String) {
        cdkBuilder.mediaStreamType(mediaStreamType)
      }

      /**
       * @param videoFormat The resolution of the video.
       */
      override fun videoFormat(videoFormat: String) {
        cdkBuilder.videoFormat(videoFormat)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty,
    ) : CdkObject(cdkObject),
        MediaStreamProperty {
      /**
       * Attributes that are related to the media stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The sample rate for the stream.
       *
       * This value is measured in Hz.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-clockrate)
       */
      override fun clockRate(): Number? = unwrap(this).getClockRate()

      /**
       * A description that can help you quickly identify what your media stream is used for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The format type number (sometimes referred to as RTP payload type) of the media stream.
       *
       * MediaConnect assigns this value to the media stream. For ST 2110 JPEG XS outputs, you need
       * to provide this value to the receiver.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-fmt)
       */
      override fun fmt(): Number? = unwrap(this).getFmt()

      /**
       * A unique identifier for the media stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamid)
       */
      override fun mediaStreamId(): Number = unwrap(this).getMediaStreamId()

      /**
       * A name that helps you distinguish one media stream from another.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamname)
       */
      override fun mediaStreamName(): String = unwrap(this).getMediaStreamName()

      /**
       * The type of media stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-mediastreamtype)
       */
      override fun mediaStreamType(): String = unwrap(this).getMediaStreamType()

      /**
       * The resolution of the video.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastream.html#cfn-mediaconnect-flow-mediastream-videoformat)
       */
      override fun videoFormat(): String? = unwrap(this).getVideoFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaStreamProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty):
          MediaStreamProperty = CdkObjectWrappers.wrap(cdkObject) as? MediaStreamProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaStreamProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamProperty
    }
  }

  /**
   * The media stream that is associated with the source, and the parameters for that association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * MediaStreamSourceConfigurationProperty mediaStreamSourceConfigurationProperty =
   * MediaStreamSourceConfigurationProperty.builder()
   * .encodingName("encodingName")
   * .mediaStreamName("mediaStreamName")
   * // the properties below are optional
   * .inputConfigurations(List.of(InputConfigurationProperty.builder()
   * .inputPort(123)
   * .interface(InterfaceProperty.builder()
   * .name("name")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html)
   */
  public interface MediaStreamSourceConfigurationProperty {
    /**
     * The format that was used to encode the data.
     *
     * For ancillary data streams, set the encoding name to smpte291. For audio streams, set the
     * encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG XS
     * streams, set the encoding name to jxsv.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-encodingname)
     */
    public fun encodingName(): String

    /**
     * The media streams that you want to associate with the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-inputconfigurations)
     */
    public fun inputConfigurations(): Any? = unwrap(this).getInputConfigurations()

    /**
     * A name that helps you distinguish one media stream from another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-mediastreamname)
     */
    public fun mediaStreamName(): String

    /**
     * A builder for [MediaStreamSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encodingName The format that was used to encode the data. 
       * For ancillary data streams, set the encoding name to smpte291. For audio streams, set the
       * encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG
       * XS streams, set the encoding name to jxsv.
       */
      public fun encodingName(encodingName: String)

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      public fun inputConfigurations(inputConfigurations: IResolvable)

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      public fun inputConfigurations(inputConfigurations: List<Any>)

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      public fun inputConfigurations(vararg inputConfigurations: Any)

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      public fun mediaStreamName(mediaStreamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty.builder()

      /**
       * @param encodingName The format that was used to encode the data. 
       * For ancillary data streams, set the encoding name to smpte291. For audio streams, set the
       * encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG
       * XS streams, set the encoding name to jxsv.
       */
      override fun encodingName(encodingName: String) {
        cdkBuilder.encodingName(encodingName)
      }

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      override fun inputConfigurations(inputConfigurations: IResolvable) {
        cdkBuilder.inputConfigurations(inputConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      override fun inputConfigurations(inputConfigurations: List<Any>) {
        cdkBuilder.inputConfigurations(inputConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inputConfigurations The media streams that you want to associate with the source.
       */
      override fun inputConfigurations(vararg inputConfigurations: Any): Unit =
          inputConfigurations(inputConfigurations.toList())

      /**
       * @param mediaStreamName A name that helps you distinguish one media stream from another. 
       */
      override fun mediaStreamName(mediaStreamName: String) {
        cdkBuilder.mediaStreamName(mediaStreamName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        MediaStreamSourceConfigurationProperty {
      /**
       * The format that was used to encode the data.
       *
       * For ancillary data streams, set the encoding name to smpte291. For audio streams, set the
       * encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video, JPEG
       * XS streams, set the encoding name to jxsv.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-encodingname)
       */
      override fun encodingName(): String = unwrap(this).getEncodingName()

      /**
       * The media streams that you want to associate with the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-inputconfigurations)
       */
      override fun inputConfigurations(): Any? = unwrap(this).getInputConfigurations()

      /**
       * A name that helps you distinguish one media stream from another.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-mediastreamsourceconfiguration.html#cfn-mediaconnect-flow-mediastreamsourceconfiguration-mediastreamname)
       */
      override fun mediaStreamName(): String = unwrap(this).getMediaStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaStreamSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty):
          MediaStreamSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaStreamSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaStreamSourceConfigurationProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.MediaStreamSourceConfigurationProperty
    }
  }

  /**
   * Specifies the configuration settings for NDI outputs.
   *
   * Required when the flow includes NDI outputs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * NdiConfigProperty ndiConfigProperty = NdiConfigProperty.builder()
   * .machineName("machineName")
   * .ndiDiscoveryServers(List.of(NdiDiscoveryServerConfigProperty.builder()
   * .discoveryServerAddress("discoveryServerAddress")
   * .vpcInterfaceAdapter("vpcInterfaceAdapter")
   * // the properties below are optional
   * .discoveryServerPort(123)
   * .build()))
   * .ndiState("ndiState")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html)
   */
  public interface NdiConfigProperty {
    /**
     * A prefix for the names of the NDI sources that the flow creates.
     *
     * If a custom name isn't specified, MediaConnect generates a unique 12-character ID as the
     * prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-machinename)
     */
    public fun machineName(): String? = unwrap(this).getMachineName()

    /**
     * A list of up to three NDI discovery server configurations.
     *
     * While not required by the API, this configuration is necessary for NDI functionality to work
     * properly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-ndidiscoveryservers)
     */
    public fun ndiDiscoveryServers(): Any? = unwrap(this).getNdiDiscoveryServers()

    /**
     * A setting that controls whether NDI outputs can be used in the flow.
     *
     * Must be ENABLED to add NDI outputs. Default is DISABLED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-ndistate)
     */
    public fun ndiState(): String? = unwrap(this).getNdiState()

    /**
     * A builder for [NdiConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param machineName A prefix for the names of the NDI sources that the flow creates.
       * If a custom name isn't specified, MediaConnect generates a unique 12-character ID as the
       * prefix.
       */
      public fun machineName(machineName: String)

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      public fun ndiDiscoveryServers(ndiDiscoveryServers: IResolvable)

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      public fun ndiDiscoveryServers(ndiDiscoveryServers: List<Any>)

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      public fun ndiDiscoveryServers(vararg ndiDiscoveryServers: Any)

      /**
       * @param ndiState A setting that controls whether NDI outputs can be used in the flow.
       * Must be ENABLED to add NDI outputs. Default is DISABLED.
       */
      public fun ndiState(ndiState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty.builder()

      /**
       * @param machineName A prefix for the names of the NDI sources that the flow creates.
       * If a custom name isn't specified, MediaConnect generates a unique 12-character ID as the
       * prefix.
       */
      override fun machineName(machineName: String) {
        cdkBuilder.machineName(machineName)
      }

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      override fun ndiDiscoveryServers(ndiDiscoveryServers: IResolvable) {
        cdkBuilder.ndiDiscoveryServers(ndiDiscoveryServers.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      override fun ndiDiscoveryServers(ndiDiscoveryServers: List<Any>) {
        cdkBuilder.ndiDiscoveryServers(ndiDiscoveryServers.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ndiDiscoveryServers A list of up to three NDI discovery server configurations.
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       */
      override fun ndiDiscoveryServers(vararg ndiDiscoveryServers: Any): Unit =
          ndiDiscoveryServers(ndiDiscoveryServers.toList())

      /**
       * @param ndiState A setting that controls whether NDI outputs can be used in the flow.
       * Must be ENABLED to add NDI outputs. Default is DISABLED.
       */
      override fun ndiState(ndiState: String) {
        cdkBuilder.ndiState(ndiState)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty,
    ) : CdkObject(cdkObject),
        NdiConfigProperty {
      /**
       * A prefix for the names of the NDI sources that the flow creates.
       *
       * If a custom name isn't specified, MediaConnect generates a unique 12-character ID as the
       * prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-machinename)
       */
      override fun machineName(): String? = unwrap(this).getMachineName()

      /**
       * A list of up to three NDI discovery server configurations.
       *
       * While not required by the API, this configuration is necessary for NDI functionality to
       * work properly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-ndidiscoveryservers)
       */
      override fun ndiDiscoveryServers(): Any? = unwrap(this).getNdiDiscoveryServers()

      /**
       * A setting that controls whether NDI outputs can be used in the flow.
       *
       * Must be ENABLED to add NDI outputs. Default is DISABLED.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndiconfig.html#cfn-mediaconnect-flow-ndiconfig-ndistate)
       */
      override fun ndiState(): String? = unwrap(this).getNdiState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NdiConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty):
          NdiConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? NdiConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NdiConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiConfigProperty
    }
  }

  /**
   * Specifies the configuration settings for individual NDI discovery servers.
   *
   * A maximum of 3 servers is allowed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * NdiDiscoveryServerConfigProperty ndiDiscoveryServerConfigProperty =
   * NdiDiscoveryServerConfigProperty.builder()
   * .discoveryServerAddress("discoveryServerAddress")
   * .vpcInterfaceAdapter("vpcInterfaceAdapter")
   * // the properties below are optional
   * .discoveryServerPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html)
   */
  public interface NdiDiscoveryServerConfigProperty {
    /**
     * The unique network address of the NDI discovery server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-discoveryserveraddress)
     */
    public fun discoveryServerAddress(): String

    /**
     * The port for the NDI discovery server.
     *
     * Defaults to 5959 if a custom port isn't specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-discoveryserverport)
     */
    public fun discoveryServerPort(): Number? = unwrap(this).getDiscoveryServerPort()

    /**
     * The identifier for the Virtual Private Cloud (VPC) network interface used by the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-vpcinterfaceadapter)
     */
    public fun vpcInterfaceAdapter(): String

    /**
     * A builder for [NdiDiscoveryServerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param discoveryServerAddress The unique network address of the NDI discovery server. 
       */
      public fun discoveryServerAddress(discoveryServerAddress: String)

      /**
       * @param discoveryServerPort The port for the NDI discovery server.
       * Defaults to 5959 if a custom port isn't specified.
       */
      public fun discoveryServerPort(discoveryServerPort: Number)

      /**
       * @param vpcInterfaceAdapter The identifier for the Virtual Private Cloud (VPC) network
       * interface used by the flow. 
       */
      public fun vpcInterfaceAdapter(vpcInterfaceAdapter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty.builder()

      /**
       * @param discoveryServerAddress The unique network address of the NDI discovery server. 
       */
      override fun discoveryServerAddress(discoveryServerAddress: String) {
        cdkBuilder.discoveryServerAddress(discoveryServerAddress)
      }

      /**
       * @param discoveryServerPort The port for the NDI discovery server.
       * Defaults to 5959 if a custom port isn't specified.
       */
      override fun discoveryServerPort(discoveryServerPort: Number) {
        cdkBuilder.discoveryServerPort(discoveryServerPort)
      }

      /**
       * @param vpcInterfaceAdapter The identifier for the Virtual Private Cloud (VPC) network
       * interface used by the flow. 
       */
      override fun vpcInterfaceAdapter(vpcInterfaceAdapter: String) {
        cdkBuilder.vpcInterfaceAdapter(vpcInterfaceAdapter)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty,
    ) : CdkObject(cdkObject),
        NdiDiscoveryServerConfigProperty {
      /**
       * The unique network address of the NDI discovery server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-discoveryserveraddress)
       */
      override fun discoveryServerAddress(): String = unwrap(this).getDiscoveryServerAddress()

      /**
       * The port for the NDI discovery server.
       *
       * Defaults to 5959 if a custom port isn't specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-discoveryserverport)
       */
      override fun discoveryServerPort(): Number? = unwrap(this).getDiscoveryServerPort()

      /**
       * The identifier for the Virtual Private Cloud (VPC) network interface used by the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-ndidiscoveryserverconfig.html#cfn-mediaconnect-flow-ndidiscoveryserverconfig-vpcinterfaceadapter)
       */
      override fun vpcInterfaceAdapter(): String = unwrap(this).getVpcInterfaceAdapter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NdiDiscoveryServerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty):
          NdiDiscoveryServerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NdiDiscoveryServerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NdiDiscoveryServerConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.NdiDiscoveryServerConfigProperty
    }
  }

  /**
   * Configures settings for the `SilentAudio` metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * SilentAudioProperty silentAudioProperty = SilentAudioProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-silentaudio.html)
   */
  public interface SilentAudioProperty {
    /**
     * Indicates whether the `SilentAudio` metric is enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-silentaudio.html#cfn-mediaconnect-flow-silentaudio-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * Specifies the number of consecutive seconds of silence that triggers an event or alert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-silentaudio.html#cfn-mediaconnect-flow-silentaudio-thresholdseconds)
     */
    public fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()

    /**
     * A builder for [SilentAudioProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param state Indicates whether the `SilentAudio` metric is enabled or disabled.
       */
      public fun state(state: String)

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of silence that
       * triggers an event or alert.
       */
      public fun thresholdSeconds(thresholdSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty.builder()

      /**
       * @param state Indicates whether the `SilentAudio` metric is enabled or disabled.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param thresholdSeconds Specifies the number of consecutive seconds of silence that
       * triggers an event or alert.
       */
      override fun thresholdSeconds(thresholdSeconds: Number) {
        cdkBuilder.thresholdSeconds(thresholdSeconds)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty,
    ) : CdkObject(cdkObject),
        SilentAudioProperty {
      /**
       * Indicates whether the `SilentAudio` metric is enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-silentaudio.html#cfn-mediaconnect-flow-silentaudio-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * Specifies the number of consecutive seconds of silence that triggers an event or alert.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-silentaudio.html#cfn-mediaconnect-flow-silentaudio-thresholdseconds)
       */
      override fun thresholdSeconds(): Number? = unwrap(this).getThresholdSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SilentAudioProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty):
          SilentAudioProperty = CdkObjectWrappers.wrap(cdkObject) as? SilentAudioProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SilentAudioProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SilentAudioProperty
    }
  }

  /**
   * The `SourceMonitoringConfig` property type specifies the source monitoring settings for an
   * `AWS::MediaConnect::Flow` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * SourceMonitoringConfigProperty sourceMonitoringConfigProperty =
   * SourceMonitoringConfigProperty.builder()
   * .audioMonitoringSettings(List.of(AudioMonitoringSettingProperty.builder()
   * .silentAudio(SilentAudioProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .build()))
   * .contentQualityAnalysisState("contentQualityAnalysisState")
   * .thumbnailState("thumbnailState")
   * .videoMonitoringSettings(List.of(VideoMonitoringSettingProperty.builder()
   * .blackFrames(BlackFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .frozenFrames(FrozenFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html)
   */
  public interface SourceMonitoringConfigProperty {
    /**
     * Contains the settings for audio stream metrics monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-audiomonitoringsettings)
     */
    public fun audioMonitoringSettings(): Any? = unwrap(this).getAudioMonitoringSettings()

    /**
     * Indicates whether content quality analysis is enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-contentqualityanalysisstate)
     */
    public fun contentQualityAnalysisState(): String? =
        unwrap(this).getContentQualityAnalysisState()

    /**
     * The current state of the thumbnail monitoring.
     *
     * * If you don't explicitly specify a value when creating a flow, no thumbnail state will be
     * set.
     * * If you update an existing flow and remove a previously set thumbnail state, the value will
     * change to `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-thumbnailstate)
     */
    public fun thumbnailState(): String? = unwrap(this).getThumbnailState()

    /**
     * Contains the settings for video stream metrics monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-videomonitoringsettings)
     */
    public fun videoMonitoringSettings(): Any? = unwrap(this).getVideoMonitoringSettings()

    /**
     * A builder for [SourceMonitoringConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      public fun audioMonitoringSettings(audioMonitoringSettings: IResolvable)

      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      public fun audioMonitoringSettings(audioMonitoringSettings: List<Any>)

      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      public fun audioMonitoringSettings(vararg audioMonitoringSettings: Any)

      /**
       * @param contentQualityAnalysisState Indicates whether content quality analysis is enabled or
       * disabled.
       */
      public fun contentQualityAnalysisState(contentQualityAnalysisState: String)

      /**
       * @param thumbnailState The current state of the thumbnail monitoring.
       * * If you don't explicitly specify a value when creating a flow, no thumbnail state will be
       * set.
       * * If you update an existing flow and remove a previously set thumbnail state, the value
       * will change to `DISABLED` .
       */
      public fun thumbnailState(thumbnailState: String)

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      public fun videoMonitoringSettings(videoMonitoringSettings: IResolvable)

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      public fun videoMonitoringSettings(videoMonitoringSettings: List<Any>)

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      public fun videoMonitoringSettings(vararg videoMonitoringSettings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty.builder()

      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      override fun audioMonitoringSettings(audioMonitoringSettings: IResolvable) {
        cdkBuilder.audioMonitoringSettings(audioMonitoringSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      override fun audioMonitoringSettings(audioMonitoringSettings: List<Any>) {
        cdkBuilder.audioMonitoringSettings(audioMonitoringSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param audioMonitoringSettings Contains the settings for audio stream metrics monitoring.
       */
      override fun audioMonitoringSettings(vararg audioMonitoringSettings: Any): Unit =
          audioMonitoringSettings(audioMonitoringSettings.toList())

      /**
       * @param contentQualityAnalysisState Indicates whether content quality analysis is enabled or
       * disabled.
       */
      override fun contentQualityAnalysisState(contentQualityAnalysisState: String) {
        cdkBuilder.contentQualityAnalysisState(contentQualityAnalysisState)
      }

      /**
       * @param thumbnailState The current state of the thumbnail monitoring.
       * * If you don't explicitly specify a value when creating a flow, no thumbnail state will be
       * set.
       * * If you update an existing flow and remove a previously set thumbnail state, the value
       * will change to `DISABLED` .
       */
      override fun thumbnailState(thumbnailState: String) {
        cdkBuilder.thumbnailState(thumbnailState)
      }

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      override fun videoMonitoringSettings(videoMonitoringSettings: IResolvable) {
        cdkBuilder.videoMonitoringSettings(videoMonitoringSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      override fun videoMonitoringSettings(videoMonitoringSettings: List<Any>) {
        cdkBuilder.videoMonitoringSettings(videoMonitoringSettings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param videoMonitoringSettings Contains the settings for video stream metrics monitoring.
       */
      override fun videoMonitoringSettings(vararg videoMonitoringSettings: Any): Unit =
          videoMonitoringSettings(videoMonitoringSettings.toList())

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty,
    ) : CdkObject(cdkObject),
        SourceMonitoringConfigProperty {
      /**
       * Contains the settings for audio stream metrics monitoring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-audiomonitoringsettings)
       */
      override fun audioMonitoringSettings(): Any? = unwrap(this).getAudioMonitoringSettings()

      /**
       * Indicates whether content quality analysis is enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-contentqualityanalysisstate)
       */
      override fun contentQualityAnalysisState(): String? =
          unwrap(this).getContentQualityAnalysisState()

      /**
       * The current state of the thumbnail monitoring.
       *
       * * If you don't explicitly specify a value when creating a flow, no thumbnail state will be
       * set.
       * * If you update an existing flow and remove a previously set thumbnail state, the value
       * will change to `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-thumbnailstate)
       */
      override fun thumbnailState(): String? = unwrap(this).getThumbnailState()

      /**
       * Contains the settings for video stream metrics monitoring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-videomonitoringsettings)
       */
      override fun videoMonitoringSettings(): Any? = unwrap(this).getVideoMonitoringSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceMonitoringConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty):
          SourceMonitoringConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceMonitoringConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceMonitoringConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty
    }
  }

  /**
   * The priority you want to assign to a source.
   *
   * You can have a primary stream and a backup stream or two equally prioritized streams.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * SourcePriorityProperty sourcePriorityProperty = SourcePriorityProperty.builder()
   * .primarySource("primarySource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcepriority.html)
   */
  public interface SourcePriorityProperty {
    /**
     * The name of the source you choose as the primary source for this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcepriority.html#cfn-mediaconnect-flow-sourcepriority-primarysource)
     */
    public fun primarySource(): String

    /**
     * A builder for [SourcePriorityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param primarySource The name of the source you choose as the primary source for this flow.
       * 
       */
      public fun primarySource(primarySource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.builder()

      /**
       * @param primarySource The name of the source you choose as the primary source for this flow.
       * 
       */
      override fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty,
    ) : CdkObject(cdkObject),
        SourcePriorityProperty {
      /**
       * The name of the source you choose as the primary source for this flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcepriority.html#cfn-mediaconnect-flow-sourcepriority-primarysource)
       */
      override fun primarySource(): String = unwrap(this).getPrimarySource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourcePriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty):
          SourcePriorityProperty = CdkObjectWrappers.wrap(cdkObject) as? SourcePriorityProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty
    }
  }

  /**
   * The details of the sources of the flow.
   *
   * If you are creating a flow with a VPC source, you must first create the flow with a temporary
   * standard source by doing the following:
   *
   * * Use CloudFormation to create a flow with a standard source that uses the flow’s public IP
   * address.
   * * Use CloudFormation to create the VPC interface to add to this flow. This can also be done as
   * part of the previous step.
   * * After CloudFormation has created the flow and the VPC interface, update the source to point
   * to the VPC interface that you created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html)
   */
  public interface SourceProperty {
    /**
     * The type of encryption that is used on the content ingested from this source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-decryption)
     */
    public fun decryption(): Any? = unwrap(this).getDecryption()

    /**
     * A description for the source.
     *
     * This value is not used or seen outside of the current MediaConnect account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another
     * AWS account.
     *
     * The entitlement is set by the content originator and the ARN is generated as part of the
     * originator's flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-entitlementarn)
     */
    public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    /**
     * The source configuration for cloud flows receiving a stream from a bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-gatewaybridgesource)
     */
    public fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

    /**
     * The IP address that the flow will be listening on for incoming content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestip)
     */
    public fun ingestIp(): String? = unwrap(this).getIngestIp()

    /**
     * The port that the flow will be listening on for incoming content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestport)
     */
    public fun ingestPort(): Number? = unwrap(this).getIngestPort()

    /**
     * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxbitrate)
     */
    public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    /**
     * The maximum latency in milliseconds for a RIST or Zixi-based source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxlatency)
     */
    public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    /**
     * The size of the buffer (in milliseconds) to use to sync incoming source data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxsyncbuffer)
     */
    public fun maxSyncBuffer(): Number? = unwrap(this).getMaxSyncBuffer()

    /**
     * The media streams that are associated with the source, and the parameters for those
     * associations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-mediastreamsourceconfigurations)
     */
    public fun mediaStreamSourceConfigurations(): Any? =
        unwrap(this).getMediaStreamSourceConfigurations()

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-minlatency)
     */
    public fun minLatency(): Number? = unwrap(this).getMinLatency()

    /**
     * The name of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The protocol that is used by the source.
     *
     * AWS CloudFormation does not currently support CDI or ST 2110 JPEG XS source protocols.
     *
     *
     * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
     * maintained for legacy purposes only.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The port that the flow uses to send outbound requests to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sendercontrolport)
     */
    public fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

    /**
     * The IP address that the flow communicates with to initiate connection with the sender.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-senderipaddress)
     */
    public fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

    /**
     * The ARN of the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcearn)
     */
    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourceingestport)
     */
    public fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

    /**
     * Source IP or domain name for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcelisteneraddress)
     */
    public fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

    /**
     * Source port for SRT-caller protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcelistenerport)
     */
    public fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

    /**
     * The stream ID that you want to use for the transport.
     *
     * This parameter applies only to Zixi-based streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-streamid)
     */
    public fun streamId(): String? = unwrap(this).getStreamId()

    /**
     * The name of the VPC interface that is used for this source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-vpcinterfacename)
     */
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * The range of IP addresses that should be allowed to contribute content to your source.
     *
     * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
     * for example, 10.0.0.0/16.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-whitelistcidr)
     */
    public fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      public fun decryption(decryption: IResolvable)

      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      public fun decryption(decryption: EncryptionProperty)

      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit)

      /**
       * @param description A description for the source.
       * This value is not used or seen outside of the current MediaConnect account.
       */
      public fun description(description: String)

      /**
       * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content
       * that comes from another AWS account.
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator's flow.
       */
      public fun entitlementArn(entitlementArn: String)

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      public fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty)

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      public
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit)

      /**
       * @param ingestIp The IP address that the flow will be listening on for incoming content.
       */
      public fun ingestIp(ingestIp: String)

      /**
       * @param ingestPort The port that the flow will be listening on for incoming content.
       */
      public fun ingestPort(ingestPort: Number)

      /**
       * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
       */
      public fun maxBitrate(maxBitrate: Number)

      /**
       * @param maxLatency The maximum latency in milliseconds for a RIST or Zixi-based source.
       */
      public fun maxLatency(maxLatency: Number)

      /**
       * @param maxSyncBuffer The size of the buffer (in milliseconds) to use to sync incoming
       * source data.
       */
      public fun maxSyncBuffer(maxSyncBuffer: Number)

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      public fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: IResolvable)

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      public fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: List<Any>)

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      public fun mediaStreamSourceConfigurations(vararg mediaStreamSourceConfigurations: Any)

      /**
       * @param minLatency The minimum latency in milliseconds for SRT-based streams.
       * In streams that use the SRT protocol, this value that you set on your MediaConnect source
       * or output represents the minimal potential latency of that connection. The latency of the
       * stream is set to the highest number between the sender’s minimum latency and the receiver’s
       * minimum latency.
       */
      public fun minLatency(minLatency: Number)

      /**
       * @param name The name of the source.
       */
      public fun name(name: String)

      /**
       * @param protocol The protocol that is used by the source.
       * AWS CloudFormation does not currently support CDI or ST 2110 JPEG XS source protocols.
       *
       *
       * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
       * maintained for legacy purposes only.
       */
      public fun protocol(protocol: String)

      /**
       * @param senderControlPort The port that the flow uses to send outbound requests to initiate
       * connection with the sender.
       */
      public fun senderControlPort(senderControlPort: Number)

      /**
       * @param senderIpAddress The IP address that the flow communicates with to initiate
       * connection with the sender.
       */
      public fun senderIpAddress(senderIpAddress: String)

      /**
       * @param sourceArn The ARN of the source.
       */
      public fun sourceArn(sourceArn: String)

      /**
       * @param sourceIngestPort The port that the flow listens on for incoming content.
       * If the protocol of the source is Zixi, the port must be set to 2088.
       */
      public fun sourceIngestPort(sourceIngestPort: String)

      /**
       * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
       */
      public fun sourceListenerAddress(sourceListenerAddress: String)

      /**
       * @param sourceListenerPort Source port for SRT-caller protocol.
       */
      public fun sourceListenerPort(sourceListenerPort: Number)

      /**
       * @param streamId The stream ID that you want to use for the transport.
       * This parameter applies only to Zixi-based streams.
       */
      public fun streamId(streamId: String)

      /**
       * @param vpcInterfaceName The name of the VPC interface that is used for this source.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)

      /**
       * @param whitelistCidr The range of IP addresses that should be allowed to contribute content
       * to your source.
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       */
      public fun whitelistCidr(whitelistCidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.builder()

      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      override fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      override fun decryption(decryption: EncryptionProperty) {
        cdkBuilder.decryption(decryption.let(EncryptionProperty.Companion::unwrap))
      }

      /**
       * @param decryption The type of encryption that is used on the content ingested from this
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
          decryption(EncryptionProperty(decryption))

      /**
       * @param description A description for the source.
       * This value is not used or seen outside of the current MediaConnect account.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content
       * that comes from another AWS account.
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator's flow.
       */
      override fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
      }

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty.Companion::unwrap))
      }

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      override
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit):
          Unit = gatewayBridgeSource(GatewayBridgeSourceProperty(gatewayBridgeSource))

      /**
       * @param ingestIp The IP address that the flow will be listening on for incoming content.
       */
      override fun ingestIp(ingestIp: String) {
        cdkBuilder.ingestIp(ingestIp)
      }

      /**
       * @param ingestPort The port that the flow will be listening on for incoming content.
       */
      override fun ingestPort(ingestPort: Number) {
        cdkBuilder.ingestPort(ingestPort)
      }

      /**
       * @param maxBitrate The maximum bitrate for RIST, RTP, and RTP-FEC streams.
       */
      override fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
      }

      /**
       * @param maxLatency The maximum latency in milliseconds for a RIST or Zixi-based source.
       */
      override fun maxLatency(maxLatency: Number) {
        cdkBuilder.maxLatency(maxLatency)
      }

      /**
       * @param maxSyncBuffer The size of the buffer (in milliseconds) to use to sync incoming
       * source data.
       */
      override fun maxSyncBuffer(maxSyncBuffer: Number) {
        cdkBuilder.maxSyncBuffer(maxSyncBuffer)
      }

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      override fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: IResolvable) {
        cdkBuilder.mediaStreamSourceConfigurations(mediaStreamSourceConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      override fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: List<Any>) {
        cdkBuilder.mediaStreamSourceConfigurations(mediaStreamSourceConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mediaStreamSourceConfigurations The media streams that are associated with the
       * source, and the parameters for those associations.
       */
      override fun mediaStreamSourceConfigurations(vararg mediaStreamSourceConfigurations: Any):
          Unit = mediaStreamSourceConfigurations(mediaStreamSourceConfigurations.toList())

      /**
       * @param minLatency The minimum latency in milliseconds for SRT-based streams.
       * In streams that use the SRT protocol, this value that you set on your MediaConnect source
       * or output represents the minimal potential latency of that connection. The latency of the
       * stream is set to the highest number between the sender’s minimum latency and the receiver’s
       * minimum latency.
       */
      override fun minLatency(minLatency: Number) {
        cdkBuilder.minLatency(minLatency)
      }

      /**
       * @param name The name of the source.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param protocol The protocol that is used by the source.
       * AWS CloudFormation does not currently support CDI or ST 2110 JPEG XS source protocols.
       *
       *
       * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
       * maintained for legacy purposes only.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param senderControlPort The port that the flow uses to send outbound requests to initiate
       * connection with the sender.
       */
      override fun senderControlPort(senderControlPort: Number) {
        cdkBuilder.senderControlPort(senderControlPort)
      }

      /**
       * @param senderIpAddress The IP address that the flow communicates with to initiate
       * connection with the sender.
       */
      override fun senderIpAddress(senderIpAddress: String) {
        cdkBuilder.senderIpAddress(senderIpAddress)
      }

      /**
       * @param sourceArn The ARN of the source.
       */
      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      /**
       * @param sourceIngestPort The port that the flow listens on for incoming content.
       * If the protocol of the source is Zixi, the port must be set to 2088.
       */
      override fun sourceIngestPort(sourceIngestPort: String) {
        cdkBuilder.sourceIngestPort(sourceIngestPort)
      }

      /**
       * @param sourceListenerAddress Source IP or domain name for SRT-caller protocol.
       */
      override fun sourceListenerAddress(sourceListenerAddress: String) {
        cdkBuilder.sourceListenerAddress(sourceListenerAddress)
      }

      /**
       * @param sourceListenerPort Source port for SRT-caller protocol.
       */
      override fun sourceListenerPort(sourceListenerPort: Number) {
        cdkBuilder.sourceListenerPort(sourceListenerPort)
      }

      /**
       * @param streamId The stream ID that you want to use for the transport.
       * This parameter applies only to Zixi-based streams.
       */
      override fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
      }

      /**
       * @param vpcInterfaceName The name of the VPC interface that is used for this source.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      /**
       * @param whitelistCidr The range of IP addresses that should be allowed to contribute content
       * to your source.
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       */
      override fun whitelistCidr(whitelistCidr: String) {
        cdkBuilder.whitelistCidr(whitelistCidr)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    ) : CdkObject(cdkObject),
        SourceProperty {
      /**
       * The type of encryption that is used on the content ingested from this source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-decryption)
       */
      override fun decryption(): Any? = unwrap(this).getDecryption()

      /**
       * A description for the source.
       *
       * This value is not used or seen outside of the current MediaConnect account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The ARN of the entitlement that allows you to subscribe to content that comes from another
       * AWS account.
       *
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator's flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-entitlementarn)
       */
      override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

      /**
       * The source configuration for cloud flows receiving a stream from a bridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-gatewaybridgesource)
       */
      override fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

      /**
       * The IP address that the flow will be listening on for incoming content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestip)
       */
      override fun ingestIp(): String? = unwrap(this).getIngestIp()

      /**
       * The port that the flow will be listening on for incoming content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestport)
       */
      override fun ingestPort(): Number? = unwrap(this).getIngestPort()

      /**
       * The maximum bitrate for RIST, RTP, and RTP-FEC streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxbitrate)
       */
      override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      /**
       * The maximum latency in milliseconds for a RIST or Zixi-based source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxlatency)
       */
      override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

      /**
       * The size of the buffer (in milliseconds) to use to sync incoming source data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxsyncbuffer)
       */
      override fun maxSyncBuffer(): Number? = unwrap(this).getMaxSyncBuffer()

      /**
       * The media streams that are associated with the source, and the parameters for those
       * associations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-mediastreamsourceconfigurations)
       */
      override fun mediaStreamSourceConfigurations(): Any? =
          unwrap(this).getMediaStreamSourceConfigurations()

      /**
       * The minimum latency in milliseconds for SRT-based streams.
       *
       * In streams that use the SRT protocol, this value that you set on your MediaConnect source
       * or output represents the minimal potential latency of that connection. The latency of the
       * stream is set to the highest number between the sender’s minimum latency and the receiver’s
       * minimum latency.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-minlatency)
       */
      override fun minLatency(): Number? = unwrap(this).getMinLatency()

      /**
       * The name of the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The protocol that is used by the source.
       *
       * AWS CloudFormation does not currently support CDI or ST 2110 JPEG XS source protocols.
       *
       *
       * AWS Elemental MediaConnect no longer supports the Fujitsu QoS protocol. This reference is
       * maintained for legacy purposes only.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The port that the flow uses to send outbound requests to initiate connection with the
       * sender.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sendercontrolport)
       */
      override fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

      /**
       * The IP address that the flow communicates with to initiate connection with the sender.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-senderipaddress)
       */
      override fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

      /**
       * The ARN of the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcearn)
       */
      override fun sourceArn(): String? = unwrap(this).getSourceArn()

      /**
       * The port that the flow listens on for incoming content.
       *
       * If the protocol of the source is Zixi, the port must be set to 2088.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourceingestport)
       */
      override fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

      /**
       * Source IP or domain name for SRT-caller protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcelisteneraddress)
       */
      override fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

      /**
       * Source port for SRT-caller protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-sourcelistenerport)
       */
      override fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

      /**
       * The stream ID that you want to use for the transport.
       *
       * This parameter applies only to Zixi-based streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-streamid)
       */
      override fun streamId(): String? = unwrap(this).getStreamId()

      /**
       * The name of the VPC interface that is used for this source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

      /**
       * The range of IP addresses that should be allowed to contribute content to your source.
       *
       * These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block;
       * for example, 10.0.0.0/16.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-whitelistcidr)
       */
      override fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty
    }
  }

  /**
   * Specifies the configuration for video stream metrics monitoring.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * VideoMonitoringSettingProperty videoMonitoringSettingProperty =
   * VideoMonitoringSettingProperty.builder()
   * .blackFrames(BlackFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .frozenFrames(FrozenFramesProperty.builder()
   * .state("state")
   * .thresholdSeconds(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-videomonitoringsetting.html)
   */
  public interface VideoMonitoringSettingProperty {
    /**
     * Detects video frames that are black.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-videomonitoringsetting.html#cfn-mediaconnect-flow-videomonitoringsetting-blackframes)
     */
    public fun blackFrames(): Any? = unwrap(this).getBlackFrames()

    /**
     * Detects video frames that have not changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-videomonitoringsetting.html#cfn-mediaconnect-flow-videomonitoringsetting-frozenframes)
     */
    public fun frozenFrames(): Any? = unwrap(this).getFrozenFrames()

    /**
     * A builder for [VideoMonitoringSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blackFrames Detects video frames that are black.
       */
      public fun blackFrames(blackFrames: IResolvable)

      /**
       * @param blackFrames Detects video frames that are black.
       */
      public fun blackFrames(blackFrames: BlackFramesProperty)

      /**
       * @param blackFrames Detects video frames that are black.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94ce03b6edc1199f96f2105e481261d9a9cfc7a7ac436c0b86c0d47f7a617c48")
      public fun blackFrames(blackFrames: BlackFramesProperty.Builder.() -> Unit)

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      public fun frozenFrames(frozenFrames: IResolvable)

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      public fun frozenFrames(frozenFrames: FrozenFramesProperty)

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75037f15f4fbaef8528479a936e575b8b81ad354cc75d894ab95499bb2959e12")
      public fun frozenFrames(frozenFrames: FrozenFramesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty.builder()

      /**
       * @param blackFrames Detects video frames that are black.
       */
      override fun blackFrames(blackFrames: IResolvable) {
        cdkBuilder.blackFrames(blackFrames.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blackFrames Detects video frames that are black.
       */
      override fun blackFrames(blackFrames: BlackFramesProperty) {
        cdkBuilder.blackFrames(blackFrames.let(BlackFramesProperty.Companion::unwrap))
      }

      /**
       * @param blackFrames Detects video frames that are black.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94ce03b6edc1199f96f2105e481261d9a9cfc7a7ac436c0b86c0d47f7a617c48")
      override fun blackFrames(blackFrames: BlackFramesProperty.Builder.() -> Unit): Unit =
          blackFrames(BlackFramesProperty(blackFrames))

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      override fun frozenFrames(frozenFrames: IResolvable) {
        cdkBuilder.frozenFrames(frozenFrames.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      override fun frozenFrames(frozenFrames: FrozenFramesProperty) {
        cdkBuilder.frozenFrames(frozenFrames.let(FrozenFramesProperty.Companion::unwrap))
      }

      /**
       * @param frozenFrames Detects video frames that have not changed.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75037f15f4fbaef8528479a936e575b8b81ad354cc75d894ab95499bb2959e12")
      override fun frozenFrames(frozenFrames: FrozenFramesProperty.Builder.() -> Unit): Unit =
          frozenFrames(FrozenFramesProperty(frozenFrames))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty,
    ) : CdkObject(cdkObject),
        VideoMonitoringSettingProperty {
      /**
       * Detects video frames that are black.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-videomonitoringsetting.html#cfn-mediaconnect-flow-videomonitoringsetting-blackframes)
       */
      override fun blackFrames(): Any? = unwrap(this).getBlackFrames()

      /**
       * Detects video frames that have not changed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-videomonitoringsetting.html#cfn-mediaconnect-flow-videomonitoringsetting-frozenframes)
       */
      override fun frozenFrames(): Any? = unwrap(this).getFrozenFrames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VideoMonitoringSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty):
          VideoMonitoringSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoMonitoringSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoMonitoringSettingProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VideoMonitoringSettingProperty
    }
  }

  /**
   * The settings for attaching a VPC interface to an resource.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html)
   */
  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface to use for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html#cfn-mediaconnect-flow-vpcinterfaceattachment-vpcinterfacename)
     */
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * A builder for [VpcInterfaceAttachmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param vpcInterfaceName The name of the VPC interface to use for this resource.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface to use for this resource.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject),
        VpcInterfaceAttachmentProperty {
      /**
       * The name of the VPC interface to use for this resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html#cfn-mediaconnect-flow-vpcinterfaceattachment-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VpcInterfaceAttachmentProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty
    }
  }

  /**
   * The details of a VPC interface.
   *
   *
   * When configuring VPC interfaces for NDI outputs, keep in mind the following:
   *
   * * VPC interfaces must be defined as nested attributes within the `AWS::MediaConnect::Flow`
   * resource, and not within the top-level `AWS::MediaConnect::FlowVpcInterface` resource.
   * * There's a maximum limit of three VPC interfaces for each flow. If you've already reached this
   * limit, you can't update the flow to use a different VPC interface without first removing an
   * existing one.
   *
   * To update your VPC interfaces in this scenario, you must first remove the VPC interface that’s
   * not being used. Next, add the new VPC interfaces. Lastly, update the `VpcInterfaceAdapter` in the
   * `NDIConfig` property. These changes must be performed as separate manual operations and cannot be
   * done through a single template update.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * VpcInterfaceProperty vpcInterfaceProperty = VpcInterfaceProperty.builder()
   * .name("name")
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetId("subnetId")
   * // the properties below are optional
   * .networkInterfaceIds(List.of("networkInterfaceIds"))
   * .networkInterfaceType("networkInterfaceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html)
   */
  public interface VpcInterfaceProperty {
    /**
     * Immutable and has to be a unique against other VpcInterfaces in this Flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-name)
     */
    public fun name(): String

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-networkinterfaceids)
     */
    public fun networkInterfaceIds(): List<String> = unwrap(this).getNetworkInterfaceIds() ?:
        emptyList()

    /**
     * The type of network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-networkinterfacetype)
     */
    public fun networkInterfaceType(): String? = unwrap(this).getNetworkInterfaceType()

    /**
     * A role Arn MediaConnect can assume to create ENIs in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-rolearn)
     */
    public fun roleArn(): String

    /**
     * Security Group IDs to be used on ENI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * Subnet must be in the AZ of the Flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-subnetid)
     */
    public fun subnetId(): String

    /**
     * A builder for [VpcInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Immutable and has to be a unique against other VpcInterfaces in this Flow. 
       */
      public fun name(name: String)

      /**
       * @param networkInterfaceIds IDs of the network interfaces created in customer's account by
       * MediaConnect .
       */
      public fun networkInterfaceIds(networkInterfaceIds: List<String>)

      /**
       * @param networkInterfaceIds IDs of the network interfaces created in customer's account by
       * MediaConnect .
       */
      public fun networkInterfaceIds(vararg networkInterfaceIds: String)

      /**
       * @param networkInterfaceType The type of network interface.
       */
      public fun networkInterfaceType(networkInterfaceType: String)

      /**
       * @param roleArn A role Arn MediaConnect can assume to create ENIs in your account. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param securityGroupIds Security Group IDs to be used on ENI. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds Security Group IDs to be used on ENI. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetId Subnet must be in the AZ of the Flow. 
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty.builder()

      /**
       * @param name Immutable and has to be a unique against other VpcInterfaces in this Flow. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param networkInterfaceIds IDs of the network interfaces created in customer's account by
       * MediaConnect .
       */
      override fun networkInterfaceIds(networkInterfaceIds: List<String>) {
        cdkBuilder.networkInterfaceIds(networkInterfaceIds)
      }

      /**
       * @param networkInterfaceIds IDs of the network interfaces created in customer's account by
       * MediaConnect .
       */
      override fun networkInterfaceIds(vararg networkInterfaceIds: String): Unit =
          networkInterfaceIds(networkInterfaceIds.toList())

      /**
       * @param networkInterfaceType The type of network interface.
       */
      override fun networkInterfaceType(networkInterfaceType: String) {
        cdkBuilder.networkInterfaceType(networkInterfaceType)
      }

      /**
       * @param roleArn A role Arn MediaConnect can assume to create ENIs in your account. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param securityGroupIds Security Group IDs to be used on ENI. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds Security Group IDs to be used on ENI. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetId Subnet must be in the AZ of the Flow. 
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty,
    ) : CdkObject(cdkObject),
        VpcInterfaceProperty {
      /**
       * Immutable and has to be a unique against other VpcInterfaces in this Flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * IDs of the network interfaces created in customer's account by MediaConnect .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-networkinterfaceids)
       */
      override fun networkInterfaceIds(): List<String> = unwrap(this).getNetworkInterfaceIds() ?:
          emptyList()

      /**
       * The type of network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-networkinterfacetype)
       */
      override fun networkInterfaceType(): String? = unwrap(this).getNetworkInterfaceType()

      /**
       * A role Arn MediaConnect can assume to create ENIs in your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * Security Group IDs to be used on ENI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * Subnet must be in the AZ of the Flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-subnetid)
       */
      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty):
          VpcInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcInterfaceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty
    }
  }
}
