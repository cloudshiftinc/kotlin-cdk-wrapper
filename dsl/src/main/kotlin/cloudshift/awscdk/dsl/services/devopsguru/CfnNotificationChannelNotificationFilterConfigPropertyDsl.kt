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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

/**
 * The filter configurations for the Amazon SNS notification topic you use with DevOps Guru.
 *
 * You can choose to specify which events or message types to receive notifications for. You can
 * also choose to specify which severity levels to receive notifications for.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * NotificationFilterConfigProperty notificationFilterConfigProperty =
 * NotificationFilterConfigProperty.builder()
 * .messageTypes(List.of("messageTypes"))
 * .severities(List.of("severities"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devopsguru-notificationchannel-notificationfilterconfig.html)
 */
@CdkDslMarker
public class CfnNotificationChannelNotificationFilterConfigPropertyDsl {
    private val cdkBuilder: CfnNotificationChannel.NotificationFilterConfigProperty.Builder =
        CfnNotificationChannel.NotificationFilterConfigProperty.builder()

    private val _messageTypes: MutableList<String> = mutableListOf()

    private val _severities: MutableList<String> = mutableListOf()

    /**
     * @param messageTypes The events that you want to receive notifications for. For example, you
     *   can choose to receive notifications only when the severity level is upgraded or a new
     *   insight is created.
     */
    public fun messageTypes(vararg messageTypes: String) {
        _messageTypes.addAll(listOf(*messageTypes))
    }

    /**
     * @param messageTypes The events that you want to receive notifications for. For example, you
     *   can choose to receive notifications only when the severity level is upgraded or a new
     *   insight is created.
     */
    public fun messageTypes(messageTypes: Collection<String>) {
        _messageTypes.addAll(messageTypes)
    }

    /**
     * @param severities The severity levels that you want to receive notifications for. For
     *   example, you can choose to receive notifications only for insights with `HIGH` and `MEDIUM`
     *   severity levels. For more information, see
     *   [Understanding insight severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
     *   .
     */
    public fun severities(vararg severities: String) {
        _severities.addAll(listOf(*severities))
    }

    /**
     * @param severities The severity levels that you want to receive notifications for. For
     *   example, you can choose to receive notifications only for insights with `HIGH` and `MEDIUM`
     *   severity levels. For more information, see
     *   [Understanding insight severities](https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities)
     *   .
     */
    public fun severities(severities: Collection<String>) {
        _severities.addAll(severities)
    }

    public fun build(): CfnNotificationChannel.NotificationFilterConfigProperty {
        if (_messageTypes.isNotEmpty()) cdkBuilder.messageTypes(_messageTypes)
        if (_severities.isNotEmpty()) cdkBuilder.severities(_severities)
        return cdkBuilder.build()
    }
}
