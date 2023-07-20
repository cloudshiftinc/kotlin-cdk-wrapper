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
public class CfnTemplateTableCellImageSizingConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableCellImageSizingConfigurationProperty.Builder =
        CfnTemplate.TableCellImageSizingConfigurationProperty.builder()

    public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
        cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
    }

    public fun build(): CfnTemplate.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
