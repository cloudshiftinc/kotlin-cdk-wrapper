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
 * .deobfuscationConfiguration(DeobfuscationConfigurationProperty.builder()
 * .javaScriptSourceMaps(JavaScriptSourceMapsProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .s3Uri("s3Uri")
 * .build())
 * .build())
 * .domain("domain")
 * .domainList(List.of("domainList"))
 * .resourcePolicy(ResourcePolicyProperty.builder()
 * .policyDocument("policyDocument")
 * // the properties below are optional
 * .policyRevisionId("policyRevisionId")
 * .build())
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
   * A structure that contains the configuration for how an app monitor can deobfuscate stack
   * traces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-deobfuscationconfiguration)
   */
  public fun deobfuscationConfiguration(): Any? = unwrap(this).getDeobfuscationConfiguration()

  /**
   * The top-level internet domain name for which your application has administrative authority.
   *
   * This parameter or the `DomainList` parameter is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * List the domain names for which your application has administrative authority. This parameter
   * or the `Domain` parameter is required.
   *
   * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain` must
   * be a minimum length of 1 and a maximum of 253 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domainlist)
   */
  public fun domainList(): List<String> = unwrap(this).getDomainList() ?: emptyList()

  /**
   * A name for the app monitor.
   *
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
   */
  public fun name(): String

  /**
   * Use this structure to assign a resource-based policy to a CloudWatch RUM app monitor to control
   * access to it.
   *
   * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB. To
   * learn more about using resource policies with RUM, see [Using resource-based policies with
   * CloudWatch
   * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-resourcepolicy)
   */
  public fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

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
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    public fun deobfuscationConfiguration(deobfuscationConfiguration: IResolvable)

    /**
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    public
        fun deobfuscationConfiguration(deobfuscationConfiguration: CfnAppMonitor.DeobfuscationConfigurationProperty)

    /**
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e9db24396c92a8e2de16f78ec9240a236758309c17af9b4b4b306c6397dbc4f")
    public
        fun deobfuscationConfiguration(deobfuscationConfiguration: CfnAppMonitor.DeobfuscationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param domain The top-level internet domain name for which your application has
     * administrative authority.
     * This parameter or the `DomainList` parameter is required.
     */
    public fun domain(domain: String)

    /**
     * @param domainList List the domain names for which your application has administrative
     * authority. This parameter or the `Domain` parameter is required.
     * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain`
     * must be a minimum length of 1 and a maximum of 253 characters.
     */
    public fun domainList(domainList: List<String>)

    /**
     * @param domainList List the domain names for which your application has administrative
     * authority. This parameter or the `Domain` parameter is required.
     * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain`
     * must be a minimum length of 1 and a maximum of 253 characters.
     */
    public fun domainList(vararg domainList: String)

    /**
     * @param name A name for the app monitor. 
     */
    public fun name(name: String)

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    public fun resourcePolicy(resourcePolicy: IResolvable)

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    public fun resourcePolicy(resourcePolicy: CfnAppMonitor.ResourcePolicyProperty)

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("194ed93bed9eb40e7dc836f5b7c952281f75f91e3f6d31206fd2d0f4b4b574cc")
    public
        fun resourcePolicy(resourcePolicy: CfnAppMonitor.ResourcePolicyProperty.Builder.() -> Unit)

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
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.appMonitorConfiguration(appMonitorConfiguration.let(CfnAppMonitor.AppMonitorConfigurationProperty.Companion::unwrap))
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
      cdkBuilder.customEvents(customEvents.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     * send custom events.
     * If you omit this parameter, custom events are `DISABLED` .
     */
    override fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
      cdkBuilder.customEvents(customEvents.let(CfnAppMonitor.CustomEventsProperty.Companion::unwrap))
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
      cdkBuilder.cwLogEnabled(cwLogEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    override fun deobfuscationConfiguration(deobfuscationConfiguration: IResolvable) {
      cdkBuilder.deobfuscationConfiguration(deobfuscationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    override
        fun deobfuscationConfiguration(deobfuscationConfiguration: CfnAppMonitor.DeobfuscationConfigurationProperty) {
      cdkBuilder.deobfuscationConfiguration(deobfuscationConfiguration.let(CfnAppMonitor.DeobfuscationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param deobfuscationConfiguration A structure that contains the configuration for how an app
     * monitor can deobfuscate stack traces.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e9db24396c92a8e2de16f78ec9240a236758309c17af9b4b4b306c6397dbc4f")
    override
        fun deobfuscationConfiguration(deobfuscationConfiguration: CfnAppMonitor.DeobfuscationConfigurationProperty.Builder.() -> Unit):
        Unit =
        deobfuscationConfiguration(CfnAppMonitor.DeobfuscationConfigurationProperty(deobfuscationConfiguration))

    /**
     * @param domain The top-level internet domain name for which your application has
     * administrative authority.
     * This parameter or the `DomainList` parameter is required.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param domainList List the domain names for which your application has administrative
     * authority. This parameter or the `Domain` parameter is required.
     * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain`
     * must be a minimum length of 1 and a maximum of 253 characters.
     */
    override fun domainList(domainList: List<String>) {
      cdkBuilder.domainList(domainList)
    }

    /**
     * @param domainList List the domain names for which your application has administrative
     * authority. This parameter or the `Domain` parameter is required.
     * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain`
     * must be a minimum length of 1 and a maximum of 253 characters.
     */
    override fun domainList(vararg domainList: String): Unit = domainList(domainList.toList())

    /**
     * @param name A name for the app monitor. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    override fun resourcePolicy(resourcePolicy: IResolvable) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    override fun resourcePolicy(resourcePolicy: CfnAppMonitor.ResourcePolicyProperty) {
      cdkBuilder.resourcePolicy(resourcePolicy.let(CfnAppMonitor.ResourcePolicyProperty.Companion::unwrap))
    }

    /**
     * @param resourcePolicy Use this structure to assign a resource-based policy to a CloudWatch
     * RUM app monitor to control access to it.
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("194ed93bed9eb40e7dc836f5b7c952281f75f91e3f6d31206fd2d0f4b4b574cc")
    override
        fun resourcePolicy(resourcePolicy: CfnAppMonitor.ResourcePolicyProperty.Builder.() -> Unit):
        Unit = resourcePolicy(CfnAppMonitor.ResourcePolicyProperty(resourcePolicy))

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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    cdkObject: software.amazon.awscdk.services.rum.CfnAppMonitorProps,
  ) : CdkObject(cdkObject),
      CfnAppMonitorProps {
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
     * A structure that contains the configuration for how an app monitor can deobfuscate stack
     * traces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-deobfuscationconfiguration)
     */
    override fun deobfuscationConfiguration(): Any? = unwrap(this).getDeobfuscationConfiguration()

    /**
     * The top-level internet domain name for which your application has administrative authority.
     *
     * This parameter or the `DomainList` parameter is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * List the domain names for which your application has administrative authority. This parameter
     * or the `Domain` parameter is required.
     *
     * You can have a minimum of 1 and a maximum of 5 `Domain` under `DomainList` . Each `Domain`
     * must be a minimum length of 1 and a maximum of 253 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domainlist)
     */
    override fun domainList(): List<String> = unwrap(this).getDomainList() ?: emptyList()

    /**
     * A name for the app monitor.
     *
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Use this structure to assign a resource-based policy to a CloudWatch RUM app monitor to
     * control access to it.
     *
     * Each app monitor can have one resource-based policy. The maximum size of the policy is 4 KB.
     * To learn more about using resource policies with RUM, see [Using resource-based policies with
     * CloudWatch
     * RUM](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-resource-policies.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-resourcepolicy)
     */
    override fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

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
