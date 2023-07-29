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
 * The configuration for a `CategoryFilter` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CategoryFilterConfigurationProperty categoryFilterConfigurationProperty =
 * CategoryFilterConfigurationProperty.builder()
 * .customFilterConfiguration(CustomFilterConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .categoryValue("categoryValue")
 * .parameterName("parameterName")
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .customFilterListConfiguration(CustomFilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * .nullOption("nullOption")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .filterListConfiguration(FilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .selectAllOptions("selectAllOptions")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-categoryfilterconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisCategoryFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CategoryFilterConfigurationProperty.Builder =
        CfnAnalysis.CategoryFilterConfigurationProperty.builder()

    /**
     * @param customFilterConfiguration A custom filter that filters based on a single value. This
     *   filter can be partially matched.
     */
    public fun customFilterConfiguration(customFilterConfiguration: IResolvable) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    /**
     * @param customFilterConfiguration A custom filter that filters based on a single value. This
     *   filter can be partially matched.
     */
    public fun customFilterConfiguration(
        customFilterConfiguration: CfnAnalysis.CustomFilterConfigurationProperty
    ) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    /**
     * @param customFilterListConfiguration A list of custom filter values. In the Amazon QuickSight
     *   console, this filter type is called a custom filter list.
     */
    public fun customFilterListConfiguration(customFilterListConfiguration: IResolvable) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    /**
     * @param customFilterListConfiguration A list of custom filter values. In the Amazon QuickSight
     *   console, this filter type is called a custom filter list.
     */
    public fun customFilterListConfiguration(
        customFilterListConfiguration: CfnAnalysis.CustomFilterListConfigurationProperty
    ) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    /**
     * @param filterListConfiguration A list of filter configurations. In the Amazon QuickSight
     *   console, this filter type is called a filter list.
     */
    public fun filterListConfiguration(filterListConfiguration: IResolvable) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    /**
     * @param filterListConfiguration A list of filter configurations. In the Amazon QuickSight
     *   console, this filter type is called a filter list.
     */
    public fun filterListConfiguration(
        filterListConfiguration: CfnAnalysis.FilterListConfigurationProperty
    ) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    public fun build(): CfnAnalysis.CategoryFilterConfigurationProperty = cdkBuilder.build()
}
