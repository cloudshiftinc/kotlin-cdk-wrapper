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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnMatchmakingConfigurationGamePropertyPropertyDsl {
    private val cdkBuilder: CfnMatchmakingConfiguration.GamePropertyProperty.Builder =
        CfnMatchmakingConfiguration.GamePropertyProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnMatchmakingConfiguration.GamePropertyProperty = cdkBuilder.build()
}
