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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The limit configuration of the visual display for an axis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ItemsLimitConfigurationProperty itemsLimitConfigurationProperty =
 * ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-itemslimitconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisItemsLimitConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ItemsLimitConfigurationProperty.Builder =
        CfnAnalysis.ItemsLimitConfigurationProperty.builder()

    /**
     * @param itemsLimit The limit on how many items of a field are showed in the chart. For
     *   example, the number of slices that are displayed in a pie chart.
     */
    public fun itemsLimit(itemsLimit: Number) {
        cdkBuilder.itemsLimit(itemsLimit)
    }

    /**
     * @param otherCategories The `Show other` of an axis in the chart. Choose one of the following
     *   options:.
     * * `INCLUDE`
     * * `EXCLUDE`
     */
    public fun otherCategories(otherCategories: String) {
        cdkBuilder.otherCategories(otherCategories)
    }

    public fun build(): CfnAnalysis.ItemsLimitConfigurationProperty = cdkBuilder.build()
}
