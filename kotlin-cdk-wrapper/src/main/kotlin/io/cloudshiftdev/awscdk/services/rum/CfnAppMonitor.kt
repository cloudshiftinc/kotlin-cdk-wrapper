@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rum

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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a CloudWatch RUM app monitor, which you can use to collect telemetry data from your
 * application and send it to CloudWatch RUM.
 *
 * The data includes performance and reliability information such as page load time, client-side
 * errors, and user behavior.
 *
 * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code
 * snippet to add to your web application. For more information, see [How do I find a code snippet that
 * I've already
 * generated?](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rum.*;
 * CfnAppMonitor cfnAppMonitor = CfnAppMonitor.Builder.create(this, "MyCfnAppMonitor")
 * .domain("domain")
 * .name("name")
 * // the properties below are optional
 * .appMonitorConfiguration(AppMonitorConfigurationProperty.builder()
 * .allowCookies(false)
 * .enableXRay(false)
 * .excludedPages(List.of("excludedPages"))
 * .favoritePages(List.of("favoritePages"))
 * .guestRoleArn("guestRoleArn")
 * .identityPoolId("identityPoolId")
 * .includedPages(List.of("includedPages"))
 * .metricDestinations(List.of(MetricDestinationProperty.builder()
 * .destination("destination")
 * // the properties below are optional
 * .destinationArn("destinationArn")
 * .iamRoleArn("iamRoleArn")
 * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .dimensionKeys(Map.of(
 * "dimensionKeysKey", "dimensionKeys"))
 * .eventPattern("eventPattern")
 * .namespace("namespace")
 * .unitLabel("unitLabel")
 * .valueKey("valueKey")
 * .build()))
 * .build()))
 * .sessionSampleRate(123)
 * .telemetries(List.of("telemetries"))
 * .build())
 * .customEvents(CustomEventsProperty.builder()
 * .status("status")
 * .build())
 * .cwLogEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html)
 */
