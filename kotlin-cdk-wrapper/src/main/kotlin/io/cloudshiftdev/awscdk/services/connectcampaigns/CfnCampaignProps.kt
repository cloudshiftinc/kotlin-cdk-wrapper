@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connectcampaigns

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnCampaign`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connectcampaigns.*;
 * CfnCampaignProps cfnCampaignProps = CfnCampaignProps.builder()
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
public interface CfnCampaignProps {
  /**
   * The Amazon Resource Name (ARN) of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-connectinstancearn)
   */
  public fun connectInstanceArn(): String

  /**
   * Contains information about the dialer configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
   */
  public fun dialerConfig(): Any

  /**
   * The name of the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-name)
   */
  public fun name(): String

  /**
   * Contains information about the outbound call configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
   */
  public fun outboundCallConfig(): Any

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCampaignProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    public fun connectInstanceArn(connectInstanceArn: String)

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    public fun dialerConfig(dialerConfig: IResolvable)

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty)

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea2ed3d759a6402c6b344a468723967fe9f0dc2111c066c3041f7812590e86")
    public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the campaign. 
     */
    public fun name(name: String)

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    public fun outboundCallConfig(outboundCallConfig: IResolvable)

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    public fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty)

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07a85f65c144ed1d964ce497a6816dda38a1110328749768df09b37aea80ebb9")
    public
        fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps.builder()

    /**
     * @param connectInstanceArn The Amazon Resource Name (ARN) of the Amazon Connect instance. 
     */
    override fun connectInstanceArn(connectInstanceArn: String) {
      cdkBuilder.connectInstanceArn(connectInstanceArn)
    }

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    override fun dialerConfig(dialerConfig: IResolvable) {
      cdkBuilder.dialerConfig(dialerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    override fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty) {
      cdkBuilder.dialerConfig(dialerConfig.let(CfnCampaign.DialerConfigProperty.Companion::unwrap))
    }

    /**
     * @param dialerConfig Contains information about the dialer configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea2ed3d759a6402c6b344a468723967fe9f0dc2111c066c3041f7812590e86")
    override fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty.Builder.() -> Unit):
        Unit = dialerConfig(CfnCampaign.DialerConfigProperty(dialerConfig))

    /**
     * @param name The name of the campaign. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    override fun outboundCallConfig(outboundCallConfig: IResolvable) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    override fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(CfnCampaign.OutboundCallConfigProperty.Companion::unwrap))
    }

    /**
     * @param outboundCallConfig Contains information about the outbound call configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07a85f65c144ed1d964ce497a6816dda38a1110328749768df09b37aea80ebb9")
    override
        fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty.Builder.() -> Unit):
        Unit = outboundCallConfig(CfnCampaign.OutboundCallConfigProperty(outboundCallConfig))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps,
  ) : CdkObject(cdkObject), CfnCampaignProps {
    /**
     * The Amazon Resource Name (ARN) of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-connectinstancearn)
     */
    override fun connectInstanceArn(): String = unwrap(this).getConnectInstanceArn()

    /**
     * Contains information about the dialer configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-dialerconfig)
     */
    override fun dialerConfig(): Any = unwrap(this).getDialerConfig()

    /**
     * The name of the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Contains information about the outbound call configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-outboundcallconfig)
     */
    override fun outboundCallConfig(): Any = unwrap(this).getOutboundCallConfig()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connectcampaigns-campaign.html#cfn-connectcampaigns-campaign-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps):
        CfnCampaignProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCampaignProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps
  }
}
