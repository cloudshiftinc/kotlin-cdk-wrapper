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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration options that determine how missing data is treated during the rendering of a
 * line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MissingDataConfigurationProperty missingDataConfigurationProperty =
 * MissingDataConfigurationProperty.builder()
 * .treatmentOption("treatmentOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-missingdataconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateMissingDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.MissingDataConfigurationProperty.Builder =
        CfnTemplate.MissingDataConfigurationProperty.builder()

    /**
     * @param treatmentOption The treatment option that determines how missing data should be
     *   rendered. Choose from the following options:.
     * * `INTERPOLATE` : Interpolate missing values between the prior and the next known value.
     * * `SHOW_AS_ZERO` : Show missing values as the value `0` .
     * * `SHOW_AS_BLANK` : Display a blank space when rendering missing data.
     */
    public fun treatmentOption(treatmentOption: String) {
        cdkBuilder.treatmentOption(treatmentOption)
    }

    public fun build(): CfnTemplate.MissingDataConfigurationProperty = cdkBuilder.build()
}
