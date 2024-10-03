@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the settings for an Amazon Pinpoint application.
 *
 * In Amazon Pinpoint, an *application* (also referred to as an *app* or *project* ) is a collection
 * of related settings, customer information, segments, and campaigns, and other types of Amazon
 * Pinpoint resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnApplicationSettings cfnApplicationSettings = CfnApplicationSettings.Builder.create(this,
 * "MyCfnApplicationSettings")
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
public open class CfnApplicationSettings(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationSettingsProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnApplicationSettings(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationSettingsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationSettingsProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The settings for the Lambda function to use by default as a code hook for campaigns in the
   * application.
   */
  public open fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  /**
   * The settings for the Lambda function to use by default as a code hook for campaigns in the
   * application.
   */
  public open fun campaignHook(`value`: IResolvable) {
    unwrap(this).setCampaignHook(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for the Lambda function to use by default as a code hook for campaigns in the
   * application.
   */
  public open fun campaignHook(`value`: CampaignHookProperty) {
    unwrap(this).setCampaignHook(`value`.let(CampaignHookProperty.Companion::unwrap))
  }

  /**
   * The settings for the Lambda function to use by default as a code hook for campaigns in the
   * application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("572df9d36b184bb68e981c10ad0d6d0a98e5e7b515c91e21455c5bcf9454f077")
  public open fun campaignHook(`value`: CampaignHookProperty.Builder.() -> Unit): Unit =
      campaignHook(CampaignHookProperty(`value`))

  /**
   *
   */
  public open fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

  /**
   *
   */
  public open fun cloudWatchMetricsEnabled(`value`: Boolean) {
    unwrap(this).setCloudWatchMetricsEnabled(`value`)
  }

  /**
   *
   */
  public open fun cloudWatchMetricsEnabled(`value`: IResolvable) {
    unwrap(this).setCloudWatchMetricsEnabled(`value`.let(IResolvable.Companion::unwrap))
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
   * The default sending limits for campaigns in the application.
   */
  public open fun limits(): Any? = unwrap(this).getLimits()

  /**
   * The default sending limits for campaigns in the application.
   */
  public open fun limits(`value`: IResolvable) {
    unwrap(this).setLimits(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default sending limits for campaigns in the application.
   */
  public open fun limits(`value`: LimitsProperty) {
    unwrap(this).setLimits(`value`.let(LimitsProperty.Companion::unwrap))
  }

  /**
   * The default sending limits for campaigns in the application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07084f7735578c586836b9ed290f4bdc7aa8ffb64ba71bbc960fe54c05a52c3b")
  public open fun limits(`value`: LimitsProperty.Builder.() -> Unit): Unit =
      limits(LimitsProperty(`value`))

  /**
   * The default quiet time for campaigns in the application.
   */
  public open fun quietTime(): Any? = unwrap(this).getQuietTime()

  /**
   * The default quiet time for campaigns in the application.
   */
  public open fun quietTime(`value`: IResolvable) {
    unwrap(this).setQuietTime(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The default quiet time for campaigns in the application.
   */
  public open fun quietTime(`value`: QuietTimeProperty) {
    unwrap(this).setQuietTime(`value`.let(QuietTimeProperty.Companion::unwrap))
  }

  /**
   * The default quiet time for campaigns in the application.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83c7063b640f33535bed43fe056ecb6700adb03ef8ffeda42bb966ea41a3b908")
  public open fun quietTime(`value`: QuietTimeProperty.Builder.() -> Unit): Unit =
      quietTime(QuietTimeProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnApplicationSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    public fun campaignHook(campaignHook: IResolvable)

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    public fun campaignHook(campaignHook: CampaignHookProperty)

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abfe5f6e64936476164afef70afb18eff364a1e76a371e2d133650f4478b7fd8")
    public fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
     * @param cloudWatchMetricsEnabled 
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
     * @param cloudWatchMetricsEnabled 
     */
    public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    public fun limits(limits: IResolvable)

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    public fun limits(limits: LimitsProperty)

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed85d66155567a9450c6bfa16a94acb7d536ee6a7a73c6fbdfc9734a6ae2c277")
    public fun limits(limits: LimitsProperty.Builder.() -> Unit)

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    public fun quietTime(quietTime: IResolvable)

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    public fun quietTime(quietTime: QuietTimeProperty)

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22f5b180df47d9c7d4c5cd8481e68acca995533e7f3ffd465f5f99286178b3e1")
    public fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.Builder
        = software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    override fun campaignHook(campaignHook: CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CampaignHookProperty.Companion::unwrap))
    }

    /**
     * The settings for the Lambda function to use by default as a code hook for campaigns in the
     * application.
     *
     * To override these settings for a specific campaign, use the Campaign resource to define
     * custom Lambda function settings for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-campaignhook)
     * @param campaignHook The settings for the Lambda function to use by default as a code hook for
     * campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abfe5f6e64936476164afef70afb18eff364a1e76a371e2d133650f4478b7fd8")
    override fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit): Unit =
        campaignHook(CampaignHookProperty(campaignHook))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
     * @param cloudWatchMetricsEnabled 
     */
    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-cloudwatchmetricsenabled)
     * @param cloudWatchMetricsEnabled 
     */
    override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
      cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable.Companion::unwrap))
    }

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    override fun limits(limits: LimitsProperty) {
      cdkBuilder.limits(limits.let(LimitsProperty.Companion::unwrap))
    }

    /**
     * The default sending limits for campaigns in the application.
     *
     * To override these limits for a specific campaign, use the Campaign resource to define custom
     * limits for the campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-applicationsettings.html#cfn-pinpoint-applicationsettings-limits)
     * @param limits The default sending limits for campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed85d66155567a9450c6bfa16a94acb7d536ee6a7a73c6fbdfc9734a6ae2c277")
    override fun limits(limits: LimitsProperty.Builder.() -> Unit): Unit =
        limits(LimitsProperty(limits))

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    override fun quietTime(quietTime: IResolvable) {
      cdkBuilder.quietTime(quietTime.let(IResolvable.Companion::unwrap))
    }

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    override fun quietTime(quietTime: QuietTimeProperty) {
      cdkBuilder.quietTime(quietTime.let(QuietTimeProperty.Companion::unwrap))
    }

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
     * @param quietTime The default quiet time for campaigns in the application. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22f5b180df47d9c7d4c5cd8481e68acca995533e7f3ffd465f5f99286178b3e1")
    override fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit): Unit =
        quietTime(QuietTimeProperty(quietTime))

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnApplicationSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings):
        CfnApplicationSettings = CfnApplicationSettings(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationSettings):
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettings = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
  }

  /**
   * Specifies the Lambda function to use by default as a code hook for campaigns in the
   * application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * CampaignHookProperty campaignHookProperty = CampaignHookProperty.builder()
   * .lambdaFunctionName("lambdaFunctionName")
   * .mode("mode")
   * .webUrl("webUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html)
   */
  public interface CampaignHookProperty {
    /**
     * The name or Amazon Resource Name (ARN) of the Lambda function that Amazon Pinpoint invokes to
     * send messages for campaigns in the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-lambdafunctionname)
     */
    public fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

    /**
     * The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values are:.
     *
     * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
     * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
     * custom channel. This functionality is not supported anymore. To send a campaign through a custom
     * channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of the
     * campaign.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-weburl)
     */
    public fun webUrl(): String? = unwrap(this).getWebUrl()

    /**
     * A builder for [CampaignHookProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function
       * that Amazon Pinpoint invokes to send messages for campaigns in the application.
       */
      public fun lambdaFunctionName(lambdaFunctionName: String)

      /**
       * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible
       * values are:.
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       */
      public fun mode(mode: String)

      /**
       * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over
       * HTTPS.
       */
      public fun webUrl(webUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty.builder()

      /**
       * @param lambdaFunctionName The name or Amazon Resource Name (ARN) of the Lambda function
       * that Amazon Pinpoint invokes to send messages for campaigns in the application.
       */
      override fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
      }

      /**
       * @param mode The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible
       * values are:.
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param webUrl The web URL that Amazon Pinpoint calls to invoke the Lambda function over
       * HTTPS.
       */
      override fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty,
    ) : CdkObject(cdkObject),
        CampaignHookProperty {
      /**
       * The name or Amazon Resource Name (ARN) of the Lambda function that Amazon Pinpoint invokes
       * to send messages for campaigns in the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-lambdafunctionname)
       */
      override fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

      /**
       * The mode that Amazon Pinpoint uses to invoke the Lambda function. Possible values are:.
       *
       * * `FILTER` - Invoke the function to customize the segment that's used by a campaign.
       * * `DELIVERY` - (Deprecated) Previously, invoked the function to send a campaign through a
       * custom channel. This functionality is not supported anymore. To send a campaign through a
       * custom channel, use the `CustomDeliveryConfiguration` and `CampaignCustomMessage` objects of
       * the campaign.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * The web URL that Amazon Pinpoint calls to invoke the Lambda function over HTTPS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-campaignhook.html#cfn-pinpoint-applicationsettings-campaignhook-weburl)
       */
      override fun webUrl(): String? = unwrap(this).getWebUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty):
          CampaignHookProperty = CdkObjectWrappers.wrap(cdkObject) as? CampaignHookProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignHookProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.CampaignHookProperty
    }
  }

  /**
   * Specifies the default sending limits for campaigns in the application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * LimitsProperty limitsProperty = LimitsProperty.builder()
   * .daily(123)
   * .maximumDuration(123)
   * .messagesPerSecond(123)
   * .total(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html)
   */
  public interface LimitsProperty {
    /**
     * The maximum number of messages that a campaign can send to a single endpoint during a 24-hour
     * period.
     *
     * The maximum value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily)
     */
    public fun daily(): Number? = unwrap(this).getDaily()

    /**
     * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message
     * after the scheduled start time for the campaign.
     *
     * The minimum value is 60 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration)
     */
    public fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

    /**
     * The maximum number of messages that a campaign can send each second.
     *
     * The minimum value is 1. The maximum value is 20,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond)
     */
    public fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

    /**
     * The maximum number of messages that a campaign can send to a single endpoint during the
     * course of the campaign.
     *
     * The maximum value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total)
     */
    public fun total(): Number? = unwrap(this).getTotal()

    /**
     * A builder for [LimitsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daily The maximum number of messages that a campaign can send to a single endpoint
       * during a 24-hour period.
       * The maximum value is 100.
       */
      public fun daily(daily: Number)

      /**
       * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt
       * to deliver a message after the scheduled start time for the campaign.
       * The minimum value is 60 seconds.
       */
      public fun maximumDuration(maximumDuration: Number)

      /**
       * @param messagesPerSecond The maximum number of messages that a campaign can send each
       * second.
       * The minimum value is 1. The maximum value is 20,000.
       */
      public fun messagesPerSecond(messagesPerSecond: Number)

      /**
       * @param total The maximum number of messages that a campaign can send to a single endpoint
       * during the course of the campaign.
       * The maximum value is 100.
       */
      public fun total(total: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty.builder()

      /**
       * @param daily The maximum number of messages that a campaign can send to a single endpoint
       * during a 24-hour period.
       * The maximum value is 100.
       */
      override fun daily(daily: Number) {
        cdkBuilder.daily(daily)
      }

      /**
       * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt
       * to deliver a message after the scheduled start time for the campaign.
       * The minimum value is 60 seconds.
       */
      override fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
      }

      /**
       * @param messagesPerSecond The maximum number of messages that a campaign can send each
       * second.
       * The minimum value is 1. The maximum value is 20,000.
       */
      override fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
      }

      /**
       * @param total The maximum number of messages that a campaign can send to a single endpoint
       * during the course of the campaign.
       * The maximum value is 100.
       */
      override fun total(total: Number) {
        cdkBuilder.total(total)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty,
    ) : CdkObject(cdkObject),
        LimitsProperty {
      /**
       * The maximum number of messages that a campaign can send to a single endpoint during a
       * 24-hour period.
       *
       * The maximum value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-daily)
       */
      override fun daily(): Number? = unwrap(this).getDaily()

      /**
       * The maximum amount of time, in seconds, that a campaign can attempt to deliver a message
       * after the scheduled start time for the campaign.
       *
       * The minimum value is 60 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-maximumduration)
       */
      override fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

      /**
       * The maximum number of messages that a campaign can send each second.
       *
       * The minimum value is 1. The maximum value is 20,000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-messagespersecond)
       */
      override fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

      /**
       * The maximum number of messages that a campaign can send to a single endpoint during the
       * course of the campaign.
       *
       * The maximum value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-limits.html#cfn-pinpoint-applicationsettings-limits-total)
       */
      override fun total(): Number? = unwrap(this).getTotal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty):
          LimitsProperty = CdkObjectWrappers.wrap(cdkObject) as? LimitsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.LimitsProperty
    }
  }

  /**
   * Specifies the start and end times that define a time range when messages aren't sent to
   * endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.pinpoint.*;
   * QuietTimeProperty quietTimeProperty = QuietTimeProperty.builder()
   * .end("end")
   * .start("start")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html)
   */
  public interface QuietTimeProperty {
    /**
     * The specific time when quiet time ends.
     *
     * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
     * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
     * AM, or `14:30` to represent 2:30 PM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html#cfn-pinpoint-applicationsettings-quiettime-end)
     */
    public fun end(): String

    /**
     * The specific time when quiet time begins.
     *
     * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
     * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
     * AM, or `14:30` to represent 2:30 PM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html#cfn-pinpoint-applicationsettings-quiettime-start)
     */
    public fun start(): String

    /**
     * A builder for [QuietTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param end The specific time when quiet time ends. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      public fun end(end: String)

      /**
       * @param start The specific time when quiet time begins. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty.builder()

      /**
       * @param end The specific time when quiet time ends. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param start The specific time when quiet time begins. 
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty,
    ) : CdkObject(cdkObject),
        QuietTimeProperty {
      /**
       * The specific time when quiet time ends.
       *
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html#cfn-pinpoint-applicationsettings-quiettime-end)
       */
      override fun end(): String = unwrap(this).getEnd()

      /**
       * The specific time when quiet time begins.
       *
       * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
       * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30
       * AM, or `14:30` to represent 2:30 PM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-applicationsettings-quiettime.html#cfn-pinpoint-applicationsettings-quiettime-start)
       */
      override fun start(): String = unwrap(this).getStart()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuietTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty):
          QuietTimeProperty = CdkObjectWrappers.wrap(cdkObject) as? QuietTimeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuietTimeProperty):
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pinpoint.CfnApplicationSettings.QuietTimeProperty
    }
  }
}
