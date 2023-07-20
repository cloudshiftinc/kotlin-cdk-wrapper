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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnInstance
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceStatePropertyDsl {
    private val cdkBuilder: CfnInstance.StateProperty.Builder = CfnInstance.StateProperty.builder()

    public fun code(code: Number) {
        cdkBuilder.code(code)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnInstance.StateProperty = cdkBuilder.build()
}
