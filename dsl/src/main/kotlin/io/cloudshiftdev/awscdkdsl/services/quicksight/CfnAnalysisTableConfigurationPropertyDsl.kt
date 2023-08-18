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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration for a `TableVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tableconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisTableConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableConfigurationProperty.Builder =
        CfnAnalysis.TableConfigurationProperty.builder()

    private val _tableInlineVisualizations: MutableList<Any> = mutableListOf()

    /** @param fieldOptions The field options for a table visual. */
    public fun fieldOptions(fieldOptions: IResolvable) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    /** @param fieldOptions The field options for a table visual. */
    public fun fieldOptions(fieldOptions: CfnAnalysis.TableFieldOptionsProperty) {
        cdkBuilder.fieldOptions(fieldOptions)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field wells of the visual. */
    public fun fieldWells(fieldWells: CfnAnalysis.TableFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param paginatedReportOptions The paginated report options for a table visual. */
    public fun paginatedReportOptions(paginatedReportOptions: IResolvable) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    /** @param paginatedReportOptions The paginated report options for a table visual. */
    public fun paginatedReportOptions(
        paginatedReportOptions: CfnAnalysis.TablePaginatedReportOptionsProperty
    ) {
        cdkBuilder.paginatedReportOptions(paginatedReportOptions)
    }

    /** @param sortConfiguration The sort configuration for a `TableVisual` . */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration for a `TableVisual` . */
    public fun sortConfiguration(sortConfiguration: CfnAnalysis.TableSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /**
     * @param tableInlineVisualizations A collection of inline visualizations to display within a
     *   chart.
     */
    public fun tableInlineVisualizations(vararg tableInlineVisualizations: Any) {
        _tableInlineVisualizations.addAll(listOf(*tableInlineVisualizations))
    }

    /**
     * @param tableInlineVisualizations A collection of inline visualizations to display within a
     *   chart.
     */
    public fun tableInlineVisualizations(tableInlineVisualizations: Collection<Any>) {
        _tableInlineVisualizations.addAll(tableInlineVisualizations)
    }

    /**
     * @param tableInlineVisualizations A collection of inline visualizations to display within a
     *   chart.
     */
    public fun tableInlineVisualizations(tableInlineVisualizations: IResolvable) {
        cdkBuilder.tableInlineVisualizations(tableInlineVisualizations)
    }

    /** @param tableOptions The table options for a table visual. */
    public fun tableOptions(tableOptions: IResolvable) {
        cdkBuilder.tableOptions(tableOptions)
    }

    /** @param tableOptions The table options for a table visual. */
    public fun tableOptions(tableOptions: CfnAnalysis.TableOptionsProperty) {
        cdkBuilder.tableOptions(tableOptions)
    }

    /** @param totalOptions The total options for a table visual. */
    public fun totalOptions(totalOptions: IResolvable) {
        cdkBuilder.totalOptions(totalOptions)
    }

    /** @param totalOptions The total options for a table visual. */
    public fun totalOptions(totalOptions: CfnAnalysis.TotalOptionsProperty) {
        cdkBuilder.totalOptions(totalOptions)
    }

    public fun build(): CfnAnalysis.TableConfigurationProperty {
        if (_tableInlineVisualizations.isNotEmpty())
            cdkBuilder.tableInlineVisualizations(_tableInlineVisualizations)
        return cdkBuilder.build()
    }
}
