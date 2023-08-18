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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

/**
 * A partition dimension defined by a timestamp attribute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * TimestampPartitionProperty timestampPartitionProperty = TimestampPartitionProperty.builder()
 * .attributeName("attributeName")
 * // the properties below are optional
 * .timestampFormat("timestampFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html)
 */
@CdkDslMarker
public class CfnDatastoreTimestampPartitionPropertyDsl {
    private val cdkBuilder: CfnDatastore.TimestampPartitionProperty.Builder =
        CfnDatastore.TimestampPartitionProperty.builder()

    /** @param attributeName The attribute name of the partition defined by a timestamp. */
    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    /**
     * @param timestampFormat The timestamp format of a partition defined by a timestamp. The
     *   default format is seconds since epoch (January 1, 1970 at midnight UTC time).
     */
    public fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
    }

    public fun build(): CfnDatastore.TimestampPartitionProperty = cdkBuilder.build()
}
