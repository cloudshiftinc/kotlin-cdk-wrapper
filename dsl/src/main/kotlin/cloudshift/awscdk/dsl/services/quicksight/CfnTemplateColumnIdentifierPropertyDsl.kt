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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplateColumnIdentifierPropertyDsl {
    private val cdkBuilder: CfnTemplate.ColumnIdentifierProperty.Builder =
        CfnTemplate.ColumnIdentifierProperty.builder()

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    public fun build(): CfnTemplate.ColumnIdentifierProperty = cdkBuilder.build()
}
