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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.events.CfnArchiveProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnArchivePropsDsl {
    private val cdkBuilder: CfnArchiveProps.Builder = CfnArchiveProps.builder()

    public fun archiveName(archiveName: String) {
        cdkBuilder.archiveName(archiveName)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventPattern(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.eventPattern(builder.map)
    }

    public fun eventPattern(eventPattern: Any) {
        cdkBuilder.eventPattern(eventPattern)
    }

    public fun retentionDays(retentionDays: Number) {
        cdkBuilder.retentionDays(retentionDays)
    }

    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnArchiveProps = cdkBuilder.build()
}
