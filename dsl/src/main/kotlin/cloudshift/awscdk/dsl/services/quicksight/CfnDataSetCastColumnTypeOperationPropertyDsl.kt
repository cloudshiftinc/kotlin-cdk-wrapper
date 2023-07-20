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
import kotlin.String

@CdkDslMarker
public class CfnDataSetCastColumnTypeOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.CastColumnTypeOperationProperty.Builder =
        CfnDataSet.CastColumnTypeOperationProperty.builder()

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun newColumnType(newColumnType: String) {
        cdkBuilder.newColumnType(newColumnType)
    }

    public fun build(): CfnDataSet.CastColumnTypeOperationProperty = cdkBuilder.build()
}
