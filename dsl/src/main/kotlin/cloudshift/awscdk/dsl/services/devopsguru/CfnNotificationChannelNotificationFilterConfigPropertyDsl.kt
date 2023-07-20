@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNotificationChannelNotificationFilterConfigPropertyDsl {
    private val cdkBuilder: CfnNotificationChannel.NotificationFilterConfigProperty.Builder =
        CfnNotificationChannel.NotificationFilterConfigProperty.builder()

    private val _messageTypes: MutableList<String> = mutableListOf()

    private val _severities: MutableList<String> = mutableListOf()

    public fun messageTypes(vararg messageTypes: String) {
        _messageTypes.addAll(listOf(*messageTypes))
    }

    public fun messageTypes(messageTypes: Collection<String>) {
        _messageTypes.addAll(messageTypes)
    }

    public fun severities(vararg severities: String) {
        _severities.addAll(listOf(*severities))
    }

    public fun severities(severities: Collection<String>) {
        _severities.addAll(severities)
    }

    public fun build(): CfnNotificationChannel.NotificationFilterConfigProperty {
        if (_messageTypes.isNotEmpty()) cdkBuilder.messageTypes(_messageTypes)
        if (_severities.isNotEmpty()) cdkBuilder.severities(_severities)
        return cdkBuilder.build()
    }
}
