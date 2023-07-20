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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnReceiptRule
import kotlin.String

@CdkDslMarker
public class CfnReceiptRuleStopActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.StopActionProperty.Builder =
        CfnReceiptRule.StopActionProperty.builder()

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnReceiptRule.StopActionProperty = cdkBuilder.build()
}
