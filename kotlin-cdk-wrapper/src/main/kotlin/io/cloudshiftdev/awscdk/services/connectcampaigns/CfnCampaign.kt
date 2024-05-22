@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connectcampaigns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains information about an outbound campaign.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
 * CfnCampaign cfnCampaign = CfnCampaign.Builder.create(this, "MyCfnCampaign")
 * .connectInstanceArn("connectInstanceArn")
 * .dialerConfig(DialerConfigProperty.builder()
 * .agentlessDialerConfig(AgentlessDialerConfigProperty.builder()
 * .dialingCapacity(123)
 * .build())
 * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * // the properties below are optional
 * .dialingCapacity(123)
 * .build())
 * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
 * .bandwidthAllocation(123)
 * // the properties below are optional
 * .dialingCapacity(123)
 * .build())
 * .build())
 * .name("name")
 * .outboundCallConfig(OutboundCallConfigProperty.builder()
 * .connectContactFlowArn("connectContactFlowArn")
 * // the properties below are optional
 * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
 * .enableAnswerMachineDetection(false)
 * // the properties below are optional
 * .awaitAnswerMachinePrompt(false)
 * .build())
 * .connectQueueArn("connectQueueArn")
 * .connectSourcePhoneNumber("connectSourcePhoneNumber")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html)
 */
