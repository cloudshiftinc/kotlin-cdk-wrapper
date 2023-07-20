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
public class CfnReceiptRuleSNSActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.SNSActionProperty.Builder =
        CfnReceiptRule.SNSActionProperty.builder()

    public fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnReceiptRule.SNSActionProperty = cdkBuilder.build()
}
