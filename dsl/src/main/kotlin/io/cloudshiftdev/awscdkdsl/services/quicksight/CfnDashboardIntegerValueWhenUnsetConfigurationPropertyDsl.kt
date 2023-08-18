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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A parameter declaration for the `Integer` data type.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * IntegerValueWhenUnsetConfigurationProperty integerValueWhenUnsetConfigurationProperty =
 * IntegerValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-integervaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardIntegerValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.IntegerValueWhenUnsetConfigurationProperty.Builder =
        CfnDashboard.IntegerValueWhenUnsetConfigurationProperty.builder()

    /** @param customValue A custom value that's used when the value of a parameter isn't set. */
    public fun customValue(customValue: Number) {
        cdkBuilder.customValue(customValue)
    }

    /**
     * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
     *   the following:.
     * * `RECOMMENDED` : The recommended value.
     * * `NULL` : The `NULL` value.
     */
    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnDashboard.IntegerValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
