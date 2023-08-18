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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.amazon.awscdk.services.ses.EmailSendingEvent
import software.amazon.awscdk.services.ses.EventDestination
import software.amazon.awscdk.services.ses.IConfigurationSet

/**
 * Properties for a configuration set event destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ConfigurationSet configurationSet;
 * EventDestination eventDestination;
 * ConfigurationSetEventDestinationProps configurationSetEventDestinationProps =
 * ConfigurationSetEventDestinationProps.builder()
 * .configurationSet(configurationSet)
 * .destination(eventDestination)
 * // the properties below are optional
 * .configurationSetEventDestinationName("configurationSetEventDestinationName")
 * .enabled(false)
 * .events(List.of(EmailSendingEvent.SEND))
 * .build();
 * ```
 */
@CdkDslMarker
public class ConfigurationSetEventDestinationPropsDsl {
    private val cdkBuilder: ConfigurationSetEventDestinationProps.Builder =
        ConfigurationSetEventDestinationProps.builder()

    private val _events: MutableList<EmailSendingEvent> = mutableListOf()

    /** @param configurationSet The configuration set that contains the event destination. */
    public fun configurationSet(configurationSet: IConfigurationSet) {
        cdkBuilder.configurationSet(configurationSet)
    }

    /**
     * @param configurationSetEventDestinationName A name for the configuration set event
     *   destination.
     */
    public fun configurationSetEventDestinationName(configurationSetEventDestinationName: String) {
        cdkBuilder.configurationSetEventDestinationName(configurationSetEventDestinationName)
    }

    /** @param destination The event destination. */
    public fun destination(destination: EventDestination) {
        cdkBuilder.destination(destination)
    }

    /** @param enabled Whether Amazon SES publishes events to this destination. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param events The type of email sending events to publish to the event destination. */
    public fun events(vararg events: EmailSendingEvent) {
        _events.addAll(listOf(*events))
    }

    /** @param events The type of email sending events to publish to the event destination. */
    public fun events(events: Collection<EmailSendingEvent>) {
        _events.addAll(events)
    }

    public fun build(): ConfigurationSetEventDestinationProps {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
