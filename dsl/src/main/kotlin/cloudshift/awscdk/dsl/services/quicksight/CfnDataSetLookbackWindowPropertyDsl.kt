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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSetLookbackWindowPropertyDsl {
    private val cdkBuilder: CfnDataSet.LookbackWindowProperty.Builder =
        CfnDataSet.LookbackWindowProperty.builder()

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun sizeUnit(sizeUnit: String) {
        cdkBuilder.sizeUnit(sizeUnit)
    }

    public fun build(): CfnDataSet.LookbackWindowProperty = cdkBuilder.build()
}
