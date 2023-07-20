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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl {
    private val cdkBuilder:
        CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder =
        CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.builder()

    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty =
        cdkBuilder.build()
}
