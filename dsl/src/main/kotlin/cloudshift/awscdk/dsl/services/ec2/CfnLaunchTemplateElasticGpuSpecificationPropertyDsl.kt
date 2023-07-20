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
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateElasticGpuSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder =
        CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLaunchTemplate.ElasticGpuSpecificationProperty = cdkBuilder.build()
}
