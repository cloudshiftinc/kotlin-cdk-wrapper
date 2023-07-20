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
import kotlin.String

@CdkDslMarker
public class CfnRuleDeadLetterConfigPropertyDsl {
    private val cdkBuilder: CfnRule.DeadLetterConfigProperty.Builder =
        CfnRule.DeadLetterConfigProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnRule.DeadLetterConfigProperty = cdkBuilder.build()
}
