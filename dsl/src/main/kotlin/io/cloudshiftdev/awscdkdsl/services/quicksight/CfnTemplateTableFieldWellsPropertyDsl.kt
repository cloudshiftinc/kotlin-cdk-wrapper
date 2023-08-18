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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The field wells for a table visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablefieldwells.html)
 */
@CdkDslMarker
public class CfnTemplateTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableFieldWellsProperty.Builder =
        CfnTemplate.TableFieldWellsProperty.builder()

    /** @param tableAggregatedFieldWells The aggregated field well for the table. */
    public fun tableAggregatedFieldWells(tableAggregatedFieldWells: IResolvable) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    /** @param tableAggregatedFieldWells The aggregated field well for the table. */
    public fun tableAggregatedFieldWells(
        tableAggregatedFieldWells: CfnTemplate.TableAggregatedFieldWellsProperty
    ) {
        cdkBuilder.tableAggregatedFieldWells(tableAggregatedFieldWells)
    }

    /** @param tableUnaggregatedFieldWells The unaggregated field well for the table. */
    public fun tableUnaggregatedFieldWells(tableUnaggregatedFieldWells: IResolvable) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    /** @param tableUnaggregatedFieldWells The unaggregated field well for the table. */
    public fun tableUnaggregatedFieldWells(
        tableUnaggregatedFieldWells: CfnTemplate.TableUnaggregatedFieldWellsProperty
    ) {
        cdkBuilder.tableUnaggregatedFieldWells(tableUnaggregatedFieldWells)
    }

    public fun build(): CfnTemplate.TableFieldWellsProperty = cdkBuilder.build()
}
