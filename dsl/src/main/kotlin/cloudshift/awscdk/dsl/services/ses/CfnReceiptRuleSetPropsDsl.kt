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
import software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps
import kotlin.String

@CdkDslMarker
public class CfnReceiptRuleSetPropsDsl {
    private val cdkBuilder: CfnReceiptRuleSetProps.Builder = CfnReceiptRuleSetProps.builder()

    public fun ruleSetName(ruleSetName: String) {
        cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): CfnReceiptRuleSetProps = cdkBuilder.build()
}
