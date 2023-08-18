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
 * The configuration that defines the default value of a `Decimal` parameter when a value has not
 * been set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalValueWhenUnsetConfigurationProperty decimalValueWhenUnsetConfigurationProperty =
 * DecimalValueWhenUnsetConfigurationProperty.builder()
 * .customValue(123)
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-decimalvaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDecimalValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DecimalValueWhenUnsetConfigurationProperty.Builder =
        CfnDashboard.DecimalValueWhenUnsetConfigurationProperty.builder()

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

    public fun build(): CfnDashboard.DecimalValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
