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

package io.cloudshiftdev.awscdkdsl.services.lookoutmetrics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * Contains information about the column used to track time in a source data file.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * TimestampColumnProperty timestampColumnProperty = TimestampColumnProperty.builder()
 * .columnFormat("columnFormat")
 * .columnName("columnName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-timestampcolumn.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorTimestampColumnPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.TimestampColumnProperty.Builder =
        CfnAnomalyDetector.TimestampColumnProperty.builder()

    /** @param columnFormat The format of the timestamp column. */
    public fun columnFormat(columnFormat: String) {
        cdkBuilder.columnFormat(columnFormat)
    }

    /** @param columnName The name of the timestamp column. */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun build(): CfnAnomalyDetector.TimestampColumnProperty = cdkBuilder.build()
}
