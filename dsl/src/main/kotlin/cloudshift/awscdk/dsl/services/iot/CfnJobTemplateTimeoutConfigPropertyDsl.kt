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
import software.amazon.awscdk.services.iot.CfnJobTemplate
import kotlin.Number

@CdkDslMarker
public class CfnJobTemplateTimeoutConfigPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.TimeoutConfigProperty.Builder =
        CfnJobTemplate.TimeoutConfigProperty.builder()

    public fun inProgressTimeoutInMinutes(inProgressTimeoutInMinutes: Number) {
        cdkBuilder.inProgressTimeoutInMinutes(inProgressTimeoutInMinutes)
    }

    public fun build(): CfnJobTemplate.TimeoutConfigProperty = cdkBuilder.build()
}
