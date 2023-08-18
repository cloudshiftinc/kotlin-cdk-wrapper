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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

/**
 * Describes the configuration for a feature.
 *
 * Although the `Required` field associated with the following properties specifies `No` , if you
 * provide information for `Name` , you will need to provide the information for `Status` too. For
 * information about the available feature configurations, see
 * [DetectorFeatureConfiguration](https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DetectorFeatureConfiguration.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * FeatureConfigurationsProperty featureConfigurationsProperty =
 * FeatureConfigurationsProperty.builder()
 * .additionalConfiguration(List.of(FeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build()))
 * .name("name")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-featureconfigurations.html)
 */
@CdkDslMarker
public class CfnDetectorFeatureConfigurationsPropertyDsl {
    private val cdkBuilder: CfnDetector.FeatureConfigurationsProperty.Builder =
        CfnDetector.FeatureConfigurationsProperty.builder()

    private val _additionalConfiguration: MutableList<Any> = mutableListOf()

    /** @param additionalConfiguration Additional configuration of the feature. */
    public fun additionalConfiguration(vararg additionalConfiguration: Any) {
        _additionalConfiguration.addAll(listOf(*additionalConfiguration))
    }

    /** @param additionalConfiguration Additional configuration of the feature. */
    public fun additionalConfiguration(additionalConfiguration: Collection<Any>) {
        _additionalConfiguration.addAll(additionalConfiguration)
    }

    /** @param additionalConfiguration Additional configuration of the feature. */
    public fun additionalConfiguration(additionalConfiguration: IResolvable) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
    }

    /** @param name Name of the feature. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param status Status of the feature. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDetector.FeatureConfigurationsProperty {
        if (_additionalConfiguration.isNotEmpty())
            cdkBuilder.additionalConfiguration(_additionalConfiguration)
        return cdkBuilder.build()
    }
}
