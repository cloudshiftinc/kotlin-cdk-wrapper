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

package io.cloudshiftdev.awscdkdsl.services.guardduty

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes the additional configuration for a feature.
 *
 * If you want to specify any additional configuration for your feature, it is required to provide
 * the `Name` and `Status` for that additional configuration. For more information, see
 * [DetectorAdditionalConfiguration](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DetectorAdditionalConfiguration.html)
 * .
 *
 * If you're providing additional configuration, ensure to provide the corresponding
 * [FeatureConfigurations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-featureconfigurations.html#cfn-guardduty-detector-featureconfigurations-additionalconfiguration)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * FeatureAdditionalConfigurationProperty featureAdditionalConfigurationProperty =
 * FeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-featureadditionalconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorFeatureAdditionalConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.FeatureAdditionalConfigurationProperty.Builder =
        CfnDetector.FeatureAdditionalConfigurationProperty.builder()

    /** @param name Name of the additional configuration of a feature. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param status Status of the additional configuration of a feature. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDetector.FeatureAdditionalConfigurationProperty = cdkBuilder.build()
}