public open class CfnCampaign(
  cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps,
  ) :
      this(software.amazon.awscdk.services.connectcampaigns.CfnCampaign(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCampaignProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCampaignProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCampaignProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the high-volume outbound campaign.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun connectInstanceArn(): String = unwrap(this).getConnectInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   */
  public open fun connectInstanceArn(`value`: String) {
    unwrap(this).setConnectInstanceArn(`value`)
  }

  /**
   * Contains information about the dialer configuration.
   */
  public open fun dialerConfig(): Any = unwrap(this).getDialerConfig()

  /**
   * Contains information about the dialer configuration.
   */
  public open fun dialerConfig(`value`: IResolvable) {
    unwrap(this).setDialerConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains information about the dialer configuration.
   */
  public open fun dialerConfig(`value`: DialerConfigProperty) {
    unwrap(this).setDialerConfig(`value`.let(DialerConfigProperty.Companion::unwrap))
  }

  /**
   * Contains information about the dialer configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1342c6fbb8f0cf07234456bb5c3bf577989c593826c26e0f8ae29128687e6a71")
  public open fun dialerConfig(`value`: DialerConfigProperty.Builder.() -> Unit): Unit =
      dialerConfig(DialerConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the campaign.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the campaign.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains information about the outbound call configuration.
   */
  public open fun outboundCallConfig(): Any = unwrap(this).getOutboundCallConfig()

  /**
   * Contains information about the outbound call configuration.
   */
  public open fun outboundCallConfig(`value`: IResolvable) {
    unwrap(this).setOutboundCallConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Contains information about the outbound call configuration.
   */
  public open fun outboundCallConfig(`value`: OutboundCallConfigProperty) {
    unwrap(this).setOutboundCallConfig(`value`.let(OutboundCallConfigProperty.Companion::unwrap))
  }

  /**
   * Contains information about the outbound call configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("59c6144b6ed2768384def521c363736d76933122a1bef8641e64a8592d96fd53")
  public open fun outboundCallConfig(`value`: OutboundCallConfigProperty.Builder.() -> Unit): Unit =
      outboundCallConfig(OutboundCallConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connectcampaigns.CfnCampaign].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-connectinstancearn)
     * @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun connectInstanceArn(connectInstanceArn: String)

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    public fun dialerConfig(dialerConfig: IResolvable)

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    public fun dialerConfig(dialerConfig: DialerConfigProperty)

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f55c809b3e8c0f3b83dab3a144dada3015026ada9a6a4d8d0e3905a638abf64")
    public fun dialerConfig(dialerConfig: DialerConfigProperty.Builder.() -> Unit)

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-name)
     * @param name The name of the campaign. 
     */
    public fun name(name: String)

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    public fun outboundCallConfig(outboundCallConfig: IResolvable)

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    public fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty)

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8c96dc62df14c4127f1ecaff294064aab077816c13f7001d89338b6c13ff5b9")
    public fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.Builder =
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-connectinstancearn)
     * @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun connectInstanceArn(connectInstanceArn: String) {
      cdkBuilder.connectInstanceArn(connectInstanceArn)
    }

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    override fun dialerConfig(dialerConfig: IResolvable) {
      cdkBuilder.dialerConfig(dialerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    override fun dialerConfig(dialerConfig: DialerConfigProperty) {
      cdkBuilder.dialerConfig(dialerConfig.let(DialerConfigProperty.Companion::unwrap))
    }

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f55c809b3e8c0f3b83dab3a144dada3015026ada9a6a4d8d0e3905a638abf64")
    override fun dialerConfig(dialerConfig: DialerConfigProperty.Builder.() -> Unit): Unit =
        dialerConfig(DialerConfigProperty(dialerConfig))

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-name)
     * @param name The name of the campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    override fun outboundCallConfig(outboundCallConfig: IResolvable) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    override fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(OutboundCallConfigProperty.Companion::unwrap))
    }

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c8c96dc62df14c4127f1ecaff294064aab077816c13f7001d89338b6c13ff5b9")
    override
        fun outboundCallConfig(outboundCallConfig: OutboundCallConfigProperty.Builder.() -> Unit):
        Unit = outboundCallConfig(OutboundCallConfigProperty(outboundCallConfig))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaigns.CfnCampaign =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign):
        CfnCampaign = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign):
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign = wrapped.cdkObject as
        software.amazon.awscdk.services.connectcampaigns.CfnCampaign
  }

  /**
   * Contains agentless dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * AgentlessDialerConfigProperty agentlessDialerConfigProperty =
   * AgentlessDialerConfigProperty.builder()
   * .dialingCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-agentlessdialerconfig.html)
   */
  public interface AgentlessDialerConfigProperty {
    /**
     * The allocation of dialing capacity between multiple active campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-agentlessdialerconfig.html#cfn-connectcampaigns-campaign-agentlessdialerconfig-dialingcapacity)
     */
    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    /**
     * A builder for [AgentlessDialerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty.builder()

      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty,
    ) : CdkObject(cdkObject), AgentlessDialerConfigProperty {
      /**
       * The allocation of dialing capacity between multiple active campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-agentlessdialerconfig.html#cfn-connectcampaigns-campaign-agentlessdialerconfig-dialingcapacity)
       */
      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AgentlessDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty):
          AgentlessDialerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AgentlessDialerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AgentlessDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AgentlessDialerConfigProperty
    }
  }

  /**
   * Contains information about answering machine detection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * AnswerMachineDetectionConfigProperty answerMachineDetectionConfigProperty =
   * AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html)
   */
  public interface AnswerMachineDetectionConfigProperty {
    /**
     * Whether waiting for answer machine prompt is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html#cfn-connectcampaigns-campaign-answermachinedetectionconfig-awaitanswermachineprompt)
     */
    public fun awaitAnswerMachinePrompt(): Any? = unwrap(this).getAwaitAnswerMachinePrompt()

    /**
     * Whether answering machine detection is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html#cfn-connectcampaigns-campaign-answermachinedetectionconfig-enableanswermachinedetection)
     */
    public fun enableAnswerMachineDetection(): Any

    /**
     * A builder for [AnswerMachineDetectionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awaitAnswerMachinePrompt Whether waiting for answer machine prompt is enabled.
       */
      public fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: Boolean)

      /**
       * @param awaitAnswerMachinePrompt Whether waiting for answer machine prompt is enabled.
       */
      public fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: IResolvable)

      /**
       * @param enableAnswerMachineDetection Whether answering machine detection is enabled. 
       */
      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean)

      /**
       * @param enableAnswerMachineDetection Whether answering machine detection is enabled. 
       */
      public fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty.builder()

      /**
       * @param awaitAnswerMachinePrompt Whether waiting for answer machine prompt is enabled.
       */
      override fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: Boolean) {
        cdkBuilder.awaitAnswerMachinePrompt(awaitAnswerMachinePrompt)
      }

      /**
       * @param awaitAnswerMachinePrompt Whether waiting for answer machine prompt is enabled.
       */
      override fun awaitAnswerMachinePrompt(awaitAnswerMachinePrompt: IResolvable) {
        cdkBuilder.awaitAnswerMachinePrompt(awaitAnswerMachinePrompt.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enableAnswerMachineDetection Whether answering machine detection is enabled. 
       */
      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: Boolean) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection)
      }

      /**
       * @param enableAnswerMachineDetection Whether answering machine detection is enabled. 
       */
      override fun enableAnswerMachineDetection(enableAnswerMachineDetection: IResolvable) {
        cdkBuilder.enableAnswerMachineDetection(enableAnswerMachineDetection.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty,
    ) : CdkObject(cdkObject), AnswerMachineDetectionConfigProperty {
      /**
       * Whether waiting for answer machine prompt is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html#cfn-connectcampaigns-campaign-answermachinedetectionconfig-awaitanswermachineprompt)
       */
      override fun awaitAnswerMachinePrompt(): Any? = unwrap(this).getAwaitAnswerMachinePrompt()

      /**
       * Whether answering machine detection is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-answermachinedetectionconfig.html#cfn-connectcampaigns-campaign-answermachinedetectionconfig-enableanswermachinedetection)
       */
      override fun enableAnswerMachineDetection(): Any =
          unwrap(this).getEnableAnswerMachineDetection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AnswerMachineDetectionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty):
          AnswerMachineDetectionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AnswerMachineDetectionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnswerMachineDetectionConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.AnswerMachineDetectionConfigProperty
    }
  }

  /**
   * Contains dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * DialerConfigProperty dialerConfigProperty = DialerConfigProperty.builder()
   * .agentlessDialerConfig(AgentlessDialerConfigProperty.builder()
   * .dialingCapacity(123)
   * .build())
   * .predictiveDialerConfig(PredictiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * // the properties below are optional
   * .dialingCapacity(123)
   * .build())
   * .progressiveDialerConfig(ProgressiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * // the properties below are optional
   * .dialingCapacity(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html)
   */
  public interface DialerConfigProperty {
    /**
     * The configuration of the agentless dialer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-agentlessdialerconfig)
     */
    public fun agentlessDialerConfig(): Any? = unwrap(this).getAgentlessDialerConfig()

    /**
     * The configuration of the predictive dialer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-predictivedialerconfig)
     */
    public fun predictiveDialerConfig(): Any? = unwrap(this).getPredictiveDialerConfig()

    /**
     * The configuration of the progressive dialer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-progressivedialerconfig)
     */
    public fun progressiveDialerConfig(): Any? = unwrap(this).getProgressiveDialerConfig()

    /**
     * A builder for [DialerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      public fun agentlessDialerConfig(agentlessDialerConfig: IResolvable)

      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      public fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty)

      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b45977c5de4e7662314547f9d6ec3f9572397a61960db97c408fcf7651dd4fe6")
      public
          fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty.Builder.() -> Unit)

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      public fun predictiveDialerConfig(predictiveDialerConfig: IResolvable)

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      public fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty)

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e453982aa0bff87c995c7b9d0c614bc3746d4e4c83d18172d9e4d3b9f42059")
      public
          fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty.Builder.() -> Unit)

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      public fun progressiveDialerConfig(progressiveDialerConfig: IResolvable)

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      public fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty)

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a824f01e264afcdef0e7e56bc6fcedf0053fdc65017727ec0f7824869d40e46")
      public
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty.builder()

      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      override fun agentlessDialerConfig(agentlessDialerConfig: IResolvable) {
        cdkBuilder.agentlessDialerConfig(agentlessDialerConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      override fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty) {
        cdkBuilder.agentlessDialerConfig(agentlessDialerConfig.let(AgentlessDialerConfigProperty.Companion::unwrap))
      }

      /**
       * @param agentlessDialerConfig The configuration of the agentless dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b45977c5de4e7662314547f9d6ec3f9572397a61960db97c408fcf7651dd4fe6")
      override
          fun agentlessDialerConfig(agentlessDialerConfig: AgentlessDialerConfigProperty.Builder.() -> Unit):
          Unit = agentlessDialerConfig(AgentlessDialerConfigProperty(agentlessDialerConfig))

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      override fun predictiveDialerConfig(predictiveDialerConfig: IResolvable) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      override fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty) {
        cdkBuilder.predictiveDialerConfig(predictiveDialerConfig.let(PredictiveDialerConfigProperty.Companion::unwrap))
      }

      /**
       * @param predictiveDialerConfig The configuration of the predictive dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83e453982aa0bff87c995c7b9d0c614bc3746d4e4c83d18172d9e4d3b9f42059")
      override
          fun predictiveDialerConfig(predictiveDialerConfig: PredictiveDialerConfigProperty.Builder.() -> Unit):
          Unit = predictiveDialerConfig(PredictiveDialerConfigProperty(predictiveDialerConfig))

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      override fun progressiveDialerConfig(progressiveDialerConfig: IResolvable) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      override
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty) {
        cdkBuilder.progressiveDialerConfig(progressiveDialerConfig.let(ProgressiveDialerConfigProperty.Companion::unwrap))
      }

      /**
       * @param progressiveDialerConfig The configuration of the progressive dialer.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a824f01e264afcdef0e7e56bc6fcedf0053fdc65017727ec0f7824869d40e46")
      override
          fun progressiveDialerConfig(progressiveDialerConfig: ProgressiveDialerConfigProperty.Builder.() -> Unit):
          Unit = progressiveDialerConfig(ProgressiveDialerConfigProperty(progressiveDialerConfig))

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty,
    ) : CdkObject(cdkObject), DialerConfigProperty {
      /**
       * The configuration of the agentless dialer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-agentlessdialerconfig)
       */
      override fun agentlessDialerConfig(): Any? = unwrap(this).getAgentlessDialerConfig()

      /**
       * The configuration of the predictive dialer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-predictivedialerconfig)
       */
      override fun predictiveDialerConfig(): Any? = unwrap(this).getPredictiveDialerConfig()

      /**
       * The configuration of the progressive dialer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-dialerconfig.html#cfn-connectcampaigns-campaign-dialerconfig-progressivedialerconfig)
       */
      override fun progressiveDialerConfig(): Any? = unwrap(this).getProgressiveDialerConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty):
          DialerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? DialerConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.DialerConfigProperty
    }
  }

  /**
   * Contains outbound call configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * OutboundCallConfigProperty outboundCallConfigProperty = OutboundCallConfigProperty.builder()
   * .connectContactFlowArn("connectContactFlowArn")
   * // the properties below are optional
   * .answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty.builder()
   * .enableAnswerMachineDetection(false)
   * // the properties below are optional
   * .awaitAnswerMachinePrompt(false)
   * .build())
   * .connectQueueArn("connectQueueArn")
   * .connectSourcePhoneNumber("connectSourcePhoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html)
   */
  public interface OutboundCallConfigProperty {
    /**
     * Whether answering machine detection has been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-answermachinedetectionconfig)
     */
    public fun answerMachineDetectionConfig(): Any? = unwrap(this).getAnswerMachineDetectionConfig()

    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectcontactflowarn)
     */
    public fun connectContactFlowArn(): String

    /**
     * The Amazon Resource Name (ARN) of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectqueuearn)
     */
    public fun connectQueueArn(): String? = unwrap(this).getConnectQueueArn()

    /**
     * The phone number associated with the outbound call.
     *
     * This is the caller ID that is displayed to customers when an agent calls them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectsourcephonenumber)
     */
    public fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()

    /**
     * A builder for [OutboundCallConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      public fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable)

      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty)

      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b5821eb58e3395cd2d600c69a1fc9ca3fbab80d0f64fe4265499bbfaf82784")
      public
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit)

      /**
       * @param connectContactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      public fun connectContactFlowArn(connectContactFlowArn: String)

      /**
       * @param connectQueueArn The Amazon Resource Name (ARN) of the queue.
       */
      public fun connectQueueArn(connectQueueArn: String)

      /**
       * @param connectSourcePhoneNumber The phone number associated with the outbound call.
       * This is the caller ID that is displayed to customers when an agent calls them.
       */
      public fun connectSourcePhoneNumber(connectSourcePhoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty.builder()

      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      override fun answerMachineDetectionConfig(answerMachineDetectionConfig: IResolvable) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty) {
        cdkBuilder.answerMachineDetectionConfig(answerMachineDetectionConfig.let(AnswerMachineDetectionConfigProperty.Companion::unwrap))
      }

      /**
       * @param answerMachineDetectionConfig Whether answering machine detection has been enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b5821eb58e3395cd2d600c69a1fc9ca3fbab80d0f64fe4265499bbfaf82784")
      override
          fun answerMachineDetectionConfig(answerMachineDetectionConfig: AnswerMachineDetectionConfigProperty.Builder.() -> Unit):
          Unit =
          answerMachineDetectionConfig(AnswerMachineDetectionConfigProperty(answerMachineDetectionConfig))

      /**
       * @param connectContactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      override fun connectContactFlowArn(connectContactFlowArn: String) {
        cdkBuilder.connectContactFlowArn(connectContactFlowArn)
      }

      /**
       * @param connectQueueArn The Amazon Resource Name (ARN) of the queue.
       */
      override fun connectQueueArn(connectQueueArn: String) {
        cdkBuilder.connectQueueArn(connectQueueArn)
      }

      /**
       * @param connectSourcePhoneNumber The phone number associated with the outbound call.
       * This is the caller ID that is displayed to customers when an agent calls them.
       */
      override fun connectSourcePhoneNumber(connectSourcePhoneNumber: String) {
        cdkBuilder.connectSourcePhoneNumber(connectSourcePhoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty,
    ) : CdkObject(cdkObject), OutboundCallConfigProperty {
      /**
       * Whether answering machine detection has been enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-answermachinedetectionconfig)
       */
      override fun answerMachineDetectionConfig(): Any? =
          unwrap(this).getAnswerMachineDetectionConfig()

      /**
       * The Amazon Resource Name (ARN) of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectcontactflowarn)
       */
      override fun connectContactFlowArn(): String = unwrap(this).getConnectContactFlowArn()

      /**
       * The Amazon Resource Name (ARN) of the queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectqueuearn)
       */
      override fun connectQueueArn(): String? = unwrap(this).getConnectQueueArn()

      /**
       * The phone number associated with the outbound call.
       *
       * This is the caller ID that is displayed to customers when an agent calls them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-outboundcallconfig.html#cfn-connectcampaigns-campaign-outboundcallconfig-connectsourcephonenumber)
       */
      override fun connectSourcePhoneNumber(): String? = unwrap(this).getConnectSourcePhoneNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutboundCallConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty):
          OutboundCallConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OutboundCallConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutboundCallConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.OutboundCallConfigProperty
    }
  }

  /**
   * Contains predictive dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * PredictiveDialerConfigProperty predictiveDialerConfigProperty =
   * PredictiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * // the properties below are optional
   * .dialingCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html)
   */
  public interface PredictiveDialerConfigProperty {
    /**
     * Bandwidth allocation for the predictive dialer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html#cfn-connectcampaigns-campaign-predictivedialerconfig-bandwidthallocation)
     */
    public fun bandwidthAllocation(): Number

    /**
     * The allocation of dialing capacity between multiple active campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html#cfn-connectcampaigns-campaign-predictivedialerconfig-dialingcapacity)
     */
    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    /**
     * A builder for [PredictiveDialerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidthAllocation Bandwidth allocation for the predictive dialer. 
       */
      public fun bandwidthAllocation(bandwidthAllocation: Number)

      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty.builder()

      /**
       * @param bandwidthAllocation Bandwidth allocation for the predictive dialer. 
       */
      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty,
    ) : CdkObject(cdkObject), PredictiveDialerConfigProperty {
      /**
       * Bandwidth allocation for the predictive dialer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html#cfn-connectcampaigns-campaign-predictivedialerconfig-bandwidthallocation)
       */
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()

      /**
       * The allocation of dialing capacity between multiple active campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-predictivedialerconfig.html#cfn-connectcampaigns-campaign-predictivedialerconfig-dialingcapacity)
       */
      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PredictiveDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty):
          PredictiveDialerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PredictiveDialerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.PredictiveDialerConfigProperty
    }
  }

  /**
   * Contains progressive dialer configuration for an outbound campaign.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
   * ProgressiveDialerConfigProperty progressiveDialerConfigProperty =
   * ProgressiveDialerConfigProperty.builder()
   * .bandwidthAllocation(123)
   * // the properties below are optional
   * .dialingCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html)
   */
  public interface ProgressiveDialerConfigProperty {
    /**
     * Bandwidth allocation for the progressive dialer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html#cfn-connectcampaigns-campaign-progressivedialerconfig-bandwidthallocation)
     */
    public fun bandwidthAllocation(): Number

    /**
     * The allocation of dialing capacity between multiple active campaigns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html#cfn-connectcampaigns-campaign-progressivedialerconfig-dialingcapacity)
     */
    public fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()

    /**
     * A builder for [ProgressiveDialerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidthAllocation Bandwidth allocation for the progressive dialer. 
       */
      public fun bandwidthAllocation(bandwidthAllocation: Number)

      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      public fun dialingCapacity(dialingCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty.Builder
          =
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty.builder()

      /**
       * @param bandwidthAllocation Bandwidth allocation for the progressive dialer. 
       */
      override fun bandwidthAllocation(bandwidthAllocation: Number) {
        cdkBuilder.bandwidthAllocation(bandwidthAllocation)
      }

      /**
       * @param dialingCapacity The allocation of dialing capacity between multiple active
       * campaigns.
       */
      override fun dialingCapacity(dialingCapacity: Number) {
        cdkBuilder.dialingCapacity(dialingCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty,
    ) : CdkObject(cdkObject), ProgressiveDialerConfigProperty {
      /**
       * Bandwidth allocation for the progressive dialer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html#cfn-connectcampaigns-campaign-progressivedialerconfig-bandwidthallocation)
       */
      override fun bandwidthAllocation(): Number = unwrap(this).getBandwidthAllocation()

      /**
       * The allocation of dialing capacity between multiple active campaigns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connectcampaigns-campaign-progressivedialerconfig.html#cfn-connectcampaigns-campaign-progressivedialerconfig-dialingcapacity)
       */
      override fun dialingCapacity(): Number? = unwrap(this).getDialingCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProgressiveDialerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty):
          ProgressiveDialerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProgressiveDialerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProgressiveDialerConfigProperty):
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connectcampaigns.CfnCampaign.ProgressiveDialerConfigProperty
    }
  }
}
