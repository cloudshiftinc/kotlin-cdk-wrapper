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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.DestinationOptions
import software.amazon.awscdk.services.ec2.FlowLogFileFormat

/**
 * Options for writing logs to a destination.
 *
 * TODO: there are other destination options, currently they are only for s3 destinations (not sure
 *   if that will change)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * DestinationOptions destinationOptions = DestinationOptions.builder()
 * .fileFormat(FlowLogFileFormat.PLAIN_TEXT)
 * .hiveCompatiblePartitions(false)
 * .perHourPartition(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class DestinationOptionsDsl {
    private val cdkBuilder: DestinationOptions.Builder = DestinationOptions.builder()

    /** @param fileFormat The format for the flow log. */
    public fun fileFormat(fileFormat: FlowLogFileFormat) {
        cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * @param hiveCompatiblePartitions Use Hive-compatible prefixes for flow logs stored in Amazon
     *   S3.
     */
    public fun hiveCompatiblePartitions(hiveCompatiblePartitions: Boolean) {
        cdkBuilder.hiveCompatiblePartitions(hiveCompatiblePartitions)
    }

    /** @param perHourPartition Partition the flow log per hour. */
    public fun perHourPartition(perHourPartition: Boolean) {
        cdkBuilder.perHourPartition(perHourPartition)
    }

    public fun build(): DestinationOptions = cdkBuilder.build()
}
