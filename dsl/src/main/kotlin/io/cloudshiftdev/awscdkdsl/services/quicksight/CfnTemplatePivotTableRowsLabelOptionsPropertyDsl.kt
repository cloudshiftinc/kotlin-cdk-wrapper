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
 * The options for the label thta is located above the row headers.
 *
 * This option is only applicable when `RowsLayout` is set to `HIERARCHY` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableRowsLabelOptionsProperty pivotTableRowsLabelOptionsProperty =
 * PivotTableRowsLabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottablerowslabeloptions.html)
 */
@CdkDslMarker
public class CfnTemplatePivotTableRowsLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableRowsLabelOptionsProperty.Builder =
        CfnTemplate.PivotTableRowsLabelOptionsProperty.builder()

    /** @param customLabel The custom label string for the rows label. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param visibility The visibility of the rows label. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.PivotTableRowsLabelOptionsProperty = cdkBuilder.build()
}
