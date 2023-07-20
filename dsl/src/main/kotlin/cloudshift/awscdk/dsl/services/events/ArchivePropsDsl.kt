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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.ArchiveProps
import software.amazon.awscdk.services.events.EventPattern
import software.amazon.awscdk.services.events.IEventBus
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class ArchivePropsDsl {
    private val cdkBuilder: ArchiveProps.Builder = ArchiveProps.builder()

    public fun archiveName(archiveName: String) {
        cdkBuilder.archiveName(archiveName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventPattern(block: EventPatternDsl.() -> Unit = {}) {
        val builder = EventPatternDsl()
        builder.apply(block)
        cdkBuilder.eventPattern(builder.build())
    }

    public fun eventPattern(eventPattern: EventPattern) {
        cdkBuilder.eventPattern(eventPattern)
    }

    public fun retention(retention: Duration) {
        cdkBuilder.retention(retention)
    }

    public fun sourceEventBus(sourceEventBus: IEventBus) {
        cdkBuilder.sourceEventBus(sourceEventBus)
    }

    public fun build(): ArchiveProps = cdkBuilder.build()
}
