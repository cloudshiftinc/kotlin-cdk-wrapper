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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The image configuration of a table field URL.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldImageConfigurationProperty tableFieldImageConfigurationProperty =
 * TableFieldImageConfigurationProperty.builder()
 * .sizingOptions(TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablefieldimageconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisTableFieldImageConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldImageConfigurationProperty.Builder =
        CfnAnalysis.TableFieldImageConfigurationProperty.builder()

    /** @param sizingOptions The sizing options for the table image configuration. */
    public fun sizingOptions(sizingOptions: IResolvable) {
        cdkBuilder.sizingOptions(sizingOptions)
    }

    /** @param sizingOptions The sizing options for the table image configuration. */
    public fun sizingOptions(sizingOptions: CfnAnalysis.TableCellImageSizingConfigurationProperty) {
        cdkBuilder.sizingOptions(sizingOptions)
    }

    public fun build(): CfnAnalysis.TableFieldImageConfigurationProperty = cdkBuilder.build()
}
