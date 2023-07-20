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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardMappedDataSetParameterPropertyDsl {
    private val cdkBuilder: CfnDashboard.MappedDataSetParameterProperty.Builder =
        CfnDashboard.MappedDataSetParameterProperty.builder()

    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    public fun dataSetParameterName(dataSetParameterName: String) {
        cdkBuilder.dataSetParameterName(dataSetParameterName)
    }

    public fun build(): CfnDashboard.MappedDataSetParameterProperty = cdkBuilder.build()
}
