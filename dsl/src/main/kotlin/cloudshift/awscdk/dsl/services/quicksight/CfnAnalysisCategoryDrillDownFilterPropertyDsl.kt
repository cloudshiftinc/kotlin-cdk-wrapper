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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The numeric equality type drill down filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CategoryDrillDownFilterProperty categoryDrillDownFilterProperty =
 * CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-categorydrilldownfilter.html)
 */
@CdkDslMarker
public class CfnAnalysisCategoryDrillDownFilterPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CategoryDrillDownFilterProperty.Builder =
        CfnAnalysis.CategoryDrillDownFilterProperty.builder()

    private val _categoryValues: MutableList<String> = mutableListOf()

    /**
     * @param categoryValues A list of the string inputs that are the values of the category drill
     *   down filter.
     */
    public fun categoryValues(vararg categoryValues: String) {
        _categoryValues.addAll(listOf(*categoryValues))
    }

    /**
     * @param categoryValues A list of the string inputs that are the values of the category drill
     *   down filter.
     */
    public fun categoryValues(categoryValues: Collection<String>) {
        _categoryValues.addAll(categoryValues)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun build(): CfnAnalysis.CategoryDrillDownFilterProperty {
        if (_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
        return cdkBuilder.build()
    }
}
