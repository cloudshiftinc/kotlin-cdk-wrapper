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
 * The tooltip item for the fields.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldTooltipItemProperty fieldTooltipItemProperty = FieldTooltipItemProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .label("label")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-fieldtooltipitem.html)
 */
@CdkDslMarker
public class CfnTemplateFieldTooltipItemPropertyDsl {
    private val cdkBuilder: CfnTemplate.FieldTooltipItemProperty.Builder =
        CfnTemplate.FieldTooltipItemProperty.builder()

    /** @param fieldId The unique ID of the field that is targeted by the tooltip. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param label The label of the tooltip item. */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /** @param visibility The visibility of the tooltip item. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.FieldTooltipItemProperty = cdkBuilder.build()
}
