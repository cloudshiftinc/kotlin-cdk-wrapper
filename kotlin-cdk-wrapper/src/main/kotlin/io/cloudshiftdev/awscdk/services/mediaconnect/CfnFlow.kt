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
 * The AWS::MediaConnect::Flow resource defines a connection between one or more video sources and
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
   * The outgoing IP address that MediaConnect uses to send video from the flow.
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
   * The media streams associated with the flow.
   */
  public open fun mediaStreams(): Any? = unwrap(this).getMediaStreams()

  /**
   * The media streams associated with the flow.
   */
  public open fun mediaStreams(`value`: IResolvable) {
    unwrap(this).setMediaStreams(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The media streams associated with the flow.
   */
  public open fun mediaStreams(`value`: List<Any>) {
    unwrap(this).setMediaStreams(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The media streams associated with the flow.
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
   * The VPC interfaces that you added to this flow.
   */
  public open fun vpcInterfaces(): Any? = unwrap(this).getVpcInterfaces()

  /**
   * The VPC interfaces that you added to this flow.
   */
  public open fun vpcInterfaces(`value`: IResolvable) {
    unwrap(this).setVpcInterfaces(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The VPC interfaces that you added to this flow.
   */
  public open fun vpcInterfaces(`value`: List<Any>) {
    unwrap(this).setVpcInterfaces(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The VPC interfaces that you added to this flow.
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
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
     */
    public fun mediaStreams(mediaStreams: IResolvable)

    /**
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
     */
    public fun mediaStreams(mediaStreams: List<Any>)

    /**
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
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
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
     */
    public fun vpcInterfaces(vpcInterfaces: IResolvable)

    /**
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
     */
    public fun vpcInterfaces(vpcInterfaces: List<Any>)

    /**
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
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
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
     */
    override fun mediaStreams(mediaStreams: IResolvable) {
      cdkBuilder.mediaStreams(mediaStreams.let(IResolvable.Companion::unwrap))
    }

    /**
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
     */
    override fun mediaStreams(mediaStreams: List<Any>) {
      cdkBuilder.mediaStreams(mediaStreams.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The media streams associated with the flow.
     *
     * You can associate any of these media streams with sources and outputs on the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-mediastreams)
     * @param mediaStreams The media streams associated with the flow. 
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
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
     */
    override fun vpcInterfaces(vpcInterfaces: IResolvable) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.let(IResolvable.Companion::unwrap))
    }

    /**
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
     */
    override fun vpcInterfaces(vpcInterfaces: List<Any>) {
      cdkBuilder.vpcInterfaces(vpcInterfaces.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The VPC interfaces that you added to this flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-vpcinterfaces)
     * @param vpcInterfaces The VPC interfaces that you added to this flow. 
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
     * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
     * MediaConnect as a trusted entity).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
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
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
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
       * @param roleArn The Amazon Resource Name (ARN) of the role that you created during setup
       * (when you set up MediaConnect as a trusted entity). 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the secret that you created in AWS Secrets Manager to store the
       * encryption key.
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
       * The Amazon Resource Name (ARN) of the role that you created during setup (when you set up
       * MediaConnect as a trusted entity).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-encryption.html#cfn-mediaconnect-flow-encryption-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key.
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
     * The size of the buffer (delay) that the service maintains.
     *
     * A larger buffer means a longer delay in transmitting the stream, but more room for error
     * correction. A smaller buffer means a shorter delay, but less room for error correction. You can
     * choose a value from 100-500 ms. If you keep this field blank, the service uses the default value
     * of 200 ms. This setting only applies when Failover Mode is set to MERGE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-recoverywindow)
     */
    public fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

    /**
     * The priority you want to assign to a source.
     *
     * You can have a primary stream and a backup stream or two equally prioritized streams. This
     * setting only applies when Failover Mode is set to FAILOVER.
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
       * @param recoveryWindow The size of the buffer (delay) that the service maintains.
       * A larger buffer means a longer delay in transmitting the stream, but more room for error
       * correction. A smaller buffer means a shorter delay, but less room for error correction. You
       * can choose a value from 100-500 ms. If you keep this field blank, the service uses the default
       * value of 200 ms. This setting only applies when Failover Mode is set to MERGE.
       */
      public fun recoveryWindow(recoveryWindow: Number)

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
       * @param recoveryWindow The size of the buffer (delay) that the service maintains.
       * A larger buffer means a longer delay in transmitting the stream, but more room for error
       * correction. A smaller buffer means a shorter delay, but less room for error correction. You
       * can choose a value from 100-500 ms. If you keep this field blank, the service uses the default
       * value of 200 ms. This setting only applies when Failover Mode is set to MERGE.
       */
      override fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
       */
      override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty.Companion::unwrap))
      }

      /**
       * @param sourcePriority The priority you want to assign to a source.
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
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
       * The size of the buffer (delay) that the service maintains.
       *
       * A larger buffer means a longer delay in transmitting the stream, but more room for error
       * correction. A smaller buffer means a shorter delay, but less room for error correction. You
       * can choose a value from 100-500 ms. If you keep this field blank, the service uses the default
       * value of 200 ms. This setting only applies when Failover Mode is set to MERGE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-failoverconfig.html#cfn-mediaconnect-flow-failoverconfig-recoverywindow)
       */
      override fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

      /**
       * The priority you want to assign to a source.
       *
       * You can have a primary stream and a backup stream or two equally prioritized streams. This
       * setting only applies when Failover Mode is set to FAILOVER.
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
   * The transport parameters associated with an incoming media stream.
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
   * The VPC interface that you want to use for the media stream associated with the output.
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
     * The name of the VPC interface that you want to use for the media stream associated with the
     * output.
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
       * @param name The name of the VPC interface that you want to use for the media stream
       * associated with the output. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.InterfaceProperty.builder()

      /**
       * @param name The name of the VPC interface that you want to use for the media stream
       * associated with the output. 
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
       * The name of the VPC interface that you want to use for the media stream associated with the
       * output.
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
   * MediaConnect routinely performs maintenance on underlying systems for security, reliability,
   * and operational performance. The maintenance activities include actions such as patching the
   * operating system, updating drivers, or installing software and patches.
   *
   * You can select the day and time that maintenance events occur. This is called a maintenance
   * window and is used every time a maintenance event is required. To change the day and time, you can
   * edit the maintenance window using `MaintenanceDay` and `MaintenanceStartHour` .
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
     * A set of parameters that define the media stream.
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
       * @param fmtp A set of parameters that define the media stream.
       */
      public fun fmtp(fmtp: IResolvable)

      /**
       * @param fmtp A set of parameters that define the media stream.
       */
      public fun fmtp(fmtp: FmtpProperty)

      /**
       * @param fmtp A set of parameters that define the media stream.
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
       * @param fmtp A set of parameters that define the media stream.
       */
      override fun fmtp(fmtp: IResolvable) {
        cdkBuilder.fmtp(fmtp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fmtp A set of parameters that define the media stream.
       */
      override fun fmtp(fmtp: FmtpProperty) {
        cdkBuilder.fmtp(fmtp.let(FmtpProperty.Companion::unwrap))
      }

      /**
       * @param fmtp A set of parameters that define the media stream.
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
       * A set of parameters that define the media stream.
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
   * A single track or stream of media that contains video, audio, or ancillary data.
   *
   * After you add a media stream to a flow, you can associate it with sources and outputs on that
   * flow, as long as they use the CDI protocol or the ST 2110 JPEG XS protocol. Each source or output
   * can consist of one or many media streams.
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
     * This value in measured in kHz.
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
       * This value in measured in kHz.
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
       * This value in measured in kHz.
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
       * This value in measured in kHz.
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
     * For ancillary data streams, set the encoding name to `smpte291` .
     *
     * For audio streams, set the encoding name to `pcm` .
     *
     * For video, 2110 streams, set the encoding name to `raw` .
     *
     * For video, JPEG XS streams, set the encoding name to `jxsv` .
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
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video, 2110 streams, set the encoding name to `raw` .
       *
       * For video, JPEG XS streams, set the encoding name to `jxsv` .
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
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video, 2110 streams, set the encoding name to `raw` .
       *
       * For video, JPEG XS streams, set the encoding name to `jxsv` .
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
       * For ancillary data streams, set the encoding name to `smpte291` .
       *
       * For audio streams, set the encoding name to `pcm` .
       *
       * For video, 2110 streams, set the encoding name to `raw` .
       *
       * For video, JPEG XS streams, set the encoding name to `jxsv` .
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
   * The settings for source monitoring.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
   * SourceMonitoringConfigProperty sourceMonitoringConfigProperty =
   * SourceMonitoringConfigProperty.builder()
   * .thumbnailState("thumbnailState")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html)
   */
  public interface SourceMonitoringConfigProperty {
    /**
     * The state of thumbnail monitoring.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-thumbnailstate)
     */
    public fun thumbnailState(): String

    /**
     * A builder for [SourceMonitoringConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param thumbnailState The state of thumbnail monitoring. 
       */
      public fun thumbnailState(thumbnailState: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty.builder()

      /**
       * @param thumbnailState The state of thumbnail monitoring. 
       */
      override fun thumbnailState(thumbnailState: String) {
        cdkBuilder.thumbnailState(thumbnailState)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceMonitoringConfigProperty,
    ) : CdkObject(cdkObject),
        SourceMonitoringConfigProperty {
      /**
       * The state of thumbnail monitoring.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-sourcemonitoringconfig.html#cfn-mediaconnect-flow-sourcemonitoringconfig-thumbnailstate)
       */
      override fun thumbnailState(): String = unwrap(this).getThumbnailState()
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
   * You can have a primary stream and a backup stream or two equally prioritized streams. This
   * setting only applies when Failover Mode is set to FAILOVER.
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
     * The type of encryption that is used on the content ingested from the source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-decryption)
     */
    public fun decryption(): Any? = unwrap(this).getDecryption()

    /**
     * A description of the source.
     *
     * This description is not visible outside of the current AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another
     * AWS account.
     *
     * The entitlement is set by the content originator and the ARN is generated as part of the
     * originator’s flow.
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
     * The IP address that the flow listens on for incoming content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestip)
     */
    public fun ingestIp(): String? = unwrap(this).getIngestIp()

    /**
     * The port that the flow listens on for incoming content.
     *
     * If the protocol of the source is Zixi, the port must be set to 2088.
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
     * The media stream that is associated with the source, and the parameters for that association.
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
     * The name of the VPC interface that the source content comes from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-vpcinterfacename)
     */
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    /**
     * The range of IP addresses that are allowed to contribute content to your source.
     *
     * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16.
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
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      public fun decryption(decryption: IResolvable)

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      public fun decryption(decryption: EncryptionProperty)

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit)

      /**
       * @param description A description of the source.
       * This description is not visible outside of the current AWS account.
       */
      public fun description(description: String)

      /**
       * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content
       * that comes from another AWS account.
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator’s flow.
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
       * @param ingestIp The IP address that the flow listens on for incoming content.
       */
      public fun ingestIp(ingestIp: String)

      /**
       * @param ingestPort The port that the flow listens on for incoming content.
       * If the protocol of the source is Zixi, the port must be set to 2088.
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
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
       */
      public fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: IResolvable)

      /**
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
       */
      public fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: List<Any>)

      /**
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
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
       * @param vpcInterfaceName The name of the VPC interface that the source content comes from.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)

      /**
       * @param whitelistCidr The range of IP addresses that are allowed to contribute content to
       * your source.
       * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
       * 10.0.0.0/16.
       */
      public fun whitelistCidr(whitelistCidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.builder()

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      override fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      override fun decryption(decryption: EncryptionProperty) {
        cdkBuilder.decryption(decryption.let(EncryptionProperty.Companion::unwrap))
      }

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
          decryption(EncryptionProperty(decryption))

      /**
       * @param description A description of the source.
       * This description is not visible outside of the current AWS account.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param entitlementArn The ARN of the entitlement that allows you to subscribe to content
       * that comes from another AWS account.
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator’s flow.
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
       * @param ingestIp The IP address that the flow listens on for incoming content.
       */
      override fun ingestIp(ingestIp: String) {
        cdkBuilder.ingestIp(ingestIp)
      }

      /**
       * @param ingestPort The port that the flow listens on for incoming content.
       * If the protocol of the source is Zixi, the port must be set to 2088.
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
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
       */
      override fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: IResolvable) {
        cdkBuilder.mediaStreamSourceConfigurations(mediaStreamSourceConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
       */
      override fun mediaStreamSourceConfigurations(mediaStreamSourceConfigurations: List<Any>) {
        cdkBuilder.mediaStreamSourceConfigurations(mediaStreamSourceConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param mediaStreamSourceConfigurations The media stream that is associated with the source,
       * and the parameters for that association.
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
       * @param vpcInterfaceName The name of the VPC interface that the source content comes from.
       */
      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      /**
       * @param whitelistCidr The range of IP addresses that are allowed to contribute content to
       * your source.
       * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
       * 10.0.0.0/16.
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
       * The type of encryption that is used on the content ingested from the source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-decryption)
       */
      override fun decryption(): Any? = unwrap(this).getDecryption()

      /**
       * A description of the source.
       *
       * This description is not visible outside of the current AWS account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The ARN of the entitlement that allows you to subscribe to content that comes from another
       * AWS account.
       *
       * The entitlement is set by the content originator and the ARN is generated as part of the
       * originator’s flow.
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
       * The IP address that the flow listens on for incoming content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-ingestip)
       */
      override fun ingestIp(): String? = unwrap(this).getIngestIp()

      /**
       * The port that the flow listens on for incoming content.
       *
       * If the protocol of the source is Zixi, the port must be set to 2088.
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
       * The media stream that is associated with the source, and the parameters for that
       * association.
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
       * The name of the VPC interface that the source content comes from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-vpcinterfacename)
       */
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

      /**
       * The range of IP addresses that are allowed to contribute content to your source.
       *
       * Format the IP addresses as a Classless Inter-Domain Routing (CIDR) block; for example,
       * 10.0.0.0/16.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterfaceattachment.html)
   */
  public interface VpcInterfaceAttachmentProperty {
    /**
     * The name of the VPC interface that you want to send your output to.
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
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
       */
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.builder()

      /**
       * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
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
       * The name of the VPC interface that you want to send your output to.
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
     * The name for the VPC interface.
     *
     * This name must be unique within the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-name)
     */
    public fun name(): String

    /**
     * The IDs of the network interfaces that MediaConnect created in your account.
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
     * The ARN of the IAM role that you created when you set up MediaConnect as a trusted service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-rolearn)
     */
    public fun roleArn(): String

    /**
     * A virtual firewall to control inbound and outbound traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The subnet IDs that you specified for your VPC interface.
     *
     * A subnet ID is a range of IP addresses in your VPC. When you create your VPC, you specify a
     * range of IPv4 addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR)
     * block; for example, 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a
     * subnet for your VPC, you specify the CIDR block for the subnet, which is a subset of the VPC
     * CIDR block.
     *
     * The subnets that you use across all VPC interfaces on the flow must be in the same
     * Availability Zone as the flow.
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
       * @param name The name for the VPC interface. 
       * This name must be unique within the flow.
       */
      public fun name(name: String)

      /**
       * @param networkInterfaceIds The IDs of the network interfaces that MediaConnect created in
       * your account.
       */
      public fun networkInterfaceIds(networkInterfaceIds: List<String>)

      /**
       * @param networkInterfaceIds The IDs of the network interfaces that MediaConnect created in
       * your account.
       */
      public fun networkInterfaceIds(vararg networkInterfaceIds: String)

      /**
       * @param networkInterfaceType The type of network interface.
       */
      public fun networkInterfaceType(networkInterfaceType: String)

      /**
       * @param roleArn The ARN of the IAM role that you created when you set up MediaConnect as a
       * trusted service. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param securityGroupIds A virtual firewall to control inbound and outbound traffic. 
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A virtual firewall to control inbound and outbound traffic. 
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetId The subnet IDs that you specified for your VPC interface. 
       * A subnet ID is a range of IP addresses in your VPC. When you create your VPC, you specify a
       * range of IPv4 addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR)
       * block; for example, 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create
       * a subnet for your VPC, you specify the CIDR block for the subnet, which is a subset of the VPC
       * CIDR block.
       *
       * The subnets that you use across all VPC interfaces on the flow must be in the same
       * Availability Zone as the flow.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceProperty.builder()

      /**
       * @param name The name for the VPC interface. 
       * This name must be unique within the flow.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param networkInterfaceIds The IDs of the network interfaces that MediaConnect created in
       * your account.
       */
      override fun networkInterfaceIds(networkInterfaceIds: List<String>) {
        cdkBuilder.networkInterfaceIds(networkInterfaceIds)
      }

      /**
       * @param networkInterfaceIds The IDs of the network interfaces that MediaConnect created in
       * your account.
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
       * @param roleArn The ARN of the IAM role that you created when you set up MediaConnect as a
       * trusted service. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param securityGroupIds A virtual firewall to control inbound and outbound traffic. 
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A virtual firewall to control inbound and outbound traffic. 
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetId The subnet IDs that you specified for your VPC interface. 
       * A subnet ID is a range of IP addresses in your VPC. When you create your VPC, you specify a
       * range of IPv4 addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR)
       * block; for example, 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create
       * a subnet for your VPC, you specify the CIDR block for the subnet, which is a subset of the VPC
       * CIDR block.
       *
       * The subnets that you use across all VPC interfaces on the flow must be in the same
       * Availability Zone as the flow.
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
       * The name for the VPC interface.
       *
       * This name must be unique within the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The IDs of the network interfaces that MediaConnect created in your account.
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
       * The ARN of the IAM role that you created when you set up MediaConnect as a trusted service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * A virtual firewall to control inbound and outbound traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-vpcinterface.html#cfn-mediaconnect-flow-vpcinterface-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The subnet IDs that you specified for your VPC interface.
       *
       * A subnet ID is a range of IP addresses in your VPC. When you create your VPC, you specify a
       * range of IPv4 addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR)
       * block; for example, 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create
       * a subnet for your VPC, you specify the CIDR block for the subnet, which is a subset of the VPC
       * CIDR block.
       *
       * The subnets that you use across all VPC interfaces on the flow must be in the same
       * Availability Zone as the flow.
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
