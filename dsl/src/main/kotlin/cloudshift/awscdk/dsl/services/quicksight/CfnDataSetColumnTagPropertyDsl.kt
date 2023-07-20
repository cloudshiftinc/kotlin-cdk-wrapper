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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String

@CdkDslMarker
public class CfnDataSetColumnTagPropertyDsl {
    private val cdkBuilder: CfnDataSet.ColumnTagProperty.Builder =
        CfnDataSet.ColumnTagProperty.builder()

    public fun columnDescription(columnDescription: IResolvable) {
        cdkBuilder.columnDescription(columnDescription)
    }

    public fun columnDescription(columnDescription: CfnDataSet.ColumnDescriptionProperty) {
        cdkBuilder.columnDescription(columnDescription)
    }

    public fun columnGeographicRole(columnGeographicRole: String) {
        cdkBuilder.columnGeographicRole(columnGeographicRole)
    }

    public fun build(): CfnDataSet.ColumnTagProperty = cdkBuilder.build()
}
