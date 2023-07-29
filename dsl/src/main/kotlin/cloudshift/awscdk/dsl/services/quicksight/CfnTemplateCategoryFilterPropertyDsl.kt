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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A `CategoryFilter` filters text values.
 *
 * For more information, see
 * [Adding text filters](https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html)
 * in the *Amazon QuickSight User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CategoryFilterProperty categoryFilterProperty = CategoryFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .configuration(CategoryFilterConfigurationProperty.builder()
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
 * .build())
 * .filterId("filterId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-categoryfilter.html)
 */
@CdkDslMarker
public class CfnTemplateCategoryFilterPropertyDsl {
    private val cdkBuilder: CfnTemplate.CategoryFilterProperty.Builder =
        CfnTemplate.CategoryFilterProperty.builder()

    /** @param column The column that the filter is applied to. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /** @param configuration The configuration for a `CategoryFilter` . */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /** @param configuration The configuration for a `CategoryFilter` . */
    public fun configuration(configuration: CfnTemplate.CategoryFilterConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
     *   or template.
     */
    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    public fun build(): CfnTemplate.CategoryFilterProperty = cdkBuilder.build()
}
