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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Determines the row alternate color options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RowAlternateColorOptionsProperty rowAlternateColorOptionsProperty =
 * RowAlternateColorOptionsProperty.builder()
 * .rowAlternateColors(List.of("rowAlternateColors"))
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-rowalternatecoloroptions.html)
 */
@CdkDslMarker
public class CfnTemplateRowAlternateColorOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.RowAlternateColorOptionsProperty.Builder =
        CfnTemplate.RowAlternateColorOptionsProperty.builder()

    private val _rowAlternateColors: MutableList<String> = mutableListOf()

    /** @param rowAlternateColors Determines the list of row alternate colors. */
    public fun rowAlternateColors(vararg rowAlternateColors: String) {
        _rowAlternateColors.addAll(listOf(*rowAlternateColors))
    }

    /** @param rowAlternateColors Determines the list of row alternate colors. */
    public fun rowAlternateColors(rowAlternateColors: Collection<String>) {
        _rowAlternateColors.addAll(rowAlternateColors)
    }

    /** @param status Determines the widget status. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnTemplate.RowAlternateColorOptionsProperty {
        if (_rowAlternateColors.isNotEmpty()) cdkBuilder.rowAlternateColors(_rowAlternateColors)
        return cdkBuilder.build()
    }
}
