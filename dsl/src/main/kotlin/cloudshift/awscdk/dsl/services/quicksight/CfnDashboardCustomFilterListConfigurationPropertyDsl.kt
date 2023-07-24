@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A list of custom filter values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomFilterListConfigurationProperty customFilterListConfigurationProperty =
 * CustomFilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .selectAllOptions("selectAllOptions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-customfilterlistconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardCustomFilterListConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomFilterListConfigurationProperty.Builder =
        CfnDashboard.CustomFilterListConfigurationProperty.builder()

    private val _categoryValues: MutableList<String> = mutableListOf()

    /**
     * @param categoryValues The list of category values for the filter.
     */
    public fun categoryValues(vararg categoryValues: String) {
        _categoryValues.addAll(listOf(*categoryValues))
    }

    /**
     * @param categoryValues The list of category values for the filter.
     */
    public fun categoryValues(categoryValues: Collection<String>) {
        _categoryValues.addAll(categoryValues)
    }

    /**
     * @param matchOperator The match operator that is used to determine if a filter should be
     * applied.
     */
    public fun matchOperator(matchOperator: String) {
        cdkBuilder.matchOperator(matchOperator)
    }

    /**
     * @param nullOption This option determines how null values should be treated when filtering data.
     *
     * * `ALL_VALUES` : Include null values in filtered results.
     * * `NULLS_ONLY` : Only include null values in filtered results.
     * * `NON_NULLS_ONLY` : Exclude null values from filtered results.
     */
    public fun nullOption(nullOption: String) {
        cdkBuilder.nullOption(nullOption)
    }

    /**
     * @param selectAllOptions Select all of the values. Null is not the assigned value of select all.
     * * `FILTER_ALL_VALUES`
     */
    public fun selectAllOptions(selectAllOptions: String) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun build(): CfnDashboard.CustomFilterListConfigurationProperty {
        if (_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
        return cdkBuilder.build()
    }
}
