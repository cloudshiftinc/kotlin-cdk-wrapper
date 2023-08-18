@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.rum

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.constructs.Construct

/**
 * Creates a CloudWatch RUM app monitor, which you can use to collect telemetry data from your
 * application and send it to CloudWatch RUM.
 *
 * The data includes performance and reliability information such as page load time, client-side
 * errors, and user behavior.
 *
 * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript code
 * snippet to add to your web application. For more information, see
 * [How do I find a code snippet that I've already generated?](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rum.*;
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
@CdkDslMarker
public class CfnAppMonitorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAppMonitor.Builder = CfnAppMonitor.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see
     * [Authorize your application to send data to AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     *
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     *   the app monitor.
     */
    public fun appMonitorConfiguration(appMonitorConfiguration: IResolvable) {
        cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
    }

    /**
     * A structure that contains much of the configuration data for the app monitor.
     *
     * If you are using Amazon Cognito for authorization, you must include this structure in your
     * request, and it must include the ID of the Amazon Cognito identity pool to use for
     * authorization. If you don't include `AppMonitorConfiguration` , you must set up your own
     * authorization method. For more information, see
     * [Authorize your application to send data to AWS](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-get-started-authorization.html)
     * .
     *
     * If you omit this argument, the sample rate used for CloudWatch RUM is set to 10% of the user
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-appmonitorconfiguration)
     *
     * @param appMonitorConfiguration A structure that contains much of the configuration data for
     *   the app monitor.
     */
    public fun appMonitorConfiguration(
        appMonitorConfiguration: CfnAppMonitor.AppMonitorConfigurationProperty
    ) {
        cdkBuilder.appMonitorConfiguration(appMonitorConfiguration)
    }

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     *
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     *   send custom events.
     */
    public fun customEvents(customEvents: IResolvable) {
        cdkBuilder.customEvents(customEvents)
    }

    /**
     * Specifies whether this app monitor allows the web client to define and send custom events.
     *
     * If you omit this parameter, custom events are `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-customevents)
     *
     * @param customEvents Specifies whether this app monitor allows the web client to define and
     *   send custom events.
     */
    public fun customEvents(customEvents: CfnAppMonitor.CustomEventsProperty) {
        cdkBuilder.customEvents(customEvents)
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
     *
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     *   deleted.
     */
    public fun cwLogEnabled(cwLogEnabled: Boolean) {
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
     *
     * @param cwLogEnabled Data collected by CloudWatch RUM is kept by RUM for 30 days and then
     *   deleted.
     */
    public fun cwLogEnabled(cwLogEnabled: IResolvable) {
        cdkBuilder.cwLogEnabled(cwLogEnabled)
    }

    /**
     * The top-level internet domain name for which your application has administrative authority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-domain)
     *
     * @param domain The top-level internet domain name for which your application has
     *   administrative authority.
     */
    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    /**
     * A name for the app monitor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-name)
     *
     * @param name A name for the app monitor.
     */
    public fun name(name: String) {
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
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     *
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
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
     * For more information, see
     * [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html#cfn-rum-appmonitor-tags)
     *
     * @param tags Assigns one or more tags (key-value pairs) to the app monitor.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAppMonitor {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
