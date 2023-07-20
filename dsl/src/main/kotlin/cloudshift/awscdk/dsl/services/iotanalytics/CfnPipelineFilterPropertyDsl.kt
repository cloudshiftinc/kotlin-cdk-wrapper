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
public class CfnPipelineFilterPropertyDsl {
    private val cdkBuilder: CfnPipeline.FilterProperty.Builder = CfnPipeline.FilterProperty.builder()

    public fun filter(filter: String) {
        cdkBuilder.filter(filter)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.FilterProperty = cdkBuilder.build()
}