public open class CfnAppMonitor(
  cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAppMonitorProps,
  ) :
      this(software.amazon.awscdk.services.rum.CfnAppMonitor(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAppMonitorProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAppMonitorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAppMonitorProps(props)
  )

  /**
   * A structure that contains much of the configuration data for the app monitor.
   */
  public open fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

  /**
   * A structure that contains much of the configuration data for the app monitor.
   */
  public open fun appMonitorConfiguration(`value`: IResolvable) {
    unwrap(this).setAppMonitorConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure that contains much of the configuration data for the app monitor.
   */
  public open fun appMonitorConfiguration(`value`: AppMonitorConfigurationProperty) {
    unwrap(this).setAppMonitorConfiguration(`value`.let(AppMonitorConfigurationProperty.Companion::unwrap))
  }

  /**
   * A structure that contains much of the configuration data for the app monitor.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04aafd667188d60d7f60268739bc56055270d4debbdc2f660ff7b920ed3a7dea")
  public open
      fun appMonitorConfiguration(`value`: AppMonitorConfigurationProperty.Builder.() -> Unit): Unit
      = appMonitorConfiguration(AppMonitorConfigurationProperty(`value`))

  /**
   * The ID of the app monitor, such as `123456ab-1234-4ca9-9d2f-a1b2c3456789` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies whether this app monitor allows the web client to define and send custom events.
   */
  public open fun customEvents(): Any? = unwrap(this).getCustomEvents()

  /**
   * Specifies whether this app monitor allows the web client to define and send custom events.
   */
  public open fun customEvents(`value`: IResolvable) {
    unwrap(this).setCustomEvents(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether this app monitor allows the web client to define and send custom events.
   */
  public open fun customEvents(`value`: CustomEventsProperty) {
    unwrap(this).setCustomEvents(`value`.let(CustomEventsProperty.Companion::unwrap))
  }

  /**
   * Specifies whether this app monitor allows the web client to define and send custom events.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be3aba87a25928e5f2d398793c238db9ce4d85dc2e7a5720eba8815231bb1d4a")
  public open fun customEvents(`value`: CustomEventsProperty.Builder.() -> Unit): Unit =
      customEvents(CustomEventsProperty(`value`))

  /**
   * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
   */
  public open fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

  /**
   * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
   */
  public open fun cwLogEnabled(`value`: Boolean) {
    unwrap(this).setCwLogEnabled(`value`)
  }

  /**
   * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
   */
  public open fun cwLogEnabled(`value`: IResolvable) {
    unwrap(this).setCwLogEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The top-level internet domain name for which your application has administrative authority.
   */
  public open fun domain(): String = unwrap(this).getDomain()

  /**
   * The top-level internet domain name for which your application has administrative authority.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
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
   * A name for the app monitor.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the app monitor.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Assigns one or more tags (key-value pairs) to the app monitor.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Assigns one or more tags (key-value pairs) to the app monitor.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Assigns one or more tags (key-value pairs) to the app monitor.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rum.CfnAppMonitor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable)

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    public fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty)

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b802a42d88c685bb109f03f88e6e416040dab8249fa0c83dd16278c4f09081ed")
    public
        fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    public fun customEvents(customEvents: IResolvable)

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    public fun customEvents(customEvents: CustomEventsProperty)

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e1603fae134115d4dc9eadf51f7d88629bbf2443d24bc3880c95bb84cc5e976")
    public fun customEvents(customEvents: CustomEventsProperty.Builder.() -> Unit)

    /**
     * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
     *
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-cwlogenabled)
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted. 
     */
    public fun cwLogEnabled(cwLogEnabled: Boolean)

    /**
     * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
     *
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-cwlogenabled)
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted. 
     */
    public fun cwLogEnabled(cwLogEnabled: IResolvable)

    /**
     * The top-level internet domain name for which your application has administrative authority.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
     * @param domain The top-level internet domain name for which your application has
     * administrative authority. 
     */
    public fun domain(domain: String)

    /**
     * A name for the app monitor.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
     * @param name A name for the app monitor. 
     */
    public fun name(name: String)

    /**
     * Assigns one or more tags (key-value pairs) to the app monitor.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an app monitor.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns one or more tags (key-value pairs) to the app monitor.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an app monitor.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rum.CfnAppMonitor.Builder =
        software.amazon.awscdk.services.rum.CfnAppMonitor.Builder.create(scope, id)

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    override fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    override fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(AppMonitorConfigurationProperty.Companion::unwrap))
    }

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b802a42d88c685bb109f03f88e6e416040dab8249fa0c83dd16278c4f09081ed")
    override
        fun appMonitorConfiguration(appMonitorConfiguration: AppMonitorConfigurationProperty.Builder.() -> Unit):
        Unit = appMonitorConfiguration(AppMonitorConfigurationProperty(appMonitorConfiguration))

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    override fun customEvents(customEvents: IResolvable) {
      cdkBuilder.customEvents(customEvents.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    override fun customEvents(customEvents: CustomEventsProperty) {
      cdkBuilder.customEvents(customEvents.let(CustomEventsProperty.Companion::unwrap))
    }

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e1603fae134115d4dc9eadf51f7d88629bbf2443d24bc3880c95bb84cc5e976")
    override fun customEvents(customEvents: CustomEventsProperty.Builder.() -> Unit): Unit =
        customEvents(CustomEventsProperty(customEvents))

    /**
     * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
     *
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-cwlogenabled)
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted. 
     */
    override fun cwLogEnabled(cwLogEnabled: Boolean) {
      cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    /**
     * Data collected by CloudWatch RUM is kept by RUM for 30 days and then deleted.
     *
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-cwlogenabled)
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted. 
     */
    override fun cwLogEnabled(cwLogEnabled: IResolvable) {
      cdkBuilder.cwLogEnabled(cwLogEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The top-level internet domain name for which your application has administrative authority.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
     * @param domain The top-level internet domain name for which your application has
     * administrative authority. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * A name for the app monitor.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
     * @param name A name for the app monitor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Assigns one or more tags (key-value pairs) to the app monitor.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an app monitor.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Assigns one or more tags (key-value pairs) to the app monitor.
     *
     * Tags can help you organize and categorize your resources. You can also use them to scope user
     * permissions by granting a user permission to access or change only resources with certain tag
     * values.
     *
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of
     * characters.
     *
     * You can associate as many as 50 tags with an app monitor.
     *
     * For more information, see [Tagging AWS
     * resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rum.CfnAppMonitor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor): CfnAppMonitor =
        CfnAppMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnAppMonitor): software.amazon.awscdk.services.rum.CfnAppMonitor =
        wrapped.cdkObject as software.amazon.awscdk.services.rum.CfnAppMonitor
  }

  /**
   * This structure contains much of the configuration data for the app monitor.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rum.*;
   * AppMonitorConfigurationProperty appMonitorConfigurationProperty =
   * AppMonitorConfigurationProperty.builder()
   * .allowCookies(false)
   * .enableXRay(false)
   * .excludedPages(List.of("excludedPages"))
   * .favoritePages(List.of("favoritePages"))
   * .guestRoleArn("guestRoleArn")
   * .identityPoolId("identityPoolId")
   * .includedPages(List.of("includedPages"))
   * .metricDestinations(List.of(MetricDestinationProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .destinationArn("destinationArn")
   * .iamRoleArn("iamRoleArn")
   * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .dimensionKeys(Map.of(
   * "dimensionKeysKey", "dimensionKeys"))
   * .eventPattern("eventPattern")
   * .namespace("namespace")
   * .unitLabel("unitLabel")
   * .valueKey("valueKey")
   * .build()))
   * .build()))
   * .sessionSampleRate(123)
   * .telemetries(List.of("telemetries"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html)
   */
  public interface AppMonitorConfigurationProperty {
    /**
     * If you set this to `true` , the CloudWatch RUM web client sets two cookies, a session cookie
     * and a user cookie.
     *
     * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
     * users an application has and the behavior of the application across a sequence of events.
     * Cookies are stored in the top-level domain of the current page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-allowcookies)
     */
    public fun allowCookies(): Any? = unwrap(this).getAllowCookies()

    /**
     * If you set this to `true` , CloudWatch RUM sends client-side traces to X-Ray for each sampled
     * session.
     *
     * You can then see traces and segments from these user sessions in the RUM dashboard and the
     * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
     * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-enablexray)
     */
    public fun enableXRay(): Any? = unwrap(this).getEnableXRay()

    /**
     * A list of URLs in your website or application to exclude from RUM data collection.
     *
     * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-excludedpages)
     */
    public fun excludedPages(): List<String> = unwrap(this).getExcludedPages() ?: emptyList()

    /**
     * A list of pages in your application that are to be displayed with a "favorite" icon in the
     * CloudWatch RUM console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-favoritepages)
     */
    public fun favoritePages(): List<String> = unwrap(this).getFavoritePages() ?: emptyList()

    /**
     * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is
     * used to authorize the sending of data to CloudWatch RUM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-guestrolearn)
     */
    public fun guestRoleArn(): String? = unwrap(this).getGuestRoleArn()

    /**
     * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to
     * CloudWatch RUM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-identitypoolid)
     */
    public fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

    /**
     * If this app monitor is to collect data from only certain pages in your application, this
     * structure lists those pages.
     *
     * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-includedpages)
     */
    public fun includedPages(): List<String> = unwrap(this).getIncludedPages() ?: emptyList()

    /**
     * An array of structures that each define a destination that this app monitor will send
     * extended metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-metricdestinations)
     */
    public fun metricDestinations(): Any? = unwrap(this).getMetricDestinations()

    /**
     * Specifies the portion of user sessions to use for CloudWatch RUM data collection.
     *
     * Choosing a higher portion gives you more data but also incurs more costs.
     *
     * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user
     * sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
     *
     * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be sampled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-sessionsamplerate)
     */
    public fun sessionSampleRate(): Number? = unwrap(this).getSessionSampleRate()

    /**
     * An array that lists the types of telemetry data that this app monitor is to collect.
     *
     * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by your
     * application.
     * * `performance` indicates that RUM collects performance data about how your application and
     * its resources are loaded and rendered. This includes Core Web Vitals.
     * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-telemetries)
     */
    public fun telemetries(): List<String> = unwrap(this).getTelemetries() ?: emptyList()

    /**
     * A builder for [AppMonitorConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
       * cookies, a session cookie and a user cookie.
       * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
       * users an application has and the behavior of the application across a sequence of events.
       * Cookies are stored in the top-level domain of the current page.
       */
      public fun allowCookies(allowCookies: Boolean)

      /**
       * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
       * cookies, a session cookie and a user cookie.
       * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
       * users an application has and the behavior of the application across a sequence of events.
       * Cookies are stored in the top-level domain of the current page.
       */
      public fun allowCookies(allowCookies: IResolvable)

      /**
       * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
       * X-Ray for each sampled session.
       * You can then see traces and segments from these user sessions in the RUM dashboard and the
       * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
       * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
       */
      public fun enableXRay(enableXRay: Boolean)

      /**
       * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
       * X-Ray for each sampled session.
       * You can then see traces and segments from these user sessions in the RUM dashboard and the
       * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
       * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
       */
      public fun enableXRay(enableXRay: IResolvable)

      /**
       * @param excludedPages A list of URLs in your website or application to exclude from RUM data
       * collection.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      public fun excludedPages(excludedPages: List<String>)

      /**
       * @param excludedPages A list of URLs in your website or application to exclude from RUM data
       * collection.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      public fun excludedPages(vararg excludedPages: String)

      /**
       * @param favoritePages A list of pages in your application that are to be displayed with a
       * "favorite" icon in the CloudWatch RUM console.
       */
      public fun favoritePages(favoritePages: List<String>)

      /**
       * @param favoritePages A list of pages in your application that are to be displayed with a
       * "favorite" icon in the CloudWatch RUM console.
       */
      public fun favoritePages(vararg favoritePages: String)

      /**
       * @param guestRoleArn The ARN of the guest IAM role that is attached to the Amazon Cognito
       * identity pool that is used to authorize the sending of data to CloudWatch RUM.
       */
      public fun guestRoleArn(guestRoleArn: String)

      /**
       * @param identityPoolId The ID of the Amazon Cognito identity pool that is used to authorize
       * the sending of data to CloudWatch RUM.
       */
      public fun identityPoolId(identityPoolId: String)

      /**
       * @param includedPages If this app monitor is to collect data from only certain pages in your
       * application, this structure lists those pages.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      public fun includedPages(includedPages: List<String>)

      /**
       * @param includedPages If this app monitor is to collect data from only certain pages in your
       * application, this structure lists those pages.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      public fun includedPages(vararg includedPages: String)

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      public fun metricDestinations(metricDestinations: IResolvable)

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      public fun metricDestinations(metricDestinations: List<Any>)

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      public fun metricDestinations(vararg metricDestinations: Any)

      /**
       * @param sessionSampleRate Specifies the portion of user sessions to use for CloudWatch RUM
       * data collection.
       * Choosing a higher portion gives you more data but also incurs more costs.
       *
       * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user
       * sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
       *
       * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be
       * sampled.
       */
      public fun sessionSampleRate(sessionSampleRate: Number)

      /**
       * @param telemetries An array that lists the types of telemetry data that this app monitor is
       * to collect.
       * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by
       * your application.
       * * `performance` indicates that RUM collects performance data about how your application and
       * its resources are loaded and rendered. This includes Core Web Vitals.
       * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
       */
      public fun telemetries(telemetries: List<String>)

      /**
       * @param telemetries An array that lists the types of telemetry data that this app monitor is
       * to collect.
       * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by
       * your application.
       * * `performance` indicates that RUM collects performance data about how your application and
       * its resources are loaded and rendered. This includes Core Web Vitals.
       * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
       */
      public fun telemetries(vararg telemetries: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty.builder()

      /**
       * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
       * cookies, a session cookie and a user cookie.
       * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
       * users an application has and the behavior of the application across a sequence of events.
       * Cookies are stored in the top-level domain of the current page.
       */
      override fun allowCookies(allowCookies: Boolean) {
        cdkBuilder.allowCookies(allowCookies)
      }

      /**
       * @param allowCookies If you set this to `true` , the CloudWatch RUM web client sets two
       * cookies, a session cookie and a user cookie.
       * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
       * users an application has and the behavior of the application across a sequence of events.
       * Cookies are stored in the top-level domain of the current page.
       */
      override fun allowCookies(allowCookies: IResolvable) {
        cdkBuilder.allowCookies(allowCookies.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
       * X-Ray for each sampled session.
       * You can then see traces and segments from these user sessions in the RUM dashboard and the
       * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
       * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
       */
      override fun enableXRay(enableXRay: Boolean) {
        cdkBuilder.enableXRay(enableXRay)
      }

      /**
       * @param enableXRay If you set this to `true` , CloudWatch RUM sends client-side traces to
       * X-Ray for each sampled session.
       * You can then see traces and segments from these user sessions in the RUM dashboard and the
       * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
       * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
       */
      override fun enableXRay(enableXRay: IResolvable) {
        cdkBuilder.enableXRay(enableXRay.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param excludedPages A list of URLs in your website or application to exclude from RUM data
       * collection.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      override fun excludedPages(excludedPages: List<String>) {
        cdkBuilder.excludedPages(excludedPages)
      }

      /**
       * @param excludedPages A list of URLs in your website or application to exclude from RUM data
       * collection.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      override fun excludedPages(vararg excludedPages: String): Unit =
          excludedPages(excludedPages.toList())

      /**
       * @param favoritePages A list of pages in your application that are to be displayed with a
       * "favorite" icon in the CloudWatch RUM console.
       */
      override fun favoritePages(favoritePages: List<String>) {
        cdkBuilder.favoritePages(favoritePages)
      }

      /**
       * @param favoritePages A list of pages in your application that are to be displayed with a
       * "favorite" icon in the CloudWatch RUM console.
       */
      override fun favoritePages(vararg favoritePages: String): Unit =
          favoritePages(favoritePages.toList())

      /**
       * @param guestRoleArn The ARN of the guest IAM role that is attached to the Amazon Cognito
       * identity pool that is used to authorize the sending of data to CloudWatch RUM.
       */
      override fun guestRoleArn(guestRoleArn: String) {
        cdkBuilder.guestRoleArn(guestRoleArn)
      }

      /**
       * @param identityPoolId The ID of the Amazon Cognito identity pool that is used to authorize
       * the sending of data to CloudWatch RUM.
       */
      override fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
      }

      /**
       * @param includedPages If this app monitor is to collect data from only certain pages in your
       * application, this structure lists those pages.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      override fun includedPages(includedPages: List<String>) {
        cdkBuilder.includedPages(includedPages)
      }

      /**
       * @param includedPages If this app monitor is to collect data from only certain pages in your
       * application, this structure lists those pages.
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       */
      override fun includedPages(vararg includedPages: String): Unit =
          includedPages(includedPages.toList())

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      override fun metricDestinations(metricDestinations: IResolvable) {
        cdkBuilder.metricDestinations(metricDestinations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      override fun metricDestinations(metricDestinations: List<Any>) {
        cdkBuilder.metricDestinations(metricDestinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param metricDestinations An array of structures that each define a destination that this
       * app monitor will send extended metrics to.
       */
      override fun metricDestinations(vararg metricDestinations: Any): Unit =
          metricDestinations(metricDestinations.toList())

      /**
       * @param sessionSampleRate Specifies the portion of user sessions to use for CloudWatch RUM
       * data collection.
       * Choosing a higher portion gives you more data but also incurs more costs.
       *
       * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user
       * sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
       *
       * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be
       * sampled.
       */
      override fun sessionSampleRate(sessionSampleRate: Number) {
        cdkBuilder.sessionSampleRate(sessionSampleRate)
      }

      /**
       * @param telemetries An array that lists the types of telemetry data that this app monitor is
       * to collect.
       * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by
       * your application.
       * * `performance` indicates that RUM collects performance data about how your application and
       * its resources are loaded and rendered. This includes Core Web Vitals.
       * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
       */
      override fun telemetries(telemetries: List<String>) {
        cdkBuilder.telemetries(telemetries)
      }

      /**
       * @param telemetries An array that lists the types of telemetry data that this app monitor is
       * to collect.
       * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by
       * your application.
       * * `performance` indicates that RUM collects performance data about how your application and
       * its resources are loaded and rendered. This includes Core Web Vitals.
       * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
       */
      override fun telemetries(vararg telemetries: String): Unit = telemetries(telemetries.toList())

      public fun build():
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty,
    ) : CdkObject(cdkObject),
        AppMonitorConfigurationProperty {
      /**
       * If you set this to `true` , the CloudWatch RUM web client sets two cookies, a session
       * cookie and a user cookie.
       *
       * The cookies allow the CloudWatch RUM web client to collect data relating to the number of
       * users an application has and the behavior of the application across a sequence of events.
       * Cookies are stored in the top-level domain of the current page.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-allowcookies)
       */
      override fun allowCookies(): Any? = unwrap(this).getAllowCookies()

      /**
       * If you set this to `true` , CloudWatch RUM sends client-side traces to X-Ray for each
       * sampled session.
       *
       * You can then see traces and segments from these user sessions in the RUM dashboard and the
       * CloudWatch ServiceLens console. For more information, see [What is AWS X-Ray
       * ?](https://docs.aws.amazon.com/xray/latest/devguide/aws-xray.html)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-enablexray)
       */
      override fun enableXRay(): Any? = unwrap(this).getEnableXRay()

      /**
       * A list of URLs in your website or application to exclude from RUM data collection.
       *
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-excludedpages)
       */
      override fun excludedPages(): List<String> = unwrap(this).getExcludedPages() ?: emptyList()

      /**
       * A list of pages in your application that are to be displayed with a "favorite" icon in the
       * CloudWatch RUM console.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-favoritepages)
       */
      override fun favoritePages(): List<String> = unwrap(this).getFavoritePages() ?: emptyList()

      /**
       * The ARN of the guest IAM role that is attached to the Amazon Cognito identity pool that is
       * used to authorize the sending of data to CloudWatch RUM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-guestrolearn)
       */
      override fun guestRoleArn(): String? = unwrap(this).getGuestRoleArn()

      /**
       * The ID of the Amazon Cognito identity pool that is used to authorize the sending of data to
       * CloudWatch RUM.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-identitypoolid)
       */
      override fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

      /**
       * If this app monitor is to collect data from only certain pages in your application, this
       * structure lists those pages.
       *
       * You can't include both `ExcludedPages` and `IncludedPages` in the same app monitor.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-includedpages)
       */
      override fun includedPages(): List<String> = unwrap(this).getIncludedPages() ?: emptyList()

      /**
       * An array of structures that each define a destination that this app monitor will send
       * extended metrics to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-metricdestinations)
       */
      override fun metricDestinations(): Any? = unwrap(this).getMetricDestinations()

      /**
       * Specifies the portion of user sessions to use for CloudWatch RUM data collection.
       *
       * Choosing a higher portion gives you more data but also incurs more costs.
       *
       * The range for this value is 0 to 1 inclusive. Setting this to 1 means that 100% of user
       * sessions are sampled, and setting it to 0.1 means that 10% of user sessions are sampled.
       *
       * If you omit this parameter, the default of 0.1 is used, and 10% of sessions will be
       * sampled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-sessionsamplerate)
       */
      override fun sessionSampleRate(): Number? = unwrap(this).getSessionSampleRate()

      /**
       * An array that lists the types of telemetry data that this app monitor is to collect.
       *
       * * `errors` indicates that RUM collects data about unhandled JavaScript errors raised by
       * your application.
       * * `performance` indicates that RUM collects performance data about how your application and
       * its resources are loaded and rendered. This includes Core Web Vitals.
       * * `http` indicates that RUM collects data about HTTP errors thrown by your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html#cfn-rum-appmonitor-appmonitorconfiguration-telemetries)
       */
      override fun telemetries(): List<String> = unwrap(this).getTelemetries() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AppMonitorConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty):
          AppMonitorConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AppMonitorConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppMonitorConfigurationProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rum.CfnAppMonitor.AppMonitorConfigurationProperty
    }
  }

  /**
   * This structure specifies whether this app monitor allows the web client to define and send
   * custom events.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rum.*;
   * CustomEventsProperty customEventsProperty = CustomEventsProperty.builder()
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-customevents.html)
   */
  public interface CustomEventsProperty {
    /**
     * Set this to `ENABLED` to allow the web client to send custom events for this app monitor.
     *
     * Valid values are `ENABLED` and `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-customevents.html#cfn-rum-appmonitor-customevents-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [CustomEventsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Set this to `ENABLED` to allow the web client to send custom events for this
       * app monitor.
       * Valid values are `ENABLED` and `DISABLED` .
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty.builder()

      /**
       * @param status Set this to `ENABLED` to allow the web client to send custom events for this
       * app monitor.
       * Valid values are `ENABLED` and `DISABLED` .
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty,
    ) : CdkObject(cdkObject),
        CustomEventsProperty {
      /**
       * Set this to `ENABLED` to allow the web client to send custom events for this app monitor.
       *
       * Valid values are `ENABLED` and `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-customevents.html#cfn-rum-appmonitor-customevents-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomEventsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty):
          CustomEventsProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomEventsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomEventsProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rum.CfnAppMonitor.CustomEventsProperty
    }
  }

  /**
   * Specifies one custom metric or extended metric that you want the CloudWatch RUM app monitor to
   * send to a destination.
   *
   * Valid destinations include CloudWatch and Evidently.
   *
   * By default, RUM app monitors send some metrics to CloudWatch . These default metrics are listed
   * in [CloudWatch metrics that you can
   * collect.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-metrics.html)
   *
   * In addition to these default metrics, you can choose to send extended metrics or custom metrics
   * or both.
   *
   * * Extended metrics enable you to send metrics with additional dimensions not included in the
   * default metrics. You can also send extended metrics to Evidently as well as CloudWatch . The valid
   * dimension names for the additional dimensions for extended metrics are `BrowserName` ,
   * `CountryCode` , `DeviceType` , `FileType` , `OSName` , and `PageId` . For more information, see
   * [Extended
   * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html)
   * .
   * * Custom metrics are metrics that you define. You can send custom metrics to CloudWatch or to
   * CloudWatch Evidently or to both. With custom metrics, you can use any metric name and namespace,
   * and to derive the metrics you can use any custom events, built-in events, custom attributes, or
   * default attributes.
   *
   * You can't send custom metrics to the `AWS/RUM` namespace. You must send custom metrics to a
   * custom namespace that you define. The namespace that you use can't start with `AWS/` . CloudWatch
   * RUM prepends `RUM/CustomMetrics/` to the custom namespace that you define, so the final namespace
   * for your metrics in CloudWatch is `RUM/CustomMetrics/ *your-custom-namespace*` .
   *
   * For information about syntax rules for specifying custom metrics and extended metrics, see
   * [MetridDefinitionRequest](https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_MetricDefinitionRequest.html)
   * in the *CloudWatch RUM API Reference* .
   *
   * The maximum number of metric definitions that one destination can contain is 2000.
   *
   * Extended metrics sent to CloudWatch and RUM custom metrics are charged as CloudWatch custom
   * metrics. Each combination of additional dimension name and dimension value counts as a custom
   * metric.
   *
   * If some metric definitions that you specify are not valid, then the operation will not modify
   * any metric definitions even if other metric definitions specified are valid.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rum.*;
   * MetricDefinitionProperty metricDefinitionProperty = MetricDefinitionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .dimensionKeys(Map.of(
   * "dimensionKeysKey", "dimensionKeys"))
   * .eventPattern("eventPattern")
   * .namespace("namespace")
   * .unitLabel("unitLabel")
   * .valueKey("valueKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html)
   */
  public interface MetricDefinitionProperty {
    /**
     * This field is a map of field paths to dimension names.
     *
     * It defines the dimensions to associate with this metric in CloudWatch . The value of this
     * field is used only if the metric destination is `CloudWatch` . If the metric destination is
     * `Evidently` , the value of `DimensionKeys` is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-dimensionkeys)
     */
    public fun dimensionKeys(): Any? = unwrap(this).getDimensionKeys()

    /**
     * The pattern that defines the metric.
     *
     * RUM checks events that happen in a user's session against the pattern, and events that match
     * the pattern are sent to the metric destination.
     *
     * If the metrics destination is `CloudWatch` and the event also matches a value in
     * `DimensionKeys` , then the metric is published with the specified dimensions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-eventpattern)
     */
    public fun eventPattern(): String? = unwrap(this).getEventPattern()

    /**
     * The name of the metric that is defined in this structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-name)
     */
    public fun name(): String

    /**
     * If you are creating a custom metric instead of an extended metrics, use this parameter to
     * define the metric namespace for that custom metric.
     *
     * Do not specify this parameter if you are creating an extended metric.
     *
     * You can't use any string that starts with `AWS/` for your namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * Use this field only if you are sending this metric to CloudWatch .
     *
     * It defines the CloudWatch metric unit that this metric is measured in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-unitlabel)
     */
    public fun unitLabel(): String? = unwrap(this).getUnitLabel()

    /**
     * The field within the event object that the metric value is sourced from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-valuekey)
     */
    public fun valueKey(): String? = unwrap(this).getValueKey()

    /**
     * A builder for [MetricDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensionKeys This field is a map of field paths to dimension names.
       * It defines the dimensions to associate with this metric in CloudWatch . The value of this
       * field is used only if the metric destination is `CloudWatch` . If the metric destination is
       * `Evidently` , the value of `DimensionKeys` is ignored.
       */
      public fun dimensionKeys(dimensionKeys: IResolvable)

      /**
       * @param dimensionKeys This field is a map of field paths to dimension names.
       * It defines the dimensions to associate with this metric in CloudWatch . The value of this
       * field is used only if the metric destination is `CloudWatch` . If the metric destination is
       * `Evidently` , the value of `DimensionKeys` is ignored.
       */
      public fun dimensionKeys(dimensionKeys: Map<String, String>)

      /**
       * @param eventPattern The pattern that defines the metric.
       * RUM checks events that happen in a user's session against the pattern, and events that
       * match the pattern are sent to the metric destination.
       *
       * If the metrics destination is `CloudWatch` and the event also matches a value in
       * `DimensionKeys` , then the metric is published with the specified dimensions.
       */
      public fun eventPattern(eventPattern: String)

      /**
       * @param name The name of the metric that is defined in this structure. 
       */
      public fun name(name: String)

      /**
       * @param namespace If you are creating a custom metric instead of an extended metrics, use
       * this parameter to define the metric namespace for that custom metric.
       * Do not specify this parameter if you are creating an extended metric.
       *
       * You can't use any string that starts with `AWS/` for your namespace.
       */
      public fun namespace(namespace: String)

      /**
       * @param unitLabel Use this field only if you are sending this metric to CloudWatch .
       * It defines the CloudWatch metric unit that this metric is measured in.
       */
      public fun unitLabel(unitLabel: String)

      /**
       * @param valueKey The field within the event object that the metric value is sourced from.
       */
      public fun valueKey(valueKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty.builder()

      /**
       * @param dimensionKeys This field is a map of field paths to dimension names.
       * It defines the dimensions to associate with this metric in CloudWatch . The value of this
       * field is used only if the metric destination is `CloudWatch` . If the metric destination is
       * `Evidently` , the value of `DimensionKeys` is ignored.
       */
      override fun dimensionKeys(dimensionKeys: IResolvable) {
        cdkBuilder.dimensionKeys(dimensionKeys.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensionKeys This field is a map of field paths to dimension names.
       * It defines the dimensions to associate with this metric in CloudWatch . The value of this
       * field is used only if the metric destination is `CloudWatch` . If the metric destination is
       * `Evidently` , the value of `DimensionKeys` is ignored.
       */
      override fun dimensionKeys(dimensionKeys: Map<String, String>) {
        cdkBuilder.dimensionKeys(dimensionKeys)
      }

      /**
       * @param eventPattern The pattern that defines the metric.
       * RUM checks events that happen in a user's session against the pattern, and events that
       * match the pattern are sent to the metric destination.
       *
       * If the metrics destination is `CloudWatch` and the event also matches a value in
       * `DimensionKeys` , then the metric is published with the specified dimensions.
       */
      override fun eventPattern(eventPattern: String) {
        cdkBuilder.eventPattern(eventPattern)
      }

      /**
       * @param name The name of the metric that is defined in this structure. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param namespace If you are creating a custom metric instead of an extended metrics, use
       * this parameter to define the metric namespace for that custom metric.
       * Do not specify this parameter if you are creating an extended metric.
       *
       * You can't use any string that starts with `AWS/` for your namespace.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param unitLabel Use this field only if you are sending this metric to CloudWatch .
       * It defines the CloudWatch metric unit that this metric is measured in.
       */
      override fun unitLabel(unitLabel: String) {
        cdkBuilder.unitLabel(unitLabel)
      }

      /**
       * @param valueKey The field within the event object that the metric value is sourced from.
       */
      override fun valueKey(valueKey: String) {
        cdkBuilder.valueKey(valueKey)
      }

      public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty,
    ) : CdkObject(cdkObject),
        MetricDefinitionProperty {
      /**
       * This field is a map of field paths to dimension names.
       *
       * It defines the dimensions to associate with this metric in CloudWatch . The value of this
       * field is used only if the metric destination is `CloudWatch` . If the metric destination is
       * `Evidently` , the value of `DimensionKeys` is ignored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-dimensionkeys)
       */
      override fun dimensionKeys(): Any? = unwrap(this).getDimensionKeys()

      /**
       * The pattern that defines the metric.
       *
       * RUM checks events that happen in a user's session against the pattern, and events that
       * match the pattern are sent to the metric destination.
       *
       * If the metrics destination is `CloudWatch` and the event also matches a value in
       * `DimensionKeys` , then the metric is published with the specified dimensions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-eventpattern)
       */
      override fun eventPattern(): String? = unwrap(this).getEventPattern()

      /**
       * The name of the metric that is defined in this structure.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * If you are creating a custom metric instead of an extended metrics, use this parameter to
       * define the metric namespace for that custom metric.
       *
       * Do not specify this parameter if you are creating an extended metric.
       *
       * You can't use any string that starts with `AWS/` for your namespace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * Use this field only if you are sending this metric to CloudWatch .
       *
       * It defines the CloudWatch metric unit that this metric is measured in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-unitlabel)
       */
      override fun unitLabel(): String? = unwrap(this).getUnitLabel()

      /**
       * The field within the event object that the metric value is sourced from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html#cfn-rum-appmonitor-metricdefinition-valuekey)
       */
      override fun valueKey(): String? = unwrap(this).getValueKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty):
          MetricDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDefinitionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDefinitionProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDefinitionProperty
    }
  }

  /**
   * Creates or updates a destination to receive extended metrics from CloudWatch RUM.
   *
   * You can send extended metrics to CloudWatch or to a CloudWatch Evidently experiment.
   *
   * For more information about extended metrics, see [Extended metrics that you can send to
   * CloudWatch and CloudWatch
   * Evidently](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rum.*;
   * MetricDestinationProperty metricDestinationProperty = MetricDestinationProperty.builder()
   * .destination("destination")
   * // the properties below are optional
   * .destinationArn("destinationArn")
   * .iamRoleArn("iamRoleArn")
   * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .dimensionKeys(Map.of(
   * "dimensionKeysKey", "dimensionKeys"))
   * .eventPattern("eventPattern")
   * .namespace("namespace")
   * .unitLabel("unitLabel")
   * .valueKey("valueKey")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html)
   */
  public interface MetricDestinationProperty {
    /**
     * Defines the destination to send the metrics to.
     *
     * Valid values are `CloudWatch` and `Evidently` . If you specify `Evidently` , you must also
     * specify the ARN of the CloudWatch Evidently experiment that is to be the destination and an IAM
     * role that has permission to write to the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-destination)
     */
    public fun destination(): String

    /**
     * Use this parameter only if `Destination` is `Evidently` .
     *
     * This parameter specifies the ARN of the Evidently experiment that will receive the extended
     * metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * This parameter is required if `Destination` is `Evidently` . If `Destination` is `CloudWatch`
     * , do not use this parameter.
     *
     * This parameter specifies the ARN of an IAM role that RUM will assume to write to the
     * Evidently experiment that you are sending metrics to. This role must have permission to write to
     * that experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-iamrolearn)
     */
    public fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

    /**
     * An array of structures which define the metrics that you want to send.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-metricdefinitions)
     */
    public fun metricDefinitions(): Any? = unwrap(this).getMetricDefinitions()

    /**
     * A builder for [MetricDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Defines the destination to send the metrics to. 
       * Valid values are `CloudWatch` and `Evidently` . If you specify `Evidently` , you must also
       * specify the ARN of the CloudWatch Evidently experiment that is to be the destination and an
       * IAM role that has permission to write to the experiment.
       */
      public fun destination(destination: String)

      /**
       * @param destinationArn Use this parameter only if `Destination` is `Evidently` .
       * This parameter specifies the ARN of the Evidently experiment that will receive the extended
       * metrics.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param iamRoleArn This parameter is required if `Destination` is `Evidently` . If
       * `Destination` is `CloudWatch` , do not use this parameter.
       * This parameter specifies the ARN of an IAM role that RUM will assume to write to the
       * Evidently experiment that you are sending metrics to. This role must have permission to write
       * to that experiment.
       */
      public fun iamRoleArn(iamRoleArn: String)

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      public fun metricDefinitions(metricDefinitions: IResolvable)

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      public fun metricDefinitions(metricDefinitions: List<Any>)

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      public fun metricDefinitions(vararg metricDefinitions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty.Builder =
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty.builder()

      /**
       * @param destination Defines the destination to send the metrics to. 
       * Valid values are `CloudWatch` and `Evidently` . If you specify `Evidently` , you must also
       * specify the ARN of the CloudWatch Evidently experiment that is to be the destination and an
       * IAM role that has permission to write to the experiment.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      /**
       * @param destinationArn Use this parameter only if `Destination` is `Evidently` .
       * This parameter specifies the ARN of the Evidently experiment that will receive the extended
       * metrics.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param iamRoleArn This parameter is required if `Destination` is `Evidently` . If
       * `Destination` is `CloudWatch` , do not use this parameter.
       * This parameter specifies the ARN of an IAM role that RUM will assume to write to the
       * Evidently experiment that you are sending metrics to. This role must have permission to write
       * to that experiment.
       */
      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      override fun metricDefinitions(metricDefinitions: IResolvable) {
        cdkBuilder.metricDefinitions(metricDefinitions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      override fun metricDefinitions(metricDefinitions: List<Any>) {
        cdkBuilder.metricDefinitions(metricDefinitions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param metricDefinitions An array of structures which define the metrics that you want to
       * send.
       */
      override fun metricDefinitions(vararg metricDefinitions: Any): Unit =
          metricDefinitions(metricDefinitions.toList())

      public fun build():
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty,
    ) : CdkObject(cdkObject),
        MetricDestinationProperty {
      /**
       * Defines the destination to send the metrics to.
       *
       * Valid values are `CloudWatch` and `Evidently` . If you specify `Evidently` , you must also
       * specify the ARN of the CloudWatch Evidently experiment that is to be the destination and an
       * IAM role that has permission to write to the experiment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-destination)
       */
      override fun destination(): String = unwrap(this).getDestination()

      /**
       * Use this parameter only if `Destination` is `Evidently` .
       *
       * This parameter specifies the ARN of the Evidently experiment that will receive the extended
       * metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * This parameter is required if `Destination` is `Evidently` . If `Destination` is
       * `CloudWatch` , do not use this parameter.
       *
       * This parameter specifies the ARN of an IAM role that RUM will assume to write to the
       * Evidently experiment that you are sending metrics to. This role must have permission to write
       * to that experiment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-iamrolearn)
       */
      override fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

      /**
       * An array of structures which define the metrics that you want to send.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html#cfn-rum-appmonitor-metricdestination-metricdefinitions)
       */
      override fun metricDefinitions(): Any? = unwrap(this).getMetricDefinitions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty):
          MetricDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MetricDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDestinationProperty):
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rum.CfnAppMonitor.MetricDestinationProperty
    }
  }
}
