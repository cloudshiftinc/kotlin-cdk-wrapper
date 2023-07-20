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
public class CfnPipelineDeviceShadowEnrichPropertyDsl {
    private val cdkBuilder: CfnPipeline.DeviceShadowEnrichProperty.Builder =
        CfnPipeline.DeviceShadowEnrichProperty.builder()

    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnPipeline.DeviceShadowEnrichProperty = cdkBuilder.build()
}
