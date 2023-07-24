@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field wells for a table visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablefieldwells.html)
 */
@CdkDslMarker
public class CfnAnalysisTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableFieldWellsProperty.Builder =
        CfnAnalysis.TableFieldWellsProperty.builder()

    /**
     * @param tableAggregatedFieldWells The aggregated field well for the table.
     */
    public fun tableAggregatedFieldWells(tableAggregatedFieldWells: IResolvable) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    /**
     * @param tableAggregatedFieldWells The aggregated field well for the table.
     */
    public fun tableAggregatedFieldWells(tableAggregatedFieldWells: CfnAnalysis.TableAggregatedFieldWellsProperty) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    /**
     * @param tableUnaggregatedFieldWells The unaggregated field well for the table.
     */
    public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: IResolvable) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    /**
     * @param tableUnaggregatedFieldWells The unaggregated field well for the table.
     */
    public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: CfnAnalysis.TableUnaggregatedFieldWellsProperty) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    public fun build(): CfnAnalysis.TableFieldWellsProperty = cdkBuilder.build()
}
