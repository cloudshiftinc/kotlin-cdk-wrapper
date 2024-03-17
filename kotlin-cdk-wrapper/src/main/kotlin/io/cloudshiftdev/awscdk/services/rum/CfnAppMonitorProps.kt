@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rum

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnAppMonitor`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rum.*;
 * CfnAppMonitorProps cfnAppMonitorProps = CfnAppMonitorProps.builder()
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
public interface CfnAppMonitorProps {
  /**
   * A structure that contains much of the configuration data for the app monitor.
   *
   * If you are using Amazon Cognito for authorization, you must include this structure in your
   * request, and it must include the ID of the Amazon Cognito identity pool to use for authorization.
   * If you don't include `AppMonitorConfiguration` , you must set up your own authorization method.
   * For more information, see [Authorize your application to send data to
   * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
   * .
   *
   * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
   * sessions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
   */
  public fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

  /**
   * Specifies whether this app monitor allows the web client to define and send custom events.
   *
   * If you omit this parameter, custom events are `DISABLED` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
   */
  public fun customEvents(): Any? = unwrap(this).getCustomEvents()

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
   */
  public fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

  /**
   * The top-level internet domain name for which your application has administrative authority.
   *
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
   */
  public fun domain(): String

  /**
   * A name for the app monitor.
   *
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
   */
  public fun name(): String

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAppMonitorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable)

    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    public
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty)

    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240234ed1bec70f9ac59c586e4f21c17a1b4bf7a3d90e5390c47984f72662364")
    public
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty.Builder.() -> Unit)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    public fun customEvents(customEvents: IResolvable)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebce3b804f4b806915800466c10811b7e1692d03470e31444e5e79d1628c26d")
    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty.Builder.() -> Unit)

    /**
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted.
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     */
    public fun cwLogEnabled(cwLogEnabled: Boolean)

    /**
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted.
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     */
    public fun cwLogEnabled(cwLogEnabled: IResolvable)

    /**
     * @param domain The top-level internet domain name for which your application has
     * administrative authority. 
     */
    public fun domain(domain: String)

    /**
     * @param name A name for the app monitor. 
     */
    public fun name(name: String)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rum.CfnAppMonitorProps.Builder =
        software.amazon.awscdk.services.rum.CfnAppMonitorProps.builder()

    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    override fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    override
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty) {
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(CfnAppMonitor.AppMonitorConfigurationProperty::unwrap))
    }

    /**
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     * the app monitor.
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see [Authorize your application to send data to
     * AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("240234ed1bec70f9ac59c586e4f21c17a1b4bf7a3d90e5390c47984f72662364")
    override
        fun appMonitorConfiguration(appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty.Builder.() -> Unit):
        Unit =
        appMonitorConfiguration(CfnAppMonitor.AppMonitorConfigurationProperty(appMonitorConfiguration))

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    override fun customEvents(customEvents: IResolvable) {
      cdkBuilder.customEvents(customEvents.let(IResolvable::unwrap))
    }

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    override fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
      cdkBuilder.customEvents(customEvents.let(CfnAppMonitor.CustomEventsProperty::unwrap))
    }

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebce3b804f4b806915800466c10811b7e1692d03470e31444e5e79d1628c26d")
    override fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty.Builder.() -> Unit):
        Unit = customEvents(CfnAppMonitor.CustomEventsProperty(customEvents))

    /**
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted.
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     */
    override fun cwLogEnabled(cwLogEnabled: Boolean) {
      cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    /**
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     * deleted.
     * This parameter specifies whether CloudWatch RUM sends a copy of this telemetry data to Amazon
     * CloudWatch Logs in your account. This enables you to keep the telemetry data for more than 30
     * days, but it does incur Amazon CloudWatch Logs charges.
     *
     * If you omit this parameter, the default is `false` .
     */
    override fun cwLogEnabled(cwLogEnabled: IResolvable) {
      cdkBuilder.cwLogEnabled(cwLogEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param domain The top-level internet domain name for which your application has
     * administrative authority. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param name A name for the app monitor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rum.CfnAppMonitorProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitorProps,
  ) : CdkObject(cdkObject), CfnAppMonitorProps {
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
     */
    override fun appMonitorConfiguration(): Any? = unwrap(this).getAppMonitorConfiguration()

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     */
    override fun customEvents(): Any? = unwrap(this).getCustomEvents()

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
     */
    override fun cwLogEnabled(): Any? = unwrap(this).getCwLogEnabled()

    /**
     * The top-level internet domain name for which your application has administrative authority.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
     */
    override fun domain(): String = unwrap(this).getDomain()

    /**
     * A name for the app monitor.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppMonitorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitorProps):
        CfnAppMonitorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAppMonitorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppMonitorProps):
        software.amazon.awscdk.services.rum.CfnAppMonitorProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rum.CfnAppMonitorProps
  }
}
