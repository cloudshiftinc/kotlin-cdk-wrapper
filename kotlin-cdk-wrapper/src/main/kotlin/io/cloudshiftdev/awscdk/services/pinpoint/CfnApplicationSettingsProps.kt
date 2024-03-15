@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplicationSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnApplicationSettingsProps cfnApplicationSettingsProps = CfnApplicationSettingsProps.builder()
 * .applicationId("applicationId")
 * // the properties below are optional
 * .campaignHook(CampaignHookProperty.builder()
 * .lambdaFunctionName("lambdaFunctionName")
 * .mode("mode")
 * .webUrl("webUrl")
 * .build())
 * .cloudWatchMetricsEnabled(false)
 * .limits(LimitsProperty.builder()
 * .daily(123)
 * .maximumDuration(123)
 * .messagesPerSecond(123)
 * .total(123)
 * .build())
 * .quietTime(QuietTimeProperty.builder()
 * .end("end")
 * .start("start")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html)
 */
public interface CfnApplicationSettingsProps {
  /**
   * The unique identifier for the Amazon Pinpoint application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid)
   */
  public fun applicationId(): String

  /**
   * The settings for the Lambda function to use by default as a code hook for campaigns in the
   * application.
   *
   * To override these settings for a specific campaign, use the Campaign resource to define custom
   * Lambda function settings for the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
   */
  public fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
   */
  public fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

  /**
   * The default sending limits for campaigns in the application.
   *
   * To override these limits for a specific campaign, use the Campaign resource to define custom
   * limits for the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
   */
  public fun limits(): Any? = unwrap(this).getLimits()

  /**
   * The default quiet time for campaigns in the application.
   *
   * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all the
   * following conditions are met:
   *
   * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
   * * The current time in the endpoint's time zone is later than or equal to the time specified by
   * the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
   * settings).
   * * The current time in the endpoint's time zone is earlier than or equal to the time specified
   * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
   * settings).
   *
   * If any of the preceding conditions isn't met, the endpoint will receive messages from a
   * campaign, even if quiet time is enabled.
   *
   * To override the default quiet time settings for a specific campaign, use the Campaign resource
   * to define a custom quiet time for the campaign.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-quiettime)
   */
  public fun quietTime(): Any? = unwrap(this).getQuietTime()

  /**
   * A builder for [CfnApplicationSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    public fun campaignHook(campaignHook: IResolvable)

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    public fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty)

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a608e559e20a9aeff8b9d146c36f5246df3fd8d138c7fb07d19b71e0862a4408")
    public
        fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty.Builder.() -> Unit)

    /**
     * @param cloudWatchMetricsEnabled the value to be set.
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

    /**
     * @param cloudWatchMetricsEnabled the value to be set.
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    public fun limits(limits: IResolvable)

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    public fun limits(limits: CfnApplicationSettings.LimitsProperty)

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad203f5494a3269791fb2d6e6a4af41fa6afe328ca7a8eb70e252af4f671e595")
    public fun limits(limits: CfnApplicationSettings.LimitsProperty.Builder.() -> Unit)

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    public fun quietTime(quietTime: IResolvable)

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty)

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ed106ecc8f33c3ddb5a1899c41466b40be21bd2b6c4b5708b995eccf1065450")
    public fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    override fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CfnApplicationSettings.CampaignHookProperty::unwrap))
    }

    /**
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application.
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a608e559e20a9aeff8b9d146c36f5246df3fd8d138c7fb07d19b71e0862a4408")
    override
        fun campaignHook(campaignHook: CfnApplicationSettings.CampaignHookProperty.Builder.() -> Unit):
        Unit = campaignHook(CfnApplicationSettings.CampaignHookProperty(campaignHook))

    /**
     * @param cloudWatchMetricsEnabled the value to be set.
     */
    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    /**
     * @param cloudWatchMetricsEnabled the value to be set.
     */
    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    override fun limits(limits: CfnApplicationSettings.LimitsProperty) {
      cdkBuilder.limits(limits.let(CfnApplicationSettings.LimitsProperty::unwrap))
    }

    /**
     * @param limits The default sending limits for campaigns in the application.
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad203f5494a3269791fb2d6e6a4af41fa6afe328ca7a8eb70e252af4f671e595")
    override fun limits(limits: CfnApplicationSettings.LimitsProperty.Builder.() -> Unit): Unit =
        limits(CfnApplicationSettings.LimitsProperty(limits))

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    override fun quietTime(quietTime: IResolvable) {
      cdkBuilder.quietTime(quietTime.let(IResolvable::unwrap))
    }

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    override fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty) {
      cdkBuilder.quietTime(quietTime.let(CfnApplicationSettings.QuietTimeProperty::unwrap))
    }

    /**
     * @param quietTime The default quiet time for campaigns in the application.
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ed106ecc8f33c3ddb5a1899c41466b40be21bd2b6c4b5708b995eccf1065450")
    override fun quietTime(quietTime: CfnApplicationSettings.QuietTimeProperty.Builder.() -> Unit):
        Unit = quietTime(CfnApplicationSettings.QuietTimeProperty(quietTime))

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps,
  ) : CdkObject(cdkObject), CfnApplicationSettingsProps {
    /**
     * The unique identifier for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     */
    override fun campaignHook(): Any? = unwrap(this).getCampaignHook()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
     */
    override fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     */
    override fun limits(): Any? = unwrap(this).getLimits()

    /**
     * The default quiet time for campaigns in the application.
     *
     * Quiet time is a specific time range when campaigns don't send messages to endpoints, if all
     * the following conditions are met:
     *
     * * The `EndpointDemographic.Timezone` property of the endpoint is set to a valid value.
     * * The current time in the endpoint's time zone is later than or equal to the time specified
     * by the `QuietTime.Start` property for the application (or a campaign that has custom quiet time
     * settings).
     * * The current time in the endpoint's time zone is earlier than or equal to the time specified
     * by the `QuietTime.End` property for the application (or a campaign that has custom quiet time
     * settings).
     *
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a
     * campaign, even if quiet time is enabled.
     *
     * To override the default quiet time settings for a specific campaign, use the Campaign
     * resource to define a custom quiet time for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-quiettime)
     */
    override fun quietTime(): Any? = unwrap(this).getQuietTime()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps):
        CfnApplicationSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationSettingsProps):
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
  }
}
