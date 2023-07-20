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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisTableCellImageSizingConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableCellImageSizingConfigurationProperty.Builder =
        CfnAnalysis.TableCellImageSizingConfigurationProperty.builder()

    public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
        cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
    }

    public fun build(): CfnAnalysis.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
