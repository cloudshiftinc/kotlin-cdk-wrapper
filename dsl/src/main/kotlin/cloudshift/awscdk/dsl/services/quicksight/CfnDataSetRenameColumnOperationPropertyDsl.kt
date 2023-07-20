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
public class CfnDataSetRenameColumnOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.RenameColumnOperationProperty.Builder =
        CfnDataSet.RenameColumnOperationProperty.builder()

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun newColumnName(newColumnName: String) {
        cdkBuilder.newColumnName(newColumnName)
    }

    public fun build(): CfnDataSet.RenameColumnOperationProperty = cdkBuilder.build()
}
