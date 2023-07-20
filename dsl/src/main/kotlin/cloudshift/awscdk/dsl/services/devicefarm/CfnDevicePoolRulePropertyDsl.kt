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

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import kotlin.String

@CdkDslMarker
public class CfnDevicePoolRulePropertyDsl {
    private val cdkBuilder: CfnDevicePool.RuleProperty.Builder = CfnDevicePool.RuleProperty.builder()

    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDevicePool.RuleProperty = cdkBuilder.build()
}
