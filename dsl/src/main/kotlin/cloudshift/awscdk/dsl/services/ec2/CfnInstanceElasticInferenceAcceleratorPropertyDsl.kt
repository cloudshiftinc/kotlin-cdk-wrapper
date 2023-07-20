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
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceElasticInferenceAcceleratorPropertyDsl {
    private val cdkBuilder: CfnInstance.ElasticInferenceAcceleratorProperty.Builder =
        CfnInstance.ElasticInferenceAcceleratorProperty.builder()

    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnInstance.ElasticInferenceAcceleratorProperty = cdkBuilder.build()
}
