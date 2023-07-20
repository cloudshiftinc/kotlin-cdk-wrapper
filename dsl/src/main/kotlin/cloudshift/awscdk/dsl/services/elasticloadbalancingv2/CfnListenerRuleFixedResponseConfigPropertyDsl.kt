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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import kotlin.String

@CdkDslMarker
public class CfnListenerRuleFixedResponseConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.FixedResponseConfigProperty.Builder =
        CfnListenerRule.FixedResponseConfigProperty.builder()

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun messageBody(messageBody: String) {
        cdkBuilder.messageBody(messageBody)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnListenerRule.FixedResponseConfigProperty = cdkBuilder.build()
}
