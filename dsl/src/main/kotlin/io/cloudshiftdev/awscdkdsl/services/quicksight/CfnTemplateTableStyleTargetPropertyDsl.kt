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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The table style target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableStyleTargetProperty tableStyleTargetProperty = TableStyleTargetProperty.builder()
 * .cellType("cellType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablestyletarget.html)
 */
@CdkDslMarker
public class CfnTemplateTableStyleTargetPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableStyleTargetProperty.Builder =
        CfnTemplate.TableStyleTargetProperty.builder()

    /** @param cellType The cell type of the table style target. */
    public fun cellType(cellType: String) {
        cdkBuilder.cellType(cellType)
    }

    public fun build(): CfnTemplate.TableStyleTargetProperty = cdkBuilder.build()
}
