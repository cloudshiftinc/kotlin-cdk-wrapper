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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchiveProps

/**
 * Properties for defining a `CfnArchive`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * Object eventPattern;
 * CfnArchiveProps cfnArchiveProps = CfnArchiveProps.builder()
 * .sourceArn("sourceArn")
 * // the properties below are optional
 * .archiveName("archiveName")
 * .description("description")
 * .eventPattern(eventPattern)
 * .retentionDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html)
 */
@CdkDslMarker
public class CfnArchivePropsDsl {
    private val cdkBuilder: CfnArchiveProps.Builder = CfnArchiveProps.builder()

    /** @param archiveName The name for the archive to create. */
    public fun archiveName(archiveName: String) {
        cdkBuilder.archiveName(archiveName)
    }

    /** @param description A description for the archive. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventPattern An event pattern to use to filter events sent to the archive. */
    public fun eventPattern(eventPattern: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(eventPattern)
        cdkBuilder.eventPattern(builder.map)
    }

    /** @param eventPattern An event pattern to use to filter events sent to the archive. */
    public fun eventPattern(eventPattern: Any) {
        cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * @param retentionDays The number of days to retain events for. Default value is 0. If set to
     *   0, events are retained indefinitely
     */
    public fun retentionDays(retentionDays: Number) {
        cdkBuilder.retentionDays(retentionDays)
    }

    /** @param sourceArn The ARN of the event bus that sends events to the archive. */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnArchiveProps = cdkBuilder.build()
}
