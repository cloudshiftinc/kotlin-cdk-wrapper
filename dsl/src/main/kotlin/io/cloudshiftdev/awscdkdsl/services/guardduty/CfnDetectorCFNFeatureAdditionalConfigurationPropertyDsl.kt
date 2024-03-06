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
 * Information about the additional configuration of a feature in your account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.guardduty.*;
 * CFNFeatureAdditionalConfigurationProperty cFNFeatureAdditionalConfigurationProperty =
 * CFNFeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html)
 */
@CdkDslMarker
public class CfnDetectorCFNFeatureAdditionalConfigurationPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNFeatureAdditionalConfigurationProperty.Builder =
        CfnDetector.CFNFeatureAdditionalConfigurationProperty.builder()

    /** @param name Name of the additional configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param status Status of the additional configuration. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnDetector.CFNFeatureAdditionalConfigurationProperty = cdkBuilder.build()
}
