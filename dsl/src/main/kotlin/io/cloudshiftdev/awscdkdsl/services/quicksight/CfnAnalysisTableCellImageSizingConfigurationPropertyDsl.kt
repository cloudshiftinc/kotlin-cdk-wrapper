@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The sizing options for the table image configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableCellImageSizingConfigurationProperty tableCellImageSizingConfigurationProperty =
 * TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablecellimagesizingconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisTableCellImageSizingConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableCellImageSizingConfigurationProperty.Builder =
        CfnAnalysis.TableCellImageSizingConfigurationProperty.builder()

    /**
     * @param tableCellImageScalingConfiguration The cell scaling configuration of the sizing
     *   options for the table image configuration.
     */
    public fun tableCellImageScalingConfiguration(tableCellImageScalingConfiguration: String) {
        cdkBuilder.tableCellImageScalingConfiguration(tableCellImageScalingConfiguration)
    }

    public fun build(): CfnAnalysis.TableCellImageSizingConfigurationProperty = cdkBuilder.build()
}
