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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import kotlin.Number

@CdkDslMarker
public class CfnRuleRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnRule.RetryPolicyProperty.Builder =
        CfnRule.RetryPolicyProperty.builder()

    public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
    }

    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    public fun build(): CfnRule.RetryPolicyProperty = cdkBuilder.build()
}
