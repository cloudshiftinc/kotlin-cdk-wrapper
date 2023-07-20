@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileMachineLearningDetectionConfigPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.MachineLearningDetectionConfigProperty.Builder =
        CfnSecurityProfile.MachineLearningDetectionConfigProperty.builder()

    public fun confidenceLevel(confidenceLevel: String) {
        cdkBuilder.confidenceLevel(confidenceLevel)
    }

    public fun build(): CfnSecurityProfile.MachineLearningDetectionConfigProperty = cdkBuilder.build()
}
