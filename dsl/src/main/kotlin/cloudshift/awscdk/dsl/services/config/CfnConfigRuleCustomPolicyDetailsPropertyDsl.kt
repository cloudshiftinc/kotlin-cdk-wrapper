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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnConfigRuleCustomPolicyDetailsPropertyDsl {
    private val cdkBuilder: CfnConfigRule.CustomPolicyDetailsProperty.Builder =
        CfnConfigRule.CustomPolicyDetailsProperty.builder()

    public fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
    }

    public fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
    }

    public fun policyRuntime(policyRuntime: String) {
        cdkBuilder.policyRuntime(policyRuntime)
    }

    public fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnConfigRule.CustomPolicyDetailsProperty = cdkBuilder.build()
}
