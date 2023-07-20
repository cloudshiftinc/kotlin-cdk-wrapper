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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.String

@CdkDslMarker
public class CfnAutomationRuleAutomationRulesActionPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.AutomationRulesActionProperty.Builder =
        CfnAutomationRule.AutomationRulesActionProperty.builder()

    public fun findingFieldsUpdate(findingFieldsUpdate: IResolvable) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate)
    }

    public fun findingFieldsUpdate(findingFieldsUpdate: CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty) {
        cdkBuilder.findingFieldsUpdate(findingFieldsUpdate)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnAutomationRule.AutomationRulesActionProperty = cdkBuilder.build()
}
