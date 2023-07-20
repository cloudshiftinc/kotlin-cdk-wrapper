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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardUnaggregatedFieldPropertyDsl {
    private val cdkBuilder: CfnDashboard.UnaggregatedFieldProperty.Builder =
        CfnDashboard.UnaggregatedFieldProperty.builder()

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun formatConfiguration(formatConfiguration: CfnDashboard.FormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun build(): CfnDashboard.UnaggregatedFieldProperty = cdkBuilder.build()
}
