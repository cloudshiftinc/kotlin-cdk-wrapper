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

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions

/**
 * Options used when creating a target input template.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.logs.*;
 * LogGroup logGroup;
 * Rule rule;
 * rule.addTarget(CloudWatchLogGroup.Builder.create(logGroup)
 * .logEvent(LogGroupTargetInput.fromObject(LogGroupTargetInputOptions.builder()
 * .timestamp(EventField.fromPath("$.time"))
 * .message(EventField.fromPath("$.detail-type"))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class LogGroupTargetInputOptionsDsl {
    private val cdkBuilder: LogGroupTargetInputOptions.Builder =
        LogGroupTargetInputOptions.builder()

    /**
     * @param message The value provided here will be used in the Log "message" field. This field
     *   must be a string. If an object is passed (e.g. JSON data) it will not throw an error, but
     *   the message that makes it to CloudWatch logs will be incorrect. This is a likely scenario
     *   if doing something like: EventField.fromPath('$.detail') since in most cases the `detail`
     *   field contains JSON data.
     */
    public fun message(message: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(message)
        cdkBuilder.message(builder.map)
    }

    /**
     * @param message The value provided here will be used in the Log "message" field. This field
     *   must be a string. If an object is passed (e.g. JSON data) it will not throw an error, but
     *   the message that makes it to CloudWatch logs will be incorrect. This is a likely scenario
     *   if doing something like: EventField.fromPath('$.detail') since in most cases the `detail`
     *   field contains JSON data.
     */
    public fun message(message: Any) {
        cdkBuilder.message(message)
    }

    /** @param timestamp The timestamp that will appear in the CloudWatch Logs record. */
    public fun timestamp(timestamp: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(timestamp)
        cdkBuilder.timestamp(builder.map)
    }

    /** @param timestamp The timestamp that will appear in the CloudWatch Logs record. */
    public fun timestamp(timestamp: Any) {
        cdkBuilder.timestamp(timestamp)
    }

    public fun build(): LogGroupTargetInputOptions = cdkBuilder.build()
}
