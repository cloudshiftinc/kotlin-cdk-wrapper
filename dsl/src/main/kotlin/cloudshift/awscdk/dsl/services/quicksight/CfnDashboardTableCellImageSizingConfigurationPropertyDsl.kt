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
public class CfnDashboardTableCellImageSizingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableCellImageSizingConfigurationProperty.Builder =
        CfnDashboard.TableCellImageSizingConfigurationProperty.builder()

    public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
        cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
    }

    public fun build(): CfnDashboard.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
