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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The option that determines the decimal places configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalPlacesConfigurationProperty decimalPlacesConfigurationProperty =
 * DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-decimalplacesconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisDecimalPlacesConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DecimalPlacesConfigurationProperty.Builder =
        CfnAnalysis.DecimalPlacesConfigurationProperty.builder()

    /** @param decimalPlaces The values of the decimal places. */
    public fun decimalPlaces(decimalPlaces: Number) {
        cdkBuilder.decimalPlaces(decimalPlaces)
    }

    public fun build(): CfnAnalysis.DecimalPlacesConfigurationProperty = cdkBuilder.build()
}
