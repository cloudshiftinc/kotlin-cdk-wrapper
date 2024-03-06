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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * The lookback window setup of an incremental refresh configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LookbackWindowProperty lookbackWindowProperty = LookbackWindowProperty.builder()
 * .columnName("columnName")
 * .size(123)
 * .sizeUnit("sizeUnit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-lookbackwindow.html)
 */
@CdkDslMarker
public class CfnDataSetLookbackWindowPropertyDsl {
    private val cdkBuilder: CfnDataSet.LookbackWindowProperty.Builder =
        CfnDataSet.LookbackWindowProperty.builder()

    /** @param columnName The name of the lookback window column. */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /** @param size The lookback window column size. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    /**
     * @param sizeUnit The size unit that is used for the lookback window column. Valid values for
     *   this structure are `HOUR` , `DAY` , and `WEEK` .
     */
    public fun sizeUnit(sizeUnit: String) {
        cdkBuilder.sizeUnit(sizeUnit)
    }

    public fun build(): CfnDataSet.LookbackWindowProperty = cdkBuilder.build()
}
