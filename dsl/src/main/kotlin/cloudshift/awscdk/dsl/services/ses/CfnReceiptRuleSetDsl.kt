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
import software.amazon.awscdk.services.ses.CfnReceiptRuleSet
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnReceiptRuleSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReceiptRuleSet.Builder = CfnReceiptRuleSet.Builder.create(scope, id)

    public fun ruleSetName(ruleSetName: String) {
        cdkBuilder.ruleSetName(ruleSetName)
    }

    public fun build(): CfnReceiptRuleSet = cdkBuilder.build()
}
