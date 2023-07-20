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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import kotlin.String

@CdkDslMarker
public class CfnPipelineMathPropertyDsl {
    private val cdkBuilder: CfnPipeline.MathProperty.Builder = CfnPipeline.MathProperty.builder()

    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    public fun math(math: String) {
        cdkBuilder.math(math)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.MathProperty = cdkBuilder.build()
}
