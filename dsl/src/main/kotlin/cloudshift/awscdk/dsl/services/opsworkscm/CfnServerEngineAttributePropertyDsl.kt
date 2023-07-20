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

package cloudshift.awscdk.dsl.services.opsworkscm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opsworkscm.CfnServer
import kotlin.String

@CdkDslMarker
public class CfnServerEngineAttributePropertyDsl {
    private val cdkBuilder: CfnServer.EngineAttributeProperty.Builder =
        CfnServer.EngineAttributeProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnServer.EngineAttributeProperty = cdkBuilder.build()
}
