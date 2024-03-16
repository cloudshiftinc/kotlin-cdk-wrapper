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
public open class CfnFlow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow,
) : CfnResource(cdkObject), IInspectable {
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

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
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings for the source that you want to use for the new flow.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6ceeb1eb4eed29a4ba3a766c50ca14ac56f766293c5979c53dffa685b655f0c")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

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
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    /**
     * The settings for the source that you want to use for the new flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
     * @param source The settings for the source that you want to use for the new flow. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
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
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    /**
     * The settings for source failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
     * @param sourceFailoverConfig The settings for source failover. 
     */
    override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty::unwrap))
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
        wrapped.cdkObject
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
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty,
    ) : CdkObject(cdkObject), SourcePriorityProperty {
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
          SourcePriorityProperty = CdkObjectWrappers.wrap(cdkObject) as SourcePriorityProperty

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty
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
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty,
    ) : CdkObject(cdkObject), FailoverConfigProperty {
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
          FailoverConfigProperty = CdkObjectWrappers.wrap(cdkObject) as FailoverConfigProperty

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty
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
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty,
    ) : CdkObject(cdkObject), EncryptionProperty {
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
          EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as EncryptionProperty

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty
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
     * Default: - 2000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxlatency)
     */
    public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    /**
     * The minimum latency in milliseconds for SRT-based streams.
     *
     * In streams that use the SRT protocol, this value that you set on your MediaConnect source or
     * output represents the minimal potential latency of that connection. The latency of the stream is
     * set to the highest number between the sender’s minimum latency and the receiver’s minimum
     * latency.
     *
     * Default: - 2000
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
        cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
      }

      /**
       * @param decryption The type of encryption that is used on the content ingested from the
       * source.
       */
      override fun decryption(decryption: EncryptionProperty) {
        cdkBuilder.decryption(decryption.let(EncryptionProperty::unwrap))
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
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
      }

      /**
       * @param gatewayBridgeSource The source configuration for cloud flows receiving a stream from
       * a bridge.
       */
      override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty::unwrap))
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
      override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
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
       * Default: - 2000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flow-source.html#cfn-mediaconnect-flow-source-maxlatency)
       */
      override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

      /**
       * The minimum latency in milliseconds for SRT-based streams.
       *
       * In streams that use the SRT protocol, this value that you set on your MediaConnect source
       * or output represents the minimal potential latency of that connection. The latency of the
       * stream is set to the highest number between the sender’s minimum latency and the receiver’s
       * minimum latency.
       *
       * Default: - 2000
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
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as SourceProperty

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty
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
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      /**
       * @param vpcInterfaceAttachment The name of the VPC interface attachment to use for this
       * bridge source.
       */
      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
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
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty,
    ) : CdkObject(cdkObject), GatewayBridgeSourceProperty {
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
          GatewayBridgeSourceProperty = CdkObjectWrappers.wrap(cdkObject) as
          GatewayBridgeSourceProperty

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty
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
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
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
          VpcInterfaceAttachmentProperty = CdkObjectWrappers.wrap(cdkObject) as
          VpcInterfaceAttachmentProperty

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty
    }
  }
}
