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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.BaseArchiveProps
import software.amazon.awscdk.services.events.EventPattern

/**
 * The event archive base properties.
 *
 * Example:
 * ```
 * EventBus bus = EventBus.Builder.create(this, "bus")
 * .eventBusName("MyCustomEventBus")
 * .build();
 * bus.archive("MyArchive", BaseArchiveProps.builder()
 * .archiveName("MyCustomEventBusArchive")
 * .description("MyCustomerEventBus Archive")
 * .eventPattern(EventPattern.builder()
 * .account(List.of(Stack.of(this).getAccount()))
 * .build())
 * .retention(Duration.days(365))
 * .build());
 * ```
 */
@CdkDslMarker
public class BaseArchivePropsDsl {
    private val cdkBuilder: BaseArchiveProps.Builder = BaseArchiveProps.builder()

    /** @param archiveName The name of the archive. */
    public fun archiveName(archiveName: String) {
        cdkBuilder.archiveName(archiveName)
    }

    /** @param description A description for the archive. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventPattern An event pattern to use to filter events sent to the archive. */
    public fun eventPattern(eventPattern: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(eventPattern)
        cdkBuilder.eventPattern(builder.build())
    }

    /** @param eventPattern An event pattern to use to filter events sent to the archive. */
    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * @param retention The number of days to retain events for. Default value is 0. If set to 0,
     *   events are retained indefinitely.
     */
    public fun retention(retention: Duration) {
        cdkBuilder.retention(retention)
    }

    public fun build(): BaseArchiveProps = cdkBuilder.build()
}
